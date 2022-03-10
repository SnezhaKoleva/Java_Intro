package inher.poly;

public class Company {

    private String name ;
    private String incorporationDate;
    private String bulstat;

    public String getName() {

        return name;}


    public void setName(String name) {
        if (!name.isEmpty())
        this.name=name;
        else {
            System.out.println("Name :invalid data !");
        }
    }

    public String getIncorporationDate() {
        return incorporationDate;
    }

    public void setIncorporationDate(String incorporationDate) {
        if (incorporationDate.length()==10 && incorporationDate.matches(".*[0-9].*")
        && incorporationDate.matches(".*[.].*"))
        this.incorporationDate = incorporationDate;
        else {
            System.out.println("Date of incorporation: invalid data !");
        }
    }

    public String getBulstat() {
        return bulstat;
    }

    public void setBulstat(String bulstat) {
             if ( !(bulstat.length()==10
                &&  bulstat.matches(".*[A-Z].*")
                &&  bulstat.matches(".*[0-9].*")
                && !bulstat.matches(".*[!,@,#,$,%,^,&,*,-,_,<,>,/,\\,|,(,),.,,,].*")
                && !bulstat.matches(".*[ ].*"))){

            System.out.println("Bulstat : Invalid data !");
        }
        else
        {this.bulstat = bulstat;
        }


    }
    public Company(String name,String incorporationDate,String bulstat){
        setName(name);
        setIncorporationDate(incorporationDate);
        setBulstat(bulstat);
    }
}
