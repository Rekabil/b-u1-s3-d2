package org.example.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PartecipazioneDAO {
    private final EntityManager em;

    public PartecipazioneDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Partecipazione evento) {
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();

        em.persist(evento);

        transaction.commit();
        System.out.println("Nuovo Evento Salvato Con Successo");
    }
    public Partecipazione findById(long id) {
        return em.find(Partecipazione.class, id);
    }

    public void deleteById(long id) {
        Partecipazione found = em.find(Partecipazione.class, id);

        if (found != null) {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.remove(found);
            transaction.commit();
            System.out.println("Partecipazione Rimosso Con Succeso");
        } else {
            System.err.println("Partecipazione Non Essiste");
        }
    }
}
