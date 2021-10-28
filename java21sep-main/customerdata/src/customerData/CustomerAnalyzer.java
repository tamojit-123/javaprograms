package customerData;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class CustomerAnalyzer {
    List<Customer> custList = new ArrayList<>();
    SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy hh:mm");

    public List<Customer> readFile(String filename) throws ParseException, IOException, FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String data;
        String[] record;
        br.readLine();
        while ((data = br.readLine()) != null) {
            record = data.split(",");
            Customer cust = new Customer();
            cust.setTransation_date(formatter.parse(record[0]));
            cust.setPrice(Double.parseDouble(record[1]));
            cust.setPayment_type(record[2]);
            cust.setName(record[3]);
            cust.setCity(record[4]);
            cust.setState(record[5]);
            cust.setAccountCreated(formatter.parse(record[6]));
            cust.setZipcode(Long.parseLong(record[7]));
            custList.add(cust);

        }
        return custList;
    }
}
