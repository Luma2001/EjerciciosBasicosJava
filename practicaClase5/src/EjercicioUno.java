import java.util.Scanner;

public class EjercicioUno {

    public static void main(String[] args) {

        System.out.println("a. Ejemplo con los parámetros dados. \n" +
                "Los números seleccionados son: 23, 1 y 45.\n" +
                "Ordenar de forma descendente");
        //Datos
        int x = 23, y = 1, z = 45;
        String opcion=" ";
        Scanner numero = new Scanner(System.in);

        //Proceso y Resultado de 1.a
        EjercicioUno.ordenar(23, 1, 45, "b");


        System.out.println("b. Ejemplo solicitando los parámetros por consola.");
        EjercicioUno.solicitarDatos();

        //Resultado de 1.b
        EjercicioUno.ordenar(x, y, z, opcion);



        System.out.println("c. Ejemplo eligiendo el item A ó el B");
        System.out.println("Elija una opción\n" +
                "a-Con parámetros preestablecidos\n" +
                "b-Ingresando parámetros por consola\n");
        opcion = numero.next();

        switch (opcion) {
            case "a":EjercicioUno.ordenar(33,4,12, "a");
            break;
            case "b":EjercicioUno.solicitarDatos();
                     EjercicioUno.ordenar(x,y,z,opcion);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + opcion);
        }

    }

    public static void solicitarDatos() {
        //Datos
        int x,y,z;
        String opcion;
        System.out.println("Ingrese tres números");
        Scanner numero = new Scanner(System.in);
        x = numero.nextInt();
        y = numero.nextInt();
        z = numero.nextInt();

        //Proceso y asignaciones
        System.out.println("Elija una opción: \n" +
                "a-Ordenar de forma ascendente y mostrar.\n" +
                "b-Ordenar de forma descendente y mostrar.");
        opcion = numero.next();
    }


    public static void ordenar(int x, int y, int z, String opcion ){

        int[] vec = {x,y,z};
        int i= 0;


        switch (opcion){
            case "a":
                for (i=0; i< vec.length-1;i++) {
                    for (int j = i + 1; j < vec.length; j++) {
                        if (vec[i] > vec[j]) {
                            int aux = vec[i];
                            vec[i] = vec[j];
                            vec[j] = aux;
                        }
                    }
                }
                break;

                case "b":for (i=0; i< vec.length-1;i++) {
                for (int j = i + 1; j < vec.length; j++) {
                    if (vec[i] < vec[j]) {
                        int aux = vec[i];
                        vec[i] = vec[j];
                        vec[j] = aux;
                    }
                }
            }
            break;


        }//fin switch

        //Resultado
                for (int elemento:vec) {
                    System.out.println(elemento);
                }

    }//Fin método ordenar




}
