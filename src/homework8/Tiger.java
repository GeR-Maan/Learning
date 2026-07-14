package homework8;

public class Tiger extends Animal{

    @Override
    public void voice() {
        System.out.println("Tiger voice");
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
}
