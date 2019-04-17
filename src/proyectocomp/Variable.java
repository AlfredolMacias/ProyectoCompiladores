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
public class Variable {
    private String tipo;
    private String tipo2;
    private String valor;
    private int valorInt;
    private int linea;
    public Variable(String tipo,String valor, int linea, String tipo2){
        this.tipo = tipo;
        this.valor = valor;
        this.linea = linea;
        this.tipo2 = tipo2;
    }
    public Variable(String tipo,int valorInt, int linea, String tipo2){
        this.tipo = tipo;
        this.valorInt = valorInt;
        this.linea = linea;
        this.tipo2 = tipo2;
    }
    public int getValorInt(){
       return valorInt;
    }
    public String getTipo(){
        return tipo;
    }
    public String getValor(){
        return valor;
    }
    public int getLinea(){
        return linea;
    }
    public String tipo2(){
        return tipo2;
    }
    public void setValorString(String nvalor){
        valor = nvalor;
    }        
    public void setValorInt(int nvalor){
        valorInt = nvalor;
    }        
}