package encapsulationHomeWork;

public class Player {

    private static Player player;
    private String name;
    public String endurance="Endurance";
    public String sprint="Sprint";
    public String dribble="Dribble";
    public String passing="Passing";
    public String shooting="Shooting";
    private int rangeEndurance;
    private int rangeSprint;
    private int rangeDribble;
    private int rangePassing;
    private int rangeShooting;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty())
            this.name = name;
        else {
            System.out.printf("A name should not be empty. ");
        }
    }

    public int getRangeEndurance() {
        return rangeEndurance;
    }

    public void setRangeEndurance(int rangeEndurance) {
        if (rangeEndurance>=0 && rangeEndurance<=100)
        this.rangeEndurance = rangeEndurance;
        else {
            System.out.printf("%s should be between 0 and 100. \n",this.endurance);
        }
    }

    public int getRangeSprint() {
        return rangeSprint;
    }

    public void setRangeSprint(int rangeSprint) {
        if (rangeSprint>=0 && rangeSprint<=100)
        this.rangeSprint = rangeSprint;
        else {
            System.out.printf("%s should be between 0 and 100. \n",this.sprint);

        }
    }

    public int getRangeDribble() {
        return rangeDribble;
    }

    public void setRangeDribble(int rangeDribble) {
        if (rangeDribble>=0 && rangeDribble<=100)
        this.rangeDribble = rangeDribble;
        else {
            System.out.printf("%s should be between 0 and 100. \n",this.dribble);
        }
    }

    public int getRangePassing() {
        return rangePassing;
    }

    public void setRangePassing(int rangePassing) {
        if (rangePassing>=0 && rangePassing<=100)
            this.rangePassing=rangePassing;
        else {
            System.out.printf("%s should be between 0 and 100. \n",this.passing);
        }
        }public int getRangeShooting() {
        return rangeShooting;
    }

    public void setRangeShooting(int rangeShooting) {
        if (rangeShooting>=0 && rangeShooting<=100)
        this.rangeShooting = rangeShooting;
        else {
            System.out.printf("%s should be between 0 and 100. \n",this.shooting);



        }
    }public Player(String name,int rangeEndurance,int rangeSprint,int rangeDribble
            ,int rangePassing,int rangeShooting){
        setName(name);
        setRangeEndurance(rangeEndurance);
        setRangeSprint(rangeSprint);
        setRangeDribble(rangeDribble);
        setRangePassing(rangePassing);
        setRangeShooting(rangeShooting);

    }

     public  static double AverageLevel(Player player){
        double averageLevel = 0;
        int averageStats = 0;
     averageStats=(player.getRangeEndurance()+player.getRangeSprint()+player.getRangeDribble()+
             player.getRangePassing() +player.getRangeShooting());
         if (averageStats==0){ averageLevel=0 ;}else {
         averageLevel= averageStats / 5 ;}

    return averageLevel;

} public boolean correctStats(){
      return rangeEndurance >= 0 && rangeEndurance <=100 &&
              rangeSprint >=0 && rangeSprint <=100 &&
              rangeDribble >=0 && rangeDribble <=100 &&
              rangePassing >=0 && rangePassing <=100 &&
              rangeShooting >=0 && rangeShooting <=100 ;
    }
}
