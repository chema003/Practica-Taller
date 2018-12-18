package practicaTaller;

import java.util.Date;

public interface Matriculable {

	String getMatricula();
		
	default boolean comprobarValidez () {
			
		return false;
	}
		
	default Date getfechaMatriculacion () {
		return null;
	}

}

