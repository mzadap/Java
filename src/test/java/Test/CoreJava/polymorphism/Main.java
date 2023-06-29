package Test.CoreJava.polymorphism;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {

            //Bahubali bahubali = (Bahubali) Class.forName("com.Test.CoreJava.polymorphism").newInstance();
        for (int i=1; i<11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i +
                    " : " + movie.getName() + "\n" +
                    "plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) +1;
        System.out.println("Random number generated waas " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Mainhona();
            case 2:
                return new KoiMilGaya();
            case 3:
                return new Pusha();
            case 4:
                return new RRR();
            case 5:
                return new Bahubali();
            case 6:
                return new Jersay();
            default:
                return null;
        }
    }
}
