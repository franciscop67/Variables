import java.util.InputMismatchException;
import java.util.Scanner;

public class DetalleFactura {
    public static void main(String[] args) {

        System.out.println("Ingresa los datos de la factura");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String mensaje1 =  scanner.nextLine();
        System.out.println("Ingresa tu domicilio");
        String mensaje2 =  scanner.nextLine();
        System.out.println("Ingresa el monto de pago");
        //String mensaje3 =  scanner.nextLine();
        int mensaje4=0;
        try{
            mensaje4 = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("error. Ingresa numero ");
            main(args);
            System.exit(0);
        }



        System.out.println(mensaje1 + "\n" + mensaje2 + "\n" + mensaje4);
    }
}
