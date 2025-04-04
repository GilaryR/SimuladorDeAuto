package autonoma.SimuladorAuto.exception;

/**
 * 
 * Excepción personalizada que se lanza cuando se intenta encender un vehículo
 * que ya se encuentra encendido.
 * 
 * Esta excepción puede ser utilizada en sistemas de simulación de vehículos
 * para controlar el estado del encendido y evitar operaciones redundantes o
 * incorrectas.
 *
 * @author Luisa Fernanda Henao Posada
 * @since 2025-04-04
 * @version 1.0.0
 */
public class VehiculoEncendidoException extends Exception {

    /**
     * Crea una nueva instancia de la excepción con el mensaje especificado.
     *
     * @param mensaje El mensaje detallado que describe la causa del error.
     */
    public VehiculoEncendidoException(String mensaje) {
        super(mensaje);
    }
}

