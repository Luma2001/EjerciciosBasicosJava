import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {

        //Datos
        int i = 4;
        int f = 14;



        //Proceso y Asignaciones
        System.out.println("\nEj. 1.a: mostrar los números entre 5 y 14 incluyendo 5 y 14");
        while(i<f){
            i++;


        //Mostramos Resultados
        System.out.println(i);

        }

        System.out.println("\nEj. 1.b: mostrar los números pares entre 5 y 14 incluyendo 14");
        i = 4;
        //Proceso y Asignaciones
        while(i<f){
            i++;
            if (i%2==0){
                //Mostramos Resultados
                System.out.println(i);
            }
        }


        System.out.println("\nEj. 1.c: seleccionar ver números pares o impares entre 5 y 14.");

        Scanner respuesta = new Scanner(System.in);
        System.out.println("Seleccione una opción:" +
                "\n1) Ver números pares entre 5 y 14" +
                "\n2) Ver números impares entre 5 y 14");
        System.out.print("Su respuesta es: ");int opcionSeleccionada = respuesta.nextInt();
        i = 4;
        //Proceso y Asignaciones
        switch (opcionSeleccionada){
            case 1:
                System.out.println("Los números pares entre 5 y 14 son:");
                while(i<f) {
                i++;
                if (i % 2 == 0) {
                    //Mostramos Resultados
                    System.out.println(i);
                }
            }
                break;

            case 2:
                System.out.println("Los números impares entre 5 y 14 son:");
                while(i<f) {
                i++;
                if (i % 2 != 0) {
                    //Mostramos Resultados
                    System.out.println(i);
                }
            }
            break;
            default:
                //Mostramos Resultados
                System.out.println("No seleccionó una opción válida");

            }

        System.out.println("\nEj. 1.d: mostrar números pares entre 5 y 14 de mayor a menor");

        i = 5;
        //Proceso y Asignaciones
        for(f=15; f>i; f--){

            if (f%2==0){
                //Mostramos Resultados
                System.out.println(f);
            }
        }



    }
}