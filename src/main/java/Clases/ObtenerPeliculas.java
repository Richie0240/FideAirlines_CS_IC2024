/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Ventanas.VentanaPrincipal.*;
import Clases.Vuelos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ricar
 */
public class ObtenerPeliculas {

    public ArrayList<String> getPeliculas() {

        ArrayList<String> listaPeliculas = new ArrayList<>();

        try {

            Connection nuevaConexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost/fidecinemax?serverTimezone=UTC",
                    "root",
                    "Fide123.");

            String Select_vuelos = "SELECT DISTINCT funcion FROM peliculas";

            PreparedStatement nuevoStatementPreparado = nuevaConexion.prepareStatement(Select_vuelos);

            ResultSet resultado = nuevoStatementPreparado.executeQuery(Select_vuelos);

            while (resultado.next()) {

                String funcion = resultado.getString("funcion");

                listaPeliculas.add(funcion);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ObtenerPeliculas.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaPeliculas;

    }
}
