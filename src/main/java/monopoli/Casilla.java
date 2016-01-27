/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoli;

/**
 *
 * @author .David
 */
public class Casilla {
    private String dueño;
    private int valor;
    private int retibucion;
    private int casas ;
    private TipoCasilla tipo;

    public Casilla(int valor, int retibucion, TipoCasilla tipo) {
        this.valor = valor;
        this.retibucion = retibucion;
        this.tipo = tipo;
    }

    public String getDueño() {
        return dueño;
    }

    public int getValor() {
        return valor;
    }

    public TipoCasilla getTipo() {
        return tipo;
    }

    
    public int getRetibucion() {
        return retibucion;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public void setCasas(int casas) {
        this.casas = casas;
    }
    
    
    
    
}
