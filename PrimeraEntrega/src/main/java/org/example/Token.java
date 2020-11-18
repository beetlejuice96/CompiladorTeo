package org.example;
public class Token {
    private String lexema;
    private String token;
    private String valor;
    private int longitud;
    
    public String getLexema() {return lexema;}
    public String getToken() {return token;}
    public String getValor() {return valor;}
    public int getLongitud() {return longitud;}
  
    public void setLexema (String lexema) {this.lexema = lexema;}
    public void setToken (String token) {this.token = token;}
    public void setValor (String valor) {this.valor = valor;}
    public void setLongitud (int longitud) {this.longitud = longitud;}
}
