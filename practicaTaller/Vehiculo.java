package practicaTaller;

import java.awt.Color;
import java.util.Calendar;
import java.util.Collection;


public abstract class Vehiculo implements Coloreable, Reparado, Averiable {
	String modelo;
    Color color;
    double peso = 500;
	Estado estado;
    Calendar fechaTaller;
    Collection<Pieza> pieza;
    
    //GETTERS Y SETTERS
    
    @Override
	public String getColor() {
        return "Mi color es " + color.toString();
    }

	    
	public void setColor(String color) {
        this.color = parseColor(color);
    }
	   
	public Calendar getFechaTaller() {
		return fechaTaller;
	}
	
	public void setFechaTaller(Calendar fechaTaller) {
		this.fechaTaller = fechaTaller;
	}
	
	Collection <Pieza> getPiezasNecesarias() {
		return pieza;
	}
	
	
	//CONSTRUCTORES
	
    public Vehiculo() {
    	super();
    }
	    
    public Vehiculo (String color) {
        this();
        setColor(color); // como ya tengo el setter lo utilizo
	    }
	    
    public Vehiculo (String modelo, String color) {
        this(color);
        this.modelo = modelo;
    }

}

