package Bootcamp.practice;

public class AreaOfTriangle {
    public static void main(String[] args) {
        double area1 = area(2.3, 3.1, "");
        stringPrinter(2.4, 1.2, area1);
    }

    public static double area(double len, double wid, String option) {
        switch (option) {
            case "area": return len * wid;
            case "parameter" : return 2 * ( len * wid);
            default:return 404;
        }

    }

    public static void stringPrinter(double len, double wid, double are) {
        System.out.println("Then length is " + len + " and width is " + wid + " = " + are);

    }
}
