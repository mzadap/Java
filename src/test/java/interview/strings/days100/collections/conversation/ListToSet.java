package interview.strings.days100.collections.conversation;

import com.sun.source.doctree.SeeTree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ListToSet {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("nachiket");
        arrayList.add("weds");
        arrayList.add("pooja");
        arrayList.add("newly");

        Set set = new HashSet(arrayList);
        System.out.println(set);
    }
}
