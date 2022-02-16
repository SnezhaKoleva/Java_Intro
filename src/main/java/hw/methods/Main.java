package hw.methods;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your password");
        String passWord = scanner.nextLine();
        MyMethods.controlPassWord(passWord);



        double[] number = new double[3];
        System.out.println("Please enter three numbers");
        for (int i = 0; i < number.length; i++)
        {number[i] = scanner.nextDouble();
        }
        MyMethods.numbersEqualPositive(number);



        System.out.println("Please enter two numbers");
        Double a1 = scanner.nextDouble();
        Double b1 = scanner.nextDouble();
        MyMethods.doubleAverage(a1, b1);
        MyMethods.doubleSum(a1, b1);
        }


    }