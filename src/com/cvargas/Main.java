package com.cvargas;

import java.util.ArrayDeque;
import java.util.Iterator;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Token token = new Token();
        //System.out.println(token.obtenerAlfabeto());
       // System.out.println(token.generarToken());

        ArrayDeque<String> cola = new ArrayDeque<>();
        for (int i =0;i<=10;i++) {
            cola.add(token.generarToken());
        }
        //System.out.println(cola);
        Iterator tokenGuardados = cola.iterator();
        System.out.println("Los valores de la lista de tokens es: ");
        while (tokenGuardados.hasNext()) {
            System.out.println(tokenGuardados.next());
        }

    }

}