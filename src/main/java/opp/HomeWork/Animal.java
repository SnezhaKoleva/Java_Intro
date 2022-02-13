package opp.HomeWork;

public class Animal implements AnimalActions {

    public Animal(String nameCat, Owner owner, int age, boolean black) {
        setNameCat(nameCat);
        setOwner(owner);
        setAge(age);
        setBlack(black);

    }

    private String nameCat;
    private Owner owner;
    private int age;
    private boolean black;

    public String getNameCat() {
        return nameCat;
    }

    public void setNameCat(String nameCat) {
        if (!nameCat.isEmpty()) {
            this.nameCat = nameCat;
        } else {
            System.out.println("Invalid data !");
        }

    }
    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>0){
        this.age = age;}
        else {
            System.out.println("Invalid data !");
        }
    }

    public boolean isBlack() {
        return black;
    }

    public void setBlack(boolean black) {
        this.black = black;
    }
    public void printData(){
        System.out.printf("Cat  %s age of %d lives with it's owner %s.%n ",nameCat,age, getOwner().getOwnerName());
        if (isBlack()){
            System.out.printf("%s is a black cat .\n",nameCat);
        }


    }

    @Override
    public void sleep() {

        System.out.printf("Cat %s is sleeping all the day %n",nameCat);

    }
}
