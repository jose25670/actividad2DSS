package com.iudigital.actividad.conhilos;
import com.iudigital.actividad.cliente.ClienteProducto;
import com.iudigital.actividad.cliente.Producto;
import java.util.ArrayList;
import java.util.List;


public class ClienteCajeraHilosMain {

    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();
        setProductos(productos);

        ClienteProducto clienteUno = new ClienteProducto("Carlos", productos);
        ClienteProducto clienteDos = new ClienteProducto("Marta", productos);


        long tiempoInicial = System.currentTimeMillis();
        CajeraProductoHilos cajeraUno = new CajeraProductoHilos("Claudia", clienteUno, tiempoInicial);
        CajeraProductoHilos cajeraDos = new CajeraProductoHilos("Marcela", clienteDos, tiempoInicial);

        cajeraUno.start();
        cajeraDos.start();
    }

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
