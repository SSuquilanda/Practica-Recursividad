/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.practicatresestructura;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class PracticaTresEstructura {
    private Scanner teclado;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la lista de signos sin espacios: ");
        String entrada = scanner.nextLine();

        List<String> listaSignos = new ArrayList<>();

        // Recorrer la entrada y agregar los signos a la lista
        for (int i = 0; i < entrada.length(); i++) {
            String signo = Character.toString(entrada.charAt(i));
            listaSignos.add(signo);
        }

        System.out.println("Lista original: " + listaSignos);

        Stack<String> pilaSignos = new Stack<>();

        // Recorrer la lista de signos
        for (String signo : listaSignos) {
            if (!pilaSignos.isEmpty() && esOpuesto(signo, pilaSignos.peek())) {
                // El signo actual coincide con el opuesto al último signo en la pila, se elimina el último signo
                pilaSignos.pop();
            } else {
                // El signo actual no coincide con el opuesto, se imprime y se agrega a la pila
                System.out.println("Signo: " + signo);
                pilaSignos.push(signo);
            }
        }

        scanner.close();
    }
                
    
}
