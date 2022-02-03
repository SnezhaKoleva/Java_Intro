package data.types;

import java.util.Scanner;

public class StringActions {
       public static void main(String[] args) {

           String book = "Your favorite book is unknown";
           System.out.println( book + "\nPlease enter your favorite book");

           Scanner scanner = new Scanner(System.in) ;
           String bookName = scanner.nextLine();

           String replaceString = book.replace("unknown",bookName);
           System.out.println(replaceString);

           System.out.println("Please enter your favourite movie");
           String movieName = scanner.nextLine();

           System.out.println(movieName.equals(bookName));

           String [] stringArray = book.split(" ");
          /* Without format
          System.out.println( "\"" + book +"\" " + "has " + stringArray.length +" words"); */

          //By using format
           System.out.println(String.format("\" %s \" has %d words ",book ,stringArray.length));
          // System.out.printf("\" %s \"has %d words ",book ,stringArray.length);


           String movie = "Are you sure that your favourite movie and book are :";
           System.out.println( movie.concat(movieName).concat(" and " + bookName));


       }
}



