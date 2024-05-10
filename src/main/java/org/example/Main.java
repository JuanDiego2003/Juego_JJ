package org.example;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.example.Funcionalidad.*;
import static org.example.Interficie.mostrarEstat;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        datosVO datos = new datosVO();
        if (args[0].equals("server")) {
            Server(datos);
        } else if (args[0].equals("client")) {
            Client();
        }
    }

    public static void Server(datosVO datos) throws IOException, ClassNotFoundException {
        ServerSocket serverSocket = new ServerSocket(8080);
        List<Socket> listaConexiones = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Socket socket = serverSocket.accept();
            listaConexiones.add(socket);
            System.out.println("Jugador conectado");
        }

        boolean Continuar = true;
        do {
            FuncioBasica.menu("MENU");
            switch (FuncioBasica.PedirNumero()) {
                case 1:
                    File Fichero = new File("src\\info.txt");
                    do {
                        datos.setFinalizar(false);
                        Funcionalidad.Juego(
                                FuncioBasica.RemplazarSeparar(FuncioBasica.LeerFichero(Fichero), false, 2), datos);
                        while (!datos.isFinalizar()) {
                            for (Socket socket : listaConexiones) {
                                do {
                                    if (datos.getJugador() == null) {
                                        datos.setJugador(new Jugador("", true));
                                    }
                                    for (Socket socketinfo : listaConexiones) {
                                        OutputStream out = socketinfo.getOutputStream();
                                        ObjectOutputStream objectOut = new ObjectOutputStream(out);
                                        if (socket.equals(socketinfo)) {
                                            objectOut.writeObject(datos);
                                        } else {
                                            datos.getJugador().setTurno(false);
                                            objectOut.writeObject(datos);
                                        }
                                    }
                                    InputStream in = socket.getInputStream();
                                    ObjectInputStream objectIn = new ObjectInputStream(in);
                                    datos = (datosVO) objectIn.readObject();
                                    datos.setFinalizar(Comparar(datos));
                                } while (datos.getJugador().isAtino());
                                datos.getJugador().setTurno(false);
                            }

                            Continuar = FuncioBasica.Continuar("\n¿Quieres volver a jugar?\n si/no\n");
                        }
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


        serverSocket.close();
    }

    public static void Client() throws IOException, ClassNotFoundException {
        Socket socket = new Socket("localhost", 8080);
        String nombre = "";
        nombre = FuncioBasica.PedirNombre();
        Jugador jugador = new Jugador(nombre);
        System.out.println("Esperando Jugadores");
        boolean finalizar = false;
        while (!finalizar) {
            InputStream in = socket.getInputStream();
            ObjectInputStream objectIn = new ObjectInputStream(in);
            datosVO datos = (datosVO) objectIn.readObject();
            if ("".equals(datos.getJugador().getNomJugador())) {
                datos.getJugador().setNomJugador(nombre);
                jugador = datos.getJugador();
            }
            mostrarEstat(datos.getCatnError());
            MostrarOculto(datos.getOculto());
            System.out.println("Es turno de: " + datos.getJugador().getNomJugador());
            if (datos.getJugador().isTurno()) {
                datos.setJugador(jugador);
                finalizar = datos.isFinalizar();
                System.out.println("Received data1: " + datos.isFinalizar());

                if (datos.isFinalizar() || datos.getJugador().getGanador()) {
                    ResultadoJuego(datos);
                }
                if (!datos.getJugador().getGanador() && datos.getJugador().isAtino()) {
                    char letra = Pedirletra();
                    datos.setLetra(letra);
                }
                OutputStream out = socket.getOutputStream();
                ObjectOutputStream objectOut = new ObjectOutputStream(out);
                objectOut.writeObject(datos);
            }
        }

    }
}