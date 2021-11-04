public class Counter {
    private String text;
    private String words;
    private int i = 0;

    public Counter() {
        text = "";
        words = "";
    }

    public void addText(String newText) {

        if (!newText.contains("stop")) {

            text += newText;
            words += (newText + " ");
            i += 1;

        } else if (newText.contains("stop") && !newText.equals("stop")) {

            if (newText.indexOf("stop") != 0) {

                text += (newText.substring(0, newText.indexOf("stop")));
                words += (newText.substring(0, newText.indexOf("stop")));
                i += 1;
            }

        }

    }

    public String getText() {
        return text;
    }

    public int getNumberOfCharacters() {
        return (text.length());
    }

    public int getNumberOfLines() {
        return i;
    }

    public boolean compareInputToStop(String end) {

        return !end.contains("stop");
    }

    public int countWords() {

        if (words.equals("")) {
            return 0;

        } else {
            String[] wordsToCount = words.split("\\s+");
            return wordsToCount.length;
        }

    }

    public String findLongestWord() {

        String[] wordsToCompare = words.split("\\s+");
        String longestWord = "";

        for (String myWords : wordsToCompare) {

            if (myWords.length() >= longestWord.length()) {

                longestWord = myWords;

            }
        }
        return longestWord;
    }
}



