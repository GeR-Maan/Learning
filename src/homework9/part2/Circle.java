package homework9.part2;

public class Circle extends Figure{

    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public void getArea() {
        System.out.printf("Площадь круга равна: %.2f",Math.PI*radius);

    }
}
