package org.example;


import org.example.entities.Evento;
import org.example.entities.EventoDAO;
import org.example.entities.JpaUtils;
import org.example.entities.TipoEvento;

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

    Evento evento = new Evento("Disco", 5 , "Discoteca A parigi" , 20   );
eventoDAO.save(evento);



} catch (Exception ex) {
    System.err.println(ex.getMessage());
} finally {
    em.close();
    emf.close();
}

    }
}