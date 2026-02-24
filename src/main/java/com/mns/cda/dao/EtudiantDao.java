package com.mns.cda.dao;

import com.mns.cda.connection.MaConnection;
import com.mns.cda.interfaces.dao.IDao;
import com.mns.cda.modele.Etudiant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EtudiantDao implements IDao<Etudiant> {
    //  Etablissement d'une connection à la DB :
    private Connection db;

    public EtudiantDao() {
        try {
            // Création de la session.
            db = MaConnection.getInstance();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void create(Etudiant o) {

    }

    @Override
    public Etudiant read(int id) {
        Etudiant etudiant = null;
        String sql = "SELECT id, nom, prenom FROM etudiant WHERE id = ?";
        try {
            PreparedStatement statement = db.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                etudiant = new Etudiant(rs.getInt("id"),
                        rs.getString("nom"),
                        rs.getString("prenom"));
            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return etudiant;
    }

    @Override
    public void update(Etudiant o) {

    }

    @Override
    public void delete(int id) {

    }
}
