package Test.CoreJava.composition.challenge;

public class NEWONOFF {

    private String on;
    private String off;

    public NEWONOFF(String on, String off) {
        this.on = on;
        this.off = off;
    }

    public void fanon(int speed) {
        System.out.println("Now fan is on in fanon method at " + speed);

    }

    public String getOn() {
        return on;
    }

    public String getOff() {
        return off;
    }
}
