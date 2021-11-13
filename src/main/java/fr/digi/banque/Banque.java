package fr.digi.banque;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Banque {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String nom;

    @OneToMany(mappedBy = "banque",cascade = CascadeType.ALL)
    private Set<ClientBanque> clientsBanque;

    public int getId() {
        return id;
    }

    public Banque() {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
