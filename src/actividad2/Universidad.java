package actividad2;

public class Universidad {
	
	String nombre;
	String nombreRector;
	String ciudadFuncionamiento;
	
	public Universidad() {
		
	}

	public Universidad(String nombre, String nombreRector, String ciudadFuncionamiento) {
		this.nombre = nombre;
		this.nombreRector = nombreRector;
		this.ciudadFuncionamiento = ciudadFuncionamiento;
	}

	
	
	public void imprimirDetallesUniversidad() {
		
		System.out.println("La universidad se llama : " + nombre);
		System.out.println("El rector de la universidad se llama: " + nombreRector);
		System.out.println("La universidad funciona en la ciudad de: " + ciudadFuncionamiento);
		System.out.println("La universidad ofrece las siguientes carreras: ");
		System.out.println();
		
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreRector() {
		return nombreRector;
	}

	public void setNombreRector(String nombreRector) {
		this.nombreRector = nombreRector;
	}

	public String getCiudadFuncionamiento() {
		return ciudadFuncionamiento;
	}

	public void setCiudadFuncionamiento(String ciudadFuncionamiento) {
		this.ciudadFuncionamiento = ciudadFuncionamiento;
	}
	
	
	
	
}
