package actividad2;

public class Estudiante extends Persona  {
	String colegio;
	int ingresoUniversidad;
	String facultad;
	String curso;
	int codigoNumerico;
	

	public Estudiante() {
		
	}
	
	public Estudiante(String nombre,String colegio,String facultad, int codigoNumerico,int ingresoUniversidad) {
		this.nombre = nombre;
		this.colegio = colegio;
		this.facultad = facultad;
		this.codigoNumerico = codigoNumerico;
		this.ingresoUniversidad = ingresoUniversidad;
		
	}
	
	
	
	public void imprimirDetallesEstudiante() {
		System.out.println("Nombre Estudiante: " + nombre);
		System.out.println("El colegio del que salio el estudiante es: " + colegio );
		System.out.println("El estudiante pertenece a la facultad de: " + facultad);
		System.out.println("Con codigo numerico #:" + codigoNumerico);
		System.out.println("El estudiante ingreso a la universidad en: " + ingresoUniversidad);
		System.out.println("---------------------------------------------------------");
	}
	
	public String getCurso() {
		return curso;
		
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	  	
	  	
	public String getFacultad() {
		return facultad;
		
	}
	
	public void setFafultad(String facultad) {
		this.facultad = facultad;
	}
	
	public String getNombre() {
		return nombre;
	}
		
	public void setNombre(String nombre) {
		this.nombre = nombre;
	
	}

	public String getColegio() {
		return colegio;
	}

	public void setColegio(String colegio) {
		this.colegio = colegio;
	}

	public int getIngresoUniversidad() {
		return ingresoUniversidad;
	}

	public void setIngresoUniversidad(int ingresoUniversidad) {
		this.ingresoUniversidad = ingresoUniversidad;
	}
	
	
}
