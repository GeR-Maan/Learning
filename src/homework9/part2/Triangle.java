package homework9.part2;

public class Triangle extends Figure {

    private int height;
    private int side;

    public Triangle(int height, int side){
        this.height = height;
        this.side = side;
    }

    @Override
    public void getArea() {
        System.out.println("Площадь треугольника равна: " + (height+side)/2);
    }
}
