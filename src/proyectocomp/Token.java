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
public class Token {
    private String token;
    private String lexema;
    private int linea;
    
    public Token(String token, String lexema, int linea){
        this.token = token;
        this.lexema = lexema;
        this.linea = linea;
    }
    public String getToken(){
        return token;
    }
    public String lexema(){
        return lexema;
    }
    public int linea(){
        return linea;
    }
    
}
