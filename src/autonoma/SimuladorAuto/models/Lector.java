
package autonoma.SimuladorAuto.models;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author jgiugtiñut
 */
public interface Lector {
    public abstract ArrayList<String> leer(String ruta) throws IOException;
}
