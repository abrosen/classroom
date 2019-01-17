import java.util.Scanner;

public class DateChecker {

    public static String getDate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a date");
        String date = scanner.nextLine();

        return date;
    }

    public static boolean isLeapYear(int year) {
        /*if(year % 400 == 0) {
            return true;
        } else if(year % 100 == 0){
            return false;
        } else if(year % 4 == 0) {
            return true;
        } else {
            return false;
        }*/





        if(year % 4 == 0 ) {  // probably a leap year!
            if(year % 100 == 0){
               if(year % 400 == 0){
                   return true;
               } else {
                   return false;
               }
            } else {
                return true;
            }
        }

        return false;
    }


    public static boolean isValidDate(int month, int day, int year) {
        if(month < 1 || month > 12) {
            return false;
        }
        if(day < 1) {
            return false;
        }
        if(month == 4 || month == 6 || month == 9 || month == 11) {
            if(day > 30){
                return false;
            } else{
                return true;
            }
        } else if(month  == 1  || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if(day > 31){
                return false;
            } else{
                return true;
            }
        } else {  // It's FEB!
            if(day <= 28) {
                return true;
            } else if(day == 29) {  // check if leap year!
                return isLeapYear(year);
            } else {
                return false;
            }
        }


    }

    public static void main(String[] args) {
        // Get input from user
        String date =  getDate();
        // Separate date into month, day, year
        // 0123456789
        // mm/dd/yyyy
        int month = Integer.parseInt(date.substring(0,2));
        int day = Integer.parseInt(date.substring(3,5));
        int year = Integer.parseInt(date.substring(6));


        boolean valid =  isValidDate(month, day, year);
        System.out.println(valid);
    }


}
