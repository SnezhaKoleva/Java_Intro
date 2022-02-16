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



        public static double doubleAverage ( double a1, double b1)
        {
            System.out.println("The average is : " + (a1 + b1) / 2);
            return (a1 + b1) / 2;
        }

        public static double doubleSum ( double a1, double b1){

            System.out.println("The sum is : " + (a1 + b1));

            return a1 + b1;

        }


    }





