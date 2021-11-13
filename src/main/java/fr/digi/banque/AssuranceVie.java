package fr.digi.banque;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;
@Entity
@DiscriminatorValue("AV")
public class AssuranceVie extends Compte{

    private Date dateFin;
    private Double taux;

    public AssuranceVie() {
        super();
        this.dateFin = dateFin;
        this.taux = taux;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Double getTaux() {
        return taux;
    }

    public void setTaux(Double taux) {
        this.taux = taux;
    }
}
