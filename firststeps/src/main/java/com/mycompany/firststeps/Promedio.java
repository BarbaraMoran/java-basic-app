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
public class Promedio {
    
       
    
     public static void main(String[] args) throws IOException {
  
        System.out.println("Ingrese primer numero");
        Integer num1 = cargarNumero();
        
        System.out.println("Ingrese segundo numero");
        Integer num2 = cargarNumero();
        
        
        System.out.println("Ingrese tercer numero");
        Integer num3 = cargarNumero();
        
        
        calcularPromedio(num1, num2, num3);
        System.out.println("Programa completado");

      }
      
    
      private static Integer cargarNumero() throws IOException{
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        String strNum = buffer.readLine();
        Integer num = Integer.parseInt(strNum);
        
        return num;


      }
      
      /**
       * Esta función sirve para calcular cual es el nº promedio de tres num.
       * @param num1
       * @param num2
       * @param num3 
       */
      private static void calcularPromedio(Integer num1, Integer num2, Integer num3) {
        
    Float promedio = Float.valueOf(num1 + num2 + num3) / 3;
     
             System.out.println("El nº promedio es " + promedio);

      }
      
}
