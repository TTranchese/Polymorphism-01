import it.develhope.polymorphism01.Animal;

public class Main {
	public static void main(String[] args) {
		Animal tiger = new Animal("Tigro");

		tiger.animalSound();
		tiger.animalSound("high");
		tiger.animalSound("low");
		tiger.animalSound("mid");

	}
}