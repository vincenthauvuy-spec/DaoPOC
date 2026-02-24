package com.mns.cda.main;

import com.mns.cda.connection.MaConnection;
import com.mns.cda.dao.EtudiantDao;
import com.mns.cda.interfaces.dao.IDao;
import com.mns.cda.modele.Etudiant;

public class StartPoint {
    public static void main(String[] args) {
        System.out.println("Hello MNS !");
        try {
            IDao<Etudiant> dao = new EtudiantDao();
            System.out.println(dao.read(1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
