package javacore;

public class PatternMatchingForSwitch {
    public static void main(String[] args) {
        {
            // Set the value of the day variable to 3
            int day = 3;
            // Use a switch statement to determine the name of
            // the day of the week
            switch (day) {
                case 1 -> System.out.println("Monday");   // If day equals 1, print "Monday"
                case 2 -> System.out.println("Tuesday");  // If day equals 2, print "Tuesday"
                case 3 -> System.out.println("Wednesday");// If day equals 3, print "Wednesday"
                case 4 -> System.out.println("Thursday"); // If day equals 4, print "Thursday"
                case 5 -> System.out.println("Friday");   // If day equals 5, print "Friday"
                case 6 -> System.out.println("Saturday"); // If day equals 6, print "Saturday"
                case 7 -> System.out.println("Sunday");   // If day equals 7, print "Sunday"
                default -> System.out.println("Invalid day"); // If day is not in the range 1-7, print "Invalid day"
            }
        }
    }
}
