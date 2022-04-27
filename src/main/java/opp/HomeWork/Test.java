package opp.HomeWork;

public class Test {

    public static void main(String[] args) {
        Cat murfy = new Cat( "Murfy",new Owner("Ani"),2,true);
        Cat boby = new Cat("Boby",new Owner("Reni"),5,false);

        murfy.printData();
        murfy.homeStay();
        murfy.sleep();
        Owner ani = new Owner("Ani");
        ani.sleep();

        boby.printData();
        boby.homeStay();
        boby.sleep();
        Owner reni =new Owner("Reni");
        reni.sleep();

    }
}
