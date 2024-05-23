package interview.strings.days100.collections.conversation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;

public class HashmapToArrayList {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap();
        map.put(1, "Nachiket");
        map.put(2, "pooja");
        map.put(3, "Weds");


        Set<Integer> set = map.keySet();
        System.out.println("sets " + set);
        ArrayList arrayList = map.keySet().stream().collect(Collectors.toCollection(ArrayList::new));
        System.out.println(arrayList);
        /*System.out.println(arrayList);
        Collection set1 = map.values();
        ArrayList values = new ArrayList(set1);
        System.out.println(values);*/

    }
}
