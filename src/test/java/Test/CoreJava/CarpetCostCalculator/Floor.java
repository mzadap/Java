package Test.CoreJava.CarpetCostCalculator;

public class Floor {

    private double width, height;

    public Floor(double width, double height) {
        if (width< 0){
            width = 0;
        }else {
            this.width = width;
        }
        if (height < 0) {
            height = 0;
        }else {
            this.height = height;
        }
    }

    public double getArea() {
        return width * height;
    }


}
