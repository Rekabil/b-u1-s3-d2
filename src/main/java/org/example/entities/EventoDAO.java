package org.example.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

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


}
