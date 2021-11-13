package fr.digi.banque;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
    private int numero;
    private String voie;
    private int codePostal;
    private String ville;

    public Adresse() {
        this.numero = numero;
        this.voie = voie;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getVoie() {
        return voie;
    }

    public void setVoie(String voie) {
        this.voie = voie;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
