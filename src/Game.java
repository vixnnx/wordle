import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Game {

    private ArrayList<String> wordlist = new ArrayList<>();


    // Board.addWord(guess.getguesses(), guess.colors())

    // guess(input, answer)
    private Word answer;
    private Scanner scan;
    private String guess;
    private Guess guessedWord;
    private ArrayList<Word> words;


    public Game() {
        readData();
        int num = (int) (Math.random() * wordlist.size());
        answer = new Word(wordlist.get(num));
        words = new ArrayList<>();
        words.add(answer);
        scan = new Scanner(System.in);
    }


    public void start() {
        System.out.println("Welcome to wordle!");
        System.out.println(ConsoleUtility.PURPLE + "RED: letter is not in the word");
        System.out.println("YELLOW: letter is in the word, but wrong spot");
        System.out.println("GREEN: letter is in the word and in the right spot" + ConsoleUtility.RESET);
        System.out.print("Enter your first guess: ");
        guess = scan.nextLine().toLowerCase();
        guessedWord = new Guess(guess, answer);
        words.add(guessedWord);
        while (!answer.getWord().equals(guessedWord.getWord()) && Guess.getGuesses() != 6) {
            Board.printBoard();
            System.out.println();
            System.out.print("Enter your next guess: ");
            guess = scan.nextLine().toLowerCase();
            guessedWord = new Guess(guess, answer);
            words.add(guessedWord);
        }
        Board.printBoard();
        System.out.println();
        if (answer.getWord().equals(guessedWord.getWord())) {
            System.out.println("You got it in " + Guess.getGuesses());
        } else {
            System.out.println("Try again next time!");
        }
        System.out.println();
        System.out.println("All of the words used in this round: ");;
        for (Word w: words) {
            System.out.println(w.toBeListed());
        }

    }



    private void readData() {
        try {
            File myFile = new File("src//wordlewords.txt");
            Scanner fileScanner = new Scanner(myFile);
            while (fileScanner.hasNext()) {
                String data = fileScanner.nextLine();
                wordlist.add(data);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}


