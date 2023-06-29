package Bootcamp.practice;
import java.util.Arrays;



public class Arraysa {
    public static void main(String[] args) {

     /*   String[] test = {"Test1", "Test2", "Test3", "Test4"};
        System.out.println(test.length);
        System.out.println(test[2]);*/

        int[] test = {10,100,20,1,50};
   /*     for (int i = 0; i<test.length;i++) {
           for (int j = i + 1; j<test.length;j++) {
               int temp=0;
               if (test[i] > test[j]) {
                   temp = test[i];
                   test[i] = test[j];
                   test[j] = temp;
               }
           }
        }
        System.out.println(java.util.Arrays.toString(test));*/

        //reverse array
        /*int[] test1 = new int[5];
        for (int i = test.length - 1; i>= 0; --i) {
            System.out.println(test[i]);
        }*/

        //Largest no in arrays
        /*int highScore = test[0];
        for (int i = 0;i<test.length;i++) {
            if (test[i] < highScore) {
                highScore = test[i];
            }
        }
        System.out.println(highScore);*/
     /*   for (int i = 0;i<test.length;i++) {
            for (int j = 0;j< test.length;j++) {
                int temp = 0;
                if (test[i] > test[j]) {
                    temp = test[i];
                    test[i] = test[j];
                    test[j] = temp;
                }
            }
        }
        System.out.println(java.util.Arrays.toString(test));
        System.out.println(test[2]);*/

      /*  Arrays.sort(test);
        System.out.println(Arrays.toString(test));
        System.out.println(test[test.length-3]);*/

       /* String st = "Nachiket";
        char ch ;
        for (int i = st.length()-1; i>=0; i--) {
            ch = st.charAt(i);
            System.out.print(ch + " ");
        }*/

      /*  String st1 = "zyx";
        char[] ch1 = st1.toCharArray();
        Arrays.sort(ch1);
        String st3 = new String(ch1);
        System.out.println(st3)*/;
/*
        String s1 = "Hello world";
        String s2 = "Hello world";
        if (s1.equals(s2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }*/

     /*   String s1 = "refer";
        char ch;
        String s2 = "";
        for (int i = s1.length() -1; i>=0; i--) {
            s2 = s2 + s1.charAt(i);
        }
        if (s1.equals(s2)) {
            System.out.println("palidrome");
        } else {
            System.out.println("Not");
        }*/

        String s1 = "refer is new";
        int count = 0;
        char[] ch = s1.toCharArray();
        for (int i = 0; i<s1.length();i++) {
            for (int j = i+1; j < s1.length(); j++) {
                if (ch[i] == ch[j] && ch[i] != ' ') {
                    count++;
                    System.out.print(ch[i] + " ");
                    break;
                }
            }
        }
        System.out.println(count);

        //String s1 = "Hello this is nachiket";
       /* int count = 1;
        for (int i = 0; i<s1.length();i++) {
            if (s1.charAt(i)==' ' && s1.charAt(i+1)!=' ') {
                count++;
            }
        }
        System.out.println(count);*/
       /* System.out.println( s1.replace(" ","").length());
        System.out.println(s1.replace(" ",""));*/
        //System.out.println(test2);

        /*char[] ch = s1.toCharArray();
        int count = 1;
        for (int i = 0;i<ch.length;i++) {
            ch[i] += s1.charAt(i);
            System.out.println(s1.charAt(i));

        }
        System.out.println(ch.length);
        System.out.println(count);*/

        //System.out.println(s1.replaceAll(" ", ""));

       /* int[] test1 = {10,5,78,5, 10};
        int count = 0;
        for (int i =0;i< test1.length;i++) {
            for (int j = i+1;j< test1.length;j++) {
                if (test1[i]==test1[j]) {
                    System.out.println(test1[j]);
                    count++;
                }
            }
        }
        System.out.println(count);*/

    }
}
