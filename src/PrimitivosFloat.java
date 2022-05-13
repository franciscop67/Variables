public class PrimitivosFloat {
    public static void main(String[] args) {

        float realFloat = 0.00000000015f; // es igual 0.000000000015f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde en byte a = " + Float.BYTES);
        System.out.println("float corresponde en bites a = " + Float.SIZE);
        System.out.println("Máximo valor para float es = " + Float.MAX_VALUE);
        System.out.println("Mínimo valor para float es = " + Float.MIN_VALUE);

        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);

        System.out.println("double corresponde en byte a = " + Double.BYTES);
        System.out.println("double corresponde en bites a = " + Double.SIZE);
        System.out.println("Máximo valor para double es = " + Double.MAX_VALUE);
        System.out.println("Mínimo valor para double es = " + Double.MIN_VALUE);

        var varFlotante =  3.1416;
        System.out.println("varFlotante = " + varFlotante);
    }
}
