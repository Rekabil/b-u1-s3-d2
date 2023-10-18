package org.example.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PersonaDAO {
    private final EntityManager em;

    public PersonaDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Persona persona) {
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();

        em.persist(persona);

        transaction.commit();
        System.out.println("Nuovo Evento Salvato Con Successo");
    }
    public Persona findById(long id) {
        return em.find(Persona.class, id);
    }

    public void deleteById(long id) {
        Persona found = em.find(Persona.class, id);

        if (found != null) {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.remove(found);
            transaction.commit();
            System.out.println("Persona Rimosso Con Succeso");
        } else {
            System.err.println("Persona Non Essiste");
        }
    }
}
