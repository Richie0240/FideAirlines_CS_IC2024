package Admin;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.swing.JLabel;

public class hiloDuracion extends Thread {

    private JLabel lblDuracion;
    private String horaSalida;
    private String horaLlegada;

    public hiloDuracion(JLabel lblDuracion, String horaSalida, String horaLlegada) {
        this.lblDuracion = lblDuracion;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
    }

    @Override
    public void run() {
        while (true) {
            try {
                // Actualizar el texto del JLabel cada medio segundo
                calcularDiferencia();
                Thread.sleep(500); // 500 milisegundos = medio segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void calcularDiferencia() {
        // Aquí colocas la lógica para calcular la diferencia de horas y actualizar el JLabel
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");

        LocalTime tiempo1 = LocalTime.parse(horaSalida, formatter);
        LocalTime tiempo2 = LocalTime.parse(horaLlegada, formatter);

        long diferenciaHoras = ChronoUnit.HOURS.between(tiempo1, tiempo2);

        String diferenciaString = Math.abs(diferenciaHoras) + " horas";

        // Actualizar el texto del JLabel con la diferencia calculada
        lblDuracion.setText(diferenciaString);
    }
}
