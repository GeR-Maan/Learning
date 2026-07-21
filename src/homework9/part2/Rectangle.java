package homework9.part2;

public class Rectangle extends Figure{

    private int side;
    private int side2;

    public Rectangle(int side,int side2){
        this.side = side;
        this.side2 = side2;
    }
    @Override
    public void getArea() {
        System.out.println("Площадь прямоугольника равна: " + side*side2);
    }
}
