package codechef;

public class LastLevel {

    public static void main(String[] args) {
        int x = 3;
        int y = 12;
        int z = 10;
        int sum = 0;
        int ab = 3;
        int n=x/3;
        if(x%3==0)
        {
            System.out.println((x*y)+(n-1)*z);
        }
        else
            System.out.println((x*y)+(n*z));


    }
}
