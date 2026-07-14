package homework8;

public class Main {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Rabbit rabbit = new Rabbit();

        tiger.eat("meal");
        tiger.voice();
        rabbit.eat("Grass");
        rabbit.voice();

        Dog dog = Dog.createDog();
        dog.eat("Meat");
        dog.voice();

    }

}
