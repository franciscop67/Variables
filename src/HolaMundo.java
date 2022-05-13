public class HolaMundo {
    public static void main(String[] args) {
        String saludar =  "Hola Mundo Dev";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());
        
        int num1 = 10;
        boolean valor = true;
        int num2 = 5;
        if(valor ){
            System.out.println("num1 = " + num1);
            num2 = 10;
        }
        System.out.println("num2 = " + num2);

        var num3 = 15;

        String nombre;
        nombre = "cisco";

        if(num1 >=10){
            nombre =  "pepe";
        }

        System.out.println("nombre = " + nombre);
    }
}
