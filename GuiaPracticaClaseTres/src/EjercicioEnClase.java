import java.util.Scanner;

public class EjercicioEnClase {

    public static void main(String[] args) {

        System.out.println("Ingrese un número");
        Scanner resp = new Scanner(System.in);
        int num=resp.nextInt();

        boolean ejemplo = EjercicioEnClase.esPrimo(num);

        if(ejemplo==true){
            System.out.println("El numero es primo.");
        }else{
            System.out.println("El numero  NO es primo.");
        }


    }

    public static boolean esPrimo(int numero){
        boolean resultado=true;

        if(numero <=1){
            resultado=false;
        }

        int raizNumero = (int) Math.sqrt(numero);

        for(int i=2; i < raizNumero; i++){
            if(numero%i==0){
                resultado =false;
                break;
            }
        }

        return resultado;

    }

}
