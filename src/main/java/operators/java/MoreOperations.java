
package operators.java;

import java.time.DayOfWeek;
import java.util.Scanner;

public class MoreOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number");
        int num1 = scanner.nextInt();
        System.out.println("Please enter the second number");
        int num2 = scanner.nextInt();
        System.out.println("Please enter the third number");
        int num3 = scanner.nextInt();

        int result = 0;
        result = num3 > ((num1 > num2) ? num1 : num2) ? num3 : ((num1 > num2) ? num1 : num2);
        System.out.println("The largest number is :" + result);

        printAreaPerRectangle(2.0,8.3);

        System.out.println("Please enter number ");
        int evenOdd = scanner.nextInt();
        printEvenOddNumber(evenOdd);

        System.out.println("Select day of the week number");
        int dayOfTheWeek = scanner.nextInt();
        printDayOfTheWeek(dayOfTheWeek);
    }

    public static void printAreaPerRectangle(double length, double breadth){

        System.out.println("The rectangle's perimeter is : " + 2*(length+breadth));
        System.out.println("The rectangle's area is : " + length * breadth);

    }
    public static void printEvenOddNumber(int evenOdd) {

        if (evenOdd % 2 == 0) {
            System.out.println("The entered number is even ");
        }
        else {
            System.out.println( "The entered number is odd ");
        }
    }
    public static void printDayOfTheWeek( int dayOfTheWeek){

              switch (dayOfTheWeek){
                  case 1:
                      System.out.println("Selected day is Monday");
                      break;
                  case 2:
                      System.out.println("Selected day is Tuesday");
                      break;
                  case 3:
                      System.out.println("Selected day is Wednesday");
                      break;
                  case 4:
                      System.out.println("Selected day is Thursday");
                      break;
                  case 5:
                      System.out.println("Selected day is Friday");
                      break;
                  case 6:
                     System.out.println("Selected day is Saturday");
                      break;
                  case 7:
                      System.out.println("Selected day is Sunday");
                      break;

                      default:
                      System.out.println("Not correct option");




        }

    }
}
