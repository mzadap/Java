package Test.CoreJava;

public class WallArea {
    private double width, height;

    public WallArea() {

    }

    public WallArea(double width, double height) {

        if (width<0) {
            width = 0;
        }else {
            this.width = width;
        }
        if (height<0) {
            height = 0;
        }else {
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {

        if (width < 0) {
            width = 0;
        }else {
            this.width = width;
        }

    }

    public void setHeight(double height) {
        if (height < 0 ) {
            height = 0;
        }else {
            this.height = height;
        }

    }

    public double getArea() {
        return height * width;
    }
}
