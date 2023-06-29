package testing;

public class switchCase {

    public static void main(String[] args) {

        char charValue = 'D';
        switch (charValue){

            case 'A':
                System.out.println("got the case A" + charValue);
                break;
            case 'B':
                System.out.println("got the case b" + charValue);
                break;
            case 'C':
                System.out.println("got the case c" + charValue);
                break;
            case 'D':
                System.out.println("got the case D" + charValue);
                break;
            case 'E':
                System.out.println("got the case E" + charValue);
                break;
            default:
                System.out.println("This is a default value");
                break;
        }

    }
}
