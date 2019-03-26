/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gerber
 */
public class Archivo {

    public ArrayList<String> leerArchivo() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        ArrayList<String> lista = new ArrayList<>();
        try {
            archivo = new File("D:\\productos.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                lista.add(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return lista;
    }

    public void obtenerNodos(ArrayList<String> nodos) {
        for (int i = 0; i < nodos.size(); i++) {
            System.out.println("\nARBOL " + i);
            String datosArbol = nodos.get(i);
            String[] preguntas;
            preguntas = datosArbol.split(",");
            for (int j = 0; j < preguntas.length; j++) {
                System.out.println(preguntas[j].trim());
            }
        }
    }
}
