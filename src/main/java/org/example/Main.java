package org.example;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) throws IOException {

        if (args[0].equals("server")) {
            Server();
        }
    }

    public static void Server() throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket socket = serverSocket.accept();
        Boolean Continuar = true;
        do {
            FuncioBasica.menu("MENU");
            switch (FuncioBasica.PedirNumero()) {
                case 1:

                    File Fichero = new File("src\\info.txt");
                    String Nombre = "";
                    Nombre = FuncioBasica.PedirNombre();
                    do {

                        



                        Funcionalidad.Juego(
                                FuncioBasica.RemplazarSeparar(FuncioBasica.LeerFichero(Fichero), false, 2));
                        Continuar = FuncioBasica.Continuar("\n¿Quieres volver a jugar?\n si/no\n");
                    } while (Continuar);
                    break;
                case 2:
                    System.out.println("Has salido del juego");
                    Continuar = false;
                    break;
                default:
                    break;
            }
        } while (Continuar);
        System.out.println("Client connected");
        // Send and receive data
        OutputStream out = socket.getOutputStream();
        ObjectOutputStream objectOut = new ObjectOutputStream(out);

        objectOut.writeObject(new Data(42));

        serverSocket.close();
    }
}