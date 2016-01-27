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
public enum TipoCasilla {
    Carcel("Car"),Bote("B"),Trampa("T"),Calle("C"),Salida("S"),Suerte("S");
    
    private String Tcasilla;

	private TipoCasilla(String s) {
		Tcasilla = s;
	}

	public String getTcasilla() {
		return Tcasilla;
	}
    
}
