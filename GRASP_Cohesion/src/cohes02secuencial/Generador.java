package cohes02secuencial;

public class Generador {
	private int[] numbers={4,5,6,8,8,6,5,4,3,2,2,4};
	
	public int addNumbers() {
		int total=0;
		for (int i : numbers) {
			total+=i;
		}
		return total;
	}
	
	public float averageNumbers() {
		return (float)addNumbers()/numbers.length;
	}
}
