package hw.methods;

public class MyMethods {


    public static void controlPassWord(String passWord) {

        if (!(passWord.length() > 8 && passWord.matches(".*[0-9].*")
                && passWord.matches(".*[a-z].*") && passWord.matches(".*[A-Z].*")
                && passWord.matches(".*[!,@,#,$,%,^,&,*, ].*")
                && ! passWord.matches(".*[ ].*"))) {
            System.out.println("The string does not match the criteria for password");

        } else {
            System.out.println("The string matches the  criteria for password");
        }
    }



    public static void numbersEqualPositive(double number[]) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] > 0) {
                System.out.printf("Number %f is positive %n", number[i]);

            } else if (number[i] < 0) {
                System.out.printf("Number %f is negative %n", number[i]);
            } else {
                System.out.printf("This  %f is zero %n", number[i]);
            }
        }
        for (int i = 1; i < number.length - 1; i++) {
            if (number[i] == number[i + 1] && number[i] == number[i - 1]) {
                System.out.println("The entered numbers are equal ");
            } else {
                System.out.println("The entered numbers are not equal");
            }
        }
    }


    public static double calculateAverageSum(double resultAverage1, double resultAverage2)
    {
        double resultAverageSum = resultAverage1 + resultAverage2;
        System.out.printf("The sum of the averages is :" +resultAverageSum);
        return resultAverageSum;
    }

    public static void calculateAverage ( double a1[]) {
            double resultAverage1= 0;
            double resultAverage2= 0;
            for (int i = 0; i < a1.length - 1; i++) {
                resultAverage1 =(a1[0] + a1[1]) / 2;
                resultAverage2 =(a1[2] + a1[3])/2;}
                System.out.println("The average of the first two numbers is : " + resultAverage1);
            System.out.println("The average of the second two numbers is : " + resultAverage2);

    MyMethods.calculateAverageSum(resultAverage1,resultAverage2);

    }







    }








