
package autonoma.SimuladorAuto.models;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *Esta clase permite escribir una lista de líneas en un archivo especificado. Cada línea de la lista
 * se escribe en una nueva línea del archivo.
 * El archivo se sobrescribe cada vez que se llama al método {@code escribir}.
 * @author Gilary
 * @since 20250411
 * @version 1.0
 */
public class EscritorArchivoTextoPlano implements Escritor {

    private final String rutaArchivo;

    public EscritorArchivoTextoPlano(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }
    
    
    /**
     * Escribe una lista de líneas en el archivo de texto plano especificado.
     * 
     * Cada elemento de la lista se escribe como una nueva línea en el archivo.
     * El contenido anterior del archivo será reemplazado.
     * 
     * @param lineas Lista de líneas a escribir en el archivo.
     * @throws IOException Si ocurre un error durante la escritura del archivo.
     */

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
