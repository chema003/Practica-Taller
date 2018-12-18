package practicaTaller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;



public class Taller <T extends Averiable, Reparado> {

	String nombre;
	double precioManoDeObra = 0;
	int turno = 0;
	Calendar fechaActual;
	
	Collection <T> colaVehiculos;
	Collection<Reparado> vehiculosArreglados;
	Collection <Pieza> repuestos;
	
	
	//GETTERS Y SETTERS
	
	public Collection<T> getColaVehiculos() {
		return colaVehiculos;
	}

	public Collection<Pieza> getRepuestos() {
		return repuestos;
	}	

	

	
	//CONSTRUCTOR
	
	public Taller () {
		
	}
	
	
	//METODOS
	
	public void ingresarEnTaller (Averiable vehiculo) {
		
		colaVehiculos = new ArrayList<T>();
		colaVehiculos.add((T) vehiculo);
		vehiculo.setFechaTaller(fechaActual);
		this.turno = asignarTurno();//Me falta implementar este metodo.
		System.out.println(calcularPresupuesto());
		System.out.println(realizarDiagnostico());
		
	}
	
	
	public double calcularPresupuesto () {
		double presupuesto = 0;
		
		repuestos = new ArrayList<Pieza>();
		
		presupuesto = getRepuestos().size()*realizarDiagnostico()*precioManoDeObra;
		
		return presupuesto;
	}
	
	public double realizarDiagnostico () {
		double tiempoEmpleado = 0;
		
		//No sé cómo quiere que calculemos el tiempo para la reparacion.	
		
		return tiempoEmpleado;
		
	}
	
	public int asignarTurno(Averiable vehiculo) {
		turno = 0;
		Calendar fechaActual = Calendar.getInstance();
		if (!getRepuestos().isEmpty()) {
			turno ++;
			
		}else {
				if (vehiculo.getFechaTaller()
						{
					
				}

			}
		
	
		return turno;
		
	}

	public Collection<Reparado> listaTerminados (Averiable vehiculo) {
		vehiculosArreglados.add((Reparado) vehiculo);
		
		return vehiculosArreglados;		
	}

	

	

	

}
