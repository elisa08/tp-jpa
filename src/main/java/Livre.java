import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="livre")

public class Livre {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="TITRE", length=30, unique=false, nullable=false)
    private String titre;

    @Column(name="AUTEUR", length=30, unique=false, nullable=false)
    private String auteur;

    @ManyToMany(mappedBy = "livres")

    private Set<Emprunt> emprunts;

    public Livre() {
        super();
    }

    public String toString() {
        return titre+" "+auteur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }



}

