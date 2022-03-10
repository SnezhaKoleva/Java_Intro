package math.hw;

import java.util.Random;


public class MathMethods {


    public static void returnMaxNumber(int a,int b,int c){
        int result =0 ;
        result= c > Math.max(a,b) ? c : Math.max(a,b) ;

        System.out.println("The largest number is " + result);



    }
    public static int calculateTriangleAreaByTwoSidesAndAngle(int x,int y,double angle){
        int result =0;
        result= (int) ( 0.5 * x * y * Math.sin(Math.toRadians(angle)));
        System.out.println("The triangle's area is :" + result );
        return result;
    }



    public static void printTheRandomNumbers(int arrayLength){

        System.out.println("The added random numbers are : ");
        Random random = new Random();
        int randomNumber = 0;

        for (int i = 0; i<arrayLength ; i++) {

            randomNumber=random.nextInt(0,100) ;

            System.out.print(randomNumber + ";");
        }


    }


}
