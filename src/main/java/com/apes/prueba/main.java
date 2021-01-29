package com.apes.prueba;

public class main {

    public static void main(String[] args)
    {
        Carrito.Producto productoP = new Carrito.Producto();

        productoP.setCantidad( 6 );
        productoP.setNombre( "Jabon" );
        productoP.setPrecio( 2000 );

        Carrito carrito = new Carrito();

        Carrito.llenarCarrito(productoP);

        llenarCarritoPapas();

        Carrito.tenerCarrito().stream().forEach( System.out::println );
        System.out.println( "Carrito.precioTotal = " + Carrito.calculaPrecioCarrito() );
        System.out.println( "Suma alternativa= " + Carrito.alternativaPrecioCarrito() );
    }

    static void llenarCarritoPapas(){

        Carrito.Producto productoP = new Carrito.Producto();

        productoP.setCantidad( 25 );
        productoP.setNombre( "papas" );
        productoP.setPrecio( 1700 );

        Carrito.llenarCarrito( productoP );
    }
}
