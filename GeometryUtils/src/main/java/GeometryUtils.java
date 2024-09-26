public class GeometryUtils {
    public static double centimetersToMeters(double cm) {
        return cm / 100;
    }

    public static double metersToCentimeters(double m) {
        return m * 100;
    }

    public static int compareAreas(double area1, double area2) {
        return Double.compare(area1, area2);
    }
}
