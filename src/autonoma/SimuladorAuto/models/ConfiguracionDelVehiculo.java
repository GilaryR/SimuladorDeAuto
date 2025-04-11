
package autonoma.SimuladorAuto.models;

import autonoma.SimuladorAuto.persistencia.LecturaEscrituraConfiguracion;
import java.io.IOException;
import java.util.Map;

/**
 *
 * @author jgiugtiñut
 */

public class ConfiguracionDelVehiculo {
        public static Vehiculo cargarVehiculo(String rutaArchivo) throws IOException {
        return LecturaEscrituraConfiguracion.leerConfiguracion(rutaArchivo);
    }

     public static double obtenerLimitePatinaje(String tipoLlantas) {
        double limite = 0.0;

        switch (tipoLlantas.toLowerCase()) {
            case "buenas":
                limite = 110.0;
                break;
            case "bonitas":
                limite = 70.0;
                break;
            case "baratas":
                limite = 50.0;
                break;
            default:
                throw new IllegalArgumentException("Tipo de llantas no válido: " + tipoLlantas);
        }

        return limite;
    }

    public static double obtenerVelocidadMaxima(String tipoMotor) {
        double velocidad = 0.0;

        switch (tipoMotor) {
            case "1000":
                velocidad = 100.0;
                break;
            case "2000":
                velocidad = 160.0;
                break;
            case "3000":
                velocidad = 220.0;
                break;
            default:
                throw new IllegalArgumentException("Cilindraje de motor no válido: " + tipoMotor);
        }

        return velocidad;
    }

    public static String obtenerCilindrajeDesdeVelocidad(double velocidad) {
        String cilindraje;

        if (velocidad == 100.0) {
            cilindraje = "1000";
        } else if (velocidad == 160.0) {
            cilindraje = "2000";
        } else if (velocidad == 220.0) {
            cilindraje = "3000";
        } else {
            cilindraje = "Desconocido";
        }

        return cilindraje;
    }
    public static void guardarConfiguracion(String tipoLlantas, String tipoMotor, String rutaArchivo) throws Exception {
    if (tipoLlantas == null || tipoMotor == null ||
        tipoLlantas.isBlank() || tipoMotor.isBlank()) {
        throw new IllegalArgumentException("Los campos no pueden estar vacíos.");
    }

    double limitePatinaje = obtenerLimitePatinaje(tipoLlantas);
    double velocidadMaxima = obtenerVelocidadMaxima(tipoMotor);

    Llanta llanta = new Llanta(tipoLlantas, limitePatinaje);
    Motor motor = new Motor(velocidadMaxima);
    Vehiculo vehiculo = new Vehiculo(motor, llanta);

    // Llamar a persistencia
    autonoma.SimuladorAuto.persistencia.LecturaEscrituraConfiguracion.escribirConfiguracion(rutaArchivo, vehiculo);
    }
   

}
