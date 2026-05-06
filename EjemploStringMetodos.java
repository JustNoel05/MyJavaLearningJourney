public class EjemploStringMetodos {
    public static void main(String[] args) {
        
        String nombre = "Huitrado";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase()" + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase()" + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Huitrado\") = " + nombre.equals("Huitrado"));
        System.out.println("nombre.equals(\"huitrado\") = " + nombre.equals("huitrado"));
        System.out.println("nombre.equalsIgnoreCase(\"huitrado\") = " + nombre.equalsIgnoreCase("huitrado"));
        System.out.println("nombre.compareTo(\"Huitrado\") = " + nombre.compareTo("Huitrado")); //Si es 0 es identico
        System.out.println("nombre.compareTo(\"David\") = " + nombre.compareTo("David"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length()-1)) = " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));
        System.out.println("nombre.substring(7,8) = " + nombre.substring(7,8));
        System.out.println("nombre.substring(7) = " + nombre.substring(7));
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\", \".\") = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.indexOf('lenguas') = " + trabalenguas.indexOf("lenguas"));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('z') = " + trabalenguas.lastIndexOf('z'));
        System.out.println("trabalenguas.lastIndexOf('t') = " + trabalenguas.lastIndexOf('t'));
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));
        System.out.println("trabalenguas.contains(\"z\") = " + trabalenguas.contains("z"));
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endsWith(\"lenguas\"= " + trabalenguas.endsWith("lenguas"));
        System.out.println("trabalenguas.endsWith(\"s\")= " + trabalenguas.endsWith("s"));
        System.out.println("  trabalenguas ");
        System.out.println("  trabalenguas ".trim());
    }
}
