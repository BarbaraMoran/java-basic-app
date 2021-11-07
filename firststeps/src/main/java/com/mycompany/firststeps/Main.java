/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firststeps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Bárbara
 */
public class Main {
    
    public static void main(String[] args) throws IOException {
        
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        System.out.println("Ingrese su edad");
        String strEdad = buffer.readLine();
        //en esta variable guardamos lo que he hemos escrito desde el teclado
        Integer edad = Integer.parseInt(strEdad);
        //aquí convertimos el string escrito en teclado en nº
        System.out.println("Hello "+edad);

        String name = "Lucas";
         name = "Gabriel";
         name = "Julieta";
        Integer followersInstagram = 123;
        Integer followersYouTube = 5650;
        
         String phrase = "Hola, mi nombre es " + name + " y tengo " + (followersInstagram + followersYouTube) + " followers en total";
         
        System.out.println(phrase);
        
           //Integer edad = 70;
        String phraseOld = "Es mayor de edad";
        String phraseYoung = "Es menor de edad";
        
        if (edad >= 18 ) {
        System.out.println(phraseOld);
        if (edad > 60) {
            System.out.println("Ya eres un abuelete");
        }
        }else {
        System.out.println(phraseYoung);
        }
        
        
    }
    
}
