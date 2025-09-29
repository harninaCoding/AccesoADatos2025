package acop09datos;

import java.util.Random;

public class DeDatos {
	public int solicitarValores(int min,int max){
		if(max>min)
			return dameValorAleatorio(min,max);
		else
			return min;
	}

	private int dameValorAleatorio(int min, int max) {
		return new Random().nextInt(max-min)+min;
	}
	public static void main(String[] args) {
		DeDatos deDatos=new DeDatos();
		int valor=deDatos.solicitarValores(5, 25);
	}
}
