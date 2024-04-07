package Ventanas.VentanaPrincipal;

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
public class ObtenerOrigenyDestino {

    public ArrayList<String> getOrigenyDestino() {

        ArrayList<String> listaOrigenyDestino = new ArrayList<>();

        try {

            Connection nuevaConexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost/fideairlines?serverTimezone=UTC",
                    "root",
                    "Fide123.");

            String Select_vuelos = "SELECT DISTINCT origen, destino FROM vuelos";

            PreparedStatement nuevoStatementPreparado = nuevaConexion.prepareStatement(Select_vuelos);

            ResultSet resultado = nuevoStatementPreparado.executeQuery();

            while (resultado.next()) {
                String origen = resultado.getString("origen");
                String destino = resultado.getString("destino");
                listaOrigenyDestino.add(origen);
                listaOrigenyDestino.add(destino);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ObtenerOrigenyDestino.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaOrigenyDestino;

    }
}
