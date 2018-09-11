package Sueldo;
import java.util.Scanner;

public class Operarios {
	
	private Scanner teclado;
	private int [] sueldo;
	
	public Operarios(){
		
		teclado = new Scanner (System.in);
		sueldo = new int[5];
		for(int f=0 ; f<5 ; f++) {
			System.out.println("ingresse datos");
			
			sueldo[f]= teclado.nextInt();
			
		}
		
	}
	
	public void imprimir() {
		System.out.println("ingresar salario ingresado");
		for(int i = 0; i < 5 ; i++) {
			System.out.println(sueldo[i]);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operarios op = new Operarios();
		//Imprimir valores
		op.imprimir();
		

	}

}
