import java.util.*;
public class Game {

    private final String[] WORDLIST = {"worry", "sorry", "watch", "catch", "paper", "daily",
            "devil", "tires", "mouse", "house", "foyer", "mummy", "trite", "coyly", "codes"};


   // Board.addWord(guess.getguesses(), guess.colors())

    // guess(input, answer)
    private Word answer;

    public Game () {
        int num = (int) (Math.random()*15);
        answer = new Word(WORDLIST[num]);
    }


    //while (answer.getWord != guessedWord.getWord() //keep using the same varible but update the word// && Guess.getGuesses
}


