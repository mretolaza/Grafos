
public class Edificio {
	//Variables 
	String Nombre; 
	String Descripcion; 
	String Facultad;
	
	public Edificio(String nombre, String descripcion, String facultad) {
		Nombre = nombre;
		Descripcion = descripcion;
		Facultad = facultad;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getFacultad() {
		return Facultad;
	}

	public void setFacultad(String facultad) {
		Facultad = facultad;
	}
	
	

}
