package com.config.Modals;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Table(name = "prelevement")
public class Prelevement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPrelevement;

    private double niveauGlicemique;


    private LocalDateTime datePrelevement;

    @Enumerated(EnumType.STRING)
    private RangeGlicemie range;

    public Prelevement(double niveauGlicemique, LocalDateTime datePrelevement, RangeGlicemie range) {
        this.niveauGlicemique = niveauGlicemique;
        this.datePrelevement = datePrelevement;
        this.range = range;
    }
    public Prelevement() {}

    public int getIdPrelevement() {
        return idPrelevement;
    }

    public void setIdPrelevement(int idPrelevement) {
        this.idPrelevement = idPrelevement;
    }

    public double getNiveauGlicemique() {
        return niveauGlicemique;
    }

    public void setNiveauGlicemique(double niveauGlicemique) {
        this.niveauGlicemique = niveauGlicemique;
    }

    public LocalDateTime getDatePrelevement() {
        return datePrelevement;
    }

    public void setDatePrelevement(LocalDateTime datePrelevement) {
        this.datePrelevement = datePrelevement;
    }

    public RangeGlicemie getRange() {
        return range;
    }

    public void setRange(RangeGlicemie range) {
        this.range = range;
    }
    public enum RangeGlicemie {
        NORMAL,
        PREDIABETIC,
        DIABETIC,

    }
}
