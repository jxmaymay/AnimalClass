
public class Fish extends Animal {
	public Fish(int l) {
		super(l);
		legs = 0;
	}
	
	public void eat() {
		System.out.println("Yum");
	}
	
	public void walk() {
		System.out.println("I have no legs!");
	}
	
	
}
