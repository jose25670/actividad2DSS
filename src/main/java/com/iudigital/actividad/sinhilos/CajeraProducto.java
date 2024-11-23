package com.iudigital.actividad.sinhilos;

import com.iudigital.actividad.cliente.ClienteProducto;
import com.iudigital.actividad.cliente.Producto;

/**
 * Método encargado de recibir el cliente y el tiempo
 * @author
 */
public class CajeraProducto {


    private String nombre;

    public CajeraProducto(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @param cliente
     * @param timeStamp
     */
    public void procesarCompra(ClienteProducto cliente, long timeStamp){
        System.out.println("la cajera " + this.nombre +
                " comienza a procesar la compra del cleinte "
                + cliente.getNombre() + " en el tiempo: " + (System.currentTimeMillis() - timeStamp)/ 1000 + "segundos");
        int contCliente = 1;
        for (Producto producto : cliente.getProductos()){
            this.esperarXSegundos();
            System.out.println("procesando el producto " + contCliente
            + " nombre producto " + producto.getNombre()
            + " precio producto " + producto.getPrecio()
            + " cantidad productos " + producto.getCantidad()
            + " costo total del producto: "+ producto.getCantidad() * producto.getPrecio()
            + " -> Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + " segundos");

        }

        System.out.println(" La cajera "+ this.nombre + " ha terminado de procesar la compra"
        + " del cliente " + cliente.getNombre() + " en el tiempo: "
        + (System.currentTimeMillis() - timeStamp) / 1000 + " segundos");

    }

    private void esperarXSegundos() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
