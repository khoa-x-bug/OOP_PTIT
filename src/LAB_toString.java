import java.util.Scanner;

/**
 * @author Khoa
 */
public class LAB_toString  {
    private double radius;

    public LAB_toString (double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + String.format("%.3f", radius) + "]";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            double radius = scanner.nextDouble();
            String option = scanner.next();

            LAB_toString  circle = new LAB_toString (radius);

            switch (option) {
                case "get":
                    System.out.printf("%.3f\n", circle.getRadius());
                    break;
                case "set":
                    double newRadius = scanner.nextDouble();
                    circle.setRadius(newRadius);
                    System.out.println(circle.toString());
                    break;
                case "A":
                    System.out.printf("%.3f\n", circle.getArea());
                    break;
                case "C":
                    System.out.printf("%.3f\n", circle.getCircumference());
                    break;
                case "S":
                    System.out.println("Call explicitly: " + circle.toString());
                    System.out.println("Call implicitly: " + circle);
                    break;
            }
        }
        scanner.close();
    }
}
