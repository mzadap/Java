package testing;

public class methodOverloading {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimetersABoolean(5, 10);
    }

    public static double calcFeetAndInchesToCentimetersABoolean(double feet, double inches) {

        if ((feet < 0) && (inches < 0 && inches > 12)) {
            System.out.println("Invalid value");
            return -1;
        }
        double cm = (feet * 12) * 2.54;
        cm += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + cm + " cm");
        return cm;
    }
}
