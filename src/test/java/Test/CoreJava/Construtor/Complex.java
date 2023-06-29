package Test.CoreJava.Construtor;

public class Complex {

    private int rm;
    private int im;

    public Complex(int rm, int im) {
        this.rm = rm;
        this.im = im;
    }

    public Complex(Complex complex) {
        rm = complex.rm;
        im = complex.im;
    }

    @Override
    public String toString() {
        return "(" + rm + " + " + im + " i";
    }

    public static void main(String[] args) {
        Complex complex = new Complex(10, 15);

        Complex complex1 = new Complex(complex);

        System.out.println(complex1);
    }
}
