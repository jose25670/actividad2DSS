package com.iudigital.actividad.conhilos;
import com.iudigital.actividad.cliente.ClienteProducto;
import com.iudigital.actividad.cliente.Producto;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;


public class CajeraProductoHilos extends Thread{


    private String nombre;

    private ClienteProducto cliente;

    private long tiempoInicial;

    public CajeraProductoHilos(String nombre, ClienteProducto cliente, long tiempoInicial){
        this.nombre = nombre;
        this.cliente = cliente;
        this.tiempoInicial = tiempoInicial;
    }

    public void run() {
        System.out.println("La cajera " + this.nombre + " comienza a procesar la compra del cliente "
         + this.cliente.getNombre() + " en el tiempo: " + (System.currentTimeMillis() - this.tiempoInicial)
         / 1000 + " segundos ");

        int contCliente = 1;
        for (Producto producto : cliente.getProductos()) {
            this.esperarXSegundos();
            System.out.println("procesando el producto " + contCliente + " nombre producto " + producto.getNombre()
                    + " precio producto " + producto.getPrecio()
                    + " cantidad productos " + producto.getCantidad()
                    + " costo total del producto: "+ producto.getCantidad() * producto.getPrecio()
                    + " -> Tiempo: " + (System.currentTimeMillis() - this.tiempoInicial) / 1000 + " segundos");
          contCliente++;
        }

        System.out.println();
    }

    private void esperarXSegundos() {

        try{
            Thread.sleep(1000);
    }
        catch (InterruptedException e) {
        throw new RuntimeException(e);
        }
    }


}