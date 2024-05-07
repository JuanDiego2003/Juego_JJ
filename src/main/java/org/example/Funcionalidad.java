package org.example;

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
     * @param Puntos   Obtiene el numero de puntos por parametro
     * @return int devuelve los puntos para poder trabajar con ellos
     */
    public static void Juego(String[] Palabras, int Puntos) {
        //int Puntaje = Puntos;
        //Punt = Puntaje;
        String Palab = Palabras[NumRandom(Palabras)].toLowerCase();
        char[] Palabra = Palab.toCharArray();
        char[] Oculto = new char[Palabra.length];
        Ocultar(Oculto);
        Boolean Acabado = false;
        do {
            MostrarOculto(Oculto);
            char Letra = Pedirletra();
            Acabado = Comparar(Palabra, Oculto, Letra);
        } while (Acabado == false);
        System.out.println("Escribiste:");
        MostrarOculto(Oculto);
        //Puntaje = Punt;
        System.out.println("El juego ha finalizado");
        //System.out.println("Tu puntaje es " + Puntaje);
        CantErrores = 0;
        //return Puntaje;
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
     * @param Palabra  Array compuesto de los caracteres de una palabra
     * @param Oculto   Array que cambia los caracteres de una palabra con *
     * @param Caracter Caracter que introduce el usuario
     * @return Boolean Este da la señal a otra funcion para que no pida mas
     *         caracteres
     */
    public static Boolean Comparar(char[] Palabra, char[] Oculto, char Caracter) {
        Boolean Acabar = true;
        Boolean Err = true;
        String Palab = "";
        for (int i = 0; i < Palabra.length; i++) {
            Palab = Palab + Palabra[i];
            if (Palabra[i] == Caracter) {
                if (Palabra[i] == Oculto[i]) {
                    System.out.println("Ya habias puesto esa letra");
                }
                Oculto[i] = Caracter;
                Err = false;
            }

            if (Palabra[i] != Oculto[i]) {
                Acabar = false;
            }
        }
        if (Err) {
            Interficie.mostrarEstat(CantErrores);
            CantErrores = ContError(CantErrores);
        }
        if (CantErrores == 10) {
            Acabar = true;
            System.out.println("La palabra era: " + Palab);
        }
        /*if (Acabar) {
            if (CantErrores < 10) {
                Punt += 5;
                System.out.println("Se te sumaran 5 puntos");

            } else if (Puntaje > 0 && CantErrores == 10) {
                Punt -= 5;
                System.out.println("Se te restaran 5 puntos");
            }

        }*/

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
        Boolean Correcto = true;
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
     * @param Errores Cantidad de errores
     * @return int Devuelve la cantidad de errores + 1
     */
    public static int ContError(int Errores) {
        return Errores += 1;
    }

}
