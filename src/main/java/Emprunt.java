import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Emprunt {

    @Id()
    private int id;


    private Date date_debut;
    @Column(name="DATE_FIN",nullable = true)
    private Date date_fin;

    @Column(name="DELAI",nullable = true)
    private String delai;

    @ManyToMany
    @JoinTable(name="compo",
            joinColumns = @JoinColumn(name="ID_EMP",referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name="ID_LIV",referencedColumnName = "ID")
    )

    private Set<Livre> livres;

    @ManyToOne
    @JoinColumn(name="ID_CLIENT")
    private Client client;

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public String getDelai() {
        return delai;
    }

    public void setDelai(String delai) {
        this.delai = delai;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String toString(){
        return this.livres+" "+this.delai;
    }
}
