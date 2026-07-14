package homework8;

public class Rabbit extends Animal{

    @Override
    public void voice() {
        System.out.println("Rabbit voice");
    }


    @Override
    public void eat(String str) {
        if (str.equalsIgnoreCase("grass")){
            System.out.println("I love eat Grass");
        }
        else{
            System.out.println("I'm not happy");
        }
    }

}
