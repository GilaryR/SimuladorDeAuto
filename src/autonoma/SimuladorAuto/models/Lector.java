
package autonoma.SimuladorAuto.models;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Gilary
 * @since 20250411
 * @version 1.0
 */
public interface Lector {
    public abstract ArrayList<String> leer(String ruta) throws IOException;
}
