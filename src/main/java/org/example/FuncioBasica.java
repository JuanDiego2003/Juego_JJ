package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FuncioBasica {

    // Variable global
    static public Scanner sc = new Scanner(System.in);

    /**
     * Funcion que lee el contenido de un fichero y lo guarda en un string
     *
     * @param Fich Ruta del fichero que sera leido
     * @return String Contenido del fichero
     * @throws IOException
     */
    public static String LeerFichero(File Fich) throws IOException {
        FileReader Leer = new FileReader(Fich);
        int Valor = Leer.read();
        String texto = "";
        while (Valor != -1) {
            texto = texto + (char) Valor;
            Valor = Leer.read();
        }
        return texto;
    }

    /**
     * Funcion que Separa palabras y quita caracteres dependiendo del contenido
     * de la variable por parametro split
     *
     * @param texto texto que estaba en el fichero
     * @return String[] Array en el que se almacena el resultado
     */
    public static String[] RemplazarSeparar(String texto, boolean hacer, int mostrar) {
        texto = texto.replace("\r", "");
        String[] Palabras = texto.split("\n");
        return Palabras;
    }

    // Parte de arriba y abajo de los enunciado con -
    public static void PartmenuSuperior() {
        for (int i = 0; i < 42; i++) {
            System.out.print("-");
        }
    }

    /**
     * Funcion que hace la parte central con - dependiendo del tamaño del textp
     *
     * @param numRestar
     */
    public static void PartmenuMedio(int numRestar) {
        for (int i = 0; i < 19 - numRestar; i++) {
            System.out.print("-");
        }
    }

    /**
     * Mostrar Enunciado/Menu
     *
     * @param mensaje mensaje que sera mostrado
     */
    public static void menu(String mensaje) {
        int Restar = 0;

        PartmenuSuperior();
        System.out.println();
        if (mensaje.length() != 4) {
            Restar = (mensaje.length() - 4) / 2;
        }
        PartmenuMedio(Restar);
        System.out.print(mensaje);
        PartmenuMedio(Restar);
        System.out.println();
        PartmenuSuperior();
        if (mensaje.equals("MENU")) {
            System.out.println("\nQue deseas hacer");
            System.out.println("1- Jugar");
            System.out.println("2- Salir");
        }
        System.out.println();
    }

    /**
     * Funcio que pide un string, lo compara conciertos requisitos y lo
     * conviente en int
     *
     * @return int Devuelve el String convertido en int
     */
    public static int PedirNumero() {
        System.out.print("Ingresa tu eleccion: ");
        int opcion = 3;
        String opc = "";
        Boolean correcto = true;
        do {
            correcto = true;
            opc = sc.nextLine();
            if (!opc.equals("0") && !opc.equals("1") && !opc.equals("2")) {
                System.out.println("ingresa una opcion correcta");
                menu("MENU");
                correcto = false;
            }
        } while (!correcto);
        opcion = Integer.parseInt(opc);

        return opcion;
    }

    /**
     * Funcion que pregunta al usuario si quiere volver a jugar
     *
     * @return boolean Dependiendo otra funcion realizara una u otra accion
     */
    public static boolean Continuar(String texto) {
        Boolean continua = false;
        System.out.println(texto);
        String continuar = sc.nextLine().toLowerCase();
        if (continuar.equals("si")) {
            continua = true;
        }
        return continua;
    }

    /**
     * Funcion que se encarga de tomar los puntos, pedir un nombre y guardarlos
     * en un archivo
     *
     * @param puntos Puntaje obtenido de otra funcion
     * @throws IOException
     */
    public static void Ranking(int puntos, String Nombre, Boolean Modificar) throws IOException {
        File Ranking = new File("src\\ranking.txt");
        FileWriter Esc = new FileWriter(Ranking, true);
        BufferedWriter Enviar = new BufferedWriter(Esc);
        Boolean Reescr = true;

        if (Reescribir(Nombre, puntos, Modificar, Reescr) == 0) {
            Enviar.write(Nombre + "-" + puntos + "-puntos;");
            Enviar.close();
        }
        System.out.println(Nombre + " " + puntos + " puntos \nSe ha guardado\n");

    }

    public static String PedirNombre() {
        System.out.println("Introduce el nombre de jugador");
        String Nom = "";
        do {
            Nom = sc.nextLine();
            if (Nom.isEmpty()) {
                System.out.println("El campo no puede estar en blanco");
            }
            Nom = Nom.replace(" ", "");
        } while (Nom.isEmpty());
        return Nom;
    }

    public static int Reescribir(String Nombre, int puntos, Boolean Modificar, boolean reescr) throws IOException {
        // contenido de Fichero en un array
        File Fich = new File("src\\ranking.txt");

        String Lista = LeerFichero(Fich);
        String[] texto = RemplazarSeparar(Lista, true, 1);
        // devolvera el puntaje al final
        int Aux = 0;
        // Sera lo mismo que la El string donde estan los datos pero habiendo editado el
        // puntaje
        String Rem = "";
        // Recorrer todo el array
        for (int i = 0; i < texto.length; i++) {
            // Comparar si el texto de la posicion i del array con el nombre que fue
            // introducido
            // Aqui es lo que me falla

            if (texto[i].toLowerCase().equals(Nombre.toLowerCase())) {
                FileWriter Esc = new FileWriter(Fich);
                BufferedWriter Enviar = new BufferedWriter(Esc);
                Aux = Integer.parseInt(texto[i + 1] + 1);
                int num = Integer.parseInt(texto[i + 1]) + 1;

                if (Modificar) {
                    if (reescr) {
                        Aux = puntos;
                    } else {
                        num -= 1;
                    }
                    Rem = Lista.replace(num + "", Aux + "");
                    Enviar.write(Rem);
                    if (reescr) {
                        Aux = 1;
                    }
                } else {
                    System.out.println("El nombre " + Nombre + " ha sido guardado anteriormente");
                    Rem = Lista;
                    Enviar.write(Rem);
                }
                Enviar.close();
            }
        }
        return Aux;
    }

    /*
     * funcion que hice para que al aparecer los puntajes se tuviera que dar enter
     * para poder continuar
     */
    public static void Esperar() {
        System.out.println("Pulsa enter para continuar");
        String Entrada = sc.nextLine();
    }

}