import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CounterTest {

    @Test
    public void test() {

        //arrange

        Counter myObj = new Counter();


        //act


        //assert


    }

    @Test

    public void testgettext() {

        //arrange
        Counter myObj = new Counter();


        //act
        String actual = myObj.getText();

        //assert
        String expected = "";
        assertEquals(expected, actual);

    }

    @Test

    public void testchangetext() {

        //arrange
        Counter myObj = new Counter();

        //act
        myObj.addText("characters");
        String actual = myObj.getText();

        //assert
        String expected = "characters";
        assertEquals(expected, actual);

    }

    @Test

    public void testStopbooleanfalse() {

        //arrange
        Counter myObj = new Counter();
        String end = "stop";

        //act
        boolean actual = myObj.compareInputToStop(end);


        //assert
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test

    public void testStopBooleanTrue() {

        //arrange
        Counter myObj = new Counter();
        String end = "hej";

        //act
        boolean actual = myObj.compareInputToStop(end);


        //assert
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test

    public void testChangingMyObjBooleanFalse() {

        //arrange
        Counter myObj = new Counter();
        String input = "stop";

        //act
        System.out.println(myObj.compareInputToStop(input));

        while (myObj.compareInputToStop(input)) {

            myObj.addText(input);

        }
        String actual = myObj.getText();
        //assert
        String expected = "";
        assertEquals(expected, actual);


    }

    @Test

    public void testChangingMyObjBooleanTrue() {

        //arrange
        Counter myObj = new Counter();
        String input = "Snälla fungera";

        //act
        System.out.println(myObj.compareInputToStop(input));

        while (myObj.compareInputToStop(input)) {

            myObj.addText(input);
            break; //den här sätter jag dit eftersom min input aldrig ändras i testet
        }
        String actual = myObj.getText();
        //assert
        String expected = "Snälla fungera";

        assertEquals(expected, actual);


    }

    @Test

    public void testGetNumberOfChar() {

        //Uppdatera alla räkna tecken metoder. När jag lägger till ett blanksteg
        //arrange
        Counter myObj = new Counter();
        String words = "Heja Heja";

        //act
        myObj.addText(words);
        int actual = myObj.getNumberOfCharacters();

        //assert
        int expected = 9;
        assertEquals(expected, actual);

    }


    @Test

    public void testGetNumberOfChar2Strings() {

        //arrange
        Counter myObj = new Counter();
        String words = "Heja Heja";
        String moreWords = "ajeh ajeh";


        //act
        myObj.addText(words);
        myObj.addText(moreWords);

        int actual = myObj.getNumberOfCharacters();

        //assert
        int expected = 18;
        assertEquals(expected, actual);

    }

    @Test

    public void testGetNumberOfChar3Strings() {

        //arrange
        Counter myObj = new Counter();
        String words = "Heja Heja";
        String moreWords = "ajeh ajeh";
        String evenMoreWords = "jahe jahe";


        //act
        myObj.addText(words);

        int actual = myObj.getNumberOfCharacters();

        //assert
        int expected = 9;
        assertEquals(expected, actual);

        //act
        myObj.addText(moreWords);

        int actual2 = myObj.getNumberOfCharacters();

        //assert
        int expected2 = 18;
        assertEquals(expected2, actual2);

        //act
        myObj.addText(evenMoreWords);

        int actual3 = myObj.getNumberOfCharacters();

        //assert
        int expected3 = 27;
        assertEquals(expected3, actual3);

    }

    @Test

    public void testGetNumberOfLines1Line() {

        //arrange
        Counter myObj = new Counter();
        String words = "Heja Heja";


        //act
        myObj.addText(words);
        int actual = myObj.getNumberOfLines();

        //assert
        int expected = 1;
        assertEquals(expected, actual);

    }

    @Test

    public void testGetNumberOfLines2Lines() {

        //arrange
        Counter myObj = new Counter();
        String words = "Heja Heja";
        String moreWords = "ajeh ajeh";


        //act
        myObj.addText(words);
        myObj.addText(moreWords);

        int actual = myObj.getNumberOfLines();

        //assert
        int expected = 2;
        assertEquals(expected, actual);

    }

    @Test

    public void testGetNumberOfLines3Lines() {

        //arrange
        Counter myObj = new Counter();
        String words = "Heja Heja";
        String moreWords = "ajeh ajeh";
        String evenMoreWords = "jahe jahe";


        //act
        myObj.addText(words);
        myObj.addText(moreWords);

        int actual = myObj.getNumberOfLines();

        //assert
        int expected = 2;
        assertEquals(expected, actual);

        //act
        myObj.addText(evenMoreWords);

        int actual2 = myObj.getNumberOfLines();

        //assert
        int expected2 = 3;
        assertEquals(expected2, actual2);

    }

    @Test

    public void testCountWords() {

        //arrange
        Counter myObj = new Counter();
        String input = "Snälla räkna mina ord";

        //act
        myObj.addText(input);
        int actual = myObj.countWords();
        System.out.println(actual);

        //assert
        int expected = 4;
        assertEquals(expected, actual);


    }

    @Test

    public void testCountWordsMultipleInputs() {
        //Kommer jag behöva ändra i metoden changetext för att
        //få rätt mängd blanksteg. annars kanske vissa ord räknas
        // som ett ord i min count metod.

        //arrange
        Counter myObj = new Counter();
        String input = "Snälla räkna mina ord";
        String input2 = "Kommer alla blanksteg med";

        //act
        myObj.addText(input);
        myObj.addText(input2);

        int actual = myObj.countWords();
        System.out.println(actual);

        //assert
        int expected = 8;
        assertEquals(expected, actual);


    }

    /*@Test

    public void testlongestword2words(){

        //arrange
        Counter myObj = new Counter();
        String input = "Snäll";
        String input2 = "Kompis";

        //act

        String actual = myObj.findLongestWord(input, input2);


        //assert
        String expected = "Kompis";
        assertEquals(expected, actual);


    }*/

    @Test

    public void testlongestword3words1String() {

        //arrange
        Counter myObj = new Counter();
        String input = "Snäll Kompis Blomkålspudding";

        //act
        myObj.addText(input);
        String actual = myObj.findLongestWord();


        //assert
        String expected = "Blomkålspudding";
        assertEquals(expected, actual);


    }

    @Test

    public void testlongestwordtext2strings() {

        //arrange
        Counter myObj = new Counter();
        String input = "Snäll Kompis Blomkål pudding";
        String input2 = "lasagneplattor är gott";

        //act
        myObj.addText(input);
        myObj.addText(input2);

        String actual = myObj.findLongestWord();
        System.out.println(actual);

        //assert
        String expected = "lasagneplattor";
        assertEquals(expected, actual);


    }

    @Test

    public void testWordsSameLength(){

        //arrange
        Counter myObj = new Counter();
        String input = "Snäll glada spade";

        //act
        myObj.addText(input);

        String actual = myObj.findLongestWord();
        System.out.println(actual);

        //assert
        String expected = "spade";
        assertEquals(expected, actual);


    }

    @Test

    public void testEndingProgramStopNotAlone() {

        //arrange
        Counter myObj = new Counter();
        String input = "Jag säger stop";

        //act
        while (myObj.compareInputToStop(input)) {

            myObj.addText(input);
        }

        String actual = myObj.getText();

        //assert
        String expected = "";
        assertEquals(expected, actual);

    }

    @Test

    public void testAddingWordsSameLineAsStop() {

        //arrange
        Counter myObj = new Counter();
        String input = "Jag säger stop";

        //act
        myObj.addText(input);

        String actual = myObj.getText();
        System.out.println(myObj.getText());

        //assert
        String expected = "Jag säger ";
        assertEquals(expected, actual);

    }

}