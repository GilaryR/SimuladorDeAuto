package autonoma.SimuladorAuto.main;

import autonoma.SimuladorAuto.models.ConfiguracionDelVehiculo;
import autonoma.SimuladorAuto.models.Simulador;
import autonoma.SimuladorAuto.models.Vehiculo;
import autonoma.SimuladorAuto.views.Principal;
import java.io.IOException;

/**
 * @author Gilary
 * @since 20250328
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) throws IOException {

        Vehiculo vehiculo = ConfiguracionDelVehiculo.cargarVehiculo("src/autonoma/SimuladorAuto/txt/Configuracion.txt");
        Simulador simulador = new Simulador(vehiculo);
        new Principal(simulador).setVisible(true);
    }
}
