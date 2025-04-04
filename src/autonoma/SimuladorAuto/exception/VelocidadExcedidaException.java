package autonoma.SimuladorAuto.exception;

/**
 * Excepción personalizada que se lanza cuando se intenta acelerar un vehículo 
 * más allá de la capacidad máxima de velocidad permitida por su motor.
 *
 * Esta excepción es útil para controlar el comportamiento del vehículo en 
 * simulaciones o sistemas donde las restricciones mecánicas deben ser respetadas.
 *
 * @author Luisa Fernanda Henao Posada
 * @since 2025-04-04
 * @version 1.0.0
 */
public class VelocidadExcedidaException extends Exception {

    /**
     * Crea una nueva instancia de la excepción {@code VelocidadExcedidaException}
     * con un mensaje descriptivo del error.
     *
     * @param mensaje El mensaje que describe la causa de la excepción.
     */
    public VelocidadExcedidaException(String mensaje) {
        super(mensaje);
    }
}
