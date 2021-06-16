package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    Animal animal = new Animal("Animal", 1, 1, 5, 5);

	    Dog teddy = new Dog("Pom", 8, 20, 2, 4, 20, 1, "long silky");
        teddy.eat();
        teddy.run();
    }
}
