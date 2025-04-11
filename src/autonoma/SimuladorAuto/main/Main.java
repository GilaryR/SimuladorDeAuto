package autonoma.SimuladorAuto.main;

import autonoma.SimuladorAuto.models.ConfiguracionDelVehiculo;
import autonoma.SimuladorAuto.models.Simulador;
import autonoma.SimuladorAuto.models.Vehiculo;
import autonoma.SimuladorAuto.views.ConfigurarVehiculo;
import autonoma.SimuladorAuto.views.Principal;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * @author Gilary
 * @since 20250328
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) throws IOException {
        // Mostrar el JDialog de configuración antes de todo
        ConfigurarVehiculo configuracionDialog = new ConfigurarVehiculo(null, true);
        configuracionDialog.setVisible(true);

        try {
            Vehiculo vehiculo = ConfiguracionDelVehiculo.cargarVehiculo("src/autonoma/SimuladorAuto/txt/Configuracion.txt");
            Simulador simulador = new Simulador(vehiculo);
            new Principal(simulador).setVisible(true);
        } catch (IOException | IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar el vehículo: " + ex.getMessage());
        }
    }
}
