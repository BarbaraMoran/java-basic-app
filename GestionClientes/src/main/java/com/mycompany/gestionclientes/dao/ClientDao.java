/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionclientes.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bárbara
 */
public class ClientDao {
    /*La idea de esta clase es que nos permita recibir objetos de la clase Client y guardarla en la bbdd en la tabla cliente. 
    Y a su vez leer la tabla clientes y transformar esos datos en objetos como la clase Client. */
    
    public void connect(){
        //CONEXIÓN CON LA BBDD MYSQL
        //creamos variables con los nombres de la bbdd de Xampp.
        String bbdd = "java";
        String user = "root";
        String password = "";
        String host = "localhost";
        String port = "3306";
        String driver = "com.mysql.jdbc.Driver";
        String urlConexion = "jdbc:mysql://" + host + ":" + port +"/" + bbdd + "?useSSL=false";
        
        Connection conexion = null;
        
        try {
            Class.forName(driver);
            //DriverManager es una clase de Java. En esa línea se conecta a la bbdd
            conexion = DriverManager.getConnection(urlConexion, user, password);
        } catch (Exception ex) {
            Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
