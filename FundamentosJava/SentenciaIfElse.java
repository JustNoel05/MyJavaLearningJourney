public class SentenciaIfElse {
    public static void main(String[] args) {
        
        float promedio = 5.5f;

        if(promedio >= 6.5){
            System.out.println("felicitaciones excelente promedio");
            System.out.println();
        } else if(promedio >= 6.0){
            System.out.println("muy buen promedio!");
        } else if(promedio >= 5.5){
            System.out.println("Buen promedio");
        } else if(promedio >= 5.0){
            System.out.println("Regular, Necesitas un poco mas de ezfuerzo");
        } else if(promedio >= 4.0){
            System.out.println("Insuficiente");
        } else{
            System.out.println("Reprobado");
        }

        System.out.println("tu promedio es: " + promedio);
    }
}
