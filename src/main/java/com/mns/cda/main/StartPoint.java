package com.mns.cda.main;

import com.mns.cda.connection.MaConnection;

public class StartPoint {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        try {
            MaConnection.getInstance();
            MaConnection.getInstance();
            MaConnection.getInstance();
            MaConnection.getInstance();
            MaConnection.getInstance();
            MaConnection.getInstance();
            MaConnection.getInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
