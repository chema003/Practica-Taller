package practicaTaller;

public class Coche extends VehiculoConRuedas {


	int numeroDePuertas;
			
	@Override
	protected int getNumeroDeRuedas() {
		return 4;
	}
		
	public Coche(String modelo, String color) {
		super(modelo, color);
			
	}

	@Override
	public String[] getEstado() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}


