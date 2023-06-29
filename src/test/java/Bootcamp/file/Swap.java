package Bootcamp.file;

public class Swap {
    public static void main(String[] args) {
        int a = 50;
        int b = 10;
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.println("b " + b);
        System.out.println("a " + a);
       /* a = a - b;
        b = b + a;
        a = b - a;
        System.out.println("a " + a);
        System.out.println("b " + b);*/
        String a1 = "Hello this new world";
        String[] ch = a1.split(" ");
        int test = ch.length;
        a1.replaceAll("", " ");
        int len = a1.length();
        System.out.println(len);
        System.out.println(test);
        for (int i = ch.length-1; i>=0; i--) {
            System.out.print(ch[i] + " ");
        }
    }
}
