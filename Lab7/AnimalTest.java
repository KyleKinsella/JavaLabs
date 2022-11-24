public class AnimalTest extends Animal{

	public static void main (String args[]) {					//, String Cat, String Dog) {
		Vet vet1 = new Vet("Kyle");
		System.out.println(vet1);
		vet1.getVaccinate();
		

		vet1.toString();
		

		System.out.println();
		System.out.println("-----------------------------");

		Animal dog = new Dog("Poodle", 4, 'M');
		System.out.println(dog.toString());
		System.out.println(((Dog) dog).isDog());
		dog.eat();
		dog.sleep();
		dog.makeSound();

		System.out.println();
		System.out.println("-----------------------------");
		
		Animal cat = new Cat("Tom", 2, 'F');
		System.out.println(cat.toString());
		//Cast
		System.out.println(((Cat) cat).isCat());
		cat.eat();
		cat.sleep();
		cat.makeSound();

		cat.toString();
		//Cast
		((Cat) cat).isCat();
	}
}