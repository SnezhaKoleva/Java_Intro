package human;

import animals.Mammal;

public class Person extends Mammal {

    public Person(String name) {
        super(name);}

    @Override
    protected void eatFood(String hungryName, String food) {
        super.eatFood(hungryName,food);
    }

}
