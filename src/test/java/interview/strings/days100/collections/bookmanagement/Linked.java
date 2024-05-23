package interview.strings.days100.collections.bookmanagement;

import java.util.LinkedList;
import java.util.List;

public class Linked {

    public static void main(String[] args) {
        List<Books> list = new LinkedList<Books>();
        Books books = new Books(1, "Nachiket", "automation", "abc", 2);
        Books books1 = new Books(2, "Pooja", "maxmio", "xyz", 22);
        Books books2 = new Books(2, "weds", "weds", "pqz" , 33);
        list.add(books);
        list.add(books1);
        list.add(books2);
        /*list.forEach(a -> {
            System.out.println(a.id + " " + a.name + " " + a.author + " " + a.published + " " + a.quaultity);
        });*/
        //list;
        for (Books books3 : list) {
            if (books3.id==1) {
                System.out.println("Name " + books1.name);
            }
        }
        if (list.contains(1)) {
            Books books3 = list.get(1);
            System.out.println("Id of " + books3.id);
        }
        list.forEach(a -> {
            System.out.println(a.id + " " + a.name + " " + a.author + " " + a.published + " " + a.quaultity);
        });
    }
}
