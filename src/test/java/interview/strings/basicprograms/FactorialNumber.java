package interview.strings.basicprograms;

public class FactorialNumber {

    public static void main(String[] args) {
        int no = 4;
        for (int i = no-1; i>0; i--) {
            no = no * i;
        }
        System.out.println(no);
    }
}
