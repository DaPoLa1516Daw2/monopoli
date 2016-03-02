/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoli;

import monopoli.Casillas.Casilla;

/**
 *
 * @author .David
 */
public class Jugador {
    private String nombre;
    private int dinero;
    private String ficha;
    private Casilla casillas[];

    public Jugador(String nombre, String ficha) {
        this.nombre = nombre;
        this.ficha = ficha;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public String getFicha() {
        return ficha;
    }

    public Casilla[] getCasillas() {
        return casillas;
    }

    public int getDinero() {
        return dinero;
    }
    
    
    

    public void setCasillas(Casilla[] casilla) {
        this.casillas = casilla;
    }
    
    
    public void addDinero(int aDinero, Boolean aMetodo){
        if(aMetodo) {
            this.dinero =+ aDinero;
        } else {
            this.dinero =- aDinero;
        }
    }    
}
