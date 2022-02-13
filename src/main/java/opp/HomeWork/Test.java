package opp.HomeWork;

public class Test {



    public static void main(String[] args){



      // Owner ani = new Owner("Ani");

        Cat murfy = new Cat( "Murfy",new Owner("Ani"),2, true);

      //  murfy.setOwner(ani);

        Cat boby = new Cat( "Boby",new Owner("Reni"),5,false );

       murfy.printData();
       murfy.homeStay();
       murfy.sleep();
       boby.sleep();
       boby.printData();
    }
}
