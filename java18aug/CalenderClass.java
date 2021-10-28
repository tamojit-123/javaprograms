import java.util.Scanner;

public class CalenderClass {

    // write code to display the calender
    public void displayCalender() {

        // declare variables for month, year, firstDay and daysInMonth
        // Declare Scanner object to take input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month(Press 1 for Jan, 2 for Feb, 12 for Dec......):");
        int month = input.nextInt();

        System.out.println("Enter Year:");
        int year = input.nextInt();

        System.out.println("Enter Day of week(Press 1 for Mon, 2 for Tue, 7 for Sun......):");
        int week = input.nextInt();

        // we set the value of the amount of days in a month
        int dayOfTheMonth = 0;

        // we set value of the month
        String monthDisplay = "";

        // then we find name of each month and number of days

        switch (month) {
            case 1:
                monthDisplay = "January";
                dayOfTheMonth = 31;
                break;

            case 2:
                monthDisplay = "February";
                if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                    dayOfTheMonth = 29;
                    break;
                }

                else {
                    dayOfTheMonth = 28;
                }
                break;

            case 3:
                monthDisplay = "March";
                dayOfTheMonth = 31;
                break;

            case 4:
                monthDisplay = "April";
                dayOfTheMonth = 30;
                break;

            case 5:
                monthDisplay = "May";
                dayOfTheMonth = 31;
                break;

            case 6:
                monthDisplay = "June";
                dayOfTheMonth = 30;
                break;

            case 7:
                monthDisplay = "July";
                dayOfTheMonth = 31;
                break;

            case 8:
                monthDisplay = "August";
                dayOfTheMonth = 31;
                break;

            case 9:
                monthDisplay = "September";
                dayOfTheMonth = 30;
                break;

            case 10:
                monthDisplay = "October";
                dayOfTheMonth = 31;
                break;

            case 11:
                monthDisplay = "November";
                dayOfTheMonth = 30;
                break;

            case 12:
                monthDisplay = "December";
                dayOfTheMonth = 31;
                break;
            // If the month is not recognized, dialog box will be displayed, and then exits
            // program.
            default:
                System.out.print("Invalid: Your month is not recognized. ");
        }
        // We will Display the month and year
        System.out.println("                      " + monthDisplay + " " + year);

        // Display the days of the week
        System.out.println("Mon\tTue\tWed\tThu\tFri\tSat\tSun\t");

        // Print spaces depending on the day the month starts
        // ((dayOfTheMonth + firstDayOfTheMonth)%7 == 0) || dayOfTheMonth == daysInMonth
        for (int day = 1; day <= dayOfTheMonth; day++) {
            if (day == 1) {
                for (int w = 1; w <= week; w++) {
                    System.out.print("\t");
                }

            }
            if (day < 10) {
                System.out.print("" + day + "\t");
            } else
                System.out.print("" + day + "\t");

            if (((day + week) % 7 == 0) || day == dayOfTheMonth) {
                System.out.println("\t");
            }
        }
    }

    public static void main(String[] args) {
        CalenderClass calenderClass = new CalenderClass();
        calenderClass.displayCalender();

    }

}