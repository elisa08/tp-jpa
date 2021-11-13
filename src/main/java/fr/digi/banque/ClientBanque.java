package fr.digi.banque;



import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class ClientBanque {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    @Column(nullable = true)
    private Date dateNaissance;
    @Embedded
    private Adresse adresse;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="compte_client",joinColumns= @JoinColumn(name="ID_CLIENT",referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "ID_COMPTE", referencedColumnName = "ID")
    )
    private Set<Compte> comptes;

    {
        comptes= new HashSet<>();
    }

    @ManyToOne
    @JoinColumn(name = "ID_BANQUE")
    private Banque banque;

    public Banque getBanque() {
        return banque;
    }

    public void setBanque(Banque banque) {
        this.banque = banque;
    }

    public ClientBanque() {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
    }

    public Set<Compte> getComptes() {
        return comptes;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public void addCompte(Compte compte){
        comptes.add(compte);
    }
}
