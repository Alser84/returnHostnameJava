package org.example;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) {
        getHostname();
    }

    static void getHostname(){
        try {
            InetAddress id = InetAddress.getLocalHost();
            System.out.println("Hostname is " + id);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }

}