/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.progra1.programacion.ejercicios;


import java.util.Arrays;

public class Formulas {
    
    /**
     * Ejercicio: Formula Cuadratica
     * Resuelva una formula cuadratica
     * Calcular las racies reales utilizando formula cuadratica
     * Consideraciones
     *  Dos soluciones reales si el discrimiantes es = b2 - 4ac es positivo
     *  Sin soluciones reales si el discriminantre es menor a cero
     *  Validar los parametros recibidos
     */    
    
        public static void formulaCuadratica (double a, double b, double c){
    
        if (a == 0){
            System.out.print ("el coeficiente de A no puede ser 0");
            return;
        }
        
        double discriminante = 2 * b - 4*a*c;
        
        if (discriminante < 0){
            
            System.out.print ("Sin Soluciones reales" );
        }else {
            
            double raiz = Math.sqrt(discriminante);
            double x1 = (-b + raiz) / (2 * a);
            double x2 = (-b - raiz) / (2 * a);
            
            System.out.print ("2 Soluciones: ");
            System.out.print ("x1: " + x1);
            System.out.print ("x2: " + x1);
            
        }
        
        
    
}    
    /**
     * Ejercicio: Numero palindrome
     * Metodo que verifique si un numero es palindromo: Se lee igual de izquierda a derecha y de derecha a izquierda
     */
    
    public static boolean esNumeroPalindromo(int numero) {
        String numStr = Integer.toString(numero);
        String invertido = new StringBuilder(numStr).reverse().toString();
        return numStr.equals(invertido);
    }   
    /**
     * Ejercicio: Palabra palindrome
     * Metodo que verifique si una palabra es palindromo: Se lee igual de izquierda a derecha y de derecha a izquierda
     */
    
public static boolean esPalabraPalindromo(String palabra) {
        String limpia = palabra.replaceAll("\\s+", "").toLowerCase();
        String invertida = new StringBuilder(limpia).reverse().toString();
        return limpia.equals(invertida);
    }
    /**
     * Ejercicio: Numero Vampiro con Colmillos
     * 
     * Un numero vampiro es un numero entero positivo que puede ser factorizado en dos numeros mas pequeños, llamados colmillos, de tal manera que:
     *  los colmillos no pueden terminar ambos en cero
     *  al multiplicar los colmillos el resultado debe ser el numero vampiro
     *  la contatenacion de los digitos colmillos en cualquier orden, debe coincidir con los digitos del numero vampiro
     * 
     * Ejemplo:
     *  el numero 1260 es un numero vampiro, porque:
     *  los digitos 21 y 60 juntos (2,1,6,0) pueden reorganizarse para formar el 1260
     *  sus colmillos son 21 y 60 porque 21 * 60 = 1260
     * 
     * El Programa debe encontrar y mostrar el primer numero vampiro dentro de un rango dado.
     */

  public static void encontrarVampiro(int inicio, int fin) {
    
      for (int numero = inicio; numero <= fin; numero++) {
            
            String numeroString = Integer.toString(numero);
            if (numeroString.length() % 2 != 0) continue;

            int mitad = numeroString.length() / 2;
            
            for (int i = (int) Math.pow(10, mitad - 1); i < Math.pow(10, mitad); i++) {
                if (numero % i != 0) continue;
                int j = numero / i;

                if (Integer.toString(i).endsWith("0") && Integer.toString(j).endsWith("0")) continue;

                String colmillos = Integer.toString(i) + Integer.toString(j);
                char[] original = numeroString.toCharArray();
                char[] combinado = colmillos.toCharArray();
                Arrays.sort(original);
                Arrays.sort(combinado);

                if (Arrays.equals(original, combinado)) {
                    System.out.println("Número vampiro encontrado: " + numero + " = " + i + " * " + j);
                    return;
}
            }
        }

        System.out.println("No se encontró número vampiro en el rango.");
    }
}
