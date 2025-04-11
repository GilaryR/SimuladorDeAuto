package autonoma.SimuladorAuto.models;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *Clase que implementa la interfaz {@link Lector} para leer datos desde archivos de texto plano.
 * Esta clase permite leer archivos línea por línea y también interpretar configuraciones
 * específicas para crear objetos del tipo {@link Vehiculo} a partir de un archivo de configuración.
 * 
  * @author Gilary
 * @since 20250411
 * @version 1.0
 */

public class LectorArchivoTextoPlano implements Lector {
    
    /**
     * Lee un archivo de configuración y construye un objeto {@link Vehiculo}
     * a partir del tipo de llantas y motor especificado en el archivo.
     * 
     * @param ruta Ruta del archivo de configuración.
     * @return Objeto {@code Vehiculo} creado a partir de la configuración leída.
     * @throws IOException Si ocurre un error al leer el archivo.
     */

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

    /**
     * Lee todas las líneas de un archivo de texto plano.
     * 
     * @param ruta Ruta del archivo que se desea leer.
     * @return Lista de líneas de texto contenidas en el archivo.
     * @throws IOException Si ocurre un error al acceder o leer el archivo.
     */
    @Override
    public ArrayList<String> leer(String ruta) throws IOException {
        List<String> lineas = Files.readAllLines(Paths.get(ruta));
        return new ArrayList<>(lineas);
    }
}
