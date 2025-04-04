/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.progra1.programacion.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Vectores {
    
    /**
     * 📜 Descripción: Dado un vector de números enteros, encuentre la suma más pequeña y la suma más grande posibles al sumar (N-1) elementos del vector.
        🔹 Instrucciones:
        Leer un vector de N números enteros.
        Calcular la suma mínima excluyendo el número más grande.
        Calcular la suma máxima excluyendo el número más pequeño.
        Imprimir ambas sumas.
        * Ejemplo de entrada: [1, 3, 5, 7, 9]
        * Ejemplo de salida: 
          Suma mínima: 16  
          Suma máxima: 24  
     */
    
    public void encontrarSuma (int[] numeros, int n){
        
        Arrays.sort(numeros);
        int resultadoMin = 0;
        int resultadoMax = 0;
        
        for (int i = 0; i < n-1; i++){
            resultadoMin = resultadoMin + numeros[i];
        }
        for (int j = 3; j > 0; j--){
            resultadoMax = resultadoMax + numeros[j];
        }
        
        System.out.println("El resultado de la suma de numeros mas pequenios; " + resultadoMin);
        System.out.println("El resultado de la suma de mas grandes; " + resultadoMax);
        
    }
    
    /**
     * Reordenamiento de Números Pares e Impares
        📜 Descripción: Reordene un vector de enteros colocando primero los pares y luego los impares, manteniendo el orden relativo de aparición en cada grupo.
        🔹 Instrucciones:
        Leer un vector de N números enteros.
        Crear un nuevo vector donde los pares aparezcan primero y los impares después.
        No utilizar estructuras adicionales como listas o colecciones.
        * Ejemplo de entrada: [3, 1, 2, 4, 5, 6]
        * Ejemplo de salida: [2, 4, 6, 3, 1, 5]
     */
    
    public void ordenarParesImpares (int[] numeros, int n){
        
        Arrays.sort(numeros);
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {            
                if (numeros[i] % 2 != 0 && numeros[j] % 2 == 0) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }
        
        System.out.println("Arreglo ordenado: ");
        for (int i = 0; i < n; i++){
            System.out.print(numeros[i] + " ");
        }
        
    }
    
    /**
     * Encuentra los Dos Números que Suman un Valor
        📜 Descripción: Dado un vector de enteros y un número objetivo, encuentre dos elementos del vector cuya suma sea igual al número objetivo.
        🔹 Instrucciones:
        Leer un vector de N enteros y un número X.
        Identificar dos números dentro del vector cuya suma sea X.
        Imprimir ambos números o indicar si no existen.
        * Ejemplo de entrada:
        *  Vector: [2, 7, 11, 15]  
            X = 9
        * Ejemplo de salida: Par encontrado: (2, 7)
     */
    
    public void encontrarDosNumeros (int [] numeros, int n, int x){
        
        Arrays.sort(numeros);
        
        for (int i = 1; i < n; i++){
            if (numeros[0] + numeros [i] != x){
                continue;
            } else {
                System.out.print("Par encontrado (" + numeros[0] + ", " + numeros[i] + ")");
                break;
            }
        
        }
        
    }
    
    /**
     * Rotación Circular de un Vector
        📜 Descripción: Desplace circularmente los elementos de un vector k posiciones hacia la derecha.
        🔹 Instrucciones:
        Leer un vector de N enteros y un número k.
        Rotar el vector k posiciones hacia la derecha.
        * Ejemplo de entrada:
        Vector: [1, 2, 3, 4, 5]  
        k = 2
        * Ejemplo de salida: [4, 5, 1, 2, 3]
     */
    
    public void circularVector (int [] numeros, int n, int k){
        
        for (int i = 1; i <= k; i++){
            
            int temp = numeros[n - 1];
            int j = n - 1;
            
            do{
                numeros[j] = numeros[j - 1];
                j--; 
            } while (j > 0);
            
            numeros[0] = temp;
        }
        
    }
    
    /**
     * Subsecuencia Más Larga de Números Consecutivos
        📜 Descripción: Encuentre la subsecuencia más larga de números consecutivos en un vector desordenado.
        🔹 Instrucciones:
        Leer un vector de N números enteros.
        Determinar la longitud de la mayor subsecuencia de números consecutivos (no necesariamente contiguos en el vector).
        * Ejemplo de entrada: [100, 4, 200, 1, 3, 2]
        * Ejemplo de salida: Mayor subsecuencia consecutiva: 4 (1, 2, 3, 4)
     */
    
    public void secuenciaLarga (int[] numeros, int n){
        
        int longitudMaxima = 1;
        int longitudActual = 1;
        int inicio = numeros[0];
        int inicioMaximo = inicio;
        
        Arrays.sort(numeros);
        
        for (int i = 1; i < n; i++) {
            if (numeros[i] == numeros[i - 1]) {
                continue;
            }
            if (numeros[i] == numeros[i - 1] + 1) {
                longitudActual++;
            } else {
                if (longitudActual > longitudMaxima) {
                    longitudMaxima = longitudActual;
                    inicioMaximo = inicio;
                }
                longitudActual = 1;
                inicio = numeros[i];
            }
        }

        
        if (longitudActual > longitudMaxima) {
            longitudMaxima = longitudActual;
            inicioMaximo = inicio;
        }

        
        System.out.print("Mayor subsecuencia consecutiva: " + longitudMaxima + " (");
        for (int i = 0; i < longitudMaxima; i++) {
            System.out.print((inicioMaximo + i));
            if (i < longitudMaxima - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(")");
        
        
    }
    
}
