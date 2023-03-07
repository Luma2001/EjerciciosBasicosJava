import java.util.Scanner;

public class EjercicioUno {

    public static void main(String[] args) {

        //Datos
        Scanner respuesta = new Scanner(System.in);
        int resto;
        int contador = 0;
        System.out.println("Ej 1.:");
        System.out.println("Vamos a determinar si un número es primo");
        System.out.println("Ingrese número:");
        int numero = respuesta.nextInt();


        //Procesos

        for (int i = 2; i < numero; i++) {
            resto = numero % i;
            if (resto == 0) {
                ++contador;
            }
        }


        //Mostrar Resultados
        if(contador!=0){
            System.out.println("El número "+ numero+ " NO es primo.");
        }else{
            System.out.println("El número "+ numero+ " es PRIMO.");

        }

    }
}
