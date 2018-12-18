package practicaTaller;
import java.awt.Color;

public interface Coloreable {

	default String getColor() {
		return "Sin especificar";
	}

//		void setColor(String color);

	default Color parseColor(String color) {
		Color aux;
	       try {
	       	aux = Color.decode(color);
	       }
	       catch (Exception e) {
	       	aux = new Color(0);
		}
	        
	       return aux;
	   }
}

