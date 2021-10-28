package userauth;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LoginImpl {

    //function arguments (list, 'D')
    public static List<Login> retreiveWithName(List<Login> lg, Predicate<Login> predicatename) {
        List<Login> ulogin = new ArrayList<>(); //creating  an empty arraylist
        for (Login login : lg) {

            if (predicatename.test(login)) {
                ulogin.add(login);
            }

        }
        return ulogin;

    }

    public static void main(String[] args) {
		/*Consumer<String> printcustomer = data->System.out.println(data);
		List<String> cities = Arrays.asList("Hyderabad","Mumbai","Delhi","Ahmebad","Mirzapur");
		cities.forEach(printcustomer);


		Consumer<Integer> value = a->System.out.println(a);
		value.accept(10);

		System.out.println("=====================================");
		Consumer<List<Integer>> dd  = list->
		{
			for(int i=0;i<list.size();i++)
			{
				list.set(i, 2* list.get(i));

			}
			System.out.println(list);
		};
		List<Integer> intcities = Arrays.asList(1,2,3,4,5);
		dd.accept(intcities);


	}*/
		/*Supplier<Integer> rv =()-> new Random().nextInt(100);
		System.out.println(rv.get());*/

        List<Login> login1 = new ArrayList<>();
        login1.add(new Login("niit", "niit123"));
        login1.add(new Login("Durga", "apc123"));
        login1.add(new Login("Durga", "durga123"));
        login1.add(new Login("Debolina", "durga123"));


        List<Login> user = retreiveWithName(login1, (Login l) -> l.getUname().equals("D"));
        System.out.print(user);


    }
}

