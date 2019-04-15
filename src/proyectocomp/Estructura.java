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
public class Estructura {
    private String campo1;
    private String valor1;
    private String tipo1;
    private String campo2;
    private String valor2;
    private String tipo2;
    private String campo3;
    private String valor3;
    private String tipo3;
    private int linea;
    public Estructura(String campo1, String valor1, String tipo1,
                String campo2, String valor2,String tipo2,
                String campo3, String valor3, String tipo3){
        this.campo1 = campo1;
        this.valor1 = valor1;
        this.tipo1 = tipo1;
        this.campo2 = campo2;
        this.valor2 = valor2;
        this.tipo2 = tipo2;
        this.campo3 = campo3;
        this.valor3 = valor3;
        this.tipo3 = tipo3;
    }
    public Estructura(String campo1, String valor1, String tipo1,
                String campo2, String valor2,String tipo2){
        this.campo1 = campo1;
        this.valor1 = valor1;
        this.tipo1 = tipo1;
        this.campo2 = campo2;
        this.valor2 = valor2;
        this.tipo2 = tipo2;
    }
    public Estructura(String campo1, String valor1, String tipo1){
        this.campo1 = campo1;
        this.valor1 = valor1;
        this.tipo1 = tipo1;
    }
    public String getCampo1(){
        return campo1;
    }
    public String getCampo2(){
        return campo2;
    }
    public String getCampo3(){
        return campo3;
    }
    public String getValor1(){
        return valor1;
    }
    public String getValor2(){
        return valor2;
    }
    public String getValor3(){
        return valor3;
    }
    public String getTipo1(){
        return tipo1;
    }
    public String getTipo2(){
        return tipo2;
    }
    public String getTipo3(){
        return tipo3;
    }
    public void setValor1(String nuevoValor1){
        valor1 = nuevoValor1;
    }
    public void setValor2(String nuevoValor2){
        valor2 = nuevoValor2;
    }
    public void setValor3(String nuevoValor3){
        valor3 = nuevoValor3;
    }
    public int getLinea(){
        return linea;
    }
}
