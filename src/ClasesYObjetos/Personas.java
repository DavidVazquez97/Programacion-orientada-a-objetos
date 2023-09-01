package ClasesYObjetos;

public class Personas {
	
	// Atributos
	String nombre;
	int edad;
	
	String  dni;
	
	public Personas (String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Personas (String dni){
		this.dni = dni;
	}
	
	
	public void correr() {
		System.out.println("Soy " + nombre + ", tengo "+edad+" años y estoy corriendo una marton");
	}
	
	public void correr(int km) {
		System.out.println("He corrido "+km+" kilometos");
	}

}
