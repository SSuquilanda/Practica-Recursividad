/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.estructurarecursividad;

import java.io.File;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class EstructuraRecursividad {

    public static void main(String[] args) {
       //int numero =5;
       //int factorial = Factorial.factorialRecursivo(numero);
        //System.out.println("Resultado: " + factorial);
        int numero = 5; 
        int numeroDigitos = 123;
        int exponente = 3;
        int resultadoSuma = SumaRecursiva.suma(numero);
        int resultadoExponente = PotenciaRecursiva.potencia(numero, exponente);
        int resultadoSumaDigitos = SumaRecursiva.sumaRecursivaDigitos(numeroDigitos);

        System.out.println("Resultado: " + resultadoSuma);
        System.out.println("Resultado Potencia Recursiva: " +resultadoExponente );
        System.out.println("Resultado Suma Digitos: " + resultadoSumaDigitos );
        
        String path = "/Users/samanthasuquilandaquilli/Desktop/RD";
        File mainPath = new File (path);
        Directorios.renombrarCarpetas(mainPath);
    }
}
