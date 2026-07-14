package ProyectoOrdenCompra;

import java.util.Date;


public class Ordencompra {
    private int id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;
    private int indiceProducto = 0;
    

    private static int ultimoId =1;
    

    public Ordencompra(){
        this.id = ultimoId++;
        this.productos = new Producto[4];
    }

    public Ordencompra(String descripcion) {
        this();
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Ordencompra addProducto(Producto producto){
        if(indiceProducto < this.productos.length){
            this.productos[indiceProducto++] = producto;
        }
        return this;
    }

   
    public int sumatoriaTotal(){
        int sumatoriaProductos = 0;
        for(Producto p: productos){
            sumatoriaProductos += p.getPrecio();
        }
        return sumatoriaProductos;
    }

    public String verDetalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nid:  " + this.id);
        sb.append("\nCliente: " + this.cliente);
        sb.append("\nDescripcion: " + this.descripcion);
        sb.append("\nfecha:  " + this.fecha);
        sb.append("\nProductos: ");
        for(Producto p: this.productos){
            sb.append("\n" + p.getFabricante() + ", " + p.getNombre() + ", " + p.getPrecio() + "$");
        }
        sb.append("\nCosto Total: " + sumatoriaTotal() + "$");

        return sb.toString();
    }

}
