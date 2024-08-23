package externalfile;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class aa {

    public static void main(String[] args) throws IOException {
        String filePath = "/home/nzadap/Documents/test/Java/src/test/java/test1.csv";
        String[] header = {"name", "address"};
        List<String> nameList = new ArrayList<>();
        List<String> addressList = new ArrayList<>();

        for (int i =0; i<=10; i++) {
            nameList.add("hello"+i);
            addressList.add("pune"+i);
        }

        System.out.println(nameList);
        System.out.println(addressList);
        String[][] data = new String[nameList.size()][2];
        for (int i =0;i< nameList.size(); i++) {
            data[i][0] = nameList.get(i);
            data[i][1] = addressList.get(i);

        }
        FileWriter writer = new FileWriter(filePath);
        CSVWriter writer1 = new CSVWriter(writer);
        //writer1.writeAll(nameList);
        List list1 = new ArrayList();
        list1.add(header);
        for (int i =0;i< nameList.size(); i++) {
            list1.add(data[i]);
        }
        writer1.writeAll(list1);
        writer1.flush();


    }
}
