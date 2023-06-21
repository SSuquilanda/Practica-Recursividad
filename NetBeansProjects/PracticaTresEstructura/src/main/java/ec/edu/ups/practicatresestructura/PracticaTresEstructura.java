/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.practicatresestructura;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class PracticaTresEstructura {
    private Scanner teclado;
    
    public static void main(String[] args) {



        Scanner teclado = new Scanner(System.in);
        Character d = null;
        String sig;
        ArrayList<Character> listaCaracteres = new ArrayList<>();
        ArrayList<Character> finales = new ArrayList<>();
        System.out.print("Ingresa una lista de signos (separados por espacios): ");
        String input = teclado.nextLine();
        String[] caracteres = input.split(" ");

        for (String caracter : caracteres) {
            char c = caracter.charAt(0);
            listaCaracteres.add(c);
        }
        
        
        for (Character caracter1 : listaCaracteres) {
            String caracter = caracter1.toString();
            if (caracter.equals("{")) {
                finales.add(caracter1);
            } else if (caracter.equals("[")) {
                finales.add(caracter1);
            } else if (caracter.equals("(")) {
                finales.add(caracter1);
            } else if (caracter.equals("}")) {
                d = finales.get(finales.size() - 1);
                sig = d.toString();
                if (sig.equals("{")) {
                    finales.remove(finales.size() - 1);
                } else if (sig.equals("[")) {
                    finales.add(caracter1);
                } else if (sig.equals("(")) {
                    finales.add(caracter1);
                }
            } else if (caracter.equals("]")) {
                d = finales.get(finales.size() - 1);
                sig = d.toString();
                if (sig.equals("{")) {
                    finales.add(caracter1);
                } else if (sig.equals("[")) {
                    finales.remove(finales.size() - 1);
                } else if (sig.equals("(")) {
                    finales.add(caracter1);
                }
            } else if (caracter.equals(")")) {
                d = finales.get(finales.size() - 1);
                sig = d.toString();
                if (sig.equals("{")) {
                    finales.add(caracter1);
                } else if (sig.equals("[")) {
                    finales.add(caracter1);
                } else if (sig.equals("(")) {
                    finales.remove(finales.size() - 1);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character elemento : finales) {
            sb.append(elemento);
            System.out.println(sb);
        }
    }
}


                
    


