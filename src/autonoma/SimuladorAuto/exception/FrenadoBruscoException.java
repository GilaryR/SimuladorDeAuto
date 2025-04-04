
package autonoma.SimuladorAuto.exception;

/**
 Exception lanzada cuando un frenado brusco provoca que el
 vehiculo patine
 * @author Gilary
 * @since 20250328
 * @version 1.0
 */
public class FrenadoBruscoException extends Exception {
    
    /**
     * Constructor de la excepcion
     */
    public FrenadoBruscoException(String mensaje ){
        super(mensaje);
    }
}
