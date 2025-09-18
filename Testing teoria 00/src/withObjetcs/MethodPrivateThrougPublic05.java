package withObjetcs;

public class MethodPrivateThrougPublic05 {

	public int addOdds(int valueOne, int valueTwo) {
		if(isOdd(valueOne)&&isOdd(valueTwo)) return  valueOne+valueTwo;
		return -1;
	}
	private boolean isOdd(int value) {
		return value%2!=0;
	}
}
