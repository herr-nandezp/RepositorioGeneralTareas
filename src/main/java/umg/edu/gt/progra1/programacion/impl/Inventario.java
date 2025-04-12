/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.progra1.programacion.impl;

import umg.edu.gt.progra1.programacion.impl.dto.Producto;

/**
 *
 * @author wcord
 */
public class Inventario {
    
    public void inicializarInventario() {
        Producto[] productos = new Producto[5];
        productos[0] = new Producto("Maseca", 100, 10.5, "Masa", true);
        productos[1] = new Producto("Coca cola", 0, 20, "Bebida", false);
        productos[2] = new Producto("Pepsi cola", 500, 15, "Bebida", true);
        productos[3] = new Producto("Galleta", 200, 7.25, "Golosinas", true);
        productos[4] = new Producto("Pinguino", 0, 7.25, "Golosinas", false);
        
        // como calcular el precio de todo el inventario?       
        System.out.println("Precio total: " + calcularTotalInventario(productos));
        
        // Cuantos productos estan fuera de inventario?
        
        System.out.println("Hay " + calcularFueraInventario(productos) + " productos fuera del inventario");
        
        // Cuales son los productos disponibles?
        
        System.out.println("Hay " + calcularInventarioDisponible(productos) + " productos dentro del inventario");
        
        // Hacer una tabla para mostrar el inventario total
        
        mostrarTablaInventario(productos);
        
        
    }
    
    private double calcularTotalInventario(Producto[] productos) {
        double precioTotal = 0;
        for(Producto prod: productos) {
            precioTotal = precioTotal + prod.calcularValorTotal();
        }
        return precioTotal;
    }
    
    
    private int calcularFueraInventario (Producto[] productos){
        int contador = 0;
    for (Producto prod : productos) {
        if (prod.fueraDeInventario() == false) {
            contador++;
        }
    }
    return contador;
    }
    
    private int calcularInventarioDisponible (Producto[] productos){
        int contador = 0;
    for (Producto prod : productos) {
        if (prod.fueraDeInventario()) {
            contador++;
        }
    }
    return contador;
    }
    
    private void mostrarTablaInventario(Producto[] productos) {
    System.out.printf("%-15s %-10s %-10s %-15s %-15s%n" , "Nombre", "Cantidad", "Precio", "Categoría", "Disponible");
    System.out.println("--------------------------------------------------------------------------");

        for (Producto prod : productos) {
            String disponible = prod.fueraDeInventario() ? "Si" : "No";
            System.out.printf(
                "%-15s %-10d Q%-9.2f %-15s %-12s%n",
                prod.getNombre(), prod.getCantidad(), prod.getPrecio(), prod.getTipo(), disponible
            );
        }
    }
    
}
