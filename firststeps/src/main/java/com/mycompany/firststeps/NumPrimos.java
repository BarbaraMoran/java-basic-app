/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firststeps;

import java.io.IOException;

/**
 *
 * @author Bárbara
 */
public class NumPrimos {
    
       public static void main(String[] args) throws IOException {
           
           String result = "";
           
           int acc = 0;
           int number= 1; 
           
           while (acc < 100) {
               if (comprobarPrimo(number)) {
               result += number + ",";
               acc++;
               
               }
               
               number++;
           }
           
           System.out.println(result);
           
       }
       
       private static Boolean comprobarPrimo(Integer number) {
           
           Boolean esPrimo = true;
           
           for (int i = 2; i < number; i++) {
               if (number % i == 0) {
                   esPrimo = false;
               }
            }
           
           return esPrimo;
           

       }
       
}
