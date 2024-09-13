class Autobox {

    public static void main(String[] args) {

        int a = 10;
        Integer intObj = a;
        System.out.println("Autoboxed Integer: " + intObj);

        double b = 5.5;
        Double doubleObj = b;
        System.out.println("Autoboxed Double: " + doubleObj);

        char c = 'A';
        Character charObj = c;
        System.out.println("Autoboxed Character: " + charObj);

        float d = 3.14f;
        Float floatObj = d;
        System.out.println("Autoboxed Float: " + floatObj);

        long e = 100000L;
        Long longObj = e;
        System.out.println("Autoboxed Long: " + longObj);

        short f = 2;
        Short shortObj = f;
        System.out.println("Autoboxed Short: " + shortObj);

        byte g = 1;
        Byte byteObj = g;
        System.out.println("Autoboxed Byte: " + byteObj);

        boolean h = true;
        Boolean boolObj = h;
        System.out.println("Autoboxed Boolean: " + boolObj);

        int intPrimitive = intObj;
        System.out.println("Unboxed int: " + intPrimitive);

        double doublePrimitive = doubleObj;
        System.out.println("Unboxed double: " + doublePrimitive);

        char charPrimitive = charObj;
        System.out.println("Unboxed char: " + charPrimitive);

        float floatPrimitive = floatObj;
        System.out.println("Unboxed float: " + floatPrimitive);

        long longPrimitive = longObj;
        System.out.println("Unboxed long: " + longPrimitive);

        short shortPrimitive = shortObj;
        System.out.println("Unboxed short: " + shortPrimitive);

        byte bytePrimitive = byteObj;
        System.out.println("Unboxed byte: " + bytePrimitive);

        boolean boolPrimitive = boolObj;
        System.out.println("Unboxed boolean: " + boolPrimitive);
    }
}
