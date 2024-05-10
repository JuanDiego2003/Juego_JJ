package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Funcionalidad {
    // Funciones globales
    static public Scanner sc = new Scanner(System.in);
    static public int CantErrores = 0;
    static public int Punt = 0;

    /**
     * Funcion que devuelve un numero random entre 0 y el tamaño de un array
     *
     * @param Palabras Array pedido por parametro el cual se usa como limite
     * @return int Devuelve el numero random
     */
    public static int NumRandom(String[] Palabras) {
        Random Rnd = new Random();
        return Rnd.nextInt(Palabras.length);
    }

    /**
     * Funcionalidad principal del juego
     *
     * @param Palabras Array donde estan las palabras separadas
     * @return int devuelve los puntos para poder trabajar con ellos
     */
    public static void Juego(String[] Palabras, datosVO datos) {
        String Palab = Palabras[NumRandom(Palabras)].toLowerCase();
        char[] palabra = Palab.toCharArray();
        char[] oculto = new char[palabra.length];
        Ocultar(oculto);
        datos.setPalabra(palabra);
        datos.setOculto(oculto);
    }

    public static void ResultadoJuego(datosVO datos) {
        if (Arrays.equals(datos.getPalabra(), datos.getOculto())) {
            datos.setGanador("Ha ganado " + datos.getJugador().getNomJugador());
            System.out.println(datos.getGanador());
        }
        System.out.println("Escribiste:");
        MostrarOculto(datos.getOculto());
        System.out.println("El juego ha finalizado");
        CantErrores = 0;

    }

    /**
     * Funcion que cambia los caracteres de un array a *
     *
     * @param Oculto Array el cual seria usado
     */
    public static void Ocultar(char[] Oculto) {
        for (int i = 0; i < Oculto.length; i++) {
            Oculto[i] = '*';
        }
    }

    /**
     * Funcion la cual muestra el array que tiene * (Oculto)
     *
     * @param Oculto Array que cambio las letras por *
     */
    public static void MostrarOculto(char[] Oculto) {
        for (int i = 0; i < Oculto.length; i++) {
            System.out.print(Oculto[i] + " ");
        }
        System.out.println();

    }

    /**
     * Funcio que compara la letra introducida con las letras del array Palabra,
     * pone visible la letra en el array oculto, comprueba si fallo para llamar otra
     * funcion,
     * comprueba la cantidad de errores y realiza una u otra tarea dependiendo de
     * esta cantidad
     *
     * @return boolean Este da la señal a otra funcion para que no pida mas
     * caracteres
     */
    public static boolean Comparar(datosVO datos) {

        char caracter = datos.getLetra();
        Jugador jugador = datos.getJugador();
        jugador.setAtino(false);
        boolean Acabar = true;
        boolean Err = true;
        String Palab = "";
        for (int i = 0; i < datos.getPalabra().length; i++) {
            Palab = Palab + datos.getPalabra()[i];
            if (datos.getPalabra()[i] == caracter) {
                if (datos.getPalabra()[i] == datos.getOculto()[i]) {
                    System.out.println("Ya habias puesto esa letra");
                } else {
                    datos.getOculto()[i] = caracter;
                    Err = false;
                    datos.getJugador().setAtino(true);
                }
            }
            if (datos.getPalabra()[i] != datos.getOculto()[i]) {
                Acabar = false;
            }
        }
        if (Arrays.equals(datos.getPalabra(), datos.getOculto())){
            datos.getJugador().setGanador(true);
        }

        if (Err) {
            CantErrores = ContError(CantErrores);
            datos.setCatnError(CantErrores);
        }
        if (CantErrores == 10) {
            Acabar = true;
            System.out.println("La palabra era: " + Palab);
        }
        return Acabar;
    }

    /**
     * Funcion que se encarga de pedir un caracter al usuario y comprobar ciertos
     * requisitos para que no falle el programa
     *
     * @return char Devuelve el char introducido
     */
    public static char Pedirletra() {
        String Letr = "";
        boolean Correcto = true;
        do {
            System.out.print("Introduce la letra que creas que esta: ");
            Letr = sc.nextLine();
            if (Letr.length() > 1 || Letr.contains(" ") == true || Letr.isEmpty() == true) {
                System.out.println("Intoduce un caracter valido");
                Correcto = false;
            } else {
                Correcto = true;
            }
        } while (!Correcto);
        return Letr.charAt(0);
    }

    /**
     * Suma los errores que comete el usuario
     *
     * @param Errores Cantidad de errores
     * @return int Devuelve la cantidad de errores + 1
     */
    public static int ContError(int Errores) {
        return Errores += 1;
    }
}
