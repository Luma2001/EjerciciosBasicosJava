import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class EjercicioUno {
    /*Dado un String (palabra o frase) y una letra.
    Contar la cantidad de apariciones de la letra en el String

     */
    public static void main(String[] args) {


        System.out.println("Bienvenido!!!\n" +
                "Qué desea hacer (elija una opción entre 1 y 3):\n" +
                "1-Contar letras que aparece en una oración.\n" +
                "2-Ordenar tres números.\n" +
                "3-Dado un vector de números y un número X, sumar todos los números > X y\n" +
                "retornar el resultado");

        Scanner opcion = new Scanner(System.in);
        int resp= opcion.nextByte();


        switch (resp) {
            case 1:
                EjercicioUno.a();
                break;
            case 2:
                EjercicioUno.b();
                break;
            case 3:
                EjercicioUno.c();
                break;
        }







    }   //fin main


    public static void a(){

        //Datos
        String entrada;
        String letra;
        int numLetra=0;


        //Proceso y asignaciones
        Scanner respuesta = new Scanner(System.in);
        System.out.print("Ingrese String que desea analizar"); entrada=respuesta.nextLine();
        System.out.print("Ingrese letra que desee buscar y contar"); letra = respuesta.nextLine();
        System.out.println("Analizando...");

                for(int i=0;i<entrada.length();i++){
                    if(entrada.charAt(i)==letra.charAt(0)){
                        numLetra++;
                    }
                }

        //Resultado
        System.out.println("La letra '"+ letra + "' se repite " + numLetra + " vez/veces.");

    }//Fin metodo a

    public static void b(){

    //Datos
        int x=0,y=0,z=0;

        int resp;
        System.out.println("Ingrese tres números");
        Scanner numero = new Scanner(System.in);
                x= numero.nextInt();
                y= numero.nextInt();
                z= numero.nextInt();
        int[] vec = {x,y,z};
        int i= 0;

    //Proceso y asignaciones
        System.out.println("Elija una opción: \n" +
                "1-Ordenar de forma ascendente y mostrar.\n" +
                "2-Ordenar de forma descendente y mostrar.");
        resp = numero.nextByte();

        switch (resp){
            case 1:
                for (i=0; i< vec.length-1;i++) {
                    for (int j = i + 1; j < vec.length; j++) {
                        if (vec[i] > vec[j]) {
                            int aux = vec[i];
                            vec[i] = vec[j];
                            vec[j] = aux;
                        }
                    }
                }break;
            case 2:for (i=0; i< vec.length-1;i++) {
                for (int j = i + 1; j < vec.length; j++) {
                    if (vec[i] < vec[j]) {
                        int aux = vec[i];
                        vec[i] = vec[j];
                        vec[j] = aux;
                    }
                }
            }break;

            }//fin switch

        //Resultado
        for (int elemento:vec) {
            System.out.println(elemento);
        }


        }//Fin metodo b


    public static void c(){
        //Datos
        int [] vec ={23,14,24,50,32,21,2,4,6,34,45,0,49};
        Scanner num = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int resp = num.nextByte();
        int suma=0;
        for (int i=0;i<vec.length;i++){
            if (vec[i]>resp) {
                suma += vec[i];
            }
            System.out.println("Los números a comparar son");
        for (int elemento:vec)
                 {
                     System.out.println(elemento);

            }
            System.out.println("La sumatoria de todos los números mayores a " + resp+ ": "+ suma+".");
        }
    }


}//fin class
