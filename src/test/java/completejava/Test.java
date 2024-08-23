package completejava;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("");
        list.add("");
        for (int i =0;i<list.size(); i++) {
            System.out.println("a"+ list.get(i));
        }

    }
}
