package inheritanceDemoV3;

public class AnimalTester {
	public static void main(String[] args) {
		Mammal mammal = new Mammal();
		Mammal mammal2 = new Mammal(true, true);
		Mammal mammal3 = new Mammal(true, 4, "Omnivore", false, true);
		Reptile reptile = new Reptile();
		Reptile reptile2 = new Reptile(false,true);
		Reptile reptile3 = new Reptile(true, 4, "Carnivore", true, true);
		
		mammal.makeNoise();
		mammal.eat();
		mammal2.makeNoise();
		mammal2.eat();
		mammal3.makeNoise();
		mammal3.eat();
		
		mammal.makeNoise();
		mammal.eat();
		mammal2.makeNoise();
		mammal2.eat();
		mammal3.makeNoise();
		mammal3.eat();
	}
}
