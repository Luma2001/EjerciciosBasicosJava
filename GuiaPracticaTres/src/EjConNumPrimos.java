public class EjConNumPrimos {

    public static void main(String[] args) {

    }


//_____________________________________________________________________________
    //Creamos método para chequear si un número es primo
    public static boolean esPrimo(int numero) {

        //Datos
        int resto;
        int contador = 0;

        //Procesos
        for (int i = 2; i < numero; i++) {
            resto = numero % i;
            if (resto == 0) {
                ++contador;
            }
        }

        //Mostrar Resultados
        return (contador == 0);



         /*Otra forma de mostrar resultados
        if(contador!=0){
            System.out.println("El número "+ numero+ " NO es primo.");
        }else{
            System.out.println("El número "+ numero+ " es PRIMO.");

        }*/

    }

}
