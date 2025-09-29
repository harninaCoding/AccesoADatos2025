package cohes05procedimental;

public class Ingredient {

    private final String name;

    public Ingredient(String name) {
        this.name = name;
    }
    //getter, toString...

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Ingredient [name=" + name + "]";
	}
	
}