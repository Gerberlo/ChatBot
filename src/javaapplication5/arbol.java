/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.ArrayList;

/**
 *
 * @author corpgleiva
 */
public class arbol {

    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RED = "\u001B[31m";

    private Nodo principal;
    public int altura;

    public Nodo obtenerRaiz() {
        return principal;
    }

    public arbol() {
        principal = null;
    }

    public void construirArbol() {
        //************************************ RAIZ ***********************************//
        Nodo raiz = new Nodo("raiz");
        raiz.texto = "Hola, buenos días, Bienvenido a Breakfast, donde servimos los mejores desayunos, ¿le gustaría probar el nuevo McMuffin Chapín?";
        System.out.println(ANSI_RED + "Agente Breakfast: \n" + raiz.texto + "\n");
        this.principal = raiz;
        //***********************************NIVEL 1***********************************//
        Nodo n1i = raiz.HijoIzquierdo = new Nodo("n1i");
        n1i.texto = "¿Le gustaría doble por Q10 adicionales?";

        Nodo n1d = raiz.HijoDerecho = new Nodo("n1d");
        n1d.texto = "Le ofrecemos burritos y panqueques";
        //***********************************NIVEL 2***********************************//
        Nodo n1i_n2i = n1i.HijoIzquierdo = new Nodo("n1i_n2i");
        n1i_n2i.texto = "¿Le gustaría beber café o jugo?";
        Nodo n1i_n2d = n1i.HijoDerecho = new Nodo("n1i_n2d");
        n1i_n2d.texto = "¿Le gustaría beber café o jugo?";

        Nodo n1d_n2i = n1d.HijoIzquierdo = new Nodo("n1d_n2i");
        n1d_n2i.texto = "¿Le gustaría su burrito agrandado por Q10.00 más?";
        Nodo n1d_n2d = n1d.HijoDerecho = new Nodo("n1d_n2d");
        n1d_n2d.texto = "¿Desea miel extra por Q5.00 más?";
        //***********************************NIVEL 3***********************************//
        Nodo n1i_n2i__n3i = n1i_n2i.HijoIzquierdo = new Nodo("n1i_n2i__n3i");
        n1i_n2i__n3i.texto = "¿Desea su café negro o con leche?";
        Nodo n1i_n2i__n3d = n1i_n2i.HijoDerecho = new Nodo("n1i_n2i__n3d");
        n1i_n2i__n3d.texto = "¿Desea su jugo de tamaño mediano por Q2.00 más?";

        Nodo n1i_n2d__n3i = n1i_n2d.HijoIzquierdo = new Nodo("n1i_n2d__n3i");
        n1i_n2d__n3i.texto = "¿Desea su café negro o con leche?";
        Nodo n1i_n2d__n3d = n1i_n2d.HijoDerecho = new Nodo("n1i_n2d__n3d");
        n1i_n2d__n3d.texto = "¿Desea su jugo de tamaño mediano por Q2.00 más?";

        Nodo n1d_n2i__n3i = n1d_n2i.HijoIzquierdo = new Nodo("n1d_n2i__n3i");
        n1d_n2i__n3i.texto = "¿Le gustaría beber café o jugo?";
        Nodo n1d_n2i__n3d = n1d_n2i.HijoDerecho = new Nodo("n1d_n2i__n3d");
        n1d_n2i__n3d.texto = "¿Le gustaría beber café o jugo?";

        Nodo n1d_n2d__n3i = n1d_n2d.HijoIzquierdo = new Nodo("n1d_n2d__n3i");
        n1d_n2d__n3i.texto = "¿Le gustaría beber café o jugo?";
        Nodo n1d_n2d__n3d = n1d_n2d.HijoDerecho = new Nodo("n1d_n2d__n3d");
        n1d_n2d__n3d.texto = "¿Le gustaría beber café o jugo?";
        //***********************************NIVEL 4***********************************//
        Nodo n1i_n2i__n3i___n4i = n1i_n2i__n3i.HijoIzquierdo = new Nodo("n1i_n2i__n3i___n4i");
        n1i_n2i__n3i___n4i.texto = "";

        Nodo n1i_n2i__n3i___n4d = n1i_n2i__n3i.HijoDerecho = new Nodo("n1i_n2i__n3i___n4d");
        n1i_n2i__n3i___n4d.texto = "";

        Nodo n1i_n2i__n3d___n4i = n1i_n2i__n3d.HijoIzquierdo = new Nodo("n1i_n2i__n3d___n4i");
        n1i_n2i__n3d___n4i.texto = "";

        Nodo n1i_n2i__n3d___n4d = n1i_n2i__n3d.HijoDerecho = new Nodo("n1i_n2i__n3d___n4d");
        n1i_n2i__n3d___n4d.texto = "";

        Nodo n1i_n2d__n3i___n4i = n1i_n2d__n3i.HijoIzquierdo = new Nodo("n1i_n2d__n3i___n4i");
        n1i_n2d__n3i___n4i.texto = "";

        Nodo n1i_n2d__n3i___n4d = n1i_n2d__n3i.HijoDerecho = new Nodo("n1i_n2d__n3i___n4d");
        n1i_n2d__n3i___n4d.texto = "";

        Nodo n1i_n2d__n3d___n4i = n1i_n2d__n3d.HijoIzquierdo = new Nodo("n1i_n2d__n3d___n4i");
        n1i_n2d__n3d___n4i.texto = "";

        Nodo n1i_n2d__n3d___n4d = n1i_n2d__n3d.HijoDerecho = new Nodo("n1i_n2d__n3d___n4d");
        n1i_n2d__n3d___n4d.texto = "";

        Nodo n1d_n2i__n3i___n4i = n1d_n2i__n3i.HijoIzquierdo = new Nodo("n1d_n2i__n3i___n4i");
        n1d_n2i__n3i___n4i.texto = "¿Su café le gustaría Negro o con Leche?";

        Nodo n1d_n2i__n3i___n4d = n1d_n2i__n3i.HijoDerecho = new Nodo("n1d_n2i__n3i___n4d");
        n1d_n2i__n3i___n4d.texto = "¿Le gustaría mediano por Q2 más?";

        Nodo n1d_n2i__n3d___n4i = n1d_n2i__n3d.HijoIzquierdo = new Nodo("n1d_n2i__n3d___n4i");
        n1d_n2i__n3d___n4i.texto = "¿Su café le gustaría Negro o con Leche?";

        Nodo n1d_n2i__n3d___n4d = n1d_n2i__n3d.HijoDerecho = new Nodo("n1d_n2i__n3d___n4d");
        n1d_n2i__n3d___n4d.texto = "¿Le gustaría mediano por Q2 más?";

        Nodo n1d_n2d__n3i___n4i = n1d_n2d__n3i.HijoIzquierdo = new Nodo("n1d_n2d__n3i___n4i");
        n1d_n2d__n3i___n4i.texto = "¿Su café le gustaría Negro o con Leche?";

        Nodo n1d_n2d__n3i___n4d = n1d_n2d__n3i.HijoDerecho = new Nodo("n1d_n2d__n3i___n4d");
        n1d_n2d__n3i___n4d.texto = "¿Le gustaría mediano por Q2 más?";

        Nodo n1d_n2d__n3d___n4i = n1d_n2d__n3d.HijoIzquierdo = new Nodo("n1d_n2d__n3d___n4i");
        n1d_n2d__n3d___n4i.texto = "¿Su café le gustaría Negro o con Leche?";

        Nodo n1d_n2d__n3d___n4d = n1d_n2d__n3d.HijoDerecho = new Nodo("n1d_n2d__n3d___n4d");
        n1d_n2d__n3d___n4d.texto = "¿Le gustaría mediano por Q2 más?";
        //***********************************NIVEL 5***********************************//
        Nodo n1i_n2i__n3i___n4i____n5i = n1i_n2i__n3i___n4i.HijoIzquierdo = new Nodo("n1i_n2i__n3i___n4i____n5i");
        n1i_n2i__n3i___n4i____n5i.texto = "";

        Nodo n1i_n2i__n3i___n4i____n5d = n1i_n2i__n3i___n4i.HijoDerecho = new Nodo("n1i_n2i__n3i___n4i____n5d");
        n1i_n2i__n3i___n4i____n5d.texto = "";

        Nodo n1i_n2i__n3i___n4d____n5i = n1i_n2i__n3i___n4d.HijoIzquierdo = new Nodo("n1i_n2i__n3i___n4d____n5i");
        n1i_n2i__n3i___n4d____n5i.texto = "";

        Nodo n1i_n2i__n3i___n4d____n5d = n1i_n2i__n3i___n4d.HijoDerecho = new Nodo("n1i_n2i__n3i___n4d____n5d");
        n1i_n2i__n3i___n4d____n5d.texto = "";

        Nodo n1i_n2i__n3d___n4i____n5i = n1i_n2i__n3d___n4i.HijoIzquierdo = new Nodo("n1i_n2i__n3d___n4i____n5i");
        n1i_n2i__n3d___n4i____n5i.texto = "";

        Nodo n1i_n2i__n3d___n4i____n5d = n1i_n2i__n3d___n4i.HijoDerecho = new Nodo("n1i_n2i__n3d___n4i____n5d");
        n1i_n2i__n3d___n4i____n5d.texto = "";

        Nodo n1i_n2i__n3d___n4d____n5i = n1i_n2i__n3d___n4d.HijoIzquierdo = new Nodo("n1i_n2i__n3d___n4d____n5i");
        n1i_n2i__n3d___n4d____n5i.texto = "";

        Nodo n1i_n2i__n3d___n4d____n5d = n1i_n2i__n3d___n4d.HijoDerecho = new Nodo("n1i_n2i__n3d___n4d____n5d");
        n1i_n2i__n3d___n4d____n5d.texto = "";

        Nodo n1i_n2d__n3i___n4i____n5i = n1i_n2d__n3i___n4i.HijoIzquierdo = new Nodo("n1i_n2d__n3i___n4i____n5i");
        n1i_n2d__n3i___n4i____n5i.texto = "";

        Nodo n1i_n2d__n3i___n4i____n5d = n1i_n2d__n3i___n4i.HijoDerecho = new Nodo("n1i_n2d__n3i___n4i____n5d");
        n1i_n2d__n3i___n4i____n5d.texto = "";

        Nodo n1i_n2d__n3i___n4d____n5i = n1i_n2d__n3i___n4d.HijoIzquierdo = new Nodo("n1i_n2d__n3i___n4d____n5i");
        n1i_n2d__n3i___n4d____n5i.texto = "";

        Nodo n1i_n2d__n3i___n4d____n5d = n1i_n2d__n3i___n4d.HijoDerecho = new Nodo("n1i_n2d__n3i___n4d____n5d");
        n1i_n2d__n3i___n4d____n5d.texto = "";

        Nodo n1i_n2d__n3d___n4i____n5i = n1i_n2d__n3d___n4i.HijoIzquierdo = new Nodo("n1i_n2d__n3d___n4i____n5i");
        n1i_n2d__n3d___n4i____n5i.texto = "";

        Nodo n1i_n2d__n3d___n4i____n5d = n1i_n2d__n3d___n4i.HijoDerecho = new Nodo("n1i_n2d__n3d___n4i____n5d");
        n1i_n2d__n3d___n4i____n5d.texto = "";

        Nodo n1i_n2d__n3d___n4d____n5i = n1i_n2d__n3d___n4d.HijoIzquierdo = new Nodo("n1i_n2d__n3d___n4d____n5i");
        n1i_n2d__n3d___n4d____n5i.texto = "";

        Nodo n1i_n2d__n3d___n4d____n5d = n1i_n2d__n3d___n4d.HijoDerecho = new Nodo("n1i_n2d__n3d___n4d____n5d");
        n1i_n2d__n3d___n4d____n5d.texto = "";

        Nodo n1d_n2i__n3i___n4i____n5i = n1d_n2i__n3i___n4i.HijoIzquierdo = new Nodo("n1d_n2i__n3i___n4i____n5i");
        n1d_n2i__n3i___n4i____n5i.texto = "";

        Nodo n1d_n2i__n3i___n4i____n5d = n1d_n2i__n3i___n4i.HijoDerecho = new Nodo("n1d_n2i__n3i___n4i____n5d");
        n1d_n2i__n3i___n4i____n5d.texto = "";

        Nodo n1d_n2i__n3i___n4d____n5i = n1d_n2i__n3i___n4d.HijoIzquierdo = new Nodo("n1d_n2i__n3i___n4d____n5i");
        n1d_n2i__n3i___n4d____n5i.texto = "";

        Nodo n1d_n2i__n3i___n4d____n5d = n1d_n2i__n3i___n4d.HijoDerecho = new Nodo("n1d_n2i__n3i___n4d____n5d");
        n1d_n2i__n3i___n4d____n5d.texto = "";

        Nodo n1d_n2i__n3d___n4i____n5i = n1d_n2i__n3d___n4i.HijoIzquierdo = new Nodo("n1d_n2i__n3d___n4i____n5i");
        n1d_n2i__n3d___n4i____n5i.texto = "";

        Nodo n1d_n2i__n3d___n4i____n5d = n1d_n2i__n3d___n4i.HijoDerecho = new Nodo("n1d_n2i__n3d___n4i____n5d");
        n1d_n2i__n3d___n4i____n5d.texto = "";

        Nodo n1d_n2i__n3d___n4d____n5i = n1d_n2i__n3d___n4d.HijoIzquierdo = new Nodo("n1d_n2i__n3d___n4d____n5i");
        n1d_n2i__n3d___n4d____n5i.texto = "";

        Nodo n1d_n2i__n3d___n4d____n5d = n1d_n2i__n3d___n4d.HijoDerecho = new Nodo("n1d_n2i__n3d___n4d____n5d");
        n1d_n2i__n3d___n4d____n5d.texto = "";

        Nodo n1d_n2d__n3i___n4i____n5i = n1d_n2d__n3i___n4i.HijoIzquierdo = new Nodo("n1d_n2d__n3i___n4i____n5i");
        n1d_n2d__n3i___n4i____n5i.texto = "";

        Nodo n1d_n2d__n3i___n4i____n5d = n1d_n2d__n3i___n4i.HijoDerecho = new Nodo("n1d_n2d__n3i___n4i____n5d");
        n1d_n2d__n3i___n4i____n5d.texto = "";

        Nodo n1d_n2d__n3i___n4d____n5i = n1d_n2d__n3i___n4d.HijoIzquierdo = new Nodo("n1d_n2d__n3i___n4d____n5i");
        n1d_n2d__n3i___n4d____n5i.texto = "";

        Nodo n1d_n2d__n3i___n4d____n5d = n1d_n2d__n3i___n4d.HijoDerecho = new Nodo("n1d_n2d__n3i___n4d____n5d");
        n1d_n2d__n3i___n4d____n5d.texto = "";

        Nodo n1d_n2d__n3d___n4i____n5i = n1d_n2d__n3d___n4i.HijoIzquierdo = new Nodo("n1d_n2d__n3d___n4i____n5i");
        n1d_n2d__n3d___n4i____n5i.texto = "";

        Nodo n1d_n2d__n3d___n4i____n5d = n1d_n2d__n3d___n4i.HijoDerecho = new Nodo("n1d_n2d__n3d___n4i____n5d");
        n1d_n2d__n3d___n4i____n5d.texto = "";

        Nodo n1d_n2d__n3d___n4d____n5i = n1d_n2d__n3d___n4d.HijoIzquierdo = new Nodo("n1d_n2d__n3d___n4d____n5i");
        n1d_n2d__n3d___n4d____n5i.texto = "";

        Nodo n1d_n2d__n3d___n4d____n5d = n1d_n2d__n3d___n4d.HijoDerecho = new Nodo("n1d_n2d__n3d___n4d____n5d");
        n1d_n2d__n3d___n4d____n5d.texto = "";
        //*****************************************************************************//
    }

