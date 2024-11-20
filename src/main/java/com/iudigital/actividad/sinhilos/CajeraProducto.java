package com.iudigital.actividad.sinhilos;

/**
 * Método encargado de
 * @author
 */
public class CajeraProducto {


    private String nombre;

    public CajeraProducto(String nombre) {
        this.nombre = nombre;
    }
    public void procesarCompra(ClienteProducto cliente, long timeStamp){
        System.out.println("la cajera " + this.nombre +
                "comienza a procesar la compra del cleinte "
                + cliente.getNombre() + "en el tiempo: " + (System.currentTimeMillis() - timeStamp)/ 1000 + "segundos");
        int contCliente = 1;
        for (Produto producto : cliente.getProducto()){
            this.esperarXSegundos();
            System.out.println("prosesando el producto " + contCliente
            + "nombre producto " + producto.getNombre()
            + "precio producto " + producto.getPrecio()
            + "cantidad productos " + producto.getCantidad()
            + "costo total del producto: "+ producto.getCantidad() * producto.getPrecio()
            + "-> Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + " segundos");
        }
    }
}
