
package autonoma.SimuladorAuto.models;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author jgiugtiñut
 */
public interface Escritor {
    public abstract void escribir(ArrayList<String> lineas) throws IOException;
}