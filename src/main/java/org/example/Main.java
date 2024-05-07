package org.example;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Boolean Continuar = true;
        do {
            FuncioBasica.menu("MENU");
            switch (FuncioBasica.PedirNumero()) {

                case 3:
                    File Ranking = new File("src\\ranking.txt");
                    FuncioBasica.menu("PUNTAJES");
                    System.out.println();
                    String[] Rank = FuncioBasica.RemplazarSeparar(FuncioBasica.LeerFichero(Ranking), true, 0);
                    for (int i = 0; i < Rank.length; i++) {
                        System.out.println(Rank[i]);
                    }
                    FuncioBasica.Esperar();
                    break;
                case 1:
                    Boolean Continue = false;
                    int Puntos = 0;
                    File Fichero = new File("src\\info.txt");
                    Boolean Modificar = false;
                    String Nombre = "";
                    //do {

                    Modificar = true;

                    Nombre = FuncioBasica.PedirNombre();
                    //Boolean Reescr = false;
                    //Puntos = FuncioBasica.Reescribir(Nombre, Puntos, Modificar,Reescr);
                    //Modificar=true;
                    //System.out.println("El puntaje registrado es de: " + Puntos);
                    // (!FuncioBasica.Continuar("\n¿Quieres jugar con esos datos?\n si/no\n")) {
                    //    Puntos -= Puntos = FuncioBasica.Reescribir(Nombre, Puntos, Modificar,Reescr);
                    //    Modificar = false;
                    //}
                    //} while (!Modificar);

                    do {
                        Funcionalidad.Juego(
                                FuncioBasica.RemplazarSeparar(FuncioBasica.LeerFichero(Fichero), false, 2),
                                Puntos);
                        Continue = FuncioBasica.Continuar("\n¿Quieres volver a jugar?\n si/no\n");
                    } while (Continue);
                    //FuncioBasica.Ranking(Puntos, Nombre, Modificar);
                    break;
                case 2:
                    System.out.println("Has salido del juego");
                    Continuar = false;
                    break;
                default:
                    break;
            }

        } while (Continuar);

    }
}