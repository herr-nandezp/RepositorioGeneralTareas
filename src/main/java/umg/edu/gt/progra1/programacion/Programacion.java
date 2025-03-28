/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package umg.edu.gt.progra1.programacion;

import java.util.Scanner;
import static umg.edu.gt.progra1.programacion.ejercicios.Formulas.formulaCuadratica;
import umg.edu.gt.progra1.programacion.estructuraDeControl.IfElseExample;
import umg.edu.gt.progra1.programacion.estructuraDeControl.LoopExample;
import umg.edu.gt.progra1.programacion.estructuraDeControl.SwitchCaseExample;
import umg.edu.gt.progra1.programacion.ejercicios.Formulas;


public class Programacion {

    public static void main(String[] args) {
        System.out.println("Hola bienvenido a Progra 1");
        numeroVampiro();
    }
    
    
    // IF ELSE
    public static void testTriangulo() {
        
        IfElseExample ifElseExamp = new IfElseExample();        
        ifElseExamp.validarTriangulo(5, 5, 5);        
        ifElseExamp.validarTriangulo(6, 6, 4);        
        ifElseExamp.validarTriangulo(3, 4, 5);
        ifElseExamp.validarTriangulo(2, 2, 5);
    }
    
    public static void testIfSimple() {
        // Istanciar clase como objeto
        // NombreClase nombreObjeto = new NombreClase();
        IfElseExample ifElseExamp = new IfElseExample();
        
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();        
        ifElseExamp.example(numero);
        
        System.out.println("Ingrese un numero: ");
        numero = scanner.nextInt();        
        ifElseExamp.example(numero);
        
        System.out.println("Ingrese un numero: ");
        numero = scanner.nextInt();        
        ifElseExamp.example(numero);
        scanner.close();
    }
    
    // Switch
    public static void testSwitchSimple() {
        
        SwitchCaseExample switchExample = new SwitchCaseExample();
        String diaEnLetras = switchExample.getDiaSemana(4);
        System.out.println("El resultado es: " + diaEnLetras);
    }
    
    public static void testSwitchReducido() {
        SwitchCaseExample switchExample = new SwitchCaseExample();
        boolean esLaboral = switchExample.getDiasNoLaborales("Sabado");
        System.out.println("El dia es laboral: " + esLaboral);
    }
    
    public static void testLoops(){
        LoopExample loopexample = new LoopExample ();
        loopexample.DoWhileExample();
        loopexample.WhileExample();
        loopexample.ForExample();
        loopexample.BreakExample();
        loopexample.ContinueExample();
    }
    
    public static void testSwitch(){
        SwitchCaseExample switchEx = new SwitchCaseExample();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print ("Ingrese el primer numero: ");
        int n1 = scanner.nextInt();
        System.out.print ("Ingrese el segundo numero: ");
        int n2 = scanner.nextInt();
        System.out.print ("Ingrese la operacion deseada: ");
        String op = scanner.toString();
        
        
        
        switchEx.OperacionesSwitch(n1, n2, op);
    }
    
    public static void formulaCuadratica() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ejercicio: Fórmula Cuadrática");
        System.out.println("Ingrese el valor de a:");
        double a = scanner.nextDouble();

        System.out.println("Ingrese el valor de b:");
        double b = scanner.nextDouble();

        System.out.println("Ingrese el valor de c:");
        double c = scanner.nextDouble();

        System.out.println("Resultado:");
        Formulas.formulaCuadratica(a, b, c);
    }
    
    public static void numeroPalindromo(){
        System.out.println("\n----- Número Palíndromo -----");
        System.out.println("¿12321 es palíndromo? " + Formulas.esNumeroPalindromo(12321));

    }
    
    public static void palabraPalindroma(){
       System.out.println("\n----- Palabra Palíndromo -----");
       System.out.println("¿'Anita lava la tina' es palíndromo? " + Formulas.esPalabraPalindromo("Anita lava la tina"));
    }
    
    public static void numeroVampiro(){
        System.out.println("\n----- Número Vampiro -----");
        Formulas.encontrarVampiro(1000, 9999);
    }
}
