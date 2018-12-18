package practicaTaller;

public class Moto extends VehiculoConRuedas {

	@Override
	protected int getNumeroDeRuedas() {
		return 2;
	}
	
	public Moto(String modelo, String color) {
		super(modelo, color);
//		numeroDeRuedas = 2;
	}

	@Override
	public String[] getEstado() {
		// TODO Auto-generated method stub
		return null;
	}

}
