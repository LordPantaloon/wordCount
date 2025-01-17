package wordsIn;

public class wordsIn {

    //Sätter variabler
    private int lines = 0;
    private int words = 0;
    private int characters = 0;
    public String ord;
    private String longWord = "";

    public int lineCount() {
        //Ökar antalet rader med 1 med varje input
        lines += 1;
        return lines;
    }

    public int charCount(String input) {
        //Ökar antal bokstäver
        characters += input.length();
        return characters;
    }

    public int wordCount(String input) {
        //Ökar antal ord
        //Delar på en string där det finns mellanslag
        String[] wordsLength = input.split("\\s+");
        words += wordsLength.length;

        for (String word : wordsLength) {
            //Kollar vilket som är längsta ordet
            if (word.length() > longWord.length()) {
                longWord = word;
            }
        }
        return words;
    }

    public boolean checkStop(String input) {
        //Kollar om user input är "stop"
        return input.equalsIgnoreCase("stop");
    }


    public void printAll() {
        //skriver ut antalet bokstäver
        System.out.println("Antal rader: " + lines);
        System.out.println("Antal ord: " + words);
        System.out.println("Antal bokstäver: " + characters);
        System.out.println("Längsta ordet: " + longWord);
    }


    public String getOrd() {
        //retunerar ord för testfall.
        return ord;
    }

    public void setWords(String ord) {
        //Sätter ord för testfall.
        this.ord = ord;
    }
}


