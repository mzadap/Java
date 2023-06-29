import java.util.ArrayList;
import java.util.List;


public class Adddata {

    public static void main(String[] args) {

        //String CSV_FILE_PATH = "C:\\Users\\\zadap\\\Desktop\\Information service\\Load testing\\AutomationCSV.csv";

        List<String[]> csvData = createCsvDataSimple();

        // default all fields are enclosed in double quotes
        // default separator is a comma
        /*try (CSVWriter writer = new CSVWriter(new FileWriter("c:\\test\\test.csv"))) {
            writer.writeAll(csvData);
        }*/

    }

    private static List<String[]> createCsvDataSimple() {
        String[] header = {"id", "name", "address", "phone"};
        String[] record1 = {"1", "first name", "address 1", "11111"};
        String[] record2 = {"2", "second name", "address 2", "22222"};

        List<String[]> list = new ArrayList<>();
        list.add(header);
        list.add(record1);
        list.add(record2);

        return list;
    }
}
