package org.example.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.text.DateFormat;
@Entity
@DiscriminatorValue("PartitaDiCalcio")
public class PartitaDiCalcio extends Evento{


private String squadraDiCasa;
private String squadraOspite;
private String squadraVincente;
private int golCasa;
private int golOspite;






    public PartitaDiCalcio(String titolo, String dataEvento, String descrizione, int numeroMassimoParticipati, Location location, String squadraDiCasa,
    String squadraOspite, int golCasa, int golOspite) {
        super(titolo, dataEvento, descrizione, numeroMassimoParticipati, location);
        this.squadraDiCasa = squadraDiCasa;
        this.squadraOspite = squadraOspite;
        this.golCasa = golCasa;
        this.golOspite = golOspite;

        if (golCasa == golOspite) {
            this.squadraVincente = null;
        } else if (golCasa < golOspite) {
            this.squadraVincente = squadraOspite;
        } else {
            this.squadraVincente = squadraDiCasa;
        }
    }

    public int getGolCasa() {
        return golCasa;
    }

    public int getGolOspite() {
        return golOspite;
    }

    public String getSquadraDiCasa() {
        return squadraDiCasa;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public String getSquadraVincente() {
        return squadraVincente;
    }

    public void setGolCasa(int golCasa) {
        this.golCasa = golCasa;
    }

    public void setGolOspite(int golOspite) {
        this.golOspite = golOspite;
    }

    public void setSquadraDiCasa(String squadraDiCasa) {
        this.squadraDiCasa = squadraDiCasa;
    }

    public void setSquadraOspite(String squadraOspite) {
        this.squadraOspite = squadraOspite;
    }

    public void setSquadraVincente(String squadraVincente) {
        this.squadraVincente = squadraVincente;
    }

    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                "squadraDiCasa='" + squadraDiCasa + '\'' +
                ", squadraOspite='" + squadraOspite + '\'' +
                ", squadraVincente='" + squadraVincente + '\'' +
                ", golCasa=" + golCasa +
                ", golOspite=" + golOspite +
                '}';
    }
}
