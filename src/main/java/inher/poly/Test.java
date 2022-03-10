package inher.poly;

public class Test {

    public static void main(String[] args) {

       Company_ET comp1=new Company_ET("comp1","01.01.2022","AZ12345677",
               "Abv",122234,777777777) ;

       comp1.calculateProfit();
       comp1.generateInvoice();
       comp1.generateInvoice();
    }


}
