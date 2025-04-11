package autonoma.SimuladorAuto.models;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jgiugtiñut
 */

public class LectorArchivoTextoPlano implements Lector {

    public Vehiculo leerConfiguracion(String ruta) throws IOException {
    List<String> lineas = Files.readAllLines(Paths.get(ruta));

    String tipoLlantas = "";
    String cilindrajeMotor = "";

    for (String linea : lineas) {
        if (linea.toLowerCase().startsWith("llantas")) {
            tipoLlantas = linea.split(" ", 2)[1].trim();
        } else if (linea.toLowerCase().startsWith("motor")) {
            cilindrajeMotor = linea.split(" ", 2)[1].trim();
        }
    }

    // Convertir tipo motor a velocidad máxima
    double velocidadMaxima = ConfiguracionDelVehiculo.obtenerVelocidadMaxima(cilindrajeMotor);
    Motor motor = new Motor(velocidadMaxima);

    // Convertir tipo llantas a límite de patinaje
    double limitePatinaje = ConfiguracionDelVehiculo.obtenerLimitePatinaje(tipoLlantas);
    Llanta llanta = new Llanta(tipoLlantas, limitePatinaje);

    return new Vehiculo(motor, llanta);
}

    @Override
    public ArrayList<String> leer(String ruta) throws IOException {
        List<String> lineas = Files.readAllLines(Paths.get(ruta));
        return new ArrayList<>(lineas);
    }
}
