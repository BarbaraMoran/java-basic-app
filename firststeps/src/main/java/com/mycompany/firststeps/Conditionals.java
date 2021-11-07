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
public class Conditionals {
    
      public static void main(String[] args) throws IOException {
  
        System.out.println("Ingrese primer numero");
        Integer edad1 = cargarNumero();
        
        System.out.println("Ingrese segundo numero");
        Integer edad2 = cargarNumero();
        
        
        System.out.println("Ingrese tercer numero");
        Integer edad3 = cargarNumero();
        
        
        calcularNumMayor(edad1, edad2, edad3);
                System.out.println("Programa completado");

      }
      
    
      
      private static Integer cargarNumero() throws IOException{
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        String strEdad = buffer.readLine();
        Integer edad = Integer.parseInt(strEdad);
        
        return edad;


      }
      
      /**
       * Esta función sirve para calcular cual es el nº mayor de entre tres.
       * @param edad1
       * @param edad2
       * @param edad3 
       */
      private static void calcularNumMayor(Integer edad1, Integer edad2, Integer edad3) {
        
        
        Integer mayor = edad1;
        
        if(edad2 > edad1){
            mayor = edad2;
        }
        
        if(edad3 > mayor){
          mayor = edad3;
        }
     
             System.out.println("El nº mayor es " + mayor);

      }
      
      
}