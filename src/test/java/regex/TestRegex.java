package regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class TestRegex {

    public static void main(String[] args) {
        System.out.println(Pattern.matches("\\d", "1"));
        System.out.println(Pattern.matches("\\D", "1"));
        System.out.println(Pattern.matches("\\D", "1AAA"));
        System.out.println(Pattern.matches("\\D", "A"));
        System.out.println(Pattern.matches("\\D", "a"));
        System.out.println(Pattern.matches("\\d", "11111"));
        System.out.println(Pattern.matches("\\d*", "124344"));
        System.out.println(Pattern.matches("\\D*", "Ansbdbdb"));
        System.out.println(Pattern.matches(".*", "nanannana"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{3}", "annaDDDD12233"));

        String s = "nachiketa";
        int a = 124;
        System.out.println("To check character contains 2: " + Pattern.matches("\\d{2,4}", "12333"));
        System.out.println(Pattern.matches(".*?", s));

        List<String> list = new ArrayList<>();
        list.add("value1");
        list.add("value2");
        list.add("value3");

        //System.out.println(Pattern.matches("[(.*?)]", list));
        String[] s1 = {"h", "aa"};
        for (String n : s1) {
            System.out.println(n);
        }

    }
}
