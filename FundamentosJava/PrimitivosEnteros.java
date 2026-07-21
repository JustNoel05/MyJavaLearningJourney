public class PrimitivosEnteros {
    public static void main(String[] args) {
        
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("Valor maximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte: " + Byte.MIN_VALUE);

        short numeroShort= 32767;
        System.out.println("NumeroSHort = " + numeroShort);
        System.out.println("tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("tipo short corresponde en bites a " + Short.SIZE);
        System.out.println("Valor maximo de un byte: " + Short.MAX_VALUE);
        System.out.println("Valor minimo de un byte: " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("NumeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("Valor maximo de un byte: " + Integer.MAX_VALUE);
        System.out.println("Valor minimo de un byte: " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("NumeroLong = " + numeroLong);
        System.out.println("tipo Long corresponde en byte a " + Long.BYTES);
        System.out.println("tipo Long corresponde en bites a " + Long.SIZE);
        System.out.println("Valor maximo de un byte: " + Long.MAX_VALUE);
        System.out.println("Valor minimo de un byte: " + Long.MIN_VALUE);

        var numeroVar = 2147483647;
        System.out.println("NumeroLong = " + numeroVar);

    }
}
