package modulo3;

import java.util.Scanner;

public class Mod3_ejercicio1 {

	public static void main(String[] args) {
		//float nota = 0.00f;
		boolean aprobado = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingrese la nota a evaluar de 1 a 10 (máximo dos decimales separados por coma)");
		
		float nota = sc.nextFloat();
		
		if (nota >= 7) {
			aprobado = true;
		}
		
		System.out.println("El alumno aprobó? " + aprobado);	

	}

}


