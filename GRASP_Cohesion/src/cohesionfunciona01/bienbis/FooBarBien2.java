package cohesionfunciona01.bienbis;

public class FooBarBien2 {
	 private SomeObject someObject;
	 private OtherObject otherObject;
	 
	 public FooBarBien2(SomeObject someObject, OtherObject otherObject) {
		super();
		this.someObject = someObject;
		this.otherObject = otherObject;
	}


	  public void firstMethod() {
	    someObject.FirstCall();
	    otherObject.oneCall();
	  }

}
