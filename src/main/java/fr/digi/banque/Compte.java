package fr.digi.banque;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE")
public class Compte {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String numero;
    private Double solde;

    @ManyToMany(mappedBy = "comptes")
    private Set<ClientBanque> clientsBanque;

    {
        clientsBanque= new HashSet<>();
    }

    @OneToMany(mappedBy = "comptesListe")
    private Set<Operation> operations;

    public Compte() {
        this.numero = numero;
        this.solde = solde;
    }

    public Set<ClientBanque> getClientsBanque() {
        return clientsBanque;
    }

    public void setClientsBanque(Set<ClientBanque> clientsBanque) {
        this.clientsBanque = clientsBanque;
    }

    public void addClients(ClientBanque client){
        clientsBanque.add(client);
    }

    public Set<Operation> getOperations() {
        return operations;
    }

    public void setOperations(Set<Operation> operations) {
        this.operations = operations;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }
}
