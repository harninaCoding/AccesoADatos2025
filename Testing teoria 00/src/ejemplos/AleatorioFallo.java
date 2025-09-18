package ejemplos;

public class AleatorioFallo {
/**
 * Genera un numero aleatorio entre min y max, ambos incluidos
 * @param min el menor numero que puede salir
 * @param max el mayor numero que puede salir
 * @return el numero int generado
 * @throws Exception 
 */
public int generarAleatorio(int min, int max) throws Exception{
	//clausula de guarda
	if(min>max) throw new Exception("maximo menor que el minimo");
	if(min<0) throw new Exception("numero negativo");
	int result=(int) (Math.random()*(max-min));
	try {
		Thread.sleep(100);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return result; 
	
}
}
