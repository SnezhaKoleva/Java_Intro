package qa.automation;


import java.util.Scanner;

public class MyFirstJava {
    public static void main(String[] args) {

        System.out.println("Please enter your name");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("Please enter your hobby");
        String hobby = scanner.next();

        System.out.println("Hi " + name + "\n I think" +  " " + hobby +" is a nice hobby " );

        }
    }

