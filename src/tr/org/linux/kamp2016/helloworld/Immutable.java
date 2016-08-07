package tr.org.linux.kamp2016.helloworld;

public class Immutable {
	
	private final int value; // override edilemez değişmez 
	public Immutable(int value){
		this.value = value;
	}
	public int getValue(){
		return value;
	}

}
