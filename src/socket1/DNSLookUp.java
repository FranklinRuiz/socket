/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package socket1;

/* Uso: java DNSLookUp<nombre IP>
p.e. java DNSLookUp www.utp.edu.pe */
import java.net.*;

public class DNSLookUp {

    public static void main(String[] args) {
        InetAddress hostAddress;
        try {
            hostAddress = InetAddress.getByName(args[0]);
            System.out.println(hostAddress.getHostAddress());
        } catch (UnknownHostException uhe) {
            System.err.println("Unknownhost: " + args[0]);
        }
    }
}
