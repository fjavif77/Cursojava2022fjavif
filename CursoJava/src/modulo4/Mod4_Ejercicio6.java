package modulo4;

import java.util.Scanner;

public class Mod4_Ejercicio6 {

	public static void main(String[] args) {
		double sueldo = 0;
		char categoria = ' ';
		int antiguedad = 0;
		double sueldoNeto= 0; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingrese el sueldo anual a calcular");		
		sueldo = sc.nextDouble();
		
		System.out.println("ingrese los años de antiguedad");		
		antiguedad = sc.nextInt();	
		
		System.out.println("ingrese la categoría (A,B,C)");		
		categoria = sc.next().toUpperCase().charAt(0);			
		
		switch (antiguedad) {
		case 0: case 1: case 2: case 3: case 4: case 5:
			if (categoria == 'A') {
				sueldoNeto = (sueldo - 1000)- (sueldo * 0.05); 
			}else if (categoria == 'B') {
				sueldoNeto = (sueldo - 2000)- (sueldo * 0.05); 
			}else if (categoria == 'C') {
				sueldoNeto = (sueldo - 3000)- (sueldo * 0.05); 
			}
			break;
		case 6: case 7: case 8: case 9: case 10:
			if (categoria == 'A') {
				sueldoNeto = (sueldo - 1000)- (sueldo * 0.10); 
			}else if (categoria == 'B') {
				sueldoNeto = (sueldo - 2000)- (sueldo * 0.10); 
			}else if (categoria == 'C') {
				sueldoNeto = (sueldo - 3000)- (sueldo * 0.10); 
			}
			break;			
		default:
			if (categoria == 'A') {
				sueldoNeto = (sueldo - 1000)- (sueldo * 0.30); 
			}else if (categoria == 'B') {
				sueldoNeto = (sueldo - 2000)- (sueldo * 0.30); 
			}else if (categoria == 'C') {
				sueldoNeto = (sueldo - 3000)- (sueldo * 0.30); 
			}
			break;				
		}
		System.out.println("el sueldo neto es :" + sueldoNeto);
		// Hay forma de hacerlos sin tanto if y switch?
	}

}
