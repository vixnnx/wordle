public class Board {

    private static String[][] grid =  {{"_","_","_","_","_"},
                                {"_","_","_","_","_"},
                                {"_","_","_","_","_"},
                                {"_","_","_","_","_"},
                                {"_","_","_","_","_"},
                                {"_","_","_","_","_"}};
    public Board() {}

    //prints the board
    public static void printBoard() {
        for (String[] row: grid) {
            for (String r: row) {
                System.out.print(r);
            }
            System.out.println();
        }
    }

    //adds word to the next blank line
    public static void addWord(int guess, Letter[] letters) {
        int g = guess - 1;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i].getColor().equals("Green")) {
                grid[g][i] = ConsoleUtility.GREEN + letters[i].getValue() + ConsoleUtility.RESET;
            } else if (letters[i].getColor().equals("Yellow")) {
                grid[g][i] = ConsoleUtility.YELLOW + letters[i].getValue() + ConsoleUtility.RESET;
            } else {
                grid[g][i] = ConsoleUtility.RED + letters[i].getValue() + ConsoleUtility.RESET;
            }
        }
    }

}
