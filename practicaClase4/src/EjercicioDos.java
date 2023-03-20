import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class EjercicioDos {

    public static void main(String[] args) {

        //Realizar la codificación o decodificacion de una cadena dado un número de desplazamiento
        System.out.println("Seleccione que desea hacer");
        System.out.println("1-Codificar una cadena");
        System.out.println("2-Decodificar una cadena");

        Scanner opcion = new Scanner(System.in);
        int resp= opcion.nextByte();


        switch (resp) {
            case 1:
                EjercicioDos.codificar();
                break;
            case 2:
                EjercicioDos.decodificar();
                break;

        }

    }


    public static void codificar(){

        //Solicito que se ingrese una cadena
        System.out.println("Ingrese cadena:");
        Scanner respuesta = new Scanner(System.in);
        String frase = respuesta.nextLine();

        //Transformo la cadena en un vector de caracteres
        char[] vectorLetras= frase.toCharArray();

        //Recorro la cadena
        for(int i=0;i<vectorLetras.length;i++){
            System.out.println(vectorLetras[i]);
        }

        //Recorro mediante acceso secuencial
        System.out.println("CHAR | Cod ASCII");
        for(char letra : vectorLetras){
            int codigoLetra = (int) letra;
            System.out.println("   "+ letra + " | "+ codigoLetra);
        }

        //

        System.out.print("Indique número de desplazamiento:");
        int num = respuesta.nextInt();
        System.out.println("CHAR | Cod ASCII");
        for(char letra : vectorLetras){
            int codigo = (int) letra + num;
            char letraDeCod = (char) codigo;
            System.out.println("   "+ letraDeCod + " | "+ codigo);
        }
        System.out.print("'Cadena codificada: '");
        for(char letra : vectorLetras){
            int codigo = (int) letra + num;
            char letraDeCod = (char) codigo;
            System.out.print(letraDeCod);
        }
        System.out.println("' ");


    }


    public static void decodificar(){

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
        char[] codigo= cod.toCharArray();

        //Recorro la cadena
        for(int i=0;i<codigo.length;i++){
            System.out.println(codigo[i]);
        }

        //Recorro mediante acceso secuencial
        System.out.println("CHAR | Cod ASCII");
        for(char letra : codigo){
            int letraCod = (int) letra;
            System.out.println("   "+ letra + " | "+ letraCod);
        }

        //

        System.out.print("Indique número asociado:");
        int num = respuesta.nextInt();
        System.out.println("CHAR | Cod ASCII");
        for(char letra : codigo){
            int codigoLetra = (int) letra - num;
            char letraDeCod = (char) codigoLetra;
            System.out.println("   "+ letraDeCod + " | "+ codigoLetra);
        }
        System.out.print("'Cadena decodificada: '");
        for(char letra : codigo){
            int codigoLetra = (int) letra - num;
            char letraDeCod = (char) codigoLetra;
            System.out.print(letraDeCod);
        }
        System.out.println("' ");




    }







}
