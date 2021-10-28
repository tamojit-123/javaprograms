package custometInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class CustomerImpl {
    public static List<Customer> filter1(List<Customer> custList, Predicate<Customer> predicate) {
        List<Customer> customerList = new ArrayList<>();
        for (Customer c : custList) {
            if (predicate.test(c)) {
                customerList.add(c);
            }
        }
        return customerList;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Address add1 = new Address("Kolkata", "G.T.Road", 700231);
        Address add2 = new Address("chennai", "M.D.Road", 400291);

        Customer cus1 = new Customer("chaitali", 2, 402.36, add1);
        Customer cus2 = new Customer("shalini", 10, 4789.36, add2);

        List<Customer> custList = new ArrayList<>();
        custList.add(cus1);
        custList.add(cus2);

        custList.forEach(c -> System.out.println(c));
        System.out.println("after filtering--------------");

        Predicate<Customer> predicate = p -> p.getAddress().getCity().equalsIgnoreCase("chennai");
        List<Customer> list1 = filter1(custList, predicate);
        System.out.println(list1);

        System.out.println("changing pincode-------------------");
        Supplier<Long> supp = () -> 147520L;
        Predicate<Customer> pre = p1 -> p1.getAddress().getCity().equalsIgnoreCase("Kolkata");
        List<Customer> list2 = filter1(custList, pre);
        System.out.println(list2);
        for (Customer c1 : list2) {
            c1.getAddress().setPinCode(supp.get());
        }
        list2.forEach(c -> System.out.println(c));
        System.out.println("----------------");
        Function<Double, Double> func1 = f -> {
            double result = f / 50;
            return result;
        };
        for (Customer c2 : custList) {
            System.out.println(c2.getCustomerName() + " " + func1.apply(c2.getAmount()));
        }
    }
}