public class Word {
    private Letter l1;
    private Letter l2;
    private Letter l3;
    private Letter l4;
    private Letter l5;
    private String word;


    public Word (String w) {
        word = w;
        l1 = new Letter(w.substring(0,1));
        l2 = new Letter(w.substring(1,2));
        l3 = new Letter(w.substring(2,3));
        l4 = new Letter(w.substring(3,4));
        l5 = new Letter(w.substring(4,5));
    }

//returns the letter
    public Letter getL1() {
        return l1;
    }

    public Letter getL2() {
        return l2;
    }

    public Letter getL3() {
        return l3;
    }

    public Letter getL4() {
        return l4;
    }

    public Letter getL5() {
        return l5;
    }

    public String getWord() {
        return word;
    }


    public String toBeListed() {

        return ConsoleUtility.CYAN + "The answer was " + word + ConsoleUtility.RESET;
    }

}
