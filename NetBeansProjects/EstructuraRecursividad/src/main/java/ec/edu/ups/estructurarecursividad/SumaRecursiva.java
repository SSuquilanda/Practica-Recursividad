/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.estructurarecursividad;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class SumaRecursiva {
    
    public static int suma(int n){
        if(n==0) {
            return 0;
        }else {
            int sumaNMenos1 = suma(n-1);
            int sumaN = n + sumaNMenos1;
            System.out.println("Suma consecutiva de: " + n+ ": Suma(" + (n-1));
            return sumaN;
        }
        
    }
    public static int sumaRecursivaDigitos(int n){
        if(n<10){
            return n;
            
        }else {
            int ultimoDigito = n%10;
            int digito = sumaRecursivaDigitos(n/10);
            int sumaTotal = ultimoDigito + digito;
            return sumaTotal;
        }
    }
    
}
