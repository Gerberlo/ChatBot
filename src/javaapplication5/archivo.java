/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author corpgleiva
 */
public class archivo {

    public ArrayList<String> leerArchivo(String nvl) {
        String nombreArchivo = nvl.trim() + ".txt";
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        ArrayList<String> datos = new ArrayList<>();
        try {
            archivo = new File("C:\\" + nombreArchivo);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                datos.add(linea);
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
        return datos;
    }
}