    public String obtenerRespuesta(ArrayList<String> lista, String clave, String nodoActual) {
        String idSUbArbol = "";
        boolean existe = false;
        for (int i = 0; i < lista.size(); i++) {
            String[] arr = lista.get(i).split(",");
            if (arr[0].equalsIgnoreCase(clave)) {
                System.out.println(ANSI_RED + "Agente Breakfast:");
                String respuestaAnterior = this.buscar(arr[1]) + "\n";
                System.out.println(respuestaAnterior);
                idSUbArbol = arr[1];
                existe = true;
            }
        }
        if (!existe) {
            String respAnt = this.buscar(nodoActual);
            System.out.println(ANSI_RED + "Agente Breakfast: \n" + "Lo siento, no entendí, " + respAnt + "\n\n");
            return nodoActual;
        }
        return idSUbArbol;
    }

    public String buscar(String id) {
        Nodo reco = obtenerRaiz();
        String var = "Lo siento, no entendí";
        while (reco != null) {
            switch (id) {
                case "salir":
                    return "Fué un gusto atenderte, que pases un felíz día";
                case "raiz":
                    return "¿le gustaría probar el nuevo McMuffin Chapín?";
                /*NIVEL 1*/
                case "n1i":
                    return reco.getHijoIzquierdo().texto;
                case "n1d":
                    return reco.getHijoDerecho().texto;
                /*NIVEL 2*/
                case "n1i_n2i":
                    return reco.getHijoIzquierdo().getHijoIzquierdo().texto;
                case "n1i_n2d":
                    return reco.getHijoIzquierdo().getHijoDerecho().texto;
                case "n1d_n2i":
                    return reco.getHijoDerecho().getHijoIzquierdo().texto;
                case "n1d_n2d":
                    return reco.getHijoDerecho().getHijoDerecho().texto;
                /* NIVEL 3*/
                case "n1i_n2i__n3i":
                    return reco.getHijoIzquierdo().getHijoIzquierdo().getHijoIzquierdo().texto;
                case "n1i_n2i__n3d":
                    return reco.getHijoIzquierdo().getHijoIzquierdo().getHijoDerecho().texto;
                case "n1i_n2d__n3i":
                    return reco.getHijoIzquierdo().getHijoDerecho().getHijoIzquierdo().texto;
                case "n1i_n2d__n3d":
                    return reco.getHijoIzquierdo().getHijoDerecho().getHijoDerecho().texto;
                case "n1d_n2i__n3i":
                    return reco.getHijoDerecho().getHijoIzquierdo().getHijoIzquierdo().texto;
                case "n1d_n2i__n3d":
                    return reco.getHijoDerecho().getHijoIzquierdo().getHijoDerecho().texto;
                case "n1d_n2d__n3i":
                    return reco.getHijoDerecho().getHijoDerecho().getHijoIzquierdo().texto;
                case "n1d_n2d__n3d":
                    return reco.getHijoDerecho().getHijoDerecho().getHijoDerecho().texto;
                /* NIVEL 4 */
                case "n1i_n2i__n3i___n4i":
                    return reco.getHijoIzquierdo().getHijoIzquierdo().getHijoIzquierdo().getHijoIzquierdo().texto;
                case "n1i_n2i__n3i___n4d":
                    return reco.getHijoIzquierdo().getHijoIzquierdo().getHijoIzquierdo().getHijoDerecho().texto;
                case "n1i_n2i__n3d___n4i":
                    return reco.getHijoIzquierdo().getHijoIzquierdo().getHijoDerecho().getHijoIzquierdo().texto;
                case "n1i_n2i__n3d___n4d":
                    return reco.getHijoIzquierdo().getHijoIzquierdo().getHijoDerecho().getHijoDerecho().texto;
                case "n1i_n2d__n3i___n4i":
                    return reco.getHijoIzquierdo().getHijoDerecho().getHijoIzquierdo().getHijoIzquierdo().texto;
                case "n1i_n2d__n3i___n4d":
                    return reco.getHijoIzquierdo().getHijoDerecho().getHijoIzquierdo().getHijoDerecho().texto;
                case "n1i_n2d__n3d___n4i":
                    return reco.getHijoIzquierdo().getHijoDerecho().getHijoDerecho().getHijoIzquierdo().texto;
                case "n1i_n2d__n3d___n4d":
                    return reco.getHijoIzquierdo().getHijoDerecho().getHijoDerecho().getHijoDerecho().texto;
                case "n1d_n2i__n3i___n4i":
                    return reco.getHijoDerecho().getHijoIzquierdo().getHijoIzquierdo().getHijoIzquierdo().texto;
                case "n1d_n2i__n3i___n4d":
                    return reco.getHijoDerecho().getHijoIzquierdo().getHijoIzquierdo().getHijoDerecho().texto;
                case "n1d_n2i__n3d___n4i":
                    return reco.getHijoDerecho().getHijoIzquierdo().getHijoDerecho().getHijoIzquierdo().texto;
                case "n1d_n2i__n3d___n4d":
                    return reco.getHijoDerecho().getHijoIzquierdo().getHijoDerecho().getHijoDerecho().texto;
                case "n1d_n2d__n3i___n4i":
                    return reco.getHijoDerecho().getHijoDerecho().getHijoIzquierdo().getHijoIzquierdo().texto;
                case "n1d_n2d__n3i___n4d":
                    return reco.getHijoDerecho().getHijoDerecho().getHijoIzquierdo().getHijoDerecho().texto;
                case "n1d_n2d__n3d___n4i":
                    return reco.getHijoDerecho().getHijoDerecho().getHijoDerecho().getHijoIzquierdo().texto;
                case "n1d_n2d__n3d___n4d":
                    return reco.getHijoDerecho().getHijoDerecho().getHijoDerecho().getHijoDerecho().texto;
                /* NIVEL 5 */
                case "n1i_n2i__n3i___n4i____n5i":
                    return reco.getHijoIzquierdo().getHijoIzquierdo().getHijoIzquierdo().getHijoIzquierdo().getHijoIzquierdo().texto;
                case "n1i_n2i__n3i___n4i____n5d":
                    return reco.getHijoIzquierdo().getHijoIzquierdo().getHijoIzquierdo().getHijoIzquierdo().getHijoDerecho().texto;
                case "n1i_n2i__n3i___n4d____n5i":
                    return reco.getHijoIzquierdo().getHijoIzquierdo().getHijoIzquierdo().getHijoDerecho().getHijoIzquierdo().texto;
                case "n1i_n2i__n3i___n4d____n5d":
                    return reco.getHijoIzquierdo().getHijoIzquierdo().getHijoIzquierdo().getHijoDerecho().getHijoDerecho().texto;
                case "n1i_n2i__n3d___n4i____n5i":
                    return reco.getHijoIzquierdo().getHijoIzquierdo().getHijoDerecho().getHijoIzquierdo().getHijoIzquierdo().texto;
                case "n1i_n2i__n3d___n4i____n5d":
                    return reco.getHijoIzquierdo().getHijoIzquierdo().getHijoDerecho().getHijoIzquierdo().getHijoDerecho().texto;
                case "n1i_n2i__n3d___n4d____n5i":
                    return reco.getHijoIzquierdo().getHijoIzquierdo().getHijoDerecho().getHijoDerecho().getHijoIzquierdo().texto;
                case "n1i_n2i__n3d___n4d____n5d":
                    return reco.getHijoIzquierdo().getHijoIzquierdo().getHijoDerecho().getHijoDerecho().getHijoDerecho().texto;
                case "n1i_n2d__n3i___n4i____n5i":
                    return reco.getHijoIzquierdo().getHijoDerecho().getHijoIzquierdo().getHijoIzquierdo().getHijoIzquierdo().texto;
                case "n1i_n2d__n3i___n4i____n5d":
                    return reco.getHijoIzquierdo().getHijoDerecho().getHijoIzquierdo().getHijoIzquierdo().getHijoDerecho().texto;
                case "n1i_n2d__n3i___n4d____n5i":
                    return reco.getHijoIzquierdo().getHijoDerecho().getHijoIzquierdo().getHijoDerecho().getHijoIzquierdo().texto;
                case "n1i_n2d__n3i___n4d____n5d":
                    return reco.getHijoIzquierdo().getHijoDerecho().getHijoIzquierdo().getHijoDerecho().getHijoDerecho().texto;
                case "n1i_n2d__n3d___n4i____n5i":
                    return reco.getHijoIzquierdo().getHijoDerecho().getHijoDerecho().getHijoIzquierdo().getHijoIzquierdo().texto;
                case "n1i_n2d__n3d___n4i____n5d":
                    return reco.getHijoIzquierdo().getHijoDerecho().getHijoDerecho().getHijoIzquierdo().getHijoDerecho().texto;
                case "n1i_n2d__n3d___n4d____n5i":
                    return reco.getHijoIzquierdo().getHijoDerecho().getHijoDerecho().getHijoDerecho().getHijoIzquierdo().texto;
                case "n1i_n2d__n3d___n4d____n5d":
                    return reco.getHijoIzquierdo().getHijoDerecho().getHijoDerecho().getHijoDerecho().getHijoDerecho().texto;
                case "n1d_n2i__n3i___n4i____n5i":
                    return reco.getHijoDerecho().getHijoIzquierdo().getHijoIzquierdo().getHijoIzquierdo().getHijoIzquierdo().texto;
                case "n1d_n2i__n3i___n4i____n5d":
                    return reco.getHijoDerecho().getHijoIzquierdo().getHijoIzquierdo().getHijoIzquierdo().getHijoDerecho().texto;
                case "n1d_n2i__n3i___n4d____n5i":
                    return reco.getHijoDerecho().getHijoIzquierdo().getHijoIzquierdo().getHijoDerecho().getHijoIzquierdo().texto;
                case "n1d_n2i__n3i___n4d____n5d":
                    return reco.getHijoDerecho().getHijoIzquierdo().getHijoIzquierdo().getHijoDerecho().getHijoDerecho().texto;
                case "n1d_n2i__n3d___n4i____n5i":
                    return reco.getHijoDerecho().getHijoIzquierdo().getHijoDerecho().getHijoIzquierdo().getHijoIzquierdo().texto;
                case "n1d_n2i__n3d___n4i____n5d":
                    return reco.getHijoDerecho().getHijoIzquierdo().getHijoDerecho().getHijoIzquierdo().getHijoDerecho().texto;
                case "n1d_n2i__n3d___n4d____n5i":
                    return reco.getHijoDerecho().getHijoIzquierdo().getHijoDerecho().getHijoDerecho().getHijoIzquierdo().texto;
                case "n1d_n2i__n3d___n4d____n5d":
                    return reco.getHijoDerecho().getHijoIzquierdo().getHijoDerecho().getHijoDerecho().getHijoDerecho().texto;
                case "n1d_n2d__n3i___n4i____n5i":
                    return reco.getHijoDerecho().getHijoDerecho().getHijoIzquierdo().getHijoIzquierdo().getHijoIzquierdo().texto;
                case "n1d_n2d__n3i___n4i____n5d":
                    return reco.getHijoDerecho().getHijoDerecho().getHijoIzquierdo().getHijoIzquierdo().getHijoDerecho().texto;
                case "n1d_n2d__n3i___n4d____n5i":
                    return reco.getHijoDerecho().getHijoDerecho().getHijoIzquierdo().getHijoDerecho().getHijoIzquierdo().texto;
                case "n1d_n2d__n3i___n4d____n5d":
                    return reco.getHijoDerecho().getHijoDerecho().getHijoIzquierdo().getHijoDerecho().getHijoDerecho().texto;
                case "n1d_n2d__n3d___n4i____n5i":
                    return reco.getHijoDerecho().getHijoDerecho().getHijoDerecho().getHijoIzquierdo().getHijoIzquierdo().texto;
                case "n1d_n2d__n3d___n4i____n5d":
                    return reco.getHijoDerecho().getHijoDerecho().getHijoDerecho().getHijoIzquierdo().getHijoDerecho().texto;
                case "n1d_n2d__n3d___n4d____n5i":
                    return reco.getHijoDerecho().getHijoDerecho().getHijoDerecho().getHijoDerecho().getHijoIzquierdo().texto;
                case "n1d_n2d__n3d___n4d____n5d":
                    return reco.getHijoDerecho().getHijoDerecho().getHijoDerecho().getHijoDerecho().getHijoDerecho().texto;
                default:
                    return var;
            }
        }
        return var;
    }
}
