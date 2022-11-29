package PaperTest01;

public class AnimalEx {
	public static Animal animal;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog = new Dog();
		Cat cat = new Cat();
		
		animal = dog;
		animal.sound();
		animal = cat;
		animal.sound();
		animal = dog;
		animal.sound();
		animal = cat;
		animal.sound();
	}

}
