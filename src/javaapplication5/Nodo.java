/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author corpgleiva
 */
public class Nodo {
    String Id, texto;
    Nodo HijoIzquierdo;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Nodo getHijoIzquierdo() {
        return HijoIzquierdo;
    }

    public void setHijoIzquierdo(Nodo HijoIzquierdo) {
        this.HijoIzquierdo = HijoIzquierdo;
    }

    public Nodo getHijoDerecho() {
        return HijoDerecho;
    }

    public void setHijoDerecho(Nodo HijoDerecho) {
        this.HijoDerecho = HijoDerecho;
    }
    Nodo HijoDerecho;

    public Nodo(String Id) {
        this.Id = Id;
        this.texto = "";
        this.HijoIzquierdo = null;
        this.HijoDerecho= null;
    }
}
