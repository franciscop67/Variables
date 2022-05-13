import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        //Se ocupa el una ventana para ingresar el dato

        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un numero entero");
        int numeroDecimal=0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr); //Se realiza la conversion de String a Int
        }catch (NumberFormatException e){

            JOptionPane.showMessageDialog(null,"Error debe ingresar un Número entero");
            main(args); //Regresamos al main
            System.exit(0); //sale del programa
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        //Metodo para convertir en binario
        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);
        int numeroBinario =  0b11110; //Es necesario el 0b para identificar que es binario
        System.out.println("numeroBinario = " + numeroBinario); //Lo muestra como decimal

        //Metodo para convertir en Octal
        String resultadoOctal = "numero octal de " + numeroDecimal + " = " +  Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);
        int numeroOctal = 036; //Se debe colocar el 0 para identificar que es octal
        System.out.println("numeroOctal = " + numeroOctal);

        //Metodo para convertir en Hexadecimal
        String resultadoHexa = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHexa);
        int numeroHex = 0x1e; // Se debe colocar 0x para identificar que es hexadecimal
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje +=  "\n" + resultadoHexa;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
