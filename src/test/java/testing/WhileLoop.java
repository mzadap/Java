package testing;

public class WhileLoop {

    public static void main(String[] args) {
        int num = 0;
        while(num < 16){
            num++;
            if (num < 5){
                System.out.println("Contiune statement execution " + num);
                continue;
            }
            System.out.println("num" + num);
            if (num > 10){
                System.out.println("break statements" + num);
                break;
            }
        }
    }

}
