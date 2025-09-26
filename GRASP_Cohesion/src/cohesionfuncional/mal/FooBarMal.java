package cohesionfuncional.mal;

//Cohesion coincidental, comparten espacio pero no se comunican
public class FooBarMal {
	 private SomeObject someObject = new SomeObject();
	 private OtherObject otherObject=new OtherObject();

	  public void FirstMethod() {
	    someObject.FirstCall();
	  }

	  public void SecondMethod() {
	    someObject.SecondCall();
	  }

	  public void ThirdMethod() {
	    someObject.ThirdCall();
	  }
	  
	  public void oneMethod() {
		otherObject.oneCall();
	}
	  public void twoMethod() {
		otherObject.twoCall();
	}
}
