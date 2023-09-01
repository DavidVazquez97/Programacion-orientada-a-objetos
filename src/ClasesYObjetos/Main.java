package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main (String args []) {

		int num1, num2;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: " ));
		num2  = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
		
		Operecion  op = new Operecion();
		
		System.out.println( "La suma es: " + op.sumar(num1, num2));
		System.out.println("La resta es : " +op.resta(num1, num2));
		System.out.println("La multiplicación es: " + op.multiplicar(num1, num2));
		System.out.println("La división es: " + op.dividir(num1, num2));
		
	
	}

}
