package fr.digi.banque;


import javax.persistence.Entity;


@Entity
public class Virement extends Operation{


    private String beneficiaire;

    public Virement() {
        super();
        this.beneficiaire = beneficiaire;
    }

    public String getBeneficiaire() {
        return beneficiaire;
    }

    public void setBeneficiaire(String beneficiaire) {
        this.beneficiaire = beneficiaire;
    }
}
