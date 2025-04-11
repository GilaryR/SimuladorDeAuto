
package autonoma.SimuladorAuto.models;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author jgiugtiñut
 */

public class ConfiguracionDelVehiculo {
     
    public static Vehiculo cargarVehiculo(String ruta) throws IOException {
        Lector lector = new LectorArchivoTextoPlano();
        ArrayList<String> lineas = lector.leer(ruta);

        String tipoLlantas = null;
        String tipoMotor = null;

        for (String linea : lineas) {
            String[] partes = linea.trim().split("\\s+");
            if (partes[0].equalsIgnoreCase("llantas")) {
                tipoLlantas = partes[1];
            } else if (partes[0].equalsIgnoreCase("motor")) {
                tipoMotor = partes[1];
            }
        }

        if (tipoLlantas == null || tipoMotor == null) {
            throw new IllegalArgumentException("Faltan datos de configuración.");
        }

        Llanta llanta = new Llanta(tipoLlantas, obtenerLimitePatinaje(tipoLlantas));
        Motor motor = new Motor(obtenerVelocidadMaxima(tipoMotor));
        return new Vehiculo(motor, llanta);
    }

    public static int obtenerLimitePatinaje(String tipo) {
     if (tipo == null) return 0;

     switch (tipo.toLowerCase()) {
        case "buenas":
            return 110;
        case "bonitas":
            return 70;
        case "baratas":
            return 50;
        default:
            return 0; // Valor por defecto si el tipo no es reconocido
        }
    }

   public static int obtenerVelocidadMaxima(String tipo) {
    if (tipo == null) return 100;

    switch (tipo.toLowerCase()) {
        case "1000":
        case "1000cc":
            return 100;
        case "2000":
        case "2000cc":
            return 160;
        case "3000":
        case "3000cc":
            return 220;
        default:
            return 0; // Valor por defecto si el tipo no es reconocido
    }
}
}

