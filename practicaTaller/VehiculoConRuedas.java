package practicaTaller;

public abstract class VehiculoConRuedas extends Vehiculo implements Comparable<VehiculoConRuedas>, Matriculable{
	
//  int numeroDeRuedas;
  String matricula;
  
  protected abstract int getNumeroDeRuedas();	
  
	
	@Override
	public String getMatricula() {
		return matricula;
	}

	void setMatricula(String matricula) {
      this.matricula = matricula;
  }
  
	
  public VehiculoConRuedas () {
      this(null, null);
  	
  }
    
  public VehiculoConRuedas(String modelo, String color) {
	   	super(modelo, color);
//	   	numeroDeRuedas = 4;
	}

	@Override
  public String toString() {
      return "Placa " + matricula + " - " + modelo + " (" + getColor() + "), " + getNumeroDeRuedas() + " ruedas";
  }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VehiculoConRuedas other = (VehiculoConRuedas) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		return true;
	}

  @Override
  public int compareTo(VehiculoConRuedas vehiculoConRuedas) {
   	return getMatricula().compareTo(vehiculoConRuedas.getMatricula());
  }
  
}
