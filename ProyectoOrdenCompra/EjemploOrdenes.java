package ProyectoOrdenCompra;

import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {

        Date fechaActual = new Date();

        Cliente huitrado = new Cliente("Huitrado","Marquez");
        Ordencompra ordenCompra1 = new Ordencompra("Cremeria");

        ordenCompra1.addProducto(new Producto("LALA","Crema",40))
                                .addProducto(new Producto("LALA", "Leche", 55))
                                .addProducto(new Producto("Hellmanns", "Mayonesa", 75))
                                .addProducto(new Producto("Soriana", "Huevo", 60));

        ordenCompra1.setCliente(huitrado);
        ordenCompra1.setFecha(fechaActual);
        System.out.println(ordenCompra1.verDetalle());

        Cliente aki = new Cliente("Aki", "Aguilar");
        Ordencompra ordenCompra2 = new Ordencompra("Vinateria");

        ordenCompra2.addProducto(new Producto("Diageo", "Tequila Don Julio 70", 1100))
                                .addProducto(new Producto("Diageo", "Black Label Johny Walker", 900))
                                .addProducto(new Producto("Proximo Spirits", "Kraken Ron", 200))
                                .addProducto(new Producto("Pernod Ricard", "", 350));
        
        ordenCompra2.setCliente(aki);
        ordenCompra2.setFecha(fechaActual);
        System.out.println(ordenCompra2.verDetalle());

        Cliente kindred = new Cliente("Lamb", "Wolf");
        Ordencompra ordenCompra3 = new Ordencompra("Carnita asada");

        ordenCompra3.addProducto(new Producto("Kirkman", "Carne para Asar", 1200))
                                .addProducto(new Producto("Kirkman", "Guacamole", 80))
                                .addProducto(new Producto("Kirkman", "Tortillas", 30))
                                .addProducto(new Producto("Kirkman", "Cebollitas", 40));
        ordenCompra3.setCliente(kindred);
        ordenCompra3.setFecha(fechaActual);
        System.out.println(ordenCompra3.verDetalle());
        }
    }

