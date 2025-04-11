
package autonoma.SimuladorAuto.models;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author jgiugtiñut
 */

public class EscritorArchivoTextoPlano implements Escritor {

    private final String rutaArchivo;

    public EscritorArchivoTextoPlano(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    @Override
    public void escribir(ArrayList<String> lineas) throws IOException {
        File archivo = new File(this.rutaArchivo);
        FileWriter fw = new FileWriter(archivo, false);
        PrintWriter pw = new PrintWriter(fw);

        for (String linea : lineas) {
            pw.println(linea);
        }

        fw.close();
    }
}
