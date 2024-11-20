package com.iudigital.actividad.cliente;

/**
 *<b>Decripción: clase que determina los productos que el cliente compra
 * <br>
 * @author Jose David Bermudez Marin
 */
public class Producto {

    /**
     * Atributo que determina el nombre
     */
    private String nombre;


    /**
     * Atributo que determina el precio
     */
    private float precio;


    /**
     * Atributo que determina la cantidad
     */
    private float cantidad;


    /**
     * @param nombre
     * @param precio
     * @param cantidad
     */
    public Producto(String nombre, float precio, float cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }


    /**
     * metodo encargado de retornor el valor asignado al atributo nombre
     * @return  el nombre asociado a la clase
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método encargado de modificar el valor asignado al atributo nombre
     * @param nombre El nuevo nombre a modificar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * metodo encargado de retornor el valor asignado al atributo precio
     * @return el precio asociado a la clase
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Método encargado de modificar el valor asignado al atributo precio
     * @param precio El nuevo precio a modificar
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * metodo encargado de retornor el valor asignado al atributo cantidad
     * @return la cantidad asociada a la clase
     */
    public float getCantidad() {
        return cantidad;
    }

    /**
     * Método encargado de modificar el valor asignado al atributo cantidad
     * @param cantidad la cantidad asociada a la clase
     */
    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }
}
