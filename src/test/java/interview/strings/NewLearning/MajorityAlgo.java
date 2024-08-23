package interview.strings.NewLearning;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityAlgo {


    //Majoirty algoirthm
    public static void main(String[] args) {
        int a[] = {1, 2, 1, 2, 2,2,1, 1, 2};
        int size = a.length/2;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i<a.length; i++) {


                map.put(a[i], map.getOrDefault(a[i], 0) + 1);
            //map.put(a[i], );
        }
        System.out.println(map);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int values = entry.getValue();
            if (values> size) {
                System.out.println(entry.getKey());
            } else {
                System.out.println("No majority: " + entry.getKey());
            }
        }
    }
}
