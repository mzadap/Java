package interview.strings.days100.collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConvert {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("nachiker");
        list.add("pooja");
        list.add("xya");
        list.add("new man");
        list.add("poojaa");
        String[] s = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(s));

    }
}
