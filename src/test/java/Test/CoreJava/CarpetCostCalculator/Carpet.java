package Test.CoreJava.CarpetCostCalculator;



public class Carpet {

    private double cost;

    public Carpet(double cost) {
        if (cost < 0 ){
            cost = 0;
        }else {
            this.cost = cost;
        }
    }

    public double getCost() {
        return cost;
    }
}
