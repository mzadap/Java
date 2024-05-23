package interview.strings.days100.collections.conversation;

import java.util.ArrayList;

public class ArrayListToString {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("pooja");
        strings.add("nachiket");
        strings.add("weds");

        String s = "";
        for (String s1 : strings) {
            s+=s1 + "\t";
        }
        System.out.println(s);
    }
}
