package ejemplos;

public class Figuras {
	public static final float PI = 3.1416f;

	// Sirve para explicar
	public static int sumaEnteros(int numUno, int numDos) {
		return numUno + numDos;
	}

	// Este vale para explicar el delta
	public static float areaCirculo(float radio) {
		float area = 2 * PI * (radio * radio);
		return area;
	}

	public static boolean esPar(int numero) {
		if (numero % 2 == 0)
			return true;
		else
			return false;
	}

	public static long elevarNumero(int numero, int potencia) {
		long resultado = numero;
		//Finalmente se prueba esto
		resultado=1;
		for (int i = 0; i < potencia; i++) {
//			Primero prueba esto con error
//			resultado += potencia;
//			luego se prueba esto con error
//			resultado *= potencia;
			resultado *=numero;
		}
		return resultado;
	}
}
