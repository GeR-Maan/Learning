package homework9.part1;

public class Employer implements TitleOfThePosition{

    private String name;
    private int age;

    public Employer(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void titleOfThePosition() {
        System.out.printf("Должность %s: работник\n", name);
    }
}
