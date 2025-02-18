package org.example;

/**
 * Arrai del diseño del muñeco del ahorcado
 *
 * @author Juan Diego
 */
public class Interficie {

    static char[][][] estats = {
            {
                    { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
                    { '|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' }
            },
            {
                    { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
                    { '|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '*', '*', '*', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '*', ' ', '*', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '*', '*', '*', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' }
            },
            {
                    { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
                    { '|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '*', '*', '*', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '*', ' ', '*', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '*', '*', '*', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' }
            },
            {
                    { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
                    { '|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '*', '*', '*', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '*', ' ', '*', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '*', '*', '*', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '/', '|', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' }
            },
            {
                    { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
                    { '|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '*', '*', '*', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '*', ' ', '*', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '*', '*', '*', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '/', '|', '\\', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' }
            },
            {
                    { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
                    { '|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '*', '*', '*', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '*', ' ', '*', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '*', '*', '*', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '/', '|', '\\', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' }
            },
            {
                    { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
                    { '|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '*', '*', '*', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '*', ' ', '*', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '*', '*', '*', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '/', '|', '\\', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' }
            },
            {
                    { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
                    { '|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '*', '*', '*', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '*', ' ', '*', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '*', '*', '*', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '/', '|', '\\', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' }
            },
            {
                    { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
                    { '|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '*', '*', '*', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '*', ' ', '*', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '*', '*', '*', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '/', '|', '\\', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '-', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' }
            },
            {
                    { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
                    { '|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '*', '*', '*', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '*', ' ', '*', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '*', '*', '*', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '/', '|', '\\', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', '-', ' ', '-', ' ', ' ', ' ', '|' },
                    { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
                    { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' }
            }
    };

    /**
     * Array que recorre y muestra el array
     *
     * @param numEstat Variable obtenida por parametro y se usa para recorrer el
     *                 array
     */
    public static void mostrarEstat(int numEstat) {
        for (int j = 0; j < estats[numEstat].length; j++) {
            for (int k = 0; k < estats[numEstat][j].length; k++) {
                System.out.print(estats[numEstat][j][k]);
            }
            System.out.println();
        }

    }
}
