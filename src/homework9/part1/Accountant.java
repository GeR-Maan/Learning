package homework9.part1;

public class Accountant implements TitleOfThePosition{

    private String name;
    private int age;

    public Accountant(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void titleOfThePosition() {
        System.out.printf("Должность %s: бухгалтер\n",name);
    }
}
