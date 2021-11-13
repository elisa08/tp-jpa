package fr.digi.banque;

import ch.qos.logback.core.net.server.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestBanque {

    public static void main(String[]args){

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("test-jpa-banque");
        EntityManager em= emf.createEntityManager();

        EntityTransaction et= em.getTransaction();

        et.begin();

        System.out.println(em);


       AssuranceVie av= em.find(AssuranceVie.class,3);

       ClientBanque client= em.find(ClientBanque.class,12);

       client.addCompte(av);

        em.persist(client);


        et.commit();





    }

}
