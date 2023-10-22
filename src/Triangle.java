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

    public boolean isPointInside(double px, double py) {
        // Calculate the areas of the main triangle and three sub-triangles

        double sub1Area = Math.abs((px * (p1.y - p2.y) + p1.x * (p2.y - py) + p2.x * (py - p1.y)) / 2.0);
        double sub2Area = Math.abs((px * (p2.y - p3.y) + p2.x * (p3.y - py) + p3.x * (py - p2.y)) / 2.0);
        double sub3Area = Math.abs((px * (p3.y - p1.y) + p3.x * (p1.y - py) + p1.x * (py - p3.y)) / 2.0);

        // If the sum of sub-triangle areas equals the main triangle area, the point is inside the triangle
        return sub1Area + sub2Area + sub3Area;
    }
}
