import java.io.IOException;

public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {
        Process proceso = null; 
        
        try {
            if (System.getProperty("os.name").startsWith("Windows")) {
                proceso = new ProcessBuilder("notepad").start();
            } else if (System.getProperty("os.name").toLowerCase().contains("nux")) {
                proceso = new ProcessBuilder("gedit").start();
            }
            if (proceso != null) {
                int exitCode = proceso.waitFor();
                System.out.println("El editor terminó con código de salida: " + exitCode);
            }
            
        } catch (IOException e) {
            System.err.println("El comando es desconocido: " + e.getMessage());
            System.exit(1);
        } catch (InterruptedException e) {
            System.err.println("El proceso fue interrumpido: " + e.getMessage());
            Thread.currentThread().interrupt(); 
            System.exit(1);
        }
        
        System.out.println("Se ha cerrado el editor");
        System.exit(0);
    }
}
