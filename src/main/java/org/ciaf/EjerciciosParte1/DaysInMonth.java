package org.ciaf.EjerciciosParte1;

public class DaysInMonth {
    public static int calculateDaysInMonth(int month, int year) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        else if (month == 2) {
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        } else {
            return -1;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        int daysinmonth = calculateDaysInMonth(month,year);
        if (daysinmonth!= -1){
            System.out.println("The month " + month + " of the year " + year + " has " + daysinmonth + " days.");

        } else {
            System.out.println("invalid month");
        }
        scanner.close();

    }
}
