package com.cvargas;

import java.util.Random;

class Token {
    /*
      @method metodo principal
        @description Clase generadora de tokens
      */
    public String obtenerAlfabeto() {

        String alfabeto = "";
        char x = 'A';
        for (int i = 0; i <= 25; i++) {
            String charToString = String.valueOf(x++);
            //System.out.println(charToString);
            //iteramos caracter y concatenamos en alfabeto
            alfabeto = alfabeto.concat(charToString);
        }// fin de while
        return alfabeto;
    }
    public String generarToken(){
        String token = "";
        Random random = new Random();
        String alfabeto = obtenerAlfabeto();
        for (int i =0; i<=3; i++){
            char c = alfabeto.charAt(random.nextInt(alfabeto.length()));
            String charToString = String.valueOf(c);
            token = token.concat(String.valueOf(c));
        }
        return token;
    }

}