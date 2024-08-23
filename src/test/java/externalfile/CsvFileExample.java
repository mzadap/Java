package externalfile;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.DoubleStream.concat;

public class CsvFileExample {

    public static void main(String[] args) {
        String filePath = "/home/nzadap/Documents/lanuages.csv";
        List<String> h = new ArrayList<>();
        try {
            CSVReader reader = new CSVReader(new FileReader(filePath));
            String[] records = reader.readNext();
            String test = "";

            for (int i =0; i<records.length; i++) {
                h.add(records[i]);
                System.out.println(records[i]);
            }
            System.out.println(h);

        }catch (Exception e) {
            System.out.println(e);
        }
        for (String la : h) {
            la = "\"" + la + "\"";
            System.out.println("Hello this " + la);

            System.out.println(la);
            if (h.equals("ja")) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
