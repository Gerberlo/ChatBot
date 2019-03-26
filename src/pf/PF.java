/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gerber
 */
public class PF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> datos;
        Archivo archivo = new Archivo();
        datos = archivo.leerArchivo();
        String ingreso = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola ¿deseas probar el nuevo McMuffin Chapín?");
        ingreso = sc.nextLine();    
        
        archivo.obtenerNodos(datos);
        
    }
}
