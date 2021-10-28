package customerData;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.stream.Collectors;
//import java.util.stream.Stream;

public class CustomerMain {

    public static void main(String[] args) throws ParseException, IOException, FileNotFoundException {
        CustomerAnalyzer customAnalyzer = new CustomerAnalyzer();
        List<Customer> customList = customAnalyzer.readFile("src//customerData//Customerdata.csv");

        customList.forEach(c -> System.out.println(c));
        System.out.println();
        System.out.println("-----------Searching with city----------");
        System.out.println();
        List<Customer> cust = customList.stream().filter(c -> c.getCity().equalsIgnoreCase("New York")).collect(Collectors.toList());
        cust.forEach(c -> System.out.println(c));

        System.out.println();

        customList.stream().filter(c -> c.getCity().startsWith("N")).forEach(c -> System.out.println(c));

        System.out.println();
        customList.stream().filter(c -> c.getPrice() >= 1200).forEach(c -> System.out.println(c));

        System.out.println();
        customList.stream().filter(c -> c.getPayment_type().contentEquals("Visa")).forEach(c -> System.out.println(c));

        System.out.println();
        customList.stream().map(c -> c.getName().toUpperCase()).forEach(c -> System.out.println(c));
        System.out.println();
        customList.stream().sorted((c1, c2) -> c1.getName().compareTo(c2.getName())).forEach(c -> System.out.println(c));
    }

}
