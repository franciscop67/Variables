
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Clase Scanner
        System.out.println("Ingrese un numero entero");
        //String numeroStr = Scanner.nextLine();
        int numeroDecimal = 0;
        try {
            numeroDecimal = scanner.nextInt();//Integer.parseInt(numeroStr); //Podemos cambiar por nextInt para recibir un tipo int
        } catch (InputMismatchException e) {
            System.out.println("Error debe ingresar un Número entero");
            main(args); //Regresamos al main
            System.exit(0); //sale del programa
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        //Metodo para convertir en binario
        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        //Metodo para convertir en Octal
        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);


        //Metodo para convertir en Hexadecimal
        String resultadoHexa = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);


        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexa;

        System.out.println(mensaje);
    }
}
