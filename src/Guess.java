public class Guess extends Word{
    private int guesses;
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
    }


    public Letter[] color() {
        Letter[] letters = {getL1(), getL2(), getL3(), getL4(), getL5()};
        return letters;
    }

    public void makeGreen(Letter l) {
        l.setColor("Green");
    }

    public void makeYellow(Letter l) {
        l.setColor("Yellow");
    }

    public void makeGray(Letter l) {
        l.setColor("Gray");
    }

    public int getGuesses() {
        return guesses;
    }




    public void checkL1(){
        if (getL1Value().equals(ans.getL1Value())) {
            makeGreen(getL1());
        } else if (getL1Value().equals(ans.getL2Value()) ||
                    (getL1Value().equals(ans.getL3Value())) ||
                    (getL1Value().equals(ans.getL4Value())) ||
                    (getL1Value().equals(ans.getL5Value()))) {
                makeYellow(getL1());
        } else {
            makeGray(getL1());
        }
    }

    public void checkL2(){
        if (getL2Value().equals(ans.getL2Value())) {
            makeGreen(getL2());
        } else if (getL2Value().equals(ans.getL1Value()) ||
                (getL2Value().equals(ans.getL3Value())) ||
                (getL2Value().equals(ans.getL4Value())) ||
                (getL2Value().equals(ans.getL5Value()))) {
            makeYellow(getL2());
        } else {
            makeGray(getL2());
        }
    }

    public void checkL3(){
        if (getL3Value().equals(ans.getL3Value())) {
            makeGreen(getL3());
        } else if (getL3Value().equals(ans.getL2Value()) ||
                (getL3Value().equals(ans.getL1Value())) ||
                (getL3Value().equals(ans.getL4Value())) ||
                (getL3Value().equals(ans.getL5Value()))) {
            makeYellow(getL3());
        } else {
            makeGray(getL3());
        }
    }
    public void checkL4(){
        if (getL4Value().equals(ans.getL4Value())) {
            makeGreen(getL1());
        } else if (getL4Value().equals(ans.getL2Value()) ||
                (getL4Value().equals(ans.getL3Value())) ||
                (getL4Value().equals(ans.getL1Value())) ||
                (getL4Value().equals(ans.getL5Value()))) {
            makeYellow(getL4());
        } else {
            makeGray(getL4());
        }
    }
    public void checkL5(){
        if (getL5Value().equals(ans.getL5Value())) {
            makeGreen(getL5());
        } else if (getL5Value().equals(ans.getL2Value()) ||
                (getL5Value().equals(ans.getL3Value())) ||
                (getL5Value().equals(ans.getL4Value())) ||
                (getL5Value().equals(ans.getL1Value()))) {
            makeYellow(getL5());
        } else {
            makeGray(getL5());
        }
    }
}
