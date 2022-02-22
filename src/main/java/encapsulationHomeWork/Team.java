package encapsulationHomeWork;

import java.util.LinkedList;

public class Team {

    private String name;
    private LinkedList<Player> teamPlayer = new LinkedList<>();



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

    public LinkedList<Player> getTeamPlayer() {
        return teamPlayer;
    }


    public Team(String name) {
        setName(name);
    }



    public void addPlayer( Player player) {
        if (player.correctStats()){
        this.teamPlayer.add(player);

      /*  System.out.printf("%s ; %s ; %d;%d;%d;%d;%d %n ", this.getName(), player.getName(),
                    player.getRangeEndurance(), player.getRangeSprint(),
                    player.getRangeDribble(), player.getRangePassing(), player.getRangeShooting()); */
        }}

    public void removePlayer( Player player)
        {
        if (this.teamPlayer.contains(player)) {
            this.teamPlayer.remove(player);
        } else {
            System.out.printf("Player %s is not in %s team. \n", player.getName(), this.name);
        }

        }

    public static void printRating(Team team) {
        double sum = 0;
        double resultTeam;

        for (Player player : team.teamPlayer){
        sum+=Player.AverageLevel(player);}

        if (sum==0){resultTeam=0;}
        else {
            resultTeam = sum / team.teamPlayer.size();}

        System.out.printf("%s - %d %n ",team.getName(),Math.round(resultTeam));
        }

    }