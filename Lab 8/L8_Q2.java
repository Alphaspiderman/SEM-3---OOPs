package Lab_8;

import java.util.Scanner;

public class L8_Q2 {
    public static void main(String[] args) {
        CurrentDate date = new CurrentDate();
        try {
            date.createDate();
            System.out.println("Current Date: " + date.date);
        } catch (InvalidDayException e) {
            System.out.println("Invalid day");
        } catch (InvalidMonthException e) {
            System.out.println("Invalid month");
        }
    }
}

class InvalidDayException extends Exception {
}

class InvalidMonthException extends Exception {
}

class CurrentDate {
    int day, month, year;
    String date;

    void createDate() throws InvalidDayException, InvalidMonthException {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        this.year = sc.nextInt();

        System.out.print("Enter month: ");
        this.month = sc.nextInt();
        if (this.month < 1 || this.month > 12) {
            throw new InvalidMonthException();
        }

        System.out.print("Enter day: ");
        this.day = sc.nextInt();
        // check for months with 31 days
        if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8
                || this.month == 10 || this.month == 12) {
            if (this.day < 1 || this.day > 31) {
                throw new InvalidDayException();
            }
        }
        // check for months with 30 days
        else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
            if (this.day < 1 || this.day > 30) {
                throw new InvalidDayException();
            }
        } 
        // check for feburary
        else if (this.month == 2) {
            // check for leap year
            if (this.year % 4 == 0) {
                if (this.day < 1 || this.day > 29) {
                    throw new InvalidDayException();
                }
            } else {
                if (this.day < 1 || this.day > 28) {
                    throw new InvalidDayException();
                }
            }
        }

        this.date = this.day + "/" + this.month + "/" + this.year;
    }
}