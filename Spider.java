
public class Spider extends Animal {
	public Spider(int l) {
		super(l);
		l = 8;
	}
	
	public void eat() {
		System.out.println("I'm full!");
	}

	void walk() {
		System.out.println("I have " + legs + " legs!");
	}
}
