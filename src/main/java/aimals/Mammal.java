package aimals;

public class Mammal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
        this.name = name;}
        else {
            System.out.println(" Invalid data !");
        }
    }
    public Mammal(String name){
        setName(name);
    }

    protected void eatFood(String hungryName, String food){

        System.out.printf("%s eats %s%n",hungryName,food);

    }
}
