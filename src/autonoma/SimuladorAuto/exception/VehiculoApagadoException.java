package autonoma.SimuladorAuto.exception;

/**
 * 
 * Excepción personalizada que se lanza cuando se intenta realizar una operación
 * inválida sobre un vehículo que está apagado.
 *
 * @author Luisa Fernanda Henao Posada
 * @since 20250404
 * @version 1.0.0
 */

public class VehiculoApagadoException extends Exception {

    /**
     * Crea una nueva instancia de {@code VehiculoApagadoException}
     * con un mensaje descriptivo del error.
     *
     * @param mensaje El mensaje que describe la causa de la excepción.
     */
    public VehiculoApagadoException(String mensaje) {
        super(mensaje);
    }
}
