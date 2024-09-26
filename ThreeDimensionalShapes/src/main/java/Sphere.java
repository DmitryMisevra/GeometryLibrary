public class Sphere {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    // Метод для вычисления объема
    public double getVolume() {
        return (4/3) * Math.PI * Math.pow(radius, 3);
    }

    // Метод для вычисления площади поверхности
    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    // Геттеры и сеттеры
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
