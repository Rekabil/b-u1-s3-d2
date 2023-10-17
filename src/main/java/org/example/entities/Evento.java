package org.example.entities;


import javax.persistence.*;

@Entity
@Table(name = "evento")
public class Evento {

    @Id
    @GeneratedValue
    private long id;

    private String titolo;
    private int dataEvento;
    private String descrizione;

    @Enumerated(EnumType.STRING)
    private TipoEvento tipoEvento;
    private int numeroMassimoParticipati;

    public Evento (String titolo, int dataEvento, String descrizione, int numeroMassimoParticipati) {
        this.titolo = titolo;
        this.dataEvento= dataEvento;
        this.descrizione = descrizione;
        this.tipoEvento = TipoEvento.PRIVATO;
        this.numeroMassimoParticipati = numeroMassimoParticipati;

    }

    public String getTitolo() {
        return titolo;
    }

    public int getDataEvento() {
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

    public void setDataEvento(int dataEvento) {
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
