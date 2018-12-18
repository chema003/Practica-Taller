package practicaTaller;

import java.util.Calendar;
import java.util.Collection;

public interface Averiable {

	Collection<Pieza> piezasNecesarias();
	
	public Calendar getFechaTaller();
	
	public void setFechaTaller(Calendar fechaTaller);
	
	Collection <Pieza> getPiezasNecesarias();
	
}
