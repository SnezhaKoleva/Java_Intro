package opp.HomeWork;

public class Owner implements AnimalActions {

    private String ownerName;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        if (  !ownerName.isBlank()){
            this.ownerName = ownerName;
        } else {
            System.out.println("Invalid data !");
        }

    }
      public Owner(String ownerName){
        setOwnerName( ownerName);
      }


    @Override
    public void sleep() {
        System.out.println(getOwnerName() + " works home office.");
    }
}






