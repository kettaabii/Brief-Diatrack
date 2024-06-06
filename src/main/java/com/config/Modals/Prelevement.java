package com.config.Modals;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "prelevement")
public class Prelevement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPrelevement;

    private double niveauGlicemique;

    private LocalDate datePrelevement;

    private RangeGlicemie range;

    public Prelevement(double niveauGlicemique, LocalDate datePrelevement, RangeGlicemie range) {
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

    public LocalDate getDatePrelevement() {
        return datePrelevement;
    }

    public void setDatePrelevement(LocalDate datePrelevement) {
        this.datePrelevement = datePrelevement;
    }

    public RangeGlicemie getRange() {
        return range;
    }

    public void setRange(RangeGlicemie range) {
        this.range = range;
    }
}
