package actividad2;

public class Persona {
	
	int cedula;
	String nombre;
	String fechaNacimiento;
	String lugarNacimiento;
	
	public Persona () {
		
		
	}
	
	public Persona(int cedula,String nombre, String fechaNacimiento, String lugarNacimiento) {
	this.cedula = cedula;
	this.nombre = nombre;
	this.fechaNacimiento = fechaNacimiento;
	this.lugarNacimiento= lugarNacimiento;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getLugarNacimiento() {
		return lugarNacimiento;
	}

	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}
	
	

}
