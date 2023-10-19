package org.example.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.text.DateFormat;
import java.util.Set;
@Entity
@DiscriminatorValue("GaraDiAtletica")
public class GaraDiAtletica extends Evento{

    private Set<Persona> atleti;
    private Persona vincitore;


    public GaraDiAtletica(String titolo, String dataEvento, String descrizione, int numeroMassimoParticipati, Location location , Set<Persona> atleti, Persona vincitore) {
        super(titolo, dataEvento, descrizione, numeroMassimoParticipati, location);
        this.atleti = atleti;
        this.vincitore = vincitore;
    }

    public Persona getVincitore() {
        return vincitore;
    }

    public Set<Persona> getAtleti() {
        return atleti;
    }

    public void setAtleti(Set<Persona> atleti) {
        this.atleti = atleti;
    }

    public void setVincitore(Persona vincitore) {
        this.vincitore = vincitore;
    }

    @Override
    public String toString() {
        return "GaraDiAtletica{" +
                "atleti=" + atleti +
                ", vincitore=" + vincitore +
                '}';
    }
}
