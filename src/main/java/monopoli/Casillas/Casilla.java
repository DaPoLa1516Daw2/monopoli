/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoli.Casillas;

import java.util.ArrayList;
import monopoli.Jugador;
import monopoli.TipoCasilla;

/**
 *
 * @author .David
 */
public abstract class Casilla {
    private String nombre;
    private ArrayList<Jugador> jugadores = new ArrayList<Jugador>(); 
    //private int valor; //Comprar calle
    private int retibucion;
    
    public Casilla(String aNombre,int aRetibucion) {
        this.nombre = aNombre;
        this.retibucion = aRetibucion;
    }
    
    public int getRetibucion() {
        return retibucion;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre + "\n"+
                stringJugadores();
    }
    
    public String stringJugadores() {
        String j = "";
        
        for(Jugador x: jugadores){
            j +=  "\n"+x.getNombre();
        }
        
        return j;
    }
    
//    public abstract int callback();
    
    public void setJugador(Jugador j) {
        jugadores.add(j);
    }
    
    public void removeJugador(Jugador j) {
        jugadores.remove(j);
    }
    
    
    //----------------------------------------
    //----------------------------------------
    
    public static CasillaBote getCasillaBote(String aNombre, int aRetibucion){
        return new CasillaBote(aNombre, aRetibucion);
    }
    public static CasillaCalle getCasillaCalle(String aNombre,int aValor, int aRetibucion){
        return new CasillaCalle(aNombre, aValor, aRetibucion);
    }
    public static CasillaCarcel getCasillaCarcel(String aNombre, int aRetibucion){
        return new CasillaCarcel(aNombre, aRetibucion);
    }
    public static CasillaSalida getCasillaSalida(String aNombre, int aRetibucion){
        return new CasillaSalida(aNombre, aRetibucion);
    }
    public static CasillaSuerte getCasillaSuerte(String aNombre, int aRetibucion){
        return new CasillaSuerte(aNombre, aRetibucion);
    }
    public static CasillaTrampa getCasillaTrampa(String aNombre, int aRetibucion){
        return new CasillaTrampa(aNombre, aRetibucion);
    }   
}
