/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.progra1.programacion.estructuraDeControl;

/**
 *
 * @author wcord
 */
public class LoopExample {
    
    /**
    * Tarea: Implementación de estructuras de control de flujo en Java.
    *
    * Instrucciones:
    * - En esta clase, deberá escribir ejemplos de cómo funcionan las siguientes estructuras de control:
    *   1. `do-while`: Mostrar un caso donde el bloque de código se ejecute al menos una vez.
    *   2. `while`: Implementar un ciclo que se repita mientras se cumpla una condición.
    *   3. `for`: Escribir un bucle que itere un número determinado de veces.
    *   4. `break`: Incluir un ejemplo donde se interrumpa un bucle bajo una condición específica.
    *   5. `continue`: Demostrar cómo omitir una iteración sin salir del bucle.
    *
    * - Comente cada ejemplo para explicar su funcionamiento.
    * - Asegúrese de que el código sea claro y fácil de entender.
    */
    
    public void DoWhileExample () {
        int contador = 0;
        do {
            System.out.print ("Contador: " + contador);
            contador++;
        } while (contador < 3);
    }
    
    public void WhileExample(){
        int numero = 5;
        while (numero < 10){
            numero++;
            System.out.print (numero);
        }
    }
    
    public void ForExample (){
        for (int a = 1; a<5; a++){
            System.out.print(a);
        }
    }
    
    public void BreakExample (){
        for (int a=0; a<10; a++){
            if (a==3){
                System.out.print ("el ciclo fue interrumpido en: " + a);
                break;
            }
        }
    }
    
    public void ContinueExample (){
        for (int a=0; a<10; a++){
            if (a==5){
                System.out.print ("El ciclo se salto: " + a);
                continue;
            }
            System.out.print (a);
        }
    }
    
    
}
