public class Triangle {
    Point p1, p2, p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double calculateDistance(Point a, Point b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }



    public String getType() {
        double side1 = calculateDistance(p1, p2);
        double side2 = calculateDistance(p2, p3);
        double side3 = calculateDistance(p3, p1);

        if (side1 == side2 && side2 == side3) {
            return "Equilateral Triangle";
        } else if (side1 == side2 || side2 == side3 || side3 == side1) {
            return "Isosceles Triangle";
        } else {
            return "Unknown Triangle";


        }
    }

    public double calculatePerimeter() {
        double side1 = calculateDistance(p1, p2);
        double side2 = calculateDistance(p2, p3);
        double side3 = calculateDistance(p3, p1);
        return side1 + side2 + side3;
    }

    public static double calculateTriangleArea() {
        double a = calculateDistance(p1, p2);
        double b = calculateDistance(p2, p3);
        double c = calculateDistance(p3, p1);
        double s = (a + b + c) / 2; // Calculate the semi-perimeter
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }
}
