package com.config.Controller;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@ControllerAdvice
public class DateTimeBinder {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(LocalDateTime.class, new CustomLocalDateTimeEditor(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm")));
    }

    private static class CustomLocalDateTimeEditor extends CustomDateEditor {

        private final DateTimeFormatter formatter;

        public CustomLocalDateTimeEditor(DateTimeFormatter formatter) {
            super(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm"), true);
            this.formatter = formatter;
        }

        @Override
        public void setAsText(String text) throws IllegalArgumentException {
            LocalDateTime dateTime = LocalDateTime.parse(text, formatter);
            setValue(dateTime);
        }
    }
}
