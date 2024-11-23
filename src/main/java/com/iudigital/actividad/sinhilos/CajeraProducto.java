package com.iudigital.actividad.sinhilos;
import com.iudigital.actividad.cliente.ClienteProducto;
import com.iudigital.actividad.cliente.Producto;

/**
 *<b>Decripción: Clase que representa dos cajeras que procesa la compra de dos clientes sin usar hilos de procesamiento con el fin de deferencias tiempos entre una aplicación con hilos y sin hilos de procesamiento.
 * <br>
 * @author Jose David Bermudez Marin, Jonathan David Guerra Cano
 */

public class CajeraProducto {

    private String nombre;
    private ClienteProducto cliente;
    private long tiempoInicial;

    public CajeraProducto(String nombre, ClienteProducto cliente, long tiempoInicial){
        this.nombre = nombre;
        this.cliente = cliente;
        this.tiempoInicial = tiempoInicial;
    }

    /**
     *<b>Método para procesar de cada cliente en un hilo independiente, y muestra la información de forma mas legible.
     * <br>
     * @author Jose David Bermudez Marin, Jonathan David Guerra Cano
     */

    public void procesarCompra() {
        System.out.println("\n=== La cajera " + this.nombre + " comienza a procesar la compra del cliente "
                + this.cliente.getNombre() + " ===");
        System.out.println("Tiempo inicial: " + (System.currentTimeMillis() - this.tiempoInicial) / 1000 + " segundos\n");

        int contCliente = 1;
        for (Producto producto : cliente.getProductos()) {
            this.esperarXSegundos();


            System.out.println(String.format(
                    "Producto %d:\n\tNombre: %s\n\tPrecio: %.2f\n\tCantidad: %.2f\n\tCosto total: %.2f\n\tTiempo transcurrido: %d segundos\n",
                    contCliente,
                    producto.getNombre(),
                    producto.getPrecio(),
                    producto.getCantidad(),
                    producto.getCantidad() * producto.getPrecio(),
                    (System.currentTimeMillis() - this.tiempoInicial) / 1000
            ));
            contCliente++;
        }

        System.out.println("=== La cajera " + this.nombre + " ha finalizado el procesamiento del cliente "
                + this.cliente.getNombre() + " ===\n");
    }

    /**
     * <b>Pausa la ejecución por un segundo simulando el tiempo de atención a un cliente.
     * * <br>
     * @author Jose David Bermudez Marin, Jonathan David Guerra Cano
     */
    private void esperarXSegundos() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
