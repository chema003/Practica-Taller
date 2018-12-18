package practicaTaller;

public abstract class Estado implements Averiable, Reparado {

	String [] estado = {"Averiado", "Reparado"};

	public String[] getEstado() {
		return estado;
	}

	public void setEstado(String[] estado) {
		this.estado = estado;
	}
	
	
	
}
