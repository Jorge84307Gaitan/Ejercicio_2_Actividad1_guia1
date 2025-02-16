package actividad2;

public class Carrera extends Facultad{
	
	String facultad;
	int creditos;
	int semestres;
	String nombreCarrera;
	
	public Carrera() {
		
	}
	
	public Carrera (String nombreCarrera,String facultad, int creditos, int semestres) {
		this.facultad = facultad;
		this.creditos = creditos;
		this.semestres = semestres;
		this.nombreCarrera = nombreCarrera;
		
	}
	
	public void imprimirDetallesCarrera() {
		System.out.println("-----------------------------------------------------");
		System.out.println("Carrera de " + nombreCarrera);
		System.out.println("pertenece a la facultad de " + facultad);
		System.out.println("cuenta con un numero de semestres de:" + semestres);
		System.out.println("con un total de creditos de: " + creditos);
		System.out.println("-----------------------------------------------------");
		
		
	}

	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public int getSemestres() {
		return semestres;
	}

	public void setSemestres(int semestres) {
		this.semestres = semestres;
	}
	
	

}
