import java.util.Random;
import java.util.Scanner;

public class AdivinaNumeroXIntentos {
    public static void main(String[] args) {

        //Datos
        Random numero = new Random();
        Scanner respuesta = new Scanner(System.in);

        System.out.println("Hola, empecemos a jugar." +
                "\nEstoy pensando en un número entre uno y cien." +
                "\nAdivina cuál es!!!" +
                "\nTe doy 10 intentos para que lo logres, suerteeeee!!!");
        int numeroSecreto = numero.nextInt(1,100);
        //System.err.println(numeroSecreto);//codigo para verificar buen funcionamiento
        System.out.print("Tu respuesta: " );int intento = respuesta.nextInt();



        //Procesos
        if(numeroSecreto==intento){
            //mostrar resultados
            System.out.println("Felicidades, ganaste!!!");
        }else{
            while (numeroSecreto!=intento){
                if(numeroSecreto>intento){
                    System.out.println("El número " + intento + "es menor al número secreto.");
                }
            }
            //mostrar resultados
            System.out.println("Qué mal, perdiste!!!");

        }





    }//fin main
}//fin clase
