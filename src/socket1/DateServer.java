/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Franklin
 */
public class DateServer {

     public static void main(String[] args) {
        try {
            ServerSocket sock = new ServerSocket(6013);
            /* escuchar para detectar conexiones */
            while (true) {
                Socket client = sock.accept();
                PrintWriter pout = new PrintWriter(client.getOutputStream(), true);
                /* escribir la fecha para el socket */
                pout.println(new java.util.Date().toString());
                /* cerrar el socket y reanudar */
                /* la escucha para detectar conexiones */
                client.close();
            }
        } catch (IOException ioe) {
            System.err.println(ioe);
        }
    }
    
}
