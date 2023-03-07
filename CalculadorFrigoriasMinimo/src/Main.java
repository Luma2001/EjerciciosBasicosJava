import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Ingreso de Datos

        Scanner entradaDatos = new Scanner(System.in);
        System.out.println("Calculemos las frigorias mínimas para tu habitacion");
        System.out.println("Ingresa largo en  metros de la habitación");
        double largo = entradaDatos.nextDouble();
        System.out.println("Ingresa ancho en  metros de la habitación");
        double ancho = entradaDatos.nextDouble() ;
        System.out.println("Ingresa alto en  metros de la habitación");
        double alto = entradaDatos.nextDouble();



        //Asignaciones y procesos
        double kFrigoriasXMetrosCubicos = 40.0;
        double volumenHab = largo * ancho * alto;
        double frigoriasMinimas= kFrigoriasXMetrosCubicos * volumenHab;



        //Mostrar Resultados
        System.out.println("Las frigorias mínimas que se utilizarán en su habitación son " + frigoriasMinimas+".");







            System.out.println("Fin!");

        }


    }
