/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bp2finalprojesi;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Buse Nur
 */
public class VeriTabaniConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/Bp2FinalProjesi";
    private static final String USER = "root";
    private static final String PASSWORD = "fsmblm";

    public static Connection connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Veritabanina baglanilamadi!");
            e.printStackTrace();
            return null;
        }
    }
}
