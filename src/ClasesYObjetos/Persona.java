package ClasesYObjetos;

public class Persona {

	
		// Atributos
	
		String nombre;
		int edad;
		
		//Metodos
		
		// Método Constructor
		
		public Persona (String _nombre, int _edad) {
			nombre = _nombre;
			edad = _edad; 
		}
		
       /** otra forma de crear el método constructor si queremos que los parametros se llamen igual es usando this .

		public Persona ( Strin nombre, in nombre){
			this.nombre = nombre;
			this.edad = edad;
			
		}
 
		
		
		**/
		public void mostrarDatos () {
			System.out.println("El nombre es: " + nombre);
			System.out.println("La edad es: " + edad);
		}
}
