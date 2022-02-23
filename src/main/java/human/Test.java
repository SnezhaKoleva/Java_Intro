package human;

import java.util.Scanner;

public class Test  {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        Person ani = new Person("Ani");
        Person bobi =new Person("Bobi");


        System.out.println(" Please enter food");
        String food1= scanner.nextLine();
        ani.eatFood("Ani",food1);


        System.out.println(" Please enter food");
        String food2= scanner.nextLine();
        bobi.eatFood("Bobi",food2);
    }


}
