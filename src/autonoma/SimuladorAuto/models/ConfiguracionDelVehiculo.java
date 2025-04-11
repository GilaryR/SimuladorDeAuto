
package autonoma.SimuladorAuto.models;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

/**
 * Los tipos de llantas válidos son: "buenas", "bonitas", "baratas".  
 * Los tipos de motor válidos son: "1000cc", "2000cc", "3000cc".
 * Si faltan datos o se proporciona un tipo no reconocido, se lanza una excepción o se usan valores por defecto.
 * @author Gilary
 * @since 20250411
 * @version 1.0
 */

public class ConfiguracionDelVehiculo {
    
    /**
     * Carga la configuración del vehículo desde un archivo especificado por su ruta.
     * 
     * @param ruta Ruta del archivo de texto plano con la configuración del vehículo.
     * @return Una instancia de {@link Vehiculo} con los valores de motor y llantas configurados.
     * @throws IOException Si ocurre un error al leer el archivo.
     * @throws IllegalArgumentException Si faltan datos obligatorios (motor o llantas).
     */
     
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
    
    /**
     * Retorna el límite de patinaje permitido según el tipo de llantas.
     * 
     * @param tipo Tipo de llanta ("buenas", "bonitas", "baratas").
     * @return Límite de patinaje correspondiente al tipo especificado.
     */

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
        /**
     * Retorna la velocidad máxima del motor según el tipo de motor.
     * 
     * @param tipo Tipo de motor ("1000cc", "2000cc", "3000cc").
     * @return Velocidad máxima correspondiente al tipo especificado.
     */

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

