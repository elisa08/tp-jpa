import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Set;

public class TestBibliotheque {

    public static void main(String[]args){

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("test-jpa");
        EntityManager em= emf.createEntityManager();

        System.out.println(em);


        Emprunt emprunt= em.find(Emprunt.class,1);

        System.out.println(emprunt);

        Client client= em.find(Client.class,1);

        Set<Emprunt> emprunts= client.getEmprunts();

        for (Emprunt emp:emprunts) {

            System.out.println(emp);

        }



    }
}
