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


        double [] a1=new double[4];

        System.out.println("Please enter four numbers");
        for (int i = 0; i < a1.length; i++) {
            a1[i]= scanner.nextDouble();
        }

        MyMethods.calculateAverage(a1);

        }

        }


