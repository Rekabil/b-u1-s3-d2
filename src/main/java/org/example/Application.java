package org.example;


import org.example.entities.EventoDAO;
import org.example.entities.JpaUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {
    private static final EntityManagerFactory emf = JpaUtils.getEntityManagerFactory();

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
try {

    EventoDAO eventoDAO = new EventoDAO(em);
    System.out.println("hello world");




} catch (Exception ex) {
    System.err.println(ex.getMessage());
} finally {
    em.close();
    emf.close();
}

    }
}