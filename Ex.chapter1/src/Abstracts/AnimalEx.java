package Abstracts;

public class AnimalEx {
	
	public static void AnimalSound(Animal animal) {
		animal.sound();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog = new Dog();
		dog.breathe();
		dog.sound();
		Cat cat = new Cat();
		cat.breathe();
		cat.sound();
//		
//		AnimalSound(cat);
//		AnimalSound(dog);
		
		dog.Animalsound = dog;
	}

}
