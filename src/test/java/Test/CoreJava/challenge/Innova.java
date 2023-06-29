package Test.CoreJava.challenge;

public class Innova extends car{

    private int roadServiceMonths;

    public Innova(int roadServiceMonths) {
        super("innova", "4wd", 4, 5, 6, true);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurretVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGear(1);
        }else if (newVelocity >0 && newVelocity <=10) {
            changeGear(1);
        }else if (newVelocity > 10 && newVelocity <=20) {
            changeGear(2);
        }else if (newVelocity >20 && newVelocity <=30) {
            changeGear(3);
        }else if(newVelocity >40 && newVelocity<=50) {
            changeGear(4);
        }else {
            changeGear(5);
        }
        if (newVelocity>0) {
            changeVelocity(newVelocity,getCurrentDirection());
        }
    }
}
