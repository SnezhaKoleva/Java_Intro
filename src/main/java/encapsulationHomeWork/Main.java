package encapsulationHomeWork;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);



        Player lionel_Messi = new Player("Lionel_Messi",75,85,
                84,92,67);

        Player gerard_Pique =new Player( "Gerard_Pique",195,
                82,82,89,68);

        Team barcelona=new Team("Barcelona");




        System.out.println("Choose a team to add a player ");
        String  missingTeam = scanner.nextLine();

        Pattern pattern=Pattern.compile("Barcelona",Pattern.CASE_INSENSITIVE);


        Matcher matcher=pattern.matcher(missingTeam);
        Boolean matchFound=matcher.find();

        if (!matchFound){

            String missTeam=printMissingTeam(missingTeam);}
        else {
          //  Enter Barcelona OR barcelona OR BARCELONA to receive the expected output

         //   first case
            barcelona.addPlayer(lionel_Messi);
            barcelona.addPlayer(gerard_Pique);
            barcelona.removePlayer(gerard_Pique);
            Team.printRating(barcelona);

        //    second case - provide new information for Gerard_Pique-Gerard_Pique;195;82;82;89;68


        }

        System.out.println("Enter a team to show it's rating");
        String statsTeam=scanner.nextLine();

        Matcher matcher1=pattern.matcher(statsTeam);
        Boolean statsFound=matcher1.find();
        if (!statsFound){

            String noStatsToShow=printMissingTeam(statsTeam);
        }else {

            //  Enter Barcelona OR barcelona OR BARCELONA to receive the expected output
            // third case
            Team.printRating(barcelona);
        }


    }

        public static String printMissingTeam (String chosenTeam){

        String output = null;
        System.out.printf("Team %s does not exist.%n", chosenTeam);
        return output;
        }

    }



