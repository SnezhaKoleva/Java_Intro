package encapsulationHomeWork;

public class Player {

    private static Player player;
    private String name;
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
            System.out.println("Endurance should be between 0 and 100.");
        }
    }

    public int getRangeSprint() {
        return rangeSprint;
    }

    public void setRangeSprint(int rangeSprint) {
        if (rangeSprint>=0 && rangeSprint<=100)
        this.rangeSprint = rangeSprint;
        else {
            System.out.println("Sprint should be between 0 and 100. ");

        }
    }

    public int getRangeDribble() {
        return rangeDribble;
    }

    public void setRangeDribble(int rangeDribble) {
        if (rangeDribble>=0 && rangeDribble<=100)
        this.rangeDribble = rangeDribble;
        else {
            System.out.println("Dribble should be between 0 and 100. ");
        }
    }

    public int getRangePassing() {
        return rangePassing;
    }

    public void setRangePassing(int rangePassing) {
        if (rangePassing>=0 && rangePassing<=100)
            this.rangePassing=rangePassing;
        else {
            System.out.println("Passing should be between 0 and 100.");
        }
        }public int getRangeShooting() {
        return rangeShooting;
    }

    public void setRangeShooting(int rangeShooting) {
        if (rangeShooting>=0 && rangeShooting<=100)
        this.rangeShooting = rangeShooting;
        else {
            System.out.println("Shooting should be between 0 and 100.");



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

}

}


