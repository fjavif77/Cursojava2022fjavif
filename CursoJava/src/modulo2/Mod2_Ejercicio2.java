package modulo2;


public class Mod2_Ejercicio2 {
	public static int integer_min = Integer.MIN_VALUE;
	public static int integer_max = Integer.MAX_VALUE;
	public static short short_max = Short.MAX_VALUE;
	public static short short_min = Short.MIN_VALUE;
	public static byte byte_max = Byte.MAX_VALUE;
	public static byte byte_min = Byte.MIN_VALUE;
	public static long long_min = Long.MIN_VALUE;
	public static long long_max = Long.MAX_VALUE;
	public static void main(String[] args) {
		System.out.println(integer_min);
		System.out.println("\ttipo de dato \tmínimo \t\t\tmáximo");
		System.out.println("\n\tbyte \t\t" + byte_min + "\t\t\t" + byte_max);
		System.out.println("\n\tshort \t\t" + short_min + "\t\t\t" + short_max);
		System.out.println("\n\tint \t\t" + integer_min + "\t\t" + integer_max);
		System.out.println("\n\tlong \t\t" + long_min + "\t" + long_max);

	}

}
