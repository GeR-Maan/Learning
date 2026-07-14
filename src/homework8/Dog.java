package homework8;

public final class Dog extends Animal{

    private Dog(){

    }

    @Override
    public void voice() {
        System.out.println("Dog voice");
    }

    @Override
    public void eat(String str) {
        if (str.equalsIgnoreCase("meal")){
            System.out.println("I love eat meal");
        }
        else{
            System.out.println("I'm not happy");
        }
    }

    public static Dog createDog(){
        return new Dog();
    }

}
