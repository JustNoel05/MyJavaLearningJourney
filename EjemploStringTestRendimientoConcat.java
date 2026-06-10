public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 1000000; i++){
            //c = c.concat(a).concat(b).concat("\n"); // 500 => 1ms 1000 => 2ms //1000000 =>  9 minutos
            //c += a + b + "\n"; // 500 => 6ms 1000ms => 9ms
            sb.append(a).append(b).append("\n"); // 500 => 0ms //1000 => 0ms //1000000 => 26 ms
        }

        System.gc();

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
        System.exit(0);
    }
}
