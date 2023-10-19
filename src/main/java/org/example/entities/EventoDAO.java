package org.example.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class EventoDAO {
    private final EntityManager em;

    public EventoDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Evento evento) {
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();

        em.persist(evento);

        transaction.commit();
        System.out.println("Nuovo Evento Salvato Con Successo");
    }
public Evento findById(long id) {
        return em.find(Evento.class, id);
}

public void deleteById(long id) {
        Evento found = em.find(Evento.class, id);

        if (found != null) {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.remove(found);
            transaction.commit();
            System.out.println("Evento Rimosso Con Succeso");
        } else {
            System.err.println("Evento Non Essiste");
        }
}

public void getConcertiInStreaming(boolean streaming) {

EntityTransaction transaction = em.getTransaction();
transaction.begin();

    Query query = em.createQuery("SELECT a FROM Concerto a WHERE a.streaming LIKE :streaming ");
query.setParameter("steaming",  streaming);

 List<Concerto> resultati = query.getResultList();

 System.out.println("Lista Concerti in Streaming: " +resultati);
}

public void getConcertiPerGenere(Genere genere) {

    EntityTransaction transaction = em.getTransaction();
    transaction.begin();

    Query query = em.createQuery("SELECT a FROM Concerto a WHERE a.genere LIKE :genere ");
    query.setParameter("genere",  genere);

    List<Concerto> resultati = query.getResultList();

    System.out.println("Lista Concerti Di Genere " + genere +": " +resultati);
}

}
