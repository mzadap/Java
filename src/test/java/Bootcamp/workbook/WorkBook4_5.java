package Bootcamp.workbook;

public class WorkBook4_5 {

    public static double areaSquare(double side) {
        if (side < 0) {
            System.out.println("impossible");
            System.exit(404);
        }
        double area = Math.pow(side, 2.0);
        return area;
    }

    public static double areaRectangle(double length, double width) {
        if (length <0 || width <0) {
            System.out.println("Error Impossible");
            System.exit(404);
        }
        double area = length * width;
        return area;
    }

    public static double areaTriangle(double base, double height) {
        if (base <0 || height <0) {
            System.out.println("Error Impossible");
            System.exit(0);
        }
        double area = (base * height) / 2;
        return area;
    }

    public static double areaCircle(double radius) {
        if (radius <0) {
            System.out.println("Error impossible");
        }
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public static void printAreas(double square, double rectangle, double triangle, double circle) {
        System.out.println("Square area " + square);
        System.out.println("rectangle area " + rectangle);
        System.out.println("triangle area " + triangle);
        System.out.println("circle area " + circle);
    }

    public static void main(String[] args) {
        System.out.println("Thank you for using the area calculator\nThis calculator lets you get the area of:");
        System.out.println("\n1--Square\n2--Rectangle\n3--Triangle\n4--Circle");
        double square = areaSquare(2);
        double rectangle = areaRectangle(1,2);
        double triangle = areaTriangle(1, 2);
        double circle = areaCircle(2);
        printAreas(square, rectangle, triangle, circle);
    }
}
