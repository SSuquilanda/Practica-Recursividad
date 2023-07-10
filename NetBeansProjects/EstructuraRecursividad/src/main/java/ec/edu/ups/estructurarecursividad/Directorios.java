/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.estructurarecursividad;

import java.io.File;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class Directorios {
    public static void renombrarCarpetas(File path){
        if (path.isDirectory()){
            String nombrePath = path.getName() + "_Nuevo";
            File nuevoPath = new File(path.getParentFile(), nombrePath);
            path.renameTo(nuevoPath);
            
            File[] subDirectorios = nuevoPath.listFiles();
            if (subDirectorios != null){
                renombrarSubCarpetas(subDirectorios, 0);
                    
            }
        }
            
    }
    public static void renombrarSubCarpetas(File[] subdirectorios, int index){
        if(index < subdirectorios.length){
            File subdirectorio = subdirectorios [index];
            renombrarCarpetas(subdirectorio);
            renombrarSubCarpetas(subdirectorios, index+1);
        }
    }
    
}
