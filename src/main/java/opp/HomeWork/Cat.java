package opp.HomeWork;

public class Cat extends Animal {
    public Cat(String nameCat, Owner owner, int age, boolean black) {
        super(nameCat, owner, age, black);
    }

    public void homeStay(){
        System.out.printf("Cat %s likes staying at home .%n",getNameCat());
    }

}
