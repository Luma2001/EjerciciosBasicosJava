import java.util.Scanner;

public class EjercicioDos {

    public static void main(String[] args) {
        //Datos
        double ingresosTotales;
        int numInmuebles;
        int numVehiculos;
        int numEmbarcaciones;
        int numAeronavesLujo;
        boolean activoSocietario;
        Scanner respuesta =new Scanner(System.in);

        System.out.println("Ej 2. Determinar si pertenece a segmento de Ingresos Altos");
        System.out.println("Responda, las siguientes preguntas:");
        System.out.println("Ingreso total por mes del grupo familiar");ingresosTotales= respuesta.nextDouble();
        System.out.println("Número de Inmuebles a su nombre"); numInmuebles=respuesta.nextInt();
        System.out.println("Número de vehiculos que posean menos de 5 años"); numVehiculos=respuesta.nextInt();
        System.out.println("Número de embaracaciones que posean");numEmbarcaciones= respuesta.nextInt();
        System.out.println("Número de aeronaves de lujo que posean");numAeronavesLujo= respuesta.nextInt();
        System.out.println("Son titulares de Activos Societarios (responda true o false)");activoSocietario= respuesta.hasNextBoolean();


        //Proceso

        if (ingresosTotales>=489083.0 || (numInmuebles>=3) || (numVehiculos>=3) || (numEmbarcaciones!=0) || (numAeronavesLujo!=0) || (activoSocietario==true)){
            System.out.println("Usted pertenece al segmento de Ingresos Altos");
        }else{
            System.out.println("Usted NO pertenece al segmento de Ingresos Altos");
        }

    }




}
