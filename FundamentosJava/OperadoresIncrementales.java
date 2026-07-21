public class OperadoresIncrementales {
    public static void main(String[] args) {
        
        int i = 1;
        int j = ++i; // i = i + 1

        System.out.println("i =" + i);
        System.out.println("j =" + j);

        //post incremento
        i = 2;
        System.out.println("inicial de i =" + i);
        j = i++;
        System.out.println("i =" + i);
        System.out.println("j =" + j);

        //pre decremento
        i = 3;
        System.out.println("inicial de i antes de decremento =" + i);
        j = --i;
        
        System.out.println("i =" + i);
        System.out.println("j =" + j);

        //Post decremento
        i = 4;
        System.out.println("inicial de i antes de decremento =" + i);
        j = i--;
        
        System.out.println("i =" + i);
        System.out.println("j =" + j);

        System.out.println("++j = " + (++j));
        System.out.println("j++ = " + (j++));
        System.out.println(j);

    }
}
