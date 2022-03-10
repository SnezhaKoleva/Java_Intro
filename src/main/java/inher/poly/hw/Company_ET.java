package inher.poly.hw;

public class Company_ET extends Company implements Invoice {
    private String ownerName;
    private double initialCapital;
    private double currentCapital;
    private static int counter=1;

    public static int getCounter() {
        return counter;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        if (!ownerName.isEmpty())
        this.ownerName = ownerName;
        else {
            System.out.println("Owner's name : invalid data !");
        }
    }

    public double getInitialCapital() {
        return initialCapital;
    }

    public void setInitialCapital(double initialCapital) {
        this.initialCapital = initialCapital;
    }

    public double getCurrentCapital() {
        return currentCapital;
    }

    public void setCurrentCapital(double currentCapital) {
        this.currentCapital = currentCapital;
    }


    public Company_ET(String name, String incorporationDate, String bulstat ,String ownerName,
                      double initialCapital,double currentCapital) {
        super(name, incorporationDate, bulstat);
        setOwnerName(ownerName);
        setInitialCapital(initialCapital);
        setCurrentCapital(currentCapital);
    }
   public double calculateProfit(){
        double result=0;
        result=currentCapital-initialCapital;
       System.out.printf("%s profit is %f%n",getName(),result);
       return result;
   }

    @Override
    public void generateInvoice() {
        System.out.printf(" For company %s number of invoices : %d %n"
                ,getName(), counter++);
    }
}
