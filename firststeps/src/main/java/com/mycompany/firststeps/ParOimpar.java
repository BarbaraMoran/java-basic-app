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
public class ParOimpar {
    
   public static void main(String[] args) throws IOException {
       
                  System.out.println("Ingrese número");

        Integer inputNumber = cargarNumero();

        Boolean isEven = inputNumber %2 == 0;
        
        if (isEven) {
                    System.out.println("Es par");

        } else {
                    System.out.println("Es impar");

        }
    

          
             
     }

    
     private static Integer cargarNumero() throws IOException{
         
    InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        String strNum = buffer.readLine();
        Integer num = Integer.parseInt(strNum);
             
        
        return num;
     }
        
    
}
