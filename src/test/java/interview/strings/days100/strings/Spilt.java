package interview.strings.days100.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Spilt {

    public static void main(String[] args) {
        String[] s = {"20/jun/2023", "23/April/2024", "01/Sept/2024", "05/oct/2023", "01/Sept/2024", "05/oct/2023"};
        List<String> list = new ArrayList<>();
        String[] s1 = new String[s.length];
        for (int i=0; i< s.length; i++) {
            s1 = s[i].split("/");
            System.out.println(Arrays.toString(s1));
            for (int j = 1; j < s1.length - 1; j++) {
                list.add(s1[j].toLowerCase());
            }
        }
        System.out.println(list);
        //List<String> list1 = new ArrayList<>(list);
        Collections.sort(list);
        System.out.println(list);
        ///System.out.println(Arrays.toString(s1));

    }
}
