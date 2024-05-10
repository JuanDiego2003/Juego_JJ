package org.example;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class datosVO implements Serializable {
    private Jugador jugador;
    private char[] palabra;
    private char[] oculto;
    private char letra;

    private int catnError;

    private boolean finalizar=false;

    private String ganador;


    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public char[] getOculto() {
        return oculto;
    }

    public void setOculto(char[] oculto) {
        this.oculto = oculto;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public boolean isFinalizar() {
        return finalizar;
    }

    public void setFinalizar(boolean finalizar) {
        this.finalizar = finalizar;
    }

    public int getCatnError() {
        return catnError;
    }

    public void setCatnError(int catnError) {
        this.catnError = catnError;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }
}
