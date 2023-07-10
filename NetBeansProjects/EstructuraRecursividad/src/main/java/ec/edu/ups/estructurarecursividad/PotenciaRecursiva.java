/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.estructurarecursividad;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class PotenciaRecursiva {
    
    public static int potencia (int base, int exponente){
        
        if(exponente ==0) {
            return 1;
            
            
        }else{
            return base*potencia(base,exponente-1);
            
            
            
        }
    }
    
}
