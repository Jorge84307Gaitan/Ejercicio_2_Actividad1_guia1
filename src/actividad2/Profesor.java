package actividad2;

public class Profesor extends Persona {

	String profesion;
	String nacionalidad;
	int sueldo;
	
	
	
	public Profesor() {
		
	}
	
	
	public Profesor(String profesion, String nacionalidad, int sueldo, String nombre) {
		super();
		this.profesion = profesion;
		this.nacionalidad = nacionalidad;
		this.sueldo = sueldo;
		this.nombre = nombre;
	}

	public void imprimirDetallesProfesor() {
		
		System.out.println("-----------------------------------------------------");
		System.out.println("El nombre del profesor es: " + nombre);
		System.out.println("La nacionalidad del profesor es: " + nacionalidad);
		System.out.println("El sueldo del profesor es :" + sueldo);
		System.out.println("La profesion del profesor es: " + profesion);
		System.out.println("-----------------------------------------------------");
	}
	

	public String getProfesion() {
		return profesion;
	}


	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	public int getSueldo() {
		return sueldo;
	}


	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	
	
	
	
	
}
