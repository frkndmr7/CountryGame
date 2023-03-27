import java.util.Random;

public class Joker {
    public static void getRandomCharacter(String str) {
        char[] characters = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            characters[i] = str.charAt(i);
        }

        // Create a Random object
        Random random = new Random();

        // Get a random index in the range [0, str.length() - 1]
        int index = random.nextInt(str.length()-1);

        // Return the character at the random index
        System.out.println(characters[index]);
        System.out.println(index+1);
    }
}
