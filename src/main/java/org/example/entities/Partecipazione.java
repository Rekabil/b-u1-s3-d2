package org.example.entities;

import javax.persistence.*;

@Entity
@Table(name = "partecipazione")
public class Partecipazione {

    @Id
    @GeneratedValue
    private long id;

    @OneToMany
    @JoinColumn(name = "persona_id" , nullable = false)
    private Persona persona;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "evento_id", nullable = false)
    private Evento evento;

    @Enumerated(EnumType.STRING)
    private Stato stato;

    public Partecipazione(Persona persona, Evento evento) {
        this.persona = persona;
        this.evento = evento;
        this.stato = Stato.DA_CONFERMARE;
    }

    public long getId() {
        return id;
    }

    public Evento getEvento() {
        return evento;
    }

    public Persona getPersona() {
        return persona;
    }

    public Stato getStato() {
        return stato;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

}
