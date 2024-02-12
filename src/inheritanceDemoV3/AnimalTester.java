package inheritanceDemoV3;

public class AnimalTester {
	public static void main(String[] args) {
		Mammal mammal = new Mammal();
		Reptile reptile = new Reptile();
		mammal.makeNoise();
		mammal.eat();
		reptile.makeNoise();
		mammal.eat();
	}
}
