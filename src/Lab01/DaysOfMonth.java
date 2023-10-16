package Lab01;

import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        String monthInput;

        while (true) {
            System.out.print("Enter a year: ");
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                if (year >= 0) {
                    break;
                }
            }
            System.out.println("Invalid year. Please enter a non-negative number.");
            scanner.next();
        }

        while (true) {
            System.out.print("Enter a month: ");
            monthInput = scanner.next().toLowerCase();
            int month = getMonthNumber(monthInput);

            if (month != -1) {
                int daysInMonth = getDaysInMonth(month, year);
                if (daysInMonth != -1) {
                    System.out.println(month + "/" + year + " has " + daysInMonth + " days.");
                    break;
                }
            }

            System.out.println("Invalid month. Please enter a valid month (e.g., January, Jan., Jan, 1).");
        }
    }

    public static int getMonthNumber(String monthInput) {
        String[] months = {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
        String[] monthAbbreviations = {"jan.", "feb.", "mar.", "apr.", "may", "jun.", "jul.", "aug.", "sep.", "oct.", "nov.", "dec."};
        String[] monthShortNames = {"jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec"};

        for (int i = 0; i < months.length; i++) {
            boolean isMonth = months[i].equals(monthInput);
            boolean isAbbreviation = monthAbbreviations[i].equals(monthInput);
            boolean isShortName = monthShortNames[i].equals(monthInput);
            boolean isNumName = String.valueOf(i + 1).equals(monthInput);
            if (isMonth || isAbbreviation || isShortName || isNumName) {
                return i + 1;
            }
        }
        return -1;
    }

    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 4, 6, 9, 11:
                return 30;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) return 29;
                else return 28;
            default:
                System.out.println("Invalid Month.");
        }
        return 0;
    }

}
