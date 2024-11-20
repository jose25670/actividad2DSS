package com.iudigital.actividad.sinhilos;

import com.iudigital.actividad.cliente.ClienteProducto;
import com.iudigital.actividad.cliente.Producto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 */
public class ClienteCajeraMain {

    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<Producto>();
        setProductos(productos);

        ClienteProducto clienteUno = new ClienteProducto("Carlos", productos);
        ClienteProducto clienteDos = new ClienteProducto("Marta", productos);
    }



    /**
     * método encargado de modificar el valor del atributo productos
     *
     * @param productos El nuevo productos a modificar
     */
    public static void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

}
