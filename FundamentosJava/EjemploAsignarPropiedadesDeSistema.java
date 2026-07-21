import java.io.FileInputStream;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {
        try{
        FileInputStream archivo = new FileInputStream("config.properties");

        Properties p = new Properties(System.getProperties());
        p.load(archivo);
        p.setProperty("mi.propiedad.personalizada", "Mi valor guardado en el objeto properties");

        System.setProperties(p);
        System.getProperties().list(System.out);

        Properties ps = System.getProperties();
        System.out.println("ps.getProperty() = " + ps.getProperty("mi.propiedad.personalizada"));
        System.out.println(System.getProperty("config.autor.nombre"));

        ps.list(System.out);
        } catch(Exception e){
            System.err.println("No existe el archivo = " + e);
            System.exit(1);
        }
    }
}
