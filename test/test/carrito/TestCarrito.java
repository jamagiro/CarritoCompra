/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.carrito;

import carritocompra.Carrito;
import carritocompra.ClienteNormal;
import carritocompra.ClientePlatinum;
import carritocompra.Empresa;
import carritocompra.Producto;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author consultor05
 */
public class TestCarrito {

    public TestCarrito() {

    }

    @Test
    public void inscribirClienteNormal() {

        Empresa empresa = new Empresa();
        //Creando cliente normal
        ClienteNormal cliente = new ClienteNormal("47834622", "Yanina", "Giraldo", "u201418557");
        empresa.agregarCliente(cliente);
    }

    @Test
    public void inscribirClientePlatinum() {
        Empresa empresa = new Empresa();
        //Creando cliente platinum
        ClientePlatinum cliente = new ClientePlatinum("47834622", "Yanina", "Giraldo", "u201418557");
        empresa.agregarCliente(cliente);
    }

    @Test
    public void ingresarProductosCarrito() {
        Carrito carrito = new Carrito();
        Producto prod = new Producto();
        prod.setCantidad(10);
        carrito.agregarProductos(prod);
    }

    @Test
    public void calcularTotalPagarClienteNormal() {
        ClienteNormal cliente = new ClienteNormal("45858754", "Alexis", "Giraldo", "u201312522");
        Carrito carrito = new Carrito();
        Producto producto = new Producto();
        producto.setCantidad(20);
        producto.setPrecio(45);
        carrito.agregarProductos(producto);
        cliente.setCarrito(carrito);
        System.out.println("Total a pagar: " + cliente.getCarrito().calcularTotalPagar());

    }

    @Test
    public void calcularTotalPagarClientePlatinum() {
        ClientePlatinum cliente = new ClientePlatinum("45858754", "Alexis", "Giraldo", "u201312522");
        Carrito carrito = new Carrito();
        Producto producto = new Producto();
        producto.setCantidad(10);
        producto.setPrecio(65);
        carrito.agregarProductos(producto);
        cliente.setCarrito(carrito);
        System.out.println("Total a pagar: " + cliente.getCarrito().calcularTotalPagar());

    }

    @Test
    public void ingresarProductosACarrito() {
        ClientePlatinum cliente = new ClientePlatinum("45858754", "Alexis", "Giraldo", "u201312522");
        Carrito carrito = new Carrito();
        Producto producto = new Producto();
        producto.setCantidad(10);
        producto.setPrecio(65);
        carrito.agregarProductos(producto);
        cliente.setCarrito(carrito);
    }

    @Test
    public void eliminarProductoCarrito() {
        Carrito carrito = new Carrito();
        Producto producto = new Producto();
        producto.setCantidad(30);
        producto.setPrecio(20);
        carrito.agregarProductos(producto);
        carrito.eliminarProducto(0);
    }

    @Test
    public void codigoUsuarioNoSeRepita() {
        ClientePlatinum cliente = new ClientePlatinum("45858754", "Yanina", "Giraldo", "u201312522");
        ClientePlatinum cliente1 = new ClientePlatinum("54875868", "Alexis", "Giraldo", "u201312525");
        Empresa empresa = new Empresa();
        assertEquals(true,empresa.agregarCliente(cliente)); 
        assertEquals(true,empresa.agregarCliente(cliente1)); 
    }

}
