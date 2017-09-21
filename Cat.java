
public class Cat extends Animal {
	private String name;
	public Cat(String n, int l) {
		super(l);
		legs = 4;
		name = n;
	}

	public void play() {
		System.out.println("Cats love to play!");
	}
	
	public String getName() {
		return name;
	}
	
	public void eat() {
		System.out.println("Time for some sardines!");
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void walk() {
		System.out.println("Just walkin a cat...");
	}
}
