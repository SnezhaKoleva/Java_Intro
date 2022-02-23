package human;

import aimals.Mammal;

public class
Person extends Mammal {


    public Person(String name) {
        super(name);}

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    protected void eatFood(String hungryName, String food) {
        super.eatFood(hungryName,food);
    }

}
