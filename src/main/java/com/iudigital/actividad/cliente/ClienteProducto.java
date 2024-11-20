package com.iudigital.actividad.cliente;

import java.util.List;

/**
 * clase que determina el cliente que realiza la compra
 * @author Jose David Bermudez Marin
 */

public class ClienteProducto {

    private final String nombre;


    private final List<Producto> productos;

    /**
     * @param nombre
     * @param productos
     */
    public ClienteProducto(String nombre, List<Producto> productos) {
        this.nombre = nombre;
        this.productos = productos;
    }

    /**
     * metodo encargado de retornar el atributo nombre
     * @return nombre asociado a la clase
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * metodo encargado de retornar el valor dl atributo productos
     * @return el producto asociado a la clase
     */
    public List<Producto> getProductos() {
        return productos;
    }
}
