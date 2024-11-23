package com.iudigital.actividad.sinhilos;
import com.iudigital.actividad.cliente.ClienteProducto;
import com.iudigital.actividad.cliente.Producto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *<b>Decripción: Clase que simula un sistema de dos cajeras donde se procesa los productos de dos clientes con sus respectivos atributos.
 * <br>
 * @author Jose David Bermudez Marin, Jonathan David Guerra Cano
 */

public class ClienteCajeraMain {

    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<Producto>();
        setProductos(productos);

        ClienteProducto clienteUno = new ClienteProducto("Carlos", productos);
        ClienteProducto clienteDos = new ClienteProducto("Marta", productos);


        long tiempoInicial = System.currentTimeMillis();
        CajeraProducto cajeraUno = new CajeraProducto("Claudia", clienteUno, tiempoInicial);
        CajeraProducto cajeraDos = new CajeraProducto("Marcela", clienteDos, tiempoInicial);

        cajeraUno.procesarCompra();
        cajeraDos.procesarCompra();
    }

    /**
     * Método para llenar la lista de productos dinámicamente a través de un menú interactivo
     * @param productos Lista de productos que será llenada
     */

    public static void setProductos(List<Producto> productos) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los detalles de 4 productos:");

        for (int i = 1; i <= 4; i++) {
            System.out.println("Producto " + i + ":");

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            float precio = 0;
            while (true) {
                try {
                    System.out.print("Precio: ");
                    precio = Float.parseFloat(scanner.nextLine());
                    if (precio < 0) throw new IllegalArgumentException("El precio no puede ser negativo.");
                    break;
                } catch (Exception e) {
                    System.out.println("Entrada inválida. Por favor, ingrese un número positivo.");
                }
            }

            float cantidad = 0;
            while (true) {
                try {
                    System.out.print("Cantidad: ");
                    cantidad = Float.parseFloat(scanner.nextLine());
                    if (cantidad < 0) throw new IllegalArgumentException("La cantidad no puede ser negativa.");
                    break;
                } catch (Exception e) {
                    System.out.println("Entrada inválida. Por favor, ingrese un número positivo.");
                }
            }

            productos.add(new Producto(nombre, precio, cantidad));
            System.out.println("Producto agregado exitosamente.\n");
        }

        System.out.println("¡Productos registrados con éxito!");

    }
}
