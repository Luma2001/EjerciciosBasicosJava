import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class EjercicioTres {


    public static void main(String[] args) throws IOException {

        //Realizar la codificación o decodificación de una cadena dado un número de desplazamiento
        System.out.println("Seleccione que desea hacer");
        System.out.println("1-Codificar una cadena");
        System.out.println("2-Decodificar una cadena");

        Scanner opcion = new Scanner(System.in);
        int resp = opcion.nextByte();


        switch (resp) {
            case 1:
                EjercicioTres.codificar();
                break;
            case 2:
                EjercicioTres.decodificar();
                break;

        }

    }//fin main


    //_____________________________________________________________________________________________
    public static void codificar() throws IOException {
        String archivo = "entrada.txt";
        Path entrada = Paths.get(archivo);
        System.out.println("Ruta de Archivo: " + entrada.toAbsolutePath().normalize());
        Scanner respuesta = new Scanner(System.in);
        String frase = "";
        String escrito = "";
        String codigo = "";
        if (Files.exists(entrada) && Files.isReadable(entrada)) {
            //Solicito que se ingrese una cadena
            System.out.println("Ingrese cadena:");
            StringBuffer buffer = new StringBuffer();

            frase = respuesta.nextLine();

            while (!frase.equals("!end.")) {
                buffer.append(frase).append("\n");
                frase = respuesta.nextLine();
                escrito = escrito + frase;
            }

            Files.writeString(entrada, buffer.toString());
            System.out.println();
            System.out.println("    1 Archivo de Entrada creado con Éxito!");

        }


        //Transformo la cadena en un vector de caracteres
        char[] vectorLetras = escrito.toCharArray();

        System.out.print("Indique número de desplazamiento:");
        int num = respuesta.nextInt();


        //Creación de archivo de salida::::::::::::::::::::::::::::::::::::::::::
        String archivoSalida = "salida.txt";
        Path salida = Paths.get(archivoSalida);
        System.out.println("Ruta de Archivo: " + salida.toAbsolutePath().normalize());

        if (Files.exists(salida) && Files.isReadable(salida)) {

            StringBuffer buffer = new StringBuffer();
            //'Cadena codificada: '
            for (char letra : vectorLetras) {
                int codInt = (int) letra + num;
                char letraDeCod = (char) codInt;
                buffer.append(letraDeCod).append("");
                codigo = codigo + letraDeCod;
            }

            Files.writeString(salida, buffer.toString());

            System.out.println();
            System.out.println("    1 Archivo  de Salida creado con Éxito!");

        }


    }//fin método codificar


    //______________________________________________________________________________________________
    public static void decodificar() throws IOException {

        //Solicito que se ingrese una cadena
        System.out.println("Vamos a decodificar una cadena de caracteres, para encontrar un mensaje oculto. \n" +
                "Recuerde debe poseer código y número asociado.\n" +
                "Ejemplo:\n" +
                "Cadena: Gn\"swguq\"guvã\"xkglq\"{\"rqftkfq  \n" +
                "Número Asociado: 2\n\n" +
                "Ingrese cadena: ");
        Scanner respuesta = new Scanner(System.in);
        String cod = respuesta.nextLine();

        //Transformo la cadena en un vector de caracteres
        char[] codigo = cod.toCharArray();



        System.out.print("Indique número asociado:");
        int num = respuesta.nextInt();

        String archivoSalida = "salida.txt";
        Path salida = Paths.get(archivoSalida);
        System.out.println("Ruta de Archivo: " + salida.toAbsolutePath().normalize());

        if (Files.exists(salida) && Files.isReadable(salida)) {
            StringBuffer buffer = new StringBuffer();
            System.out.print("'Cadena decodificada...");
            for (char letra : codigo) {
                int codigoLetra = (int) letra - num;
                char letraDeCod = (char) codigoLetra;
                buffer.append(letraDeCod).append("");
            }
            Files.writeString(salida, buffer.toString());

            System.out.println();
            System.out.println("    1 Archivo  de Salida creado con Éxito!");

        }//fin método decodificar


    }//fin class Ejercicio tres

}