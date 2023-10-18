package org.example.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class LocationDAO {
    private final EntityManager em;

    public LocationDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Location evento) {
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();

        em.persist(evento);

        transaction.commit();
        System.out.println("Nuovo Location Salvato Con Successo");
    }
    public Location findById(long id) {
        return em.find(Location.class, id);
    }

    public void deleteById(long id) {
        Location found = em.find(Location.class, id);

        if (found != null) {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.remove(found);
            transaction.commit();
            System.out.println("Location Rimosso Con Succeso");
        } else {
            System.err.println("Location Non Essiste");
        }
    }
}
