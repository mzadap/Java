package Test.CoreJava;

public class Car {
    private String model;
    public String doors;
    public String numberPlate;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.contains("harrier") || validModel.contains("nexon")) {
            this.model = model;
        }
        else {
            this.model = "Unkown model";
        }
    }

    public String getModel() {
       return this.model;
    }
}
