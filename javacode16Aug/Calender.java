//package com.niit.looping;

import java.util.Scanner;

class Calender {

    //write code to display the calender
    public void displayCalender(){

        //declare variables for month, year, firstDay and daysInMonth
        String month;
        int year;
        int firstDay;
        int daysInMonth = 0;
        //Declare Scanner object to take input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month(Press 1 for Jan, 2 for Feb, 12 for Dec......):");
        //take input for month
        month = sc.nextLine();
        System.out.println("Enter Year:");
        //take input for year
        year = sc.nextInt();
        System.out.println("Enter Day of week(Press 1 for Mon, 2 for Tue, 7 for Sun......):");
        //take input for firstDay
        firstDay = sc.nextInt();

        switch (month)
	    {
            
	        case "1":
                month = "January";
                daysInMonth = 31;
                break;
            case "2":
                month = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            case "3":
                month = "March";
                daysInMonth = 31;
                break;
            case "4":
                month = "April";
                daysInMonth = 30;
                break;
            case "5":
                month = "May";
                daysInMonth = 31;
                break;
            case "6":
                month = "June";
                daysInMonth = 30;
                break;
            case "7":
                month = "July";
                daysInMonth = 31;
                break;
            case "8":
                month = "August";
                daysInMonth = 31;
                break;
            case "9":
                month = "September";
                daysInMonth = 30;
                break;
            case "10":
                month = "October";
                daysInMonth = 31;
                break;
            case "11":
                month = "November";
                daysInMonth = 30;
                break;
            case "12":
                month = "December";
                daysInMonth = 31;
	        break;
        }
        System.out.print("Invalid date");

        // Display the month and year
        System.out.println("                      "+ monthDisplay + " " + year);
            
        // Display the lines
        System.out.println("_____________");
        
        // Display the days of the week
        System.out.println("Sun     Mon     Tue     Wed     Thu     Fri     Sat");
        
        // Print spaces depending on the day the month starts.
        int firstDayEachMonth = (daysMonth + firstDayYear)%7;
        for (int space = 1; space <= firstDayEachMonth; space++)
            System.out.print("   ");

        // Print the days 
        for (int daysDisplay = 1; daysDisplay <= daysMonth; daysDisplay++)
        {
            if (firstDayYear%7 == 0)
                System.out.println();
            
            System.out.printf("%3d      ", daysDisplay);
            firstDayYear += 1;
        }
        System.out.println();
    }
        
}
    }

    public static void main(String[] args) {
        CalenderClass calenderClass = new CalenderClass();
        calenderClass.displayCalender();

    }

}
