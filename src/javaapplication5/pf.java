/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.ArrayList;
import java.util.Scanner;
import static javaapplication5.arbol.ANSI_PURPLE;

/**
 *
 * @author corpgleiva
 */
public class pf {

    /**
     * @param args the command line arguments
     */
    //Reset
    public static final String ANSI_RESET = "\u001B[0m";
    //Colores de letra
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        // TODO code application logic here       
        arbol arbol = new arbol();
        archivo archivo = new archivo();
        ArrayList<String> diccionario = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        arbol.construirArbol();
        String idNodoActual = "raiz";
        String clave = "";

        do {
            System.out.print(ANSI_BLUE + "Tu: ");
            clave = sc.nextLine();  
            System.out.println("\n");
            diccionario = archivo.leerArchivo(idNodoActual);
            idNodoActual = arbol.obtenerRespuesta(diccionario, clave, idNodoActual);
            if(idNodoActual.equalsIgnoreCase("salir"))
            {
                return;
            }
            //comentar este if al terminar todos los archivos diccionarios
            if (idNodoActual.length() >9)
            {
                System.out.println("Chat terminado por fase beta");
                return;
            }
            //System.out.println("nosido actual " + idNodoActual);
        } while (true);
    }
}
