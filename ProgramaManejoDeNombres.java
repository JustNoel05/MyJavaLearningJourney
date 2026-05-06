import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduzca el nombre de la primera persona: ");
        String persona1 = scanner.nextLine();
        String personaNueva1 = persona1.toUpperCase().charAt(1) + "." + (persona1.substring(persona1.length() - 2));

        System.out.println("Introduzca el nombre de la segunda persona: ");
        String persona2 = scanner.nextLine();
        String personaNueva2 = persona2.toUpperCase().charAt(1) + "." + (persona2.substring(persona2.length() - 2));
        
        System.out.println("Introduzca el nombre de la tercera persona: ");
        String persona3 = scanner.nextLine();
        String personaNueva3 = persona3.toUpperCase().charAt(1) + "." + persona3.substring(persona3.length() - 2);

        String familia = personaNueva1 + "_" + personaNueva2 + "_" + personaNueva3;
        System.out.println(familia);
        scanner.close();
    }
}
