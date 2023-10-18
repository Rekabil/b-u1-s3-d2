package org.example.entities;


import javax.persistence.*;
import java.text.DateFormat;
import java.util.Set;

@Entity
@Table(name = "evento")
public class Evento {

    @Id
    @GeneratedValue
    private long id;

    private String titolo;
    private DateFormat dataEvento;
    private String descrizione;

    @Enumerated(EnumType.STRING)
    private TipoEvento tipoEvento;
    private int numeroMassimoParticipati;

    private Location location;

    private Set<Partecipazione> partecipazioni;


    public Evento (String titolo, DateFormat dataEvento, String descrizione, int numeroMassimoParticipati, Location location ) {
        this.titolo = titolo;
        this.dataEvento= dataEvento;
        this.descrizione = descrizione;
        this.tipoEvento = TipoEvento.PRIVATO;
        this.numeroMassimoParticipati = numeroMassimoParticipati;

    }

    public String getTitolo() {
        return titolo;
    }

    public DateFormat getDataEvento() {
        return dataEvento;
    }

    public int getNumeroMassimoParticipati() {
        return numeroMassimoParticipati;
    }

    public long getId() {
        return id;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setDataEvento(DateFormat dataEvento) {
        this.dataEvento = dataEvento;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNumeroMassimoParticipati(int numeroMassimoParticipati) {
        this.numeroMassimoParticipati = numeroMassimoParticipati;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", dataEvento=" + dataEvento +
                ", descrizione='" + descrizione + '\'' +
                ", tipoEvento=" + tipoEvento +
                ", numeroMassimoParticipati=" + numeroMassimoParticipati +
                '}';
    }
}
