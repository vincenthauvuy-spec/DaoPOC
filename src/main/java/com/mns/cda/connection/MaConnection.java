package com.mns.cda.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MaConnection {
    private static Connection instance;

    private MaConnection() {
       // Empty constructor to prevent instantiation from outside the class ..
    }

    public static synchronized Connection getInstance() throws SQLException {
        if (instance == null) {
            instance = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ma_base_etudiant",
                    "root", "root");
            System.out.println("Nouvelle connection à la DB ...");
        }
        System.out.println("Connection à la DB établie ...");
        return instance;
    }
}
