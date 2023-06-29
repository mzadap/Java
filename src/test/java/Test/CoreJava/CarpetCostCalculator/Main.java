package Test.CoreJava.CarpetCostCalculator;


import Test.CoreJava.ComplexNumber;

public class Main {
    public static void main(String[] args) {
      /* arpet carpet = new Carpet(10.0);
        Floor floor = new Floor(5,3);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println(calculator.getTotalCost());
        System.out.println(carpet.getCost());
        System.out.println(floor.getArea());*/
        ComplexNumber complexNumber = new ComplexNumber(1.0, 1.0);
        ComplexNumber complexNumber1 = new ComplexNumber(2.5, -1.5);
        complexNumber.add(1,1);
        System.out.println(complexNumber.getReal());
        System.out.println(complexNumber.getImaginary());
        complexNumber.subtract(complexNumber1);
        System.out.println("After subtractions " +complexNumber.getReal());
        System.out.println("After subtractions " + complexNumber.getImaginary());


    }
}
