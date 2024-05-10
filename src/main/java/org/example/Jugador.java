package org.example;

import java.io.Serializable;

public class Jugador implements Serializable {
    private String nomJugador;
    private boolean ganador = false;
    private boolean atino = true;
    private boolean turno = false;

    public Jugador(String nomJugador) {
        this.nomJugador = nomJugador;
    }
    public Jugador(String nomJugador, boolean turno) {
        this.nomJugador = nomJugador;
        this.turno = turno;
    }
    public String getNomJugador() {
        return nomJugador;
    }

    public void setNomJugador(String nomJugador) {
        this.nomJugador = nomJugador;
    }

    public Boolean getGanador() {
        return ganador;
    }

    public void setGanador(Boolean turno) {
        this.ganador = turno;
    }

    public boolean isAtino() {
        return atino;
    }

    public void setAtino(boolean atino) {
        this.atino = atino;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }
}
