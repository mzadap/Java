package codechef;

/*

Body mass index which is equal to mass(Weight) to the height square
 */
public class BodyMassIndex {

    public static void main(String[] args) {
        int mass = 120;
        int height = 2;
        if ((mass/(height * height)) <= 18) {
            System.out.println("Category 1");
        } else if ((mass/(height * height)) >= 19 && (mass/(height * height)) < 24) {
            System.out.println("Category 2");
        } else if ((mass/(height * height)) >= 25 && (mass/(height * height)) < 29) {
            System.out.println("Category 3");
        } else {
            System.out.println("category 4");
        }
    }
}
