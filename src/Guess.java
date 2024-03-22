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
        if (getL1().getValue().equals(ans.getL1().getValue())) {
            makeGreen(getL1());
        } else if (getL1().getValue().equals(ans.getL2().getValue()) ||
                (getL1().getValue().equals(ans.getL3().getValue())) ||
                (getL1().getValue().equals(ans.getL4().getValue())) ||
                (getL1().getValue().equals(ans.getL5().getValue()))) {
            makeYellow(getL1());
        } else {
            makeRed(getL1());
        }
    }

    public void checkL2() {
        if (getL2().getValue().equals(ans.getL2().getValue())) {
            makeGreen(getL2());
        } else if (getL2().getValue().equals(ans.getL1().getValue()) ||
                (getL2().getValue().equals(ans.getL3().getValue())) ||
                (getL2().getValue().equals(ans.getL4().getValue())) ||
                (getL2().getValue().equals(ans.getL5().getValue()))) {
            makeYellow(getL2());
        } else {
            makeRed(getL2());
        }
    }

    public void checkL3() {
        if (getL3().getValue().equals(ans.getL3().getValue())) {
            makeGreen(getL3());
        } else if (getL3().getValue().equals(ans.getL2().getValue()) ||
                (getL3().getValue().equals(ans.getL1().getValue())) ||
                (getL3().getValue().equals(ans.getL4().getValue())) ||
                (getL3().getValue().equals(ans.getL5().getValue()))) {
            makeYellow(getL3());
        } else {
            makeRed(getL3());
        }
    }

    public void checkL4() {
        if (getL4().getValue().equals(ans.getL4().getValue())) {
            makeGreen(getL4());
        } else if (getL4().getValue().equals(ans.getL2().getValue()) ||
                (getL4().getValue().equals(ans.getL3().getValue())) ||
                (getL4().getValue().equals(ans.getL1().getValue())) ||
                (getL4().getValue().equals(ans.getL5().getValue()))) {
            makeYellow(getL4());
        } else {
            makeRed(getL4());
        }
    }

    public void checkL5() {
        if (getL5().getValue().equals(ans.getL5().getValue())) {
            makeGreen(getL5());
        } else if (getL5().getValue().equals(ans.getL2().getValue()) ||
                (getL5().getValue().equals(ans.getL3().getValue())) ||
                (getL5().getValue().equals(ans.getL4().getValue())) ||
                (getL5().getValue().equals(ans.getL1().getValue()))) {
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



