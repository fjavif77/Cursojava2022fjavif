package modulo3;

import java.util.Scanner;

public class Mod4_Ejercicio15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingrese el tipo de vehículo (a,b,c)");
		
		char variable = sc.next().charAt(0);
		
		System.out.println("caracter introducido: " + variable);
		
		switch (variable) {
		case 'a':
			System.out.println("el vehículo tiene cuatro ruedas y un motor");
			break;
		case 'b':
			System.out.println("el vehículo tiene cuatro ruedas, un motor, cierre centralizado y aire");	
			break;	
		case 'c':
			System.out.println("el vehículo tiene cuatro ruedas, un motor, cierre centralizado, aire y airbag");	
			break;				
		default:
			System.out.println("tipo de vehículo no válido");
		}

	}

}
