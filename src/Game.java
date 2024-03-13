import java.util.*;
public class Game {

    private final String[] WORDLIST = {"worry", "sorry", "watch", "catch", "paper", "daily",
            "devil", "tires", "mouse", "house", "foyer", "mummy", "trite", "coyly", "codes"};


    // Board.addWord(guess.getguesses(), guess.colors())

    // guess(input, answer)
    private Word answer;
    private Scanner scan;
    private String guess;
    private Guess guessedWord;


    public Game() {
        int num = (int) (Math.random() * WORDLIST.length);
        answer = new Word(WORDLIST[num]);
        scan = new Scanner(System.in);
    }


    public void start() {
        System.out.println("Welcome to wordle!");
        System.out.print("Enter your first guess: ");
        guess = scan.nextLine();
        guessedWord = new Guess(guess, answer);
        while (!answer.getWord().equals(guessedWord.getWord()) && Guess.getGuesses() != 6) {
            Board.printBoard();
            System.out.print("Enter your next guess: ");
            guess = scan.nextLine();
            guessedWord = new Guess(guess, answer);
            // keep using the same varible but update the word// && Guess.getGuesses
        }
        Board.printBoard();
        if (answer.getWord().equals(guessedWord.getWord())) {
            System.out.println("You got it in " + Guess.getGuesses());
        } else {
            System.out.println("The word was: " + answer.getWord());
            System.out.println("Try again next time!");
        }

    }
}


