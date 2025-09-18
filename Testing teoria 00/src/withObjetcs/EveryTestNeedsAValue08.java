package withObjetcs;

public class EveryTestNeedsAValue08 {

	private int amount[];
	private int index = 0;

	public EveryTestNeedsAValue08(int size) {
		amount = new int[size];
	}

	public boolean addValue(int value) {
		if (index < amount.length - 1) {
			amount[index++] = value;
			return true;
		}
		return false;
	}
	
	public int getValue(int index) {
		if(index<=this.index) {
			return amount[index];
		}
		return -1;
	}
}
