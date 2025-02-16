package actividad2;

public class Facultad {

	String nombre;
	int codigoNumerico;
	
	public Facultad() {
		
	}
	
	public Facultad(String nombre,int codigoNumerico) {
		this.nombre = nombre;
		this.codigoNumerico = codigoNumerico;	
	}
	
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigoNumerico() {
		return codigoNumerico;
	}

	public void setCodigoNumerico(int codigoNumerico) {
		this.codigoNumerico = codigoNumerico;
	}
	
	
	
}
