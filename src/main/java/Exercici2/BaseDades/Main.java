/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercici2.BaseDades;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author berta
 */
public class Main {
    
    public static void main(String args[]) throws SQLException {
        new FormulariRegistre().setVisible(true);
        
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Exercici1", "root", "Churri111+");
        Statement stmt = conn.createStatement();
        
        stmt.executeUpdate("INSERT INTO usuaris VALUES ('Pere', 'Brau', 'pere.brau@gmail.com');");
        ResultSet rs = stmt.executeQuery("SELECT * FROM usuaris");
        
        while(rs.next()){
            System.out.println(rs.getString("nom") + " " + rs.getString("cognom") + " " + rs.getString("correu"));
        }
        
        conn.close();

    }
}
