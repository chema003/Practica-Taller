package practicaTaller;

import java.util.Collection;

public class Pieza {

	double precio;
	String [] pieza = {"Freno", "Embrague", "Rueda", "Batería"}; 
	double tiempoReparacion;


	double getPrecio(String tipo) {
		return precio;
	}


	void setPrecio(String pieza, double precio) {
		this.precio = precio;
	}


	double getTiempoReparacion(String tipo) {
		return tiempoReparacion;
	}


	void setTiempoReparacion(String tipo, double tiempoReparacion) {
		this.tiempoReparacion = tiempoReparacion;
	}


	String[] getPieza() {
		return pieza;
	}


	void setPieza(String[] pieza) {
		this.pieza = pieza;
	}
	
	
}
