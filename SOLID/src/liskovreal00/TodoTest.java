package liskovreal00;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Point;
import java.text.Normalizer.Form;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TodoTest {

	@Test
	void test() {
		// que curioso si le damos el mismo
		// Point point = new Point(0, 0);
		Circulo circulo = new Circulo(new Point(0, 0));
		Cuadrado cuadrado = new Cuadrado(new Point(0, 0));
		Movement movement = new Movement(1, 1);
		circulo.mover(movement);
		System.out.println(circulo.getPoint());
		cuadrado.mover(movement);
		System.out.println(cuadrado.getPoint());
		ArrayList<Forma> formas = new ArrayList<>();
		formas.add(cuadrado);
		formas.add(circulo);
		// En este caso no espero comportamientos diferentes
		for (Forma forma : formas) {
			forma.mover(movement);
		}
	}

}
