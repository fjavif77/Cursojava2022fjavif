package modulo3;

import java.util.Scanner;

public class Mod3_Ejercicio3 {

	public static void main(String[] args) {
		int dias= 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingrese el mes del que quiera saber los días que contiene");
		
		String mes = sc.next();
		
		//String mesMayuscula = mes.toUpperCase();
		
		if (mes.toUpperCase() == "ENERO" || mes.toUpperCase() ==  "MARZO"   || mes.toUpperCase() ==  "MAYO"
			                           	|| mes.toUpperCase() ==  "JULIO"   || mes.toUpperCase() ==  "AGOSTO"
			                        	|| mes.toUpperCase() ==  "OCTUBRE" || mes.toUpperCase() ==  "DICIEMBRE") {
			dias = 31;		
		}else if (mes.toUpperCase() == "ABRIL" || mes.toUpperCase() ==  "JUNIO" 
				                          || mes.toUpperCase() ==  "SEPTIEMBRE" 
				                          || mes.toUpperCase() ==  "NOVIEMBRE" ) {
			dias = 30;			
		}else if (mes.toUpperCase() == "FEBRERO") {
			dias = 28;			
		}else {
			dias = 0;			
		}
				
		System.out.println("El mes de " + mes + " tiene " + dias + " dias"  );
	}
	
	// porque siempre acaba con valor cero? al inspeccionar mes veo que tiene el valor correcto para asignar otro valor numérico

}
