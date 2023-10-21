import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of triangles: ");
        int numTriangles = s.nextInt();

        Triangle[] triangles = new Triangle[numTriangles];

        for (int i = 0; i < numTriangles; i++) {
            System.out.println("Enter coordinates for Triangle " + (i + 1) + ":");
            System.out.print("Point 1 (x y): ");
            double x1 = s.nextDouble();
            double y1 = s.nextDouble();


            System.out.print("Point 2 (x y): ");
            double x2 = s.nextDouble();
            double y2 = s.nextDouble();

            System.out.print("Point 3 (x y): ");
            double x3 = s.nextDouble();
            double y3 = s.nextDouble();

            triangles[i] = new Triangle(new Point(x1, y1), new Point(x2, y2), new Point(x3, y3));
        }

        System.out.println("\nTriangle Information:");
        for (int i = 0; i < numTriangles; i++) {
            System.out.println("Triangle " + (i + 1) + ":");
            System.out.println("Perimeter: " + triangles[i].calculatePerimeter());
            System.out.println("Type: " + triangles[i].getType() + "\n");
        }
    }
}