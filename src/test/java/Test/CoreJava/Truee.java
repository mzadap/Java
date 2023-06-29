package Test.CoreJava;

import java.util.Locale;

public class Truee {
    public static void main(String[] args) {

        String a = "hello";
        String b = "java";


        System.out.println(a.length() + b.length());
        System.out.println(a.substring(0,1).toUpperCase() + a.substring(1, a.length()) +
                " " + b.substring(0,1).toUpperCase() + b.substring(1,b.length()));
        System.out.println(a.compareTo(b)>0?"Yes":"No");
       // System.out.println(a.toUpperCase(Locale.forLanguageTag("h")));
    }
}
