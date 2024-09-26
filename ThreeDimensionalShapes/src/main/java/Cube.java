public class Cube {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    // Метод для вычисления объема
    public double getVolume() {
        return Math.pow(side, 3);
    }

    // Метод для вычисления площади поверхности
    public double getSurfaceArea() {
        return 6 * Math.pow(side, 2);
    }

    // Геттеры и сеттеры
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
