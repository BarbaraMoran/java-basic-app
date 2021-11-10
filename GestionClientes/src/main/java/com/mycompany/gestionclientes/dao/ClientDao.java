/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionclientes.dao;

import com.mycompany.gestionclientes.models.Client;
import com.mysql.jdbc.StringUtils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bárbara
 */
public class ClientDao {
    /*La idea de esta clase es que nos permita recibir objetos de la clase Client y guardarla en la bbdd en la tabla cliente. 
    Y a su vez leer la tabla clientes y transformar esos datos en objetos como la clase Client. */
    
    public Connection connect(){
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
        
        //Excepción, error
        } catch (Exception ex) {
            Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conexion;
        
    }
    
    public void addClient(Client objectClient){
        
       
        try {
            
            //CONEXIÓN CON LA BBDD MYSQL
        Connection conexion = connect();  
        
            //Insertar nuevo cliente en la bbdd
        String sql = "INSERT INTO `clientes` (`id`, `nombre`, `apellido`, `telefono`, `email`) VALUES (NULL, '" 
                + objectClient.getName() + "', '"
                + objectClient.getSurname() + "', '"
                + objectClient.getTel() + "', '"
                + objectClient.getEmail() + "') ;";
        
     
        
        Statement statement = conexion.createStatement();
        
            //Ejecuta nuestro código SQL
        statement.execute(sql);
        
        //Excepción, error
        } catch (Exception ex) {
            Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        
    }
    
    
    public void deleteClient(String id){
        
        try {
            
             //CONEXIÓN CON LA BBDD MYSQL
        Connection conexion = connect();  
        
            //Eliminar cliente de la bbdd
        String sql = "DELETE FROM `clientes` WHERE `clientes`.`id` = " + id; 
                
        Statement statement = conexion.createStatement();
        
            //Ejecuta nuestro código SQL
        statement.execute(sql);
        
        //Excepción, error
        } catch (Exception ex) {
            Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
        public void modifyClient(Client objectClient){
        
       
        try {
            
            //CONEXIÓN CON LA BBDD MYSQL
        Connection conexion = connect();  
        
            //Cambiar datos del cliente en la bbdd
        String sql = "UPDATE `clientes` SET `nombre` = '" + objectClient.getName() 
                + "',`apellido` = '" + objectClient.getSurname() 
                + "',`telefono` = '" + objectClient.getTel() 
                + "', `email` = '"+ objectClient.getEmail() 
                + "' WHERE `clientes`.`id` = " + objectClient.getId() + ";";
                
    
        Statement statement = conexion.createStatement();
        
            //Ejecuta nuestro código SQL
        statement.execute(sql);
        
        //Excepción, error
        } catch (Exception ex) {
            Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        }
        
    
     public List<Client> listClient(){

        List<Client> clientsList = new ArrayList<Client>();
        try {
             //CONEXIÓN CON LA BBDD MYSQL
        Connection conexion = connect();  
        
            //Recoger toda la info de nuestra tabla clientes
        String sql = "SELECT * FROM `clientes`";
        Statement statement = conexion.createStatement();
        
            //Ejecuta nuestro código SQL y devuelve un resultado
        ResultSet result = statement.executeQuery(sql);
        
        //crea un nuevo cliente por cada resultado de la tabla con sus propiedades
        while (result.next()) {
            Client client = new Client();
            client.setId(result.getString("id"));
            client.setName(result.getString("nombre"));
            client.setSurname(result.getString("apellido"));
            client.setTel(result.getString("telefono"));
            client.setEmail(result.getString("email"));
            clientsList.add(client);

        } 
        
        //Excepción, error
        } catch (Exception ex) {
            Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //devuelve la lista de clientes de la bbdd
        return clientsList;
    }

    public void keepClient(Client objectClient) {
        
     if (StringUtils.isEmptyOrWhitespaceOnly(objectClient.getId())){
         addClient(objectClient);
       } else {
         modifyClient(objectClient);
     }
    }
}


