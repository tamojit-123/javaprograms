//package com.niit.wrapper.wrapper;
//
//import java.util.Objects;
//
//public class NumberValidator {
//
//    //validation rules to be written
//    public int validateNumber(String input) {
//        if (Objects.equals(input, "")) {
//            return -1;
//        }
//        long isbnNumber = Long.parseLong(input);
//        int count = 10;
//        long result = 0;
//        while (count <= 10) {
//            long last = isbnNumber % 10;
//            result = result + last * count;
//            isbnNumber = isbnNumber / 10;
//            count--;
//        }
//        if (result % 11 == 0) {
//            return 1;
//
//        } else {
//            return 0;
//        }
//    }
//}

package com.niit.wrapper.wrapper;

public class NumberValidator {

    //validation rules to be written
    public int validateNumber(String input) {
        if (input == "") {
            return -1;
        }
        long isbn = Long.parseLong(input);
        //int i = 10;
        long calculate = 0;
        for (int i = 10; i <= 10; i--) {
            long last = isbn % 10;
            calculate = calculate + last * i;
            isbn = isbn / 10;
        }

        if (calculate % 11 == 0) {
            return 1;

        }
        else {
            return 0;
        }
    }
}