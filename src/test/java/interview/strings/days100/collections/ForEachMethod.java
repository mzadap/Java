package interview.strings.days100.collections;

import java.util.*;

public class ForEachMethod {

    public static void main(String[] args) {
        int[] a = {1, 3, 44, 1, 22, 22, 50, 1, 44};
        //Arrays.sort(a);
        int count;
        Map map = new HashMap();
        for (int i = 0;i<a.length ;i++ ) {
            count = 0;
            for(int j = 0; j<a.length; j++) {
                if(a[i]==a[j]) {
                    count++;
                    //map.put(a[i], count);
                }
                map.put(a[i], count);
            }
            //map.put(a[i], count);
        }
        System.out.println(map);

        List list = new ArrayList();
        //list.size()

    }
}
