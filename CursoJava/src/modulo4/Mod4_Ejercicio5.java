package modulo4;

public class Mod4_Ejercicio5 {

	public static void main(String[] args) {
		int i = 0;
		int numMaximo = 0;
		int numMinimo = 100;
		int numSuma = 0;
		int numPromedio= 0;
		int numArray[] = {numeroAzar(), numeroAzar(), numeroAzar(), numeroAzar(),
				numeroAzar(), numeroAzar(),numeroAzar(),numeroAzar(),numeroAzar(),numeroAzar() };			
		
		while (i<10) {
			System.out.println("número aleatorio: " + numArray[i]);
			if (numArray[i] < numMinimo) {
				numMinimo = numArray[i];
			}else if (numArray[i] > numMaximo) {
				numMaximo = numArray[i];
			}
			numSuma = numSuma + numArray[i];						
			i++;
		}
		numPromedio = numSuma/ 10;
		System.out.println("número mínimo: " + numMinimo);
		System.out.println("número máximo: " + numMaximo);
		System.out.println("suma total: " + numSuma);
		System.out.println("numero promedio: " + numPromedio);

	}
	
	public static int numeroAzar() {
		int numero = (int)(Math.random()*100+1);
		return numero;
	}
	
	//Como solucionar la incialización de numMaximo y numMinimo para que sea genérico?

}
