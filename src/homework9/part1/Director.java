package homework9.part1;

public class Director implements TitleOfThePosition, Cloneable{

    private String name;
    private int age;

    public Director(String name, int age){
        this.name = name;
        this.age = age;
    }


    @Override
    public void titleOfThePosition() {
        System.out.printf("Должность %s: директор\n",name);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Director) super.clone();
    }
}
