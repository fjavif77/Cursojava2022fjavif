package modulo3;

import java.util.Scanner;

public class Mod3_Ejercicio2 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingrese el numero entero a evaluar para ver si es par");
		
		int numero = sc.nextInt();
				
		int residuo = numero / 2; 
		
		
		if (residuo == 0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero es impar");
		}
			

	}

}
