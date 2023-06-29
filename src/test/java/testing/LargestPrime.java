package testing;

public class LargestPrime {

    public static void main(String[] args) {

        int no = 121;
        int no1 = no;
        int rev = 0;
        int rem = 0;
        while (no!= 0) {
            rem = no % 10;
            rev = rev * 10 + rem;
            no = no / 10;
        }
        if (no1 == no) {
            System.out.println("Palidrame");
        } else {
            System.out.println("Not");
        }
    }


}


