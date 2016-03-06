/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoli;

import java.util.ArrayList;
import java.util.List;
import monopoli.Casillas.Casilla;

/**
 *
 * @author .David
 */
public class Jugador {
    private String nombre;
    private int dinero;
    private String ficha;
    private List<Integer> casillas;
    private int casilla;

    public Jugador(String nombre, String ficha) {
        this.nombre = nombre;
        this.ficha = ficha;
        this.dinero = 0;
        this.casilla = 0;
        this.casillas = new ArrayList<Integer>();
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public String getFicha() {
        return ficha;
    }

    public ArrayList<Integer> getCasillas() {
        return (ArrayList<Integer>) casillas;
    }

    public int getDinero() {
        return dinero;
    }

    public int getCasilla() {
        return casilla;
    }

    public void setCasilla(int casilla) {
        this.casilla += casilla;
        if(this.casilla > 40) {
            this.casilla -= 40;
        } 
    }
    
    public void setCasillas(int casilla) {
        this.casillas.add(casilla);
    }
    
    
    public void addDinero(int aDinero, Boolean aMetodo){
        if(aMetodo) {
            this.dinero += aDinero;
        } else {
            this.dinero -= aDinero;
        }
    }    
}
