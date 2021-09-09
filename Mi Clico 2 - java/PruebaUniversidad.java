/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emanuel
 */
public class PruebaUniversidad {

    Connection connection;

    public void crearConnection() {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            // Connect to a database
            connection = DriverManager.getConnection("jdbc:mysql://localhost/universidad", "universidad", "Universidad2021");
            System.out.println("Database connected");
        } catch (SQLException ex) {
            Logger.getLogger(PruebaUniversidad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PruebaUniversidad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cerrarConnection() {
        try {
            // Close the connection
            this.connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(PruebaUniversidad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void listarAlumnos() throws SQLException{
        // Create a statement
        Statement statement = this.connection.createStatement();
        // Execute a statement
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Alumno");
        // Iterate through the result and print the student names
        while (resultSet.next()) {
            System.out.println(resultSet.getString(1) + "\t"
                    + resultSet.getString(2) + "\t" + resultSet.getString(3));
        }
    }
    
    public void insertarAlumno() throws SQLException{
        PreparedStatement preparedStatement = connection.prepareStatement("insert into Alumno ("
                + "primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, cedula, edad, semestre) "
                + "values (?, ?, ?, ?, ?, ?, ?)");
    }
}
