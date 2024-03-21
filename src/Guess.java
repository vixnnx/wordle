public class Guess extends Word {
    private static int guesses;
    private Word ans;

    public Guess(String word, Word answer) {
        super(word);
        ans = answer;
        guesses++;
        checkL1();
        checkL2();
        checkL3();
        checkL4();
        checkL5();
        Board.addWord(guesses, color());
    }


    public Letter[] color() {
        Letter[] letters = {getL1(), getL2(), getL3(), getL4(), getL5()};
        return letters;
    }


    //sets the color of each letter in the guessed word
    public void makeGreen(Letter l) {
        l.setColor("Green");
    }

    public void makeYellow(Letter l) {
        l.setColor("Yellow");
    }

    public void makeRed(Letter l) {
        l.setColor("Red");
    }

//checks each letter in the guessed word
    public void checkL1() {
        if (getL1Value().equals(ans.getL1Value())) {
            makeGreen(getL1());
        } else if (getL1Value().equals(ans.getL2Value()) ||
                (getL1Value().equals(ans.getL3Value())) ||
                (getL1Value().equals(ans.getL4Value())) ||
                (getL1Value().equals(ans.getL5Value()))) {
            makeYellow(getL1());
        } else {
            makeRed(getL1());
        }
    }

    public void checkL2() {
        if (getL2Value().equals(ans.getL2Value())) {
            makeGreen(getL2());
        } else if (getL2Value().equals(ans.getL1Value()) ||
                (getL2Value().equals(ans.getL3Value())) ||
                (getL2Value().equals(ans.getL4Value())) ||
                (getL2Value().equals(ans.getL5Value()))) {
            makeYellow(getL2());
        } else {
            makeRed(getL2());
        }
    }

    public void checkL3() {
        if (getL3Value().equals(ans.getL3Value())) {
            makeGreen(getL3());
        } else if (getL3Value().equals(ans.getL2Value()) ||
                (getL3Value().equals(ans.getL1Value())) ||
                (getL3Value().equals(ans.getL4Value())) ||
                (getL3Value().equals(ans.getL5Value()))) {
            makeYellow(getL3());
        } else {
            makeRed(getL3());
        }
    }

    public void checkL4() {
        if (getL4Value().equals(ans.getL4Value())) {
            makeGreen(getL4());
        } else if (getL4Value().equals(ans.getL2Value()) ||
                (getL4Value().equals(ans.getL3Value())) ||
                (getL4Value().equals(ans.getL1Value())) ||
                (getL4Value().equals(ans.getL5Value()))) {
            makeYellow(getL4());
        } else {
            makeRed(getL4());
        }
    }

    public void checkL5() {
        if (getL5Value().equals(ans.getL5Value())) {
            makeGreen(getL5());
        } else if (getL5Value().equals(ans.getL2Value()) ||
                (getL5Value().equals(ans.getL3Value())) ||
                (getL5Value().equals(ans.getL4Value())) ||
                (getL5Value().equals(ans.getL1Value()))) {
            makeYellow(getL5());
        } else {
            makeRed(getL5());
        }
    }

    public static int getGuesses() {
        return guesses;
    }

    @Override
    public String toBeListed() {

        return ConsoleUtility.BLUE + "You guessed " + getWord() + ConsoleUtility.RESET;
    }




}



