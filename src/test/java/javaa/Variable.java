package javaa;

public class Variable {
    public static void main(String[] args) {
        int i = 10;
        int j = 15;
        i = j;
        System.out.println(i=j);
        i++;
        System.out.println(i);
        j+= 10;
        System.out.println("Value of j is " + j);
        i=j;
        System.out.println("Value of i is " + i);
        j-= 10;
        System.out.println("value of j is " + j);
        i = i * 10;
        System.out.println("value of i is " + i);
        j = j * 3;
        System.out.println("value of j is " + j);
        i = i / 25;
        System.out.println("value of i is " + i);
        j = j / 3;
        System.out.println("value of j is " + j);

        j = 10;
        if (i == j) {
            System.out.println("yes");
        }
    }
}
