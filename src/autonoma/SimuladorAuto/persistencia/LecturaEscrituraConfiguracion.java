
package autonoma.SimuladorAuto.persistencia;
import autonoma.SimuladorAuto.models.ConfiguracionDelVehiculo;
import autonoma.SimuladorAuto.models.Llanta;
import autonoma.SimuladorAuto.models.Motor;
import autonoma.SimuladorAuto.models.Vehiculo;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.*;

/**
 * @author Gilary
 * @since 20250410
 * @version 1.0
 */


public class LecturaEscrituraConfiguracion {

    public static Vehiculo leerConfiguracion(String rutaArchivo) throws IOException {
        Charset charset = Charset.forName("UTF-8");
        Path archivo = Paths.get(rutaArchivo);
        List<String> lineas = Files.readAllLines(archivo, charset);

        String tipoLlantas = null;
        String tipoMotor = null;

        for (String linea : lineas) {
            String[] partes = linea.trim().split("\\s+");
            if (partes.length >= 2) {
                if (partes[0].equalsIgnoreCase("llantas")) {
                    tipoLlantas = partes[1];
                } else if (partes[0].equalsIgnoreCase("motor")) {
                    tipoMotor = partes[1];
                }
            }
        }

        if (tipoLlantas == null || tipoMotor == null) {
            throw new IllegalArgumentException("El archivo de configuración no contiene todos los datos necesarios.");
        }

        Llanta llanta = new Llanta(tipoLlantas, ConfiguracionDelVehiculo.obtenerLimitePatinaje(tipoLlantas));
        Motor motor = new Motor(ConfiguracionDelVehiculo.obtenerVelocidadMaxima(tipoMotor));
        return new Vehiculo(motor, llanta);
    }

    public static void escribirConfiguracion(String rutaArchivo, Vehiculo vehiculo) throws IOException {
        Charset charset = Charset.forName("UTF-8");
        Path archivo = Paths.get(rutaArchivo);

        List<String> lineas = new ArrayList<>();
        lineas.add("llantas " + vehiculo.getLlantas().getTipo());
        lineas.add("motor " + ConfiguracionDelVehiculo.obtenerCilindrajeDesdeVelocidad(vehiculo.getMotor().getVelocidadMaxima()));

        Files.write(archivo, lineas, charset);
    }
}
