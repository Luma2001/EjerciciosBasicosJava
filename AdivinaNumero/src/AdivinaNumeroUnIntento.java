import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AdivinaNumeroUnIntento {
    public static void main(String[] args) {

        //Datos
        Random numero = new Random();
        Scanner respuesta = new Scanner(System.in);

        System.out.println("Hola, empecemos a jugar." +
                "\nEstoy pensando en un número entre uno y diez" +
                "\nAdivina cuál es!!!");
        int numeroSecreto = numero.nextInt(1,10);
        //System.err.println(numeroSecreto);//codigo para verificar buen funcionamiento
        System.out.print("Tu respuesta:" );int intento = respuesta.nextInt();



        //Procesos
        if(numeroSecreto==intento){
            //mostrar resultados
            System.out.println("Felicidades, ganaste!!!");
        }else{
            //mostrar resultados
            System.out.println("Qué mal, perdiste!!!");

        }


    }//Fin Main
}//Fin class
