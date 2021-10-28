package productImpl;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class WithLambdaExpression {
    public static void main(String[] args) {

        List<Product> listprod = new ArrayList<>();

/*		Product p11 =  new Product(100,"xx",1000);
		Product p12 =  new Product(90,"xx2",900);
		Product p13 =  new Product(120,"xx1",4000);

		listprod.add(p11);
		listprod.add(p12);
		listprod.add(p13);*/

//or in this way
        listprod.add(new Product(1, "Laptop", 55000));
        listprod.add(new Product(3, "Desktop", 45000));
        listprod.add(new Product(2, "NoteBook", 100000));


        System.out.println("Sorting on the basis of Name:");
        Collections.sort(listprod, (p1, p2) ->

                {
                    return p2.getPname().compareTo(p1.getPname());
                }

        );

        for (Product plist : listprod) {
            System.out.println(plist.getPid() + "\t" + plist.getPname() + "\t" + plist.getPrice());
        }

        System.out.println("Sorting on the basis of Price");
        Collections.sort(listprod, (p1, p2) ->

        {
            return (int) (p2.getPrice() - p1.getPrice());
        });

        for (Product plist1 : listprod) {
            System.out.println(plist1.getPid() + "\t" + plist1.getPname() + "\t" + plist1.getPrice());
        }

        // listprod.forEach((p) -> System.out.println(" " + p.toString()));

    }
}
