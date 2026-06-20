package homework7;

public class Apple {

    private String color = "Red";

    public Apple(String color) {
        System.out.println("Цвет яблока был изначально: " + this.color);
        this.color = color;
    }

    public String getColor() {
        return "Цвет после инициализации конструктора стал: " + color;
    }
}
