package org.example.entities;

import javax.persistence.*;
import java.text.DateFormat;
import java.util.List;

@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue
    private long id;

    private String nome;
    private String cognome;
    private String email;
    private DateFormat dataDiNascita;
    @Enumerated(EnumType.STRING)
    private Sesso sesso;
    private List<Evento> listaPartecipazioni;

    public Persona(String nome, String cognome, String email, DateFormat dataDiNascita, Sesso sesso) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataDiNascita = dataDiNascita;
        this.sesso = sesso;
    }

    public long getId() {
        return id;
    }

    public DateFormat getDataDiNascita() {
        return dataDiNascita;
    }

    public List<Evento> getListaPartecipazioni() {
        return listaPartecipazioni;
    }

    public Sesso getSesso() {
        return sesso;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setDataDiNascita(DateFormat dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setListaPartecipazioni(List<Evento> listaPartecipazioni) {
        this.listaPartecipazioni = listaPartecipazioni;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSesso(Sesso sesso) {
        this.sesso = sesso;
    }

}
