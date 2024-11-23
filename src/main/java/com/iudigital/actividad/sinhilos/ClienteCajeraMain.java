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


        long tiempoInicial = System.currentTimeMillis();
        CajeraProducto cajeraUno = new CajeraProducto("Claudia");
        CajeraProducto cajeraDos = new CajeraProducto("Marcela");

        cajeraUno.procesarCompra(clienteUno, tiempoInicial);
        cajeraDos.procesarCompra(clienteDos, tiempoInicial);
    }






    /**
     * método encargado de modificar el valor del atributo productos
     *
     * @param productos El nuevo productos a modificar
     */
    public static void setProductos(List<Producto> productos) {
        Producto productoUno = new Producto("sal", 5000, 2);
        Producto productoDos = new Producto("arroz", 2500, 7);
        Producto productoTres = new Producto("frijol", 8500, 6);
        Producto productoCuatro = new Producto("lenteja", 1200, 2);
        /**
         * funcion encargada de setear los productos
         */
        productos.add(productoUno);
        productos.add(productoDos);
        productos.add(productoTres);
        productos.add(productoCuatro);

    }

}
