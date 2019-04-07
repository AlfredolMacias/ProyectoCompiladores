/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocomp;

/**
 *
 * @author Fredy-pc
 */
public class Transicion {
    private int estadoActual;
    private int estadoSiguiente;
    private char simbolo;
    private int retroceso;
    private String nombreToken;
    
    public Transicion(int estadoActual, int estadoSiguiente, char simbolo, int retroceso, String nombreToken){
        this.estadoActual = estadoActual;
        this.estadoSiguiente = estadoSiguiente;
        this.simbolo = simbolo;
        this.retroceso = retroceso;
        this.nombreToken = nombreToken;
    }
    
    public int getActual(){
        return estadoActual;
    }
    
    public int getSiguiente(){
        return estadoSiguiente;
    }
    
    public char getSimbolo(){
        return simbolo;
    }
    
    public int getRetroceso(){
        return retroceso;
    }
    public String nomToken(){
        return nombreToken;
    }
}
