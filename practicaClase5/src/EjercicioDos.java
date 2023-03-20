import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class EjercicioDos {

    /*Haga una main donde por parámetro envíe la ruta de un archivo. Ese archivo debe
    contener números. El programa debe escribir por consola la suma de esos números
    a. Al programa anterior agreguele un parámetro para que la operación pueda ser
    suma o multiplicación.*/

    public static void main(String[] args) throws IOException {

        //Obtenemos la ruta y la mostramos por consola
        Path archivoDatos = Paths.get("datos.txt");
        System.out.println("Ruta de Archivo: " + archivoDatos.toAbsolutePath().normalize());

        //Vamos a mostrar por consola la suma o multipicación de los números contenidos en el archivo
        //Verificamos si existe y es leíble
        if (Files.exists(archivoDatos) && Files.isReadable(archivoDatos)) {
                    System.out.println("Procesando archivo ...");
                    //Utilizamos Scanner para leer línea por línea
                    Scanner escaneando = new Scanner(archivoDatos,"UTF-16");
        //          //Creamos variables para guardar las operaciones

                    int suma = 0;
                    int producto = 1;

                    while(escaneando.hasNextLine()){
                        String linea = escaneando.nextLine();
                        int numero = Integer.parseInt(linea);
                        suma += numero;
                        producto *= numero;
                    }
                    System.out.println();

                    System.out.println("Seleccione qué operación desea realizar:\n" +
                                       "1-sumar\n" +
                                       "2-multiplicar");
                    Scanner opcion = new Scanner(System.in);
                    int resp = opcion.nextInt();

                    if (resp==1){
                        System.out.println("Suma total: " + suma+".");
                    }else{
                        System.out.println("Producto total: " + producto+ ".");
                    }

        }else {
            System.err.println("Error el archivo no existe...");
        }
    }

}
