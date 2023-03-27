import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CountryGame quiz = new CountryGame();

        Joker joker = new Joker();


        // Output input by user
        Scanner cevap = new Scanner(System.in);
        System.out.println("Each level has 3 hints. Type \"hint\" to use.");
        System.out.println("You can use one hint for each information.");
        System.out.println("Gives a random letter of the current information on each hint");
        System.out.println("2 points for each question, 1 point if you know using hints");
        System.out.println("If you are not going to use hint, press enter to continue.");
        System.out.println("If you score 66 points or more when the game is over, you win the game.");
        System.out.println("Press enter to start the game");
        String start = cevap.nextLine();
        if (start.equals("start")) {
            System.out.println("Good luck! ");
            quiz.game();
            System.out.println("Enter capital,language,continent,currency respectively: ");
        } else if (start.equals("")) {
            System.out.println("Good luck! ");
            System.out.println("Enter capital,language,continent,currency respectively: ");
            quiz.game();
        } else {
            System.out.println("Good luck! ");
            System.out.println("Enter capital,language,continent,currency respectively: ");
            quiz.game();
        }


    }
}
