package math.hw;

import java.util.Scanner;

public class TestMath {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter a number");
        int a = scanner.nextInt();

        System.out.println("Please enter a number");
        int b = scanner.nextInt();

        System.out.println("Please enter a number");
        int c = scanner.nextInt();

        MathMethods.returnMaxNumber(a,b,c);



        MathMethods.calculateTriangleAreaByTwoSidesAndAngle(5,7,45) ;



        System.out.println("Please select a number to set the array length");
        int arrayLength= scanner.nextInt();

        MathMethods.printTheRandomNumbers(arrayLength);





    }
}