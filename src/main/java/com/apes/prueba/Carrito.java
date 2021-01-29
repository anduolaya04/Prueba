package com.apes.prueba;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;


enum Categorias{

    CHARCUTERIA,
    PANADERIA,
    ASEO,
    ELECTRODOMESTICOS,
    MASCOTAS
};

public class Carrito {

    static List<Producto> productos;


    final String cliente ;


    static int total = 0;


    public Carrito() {

        cliente = "hola";
        productos = new ArrayList<>();
    }

    static void llenarCarrito(Producto producto) {

        productos.add( producto );
    }


    static class Producto {

        int precio;

        String nombre;

        int cantidad;

        Categorias categoria;

        public void setPrecio(int precio) {
            this.precio = precio;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }

        public void setCategoria(Categorias categoria) {
            this.categoria = categoria;
        }

        int precioProductos(){

            return cantidad * precio;
        }

        @Override
        public String toString() {
            return "Producto{" +
                    "precio=" + precio +
                    ", nombre='" + nombre + '\'' +
                    ", cantidad=" + cantidad +
                    ", categoria=" + categoria +
                    '}';
        }
    }

    static List<Producto> tenerCarrito(){

        return Collections.unmodifiableList( productos );
    }

    static int calculaPrecioCarrito(){

        for (Producto producto: productos) {
            total = producto.precioProductos() + total;
        }

        return total;
    }

    static int alternativaPrecioCarrito() {

        return productos.stream().mapToInt( x -> x.precioProductos()).sum();
    }
}
