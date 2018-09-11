package Alumno;
import java.util.Scanner;


public class Alumno {
	
	private Scanner teclado;
	private String nombre;
	private int edad;
	
	public Alumno() {
		
		teclado = new Scanner(System.in);
		System.out.println("ingresa  nombre");
		nombre = teclado.next();
		System.out.println("ingrese edad");
		edad= teclado.nextInt();
		
	}
	public void imprimir() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad"+edad);
	}
	
	public void esMayorEdad() {
		if (edad>= 25)
			System.out.print(nombre+"es mayor");
			
		
		} else {
			System.out.print(nombre+"no es mayor de edad");
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alumno alumno1 = new Alumno();
		Alumno.imprimir()
		

	}
	
	

}
