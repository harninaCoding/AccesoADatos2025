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
	if(min>max) throw new Exception();
	int result=(int) (Math.random()*(max-min));
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return result; 
	
}
}
