package org.example.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.text.DateFormat;

@Entity
@DiscriminatorValue("Concerto")
public class Concerto extends Evento{
    private Genere genere;
    private boolean streaming;

    public Concerto(String titolo, String  dataEvento, String descrizione, int numeroMassimoParticipati, Location location, Genere genere, boolean streaming) {
        super(titolo, dataEvento, descrizione, numeroMassimoParticipati, location);
        this.genere = genere;
        this.streaming = streaming;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Concerto{" +
                "genere=" + genere +
                ", streaming=" + streaming +
                '}';
    }
}
