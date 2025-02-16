package actividad2;

public class Main {
	 
	public static void main(String[] args) {
		
		System.out.println("#####################################");
		System.out.println("#####################################");
		System.out.println("Desarrollo de software Actividad 2"   );
		System.out.println("            Actividad 2              ");
		System.out.println("Hecho por: Jorge Steven Gaitan       ");
		System.out.println(" 	       Felipe Martinez          ");
		System.out.println("	       Mariana			 ");
		System.out.println("	       Miguel     			 ");
		System.out.println("#####################################");
		
		
		
		//Creacion de los objetos//
		
		Universidad miUniversidad = new Universidad("Virual","Carlos","Bogota");
		Profesor miProfesor1 = new Profesor("Ingeniero","Colombiana",2000000,"Epifanio" );
		Profesor miProfesor2 = new Profesor("Medico General","Colombiana",2000000,"Maria");
		Facultad Facultad1 = new Facultad("Ingenieria",11111111);
		Facultad Facultad2 = new Facultad("Medicina",22222);
		Carrera Carrera1 = new Carrera("Ingenieria de sistemas",Facultad1.getNombre(),170,9);
		
		Estudiante miEstudiante1 = new Estudiante("Julio","Floresta",Facultad1.getNombre(),Facultad1.getCodigoNumerico(),2023);
		Estudiante miEstudiante2 = new Estudiante("Maria","Igualdad",Facultad2.getNombre(),Facultad2.getCodigoNumerico(),2022);
		Estudiante miEstudiante3 = new Estudiante("Marcela","Floresta",Facultad2.getNombre(),Facultad2.getCodigoNumerico(),2022);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//imprimir el resumen
		miUniversidad.imprimirDetallesUniversidad();
		Carrera1.imprimirDetallesCarrera();
		System.out.println("A continuacion se mostrara informacion de algunos profesores ");
		miProfesor1.imprimirDetallesProfesor();
		miProfesor2.imprimirDetallesProfesor();
		
		System.out.println("A continuacion se mencionaran algunos de los mejores estudiantes:");
		System.out.println("");
		miEstudiante1.imprimirDetallesEstudiante();
		miEstudiante2.imprimirDetallesEstudiante();
		miEstudiante3.imprimirDetallesEstudiante();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
