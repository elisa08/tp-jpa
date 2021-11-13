import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import static java.lang.System.*;

public class App {

    public static void main( String[] args ) {

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("test-jpa");
        EntityManager em= emf.createEntityManager();

        System.out.println(em);


        Emprunt emprunt= em.find(Emprunt.class,1);

        System.out.println(emprunt);

    }
}