import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.Arrays;
import java.util.List;


public class ParseFullCSVExample {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        //Build reader instance
        CSVReader reader = new CSVReader(new FileReader("data.csv"));

        //Read all rows at once
        List<String[]> allRows = reader.readAll();

        //Read CSV line by line and use the string array as you want
        for (String[] row : allRows) {
            System.out.println(Arrays.toString(row));
        }
    }
}