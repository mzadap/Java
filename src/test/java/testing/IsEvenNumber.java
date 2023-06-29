package testing;

public class IsEvenNumber {

    public static void main(String[] args) {
        System.out.println( isEvenNumber(10));

        int number = 1;
        int lastnumber = 20;
        int evenNUmberFound = 0;
        while (number <= lastnumber){

            number++;
            if (!isEvenNumber(number)) {

                continue;
            }
            System.out.println("even number " + number);
            evenNUmberFound++;
            if (evenNUmberFound >= 5){
                break;
            }

        }
        System.out.println("Total number even found is " + evenNUmberFound);

    }
    public static boolean isEvenNumber(int a){
        if (a % 2 == 0) {
            return true;
        }return false;
    }
}
