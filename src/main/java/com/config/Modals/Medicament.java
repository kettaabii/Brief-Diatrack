package com.config.Modals;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Medicament {
    @Id
    private int idMedicament;
    private String libelle_Medicament;
    private String Type_Medicament;
    private String Range;
    private int DoseJournaliere;
    private int DosesPrise;


    public Medicament(int idMedicament, String libelle_Medicament, String type_Medicament, String range, int doseJournaliere, int dosesPrise) {
        this.idMedicament = idMedicament;
        this.libelle_Medicament = libelle_Medicament;
        Type_Medicament = type_Medicament;
        Range = range;
        DoseJournaliere = doseJournaliere;
        DosesPrise = dosesPrise;
    }

    public Medicament() {
    }

    public int getIdMedicament() {
        return idMedicament;
    }

    public void setIdMedicament(int idMedicament) {
        this.idMedicament = idMedicament;
    }

    public String getLibelle_Medicament() {
        return libelle_Medicament;
    }

    public void setLibelle_Medicament(String libelle_Medicament) {
        this.libelle_Medicament = libelle_Medicament;
    }

    public String getType_Medicament() {
        return Type_Medicament;
    }

    public void setType_Medicament(String type_Medicament) {
        Type_Medicament = type_Medicament;
    }

    public String getRange() {
        return Range;
    }

    public void setRange(String range) {
        Range = range;
    }

    public int getDoseJournaliere() {
        return DoseJournaliere;
    }

    public void setDoseJournaliere(int doseJournaliere) {
        DoseJournaliere = doseJournaliere;
    }

    public int getDosesPrise() {
        return DosesPrise;
    }

    public void setDosesPrise(int dosesPrise) {
        DosesPrise = dosesPrise;
    }

    @Override
    public String toString() {
        return "Medicament{" +
                "idMedicament=" + idMedicament +
                ", libelle_Medicament='" + libelle_Medicament + '\'' +
                ", Type_Medicament='" + Type_Medicament + '\'' +
                ", Range='" + Range + '\'' +
                ", DoseJournaliere=" + DoseJournaliere +
                ", DosesPrise=" + DosesPrise +
                '}';
    }
}
