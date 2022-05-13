public class ConversionDeTipos {
    public static void main(String[] args) {
        //Conversion de cadenas a primitivos
        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr); //Metodo para convertir de String  a int
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr); //Metodo para convertir de String  a double
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "false";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr); //Metodo para convertir de String  a boolean
        System.out.println("logicoBoolean = " + logicoBoolean);

        //Conversion de primitivos a cadenas
        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);
        
        String otroNumeroStr = Integer.toString(otroNumeroInt); //Metodo para convertir de int a String
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt + 10); //Sobrecarga de metodos. Otra manera de convertir int a Sting
        //Tener cuidado a la hora de especificar el atributo. Con valueOf se coloca el valor explicito. El valor tal y como esta
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble =  1.23456e2;
        String otroRealStr =  Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr  = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);

        //Conversion de priimitivos a primitivos
        //Cast -> Forzar la conversion
        int i = 22768;
        short s = (short) i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        //El cast solo se puede realizar a tipo numerico
        char b = (char)i;
        System.out.println("b = " + b);
        float f = (float) i;
        System.out.println("f = " + f);
    }
}
