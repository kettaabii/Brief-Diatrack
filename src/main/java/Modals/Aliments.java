package Modals;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aliments {
    @Id
    private int idAliment;
    private String nomAliment;
    private String Type;
    private String Range;
    private String image;
    private int nbr_de_repas;


    public Aliments(String nomAliment, String type, String range, String image, int nbr_de_repas) {
        this.nomAliment = nomAliment;
        Type = type;
        Range = range;
        this.image = image;
        this.nbr_de_repas = nbr_de_repas;
    }

    public Aliments() {

    }

    public int getIdAliment() {
        return idAliment;
    }

    public void setIdAliment(int idAliment) {
        this.idAliment = idAliment;
    }

    public String getNomAliment() {
        return nomAliment;
    }

    public void setNomAliment(String nomAliment) {
        this.nomAliment = nomAliment;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getNbr_de_repas() {
        return nbr_de_repas;
    }

    public void setNbr_de_repas(int nbr_de_repas) {
        this.nbr_de_repas = nbr_de_repas;
    }

    public String getRange() {
        return Range;
    }

    public void setRange(String range) {
        Range = range;
    }
}
