import java.util.Scanner;

public class CounterMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Counter myObj = new Counter();
        System.out.println("Skriv in ord och tryck enter");
        System.out.println("Skriver du stop tar det roliga slut och ditt resultat visas");

        String input;

        do {
            System.out.println("Skriv in ord här: ");
            myObj.addText(input = scan.nextLine());
        } while (myObj.compareInputToStop(input));


        System.out.println("Du skrev stop. Här är resultatet: ");
        System.out.println("Du har skrivit " + myObj.getNumberOfCharacters() + " tecken");
        System.out.println("Du har skrivit " + myObj.countWords() + " ord");
        System.out.println("Det blev totalt " + myObj.getNumberOfLines() + " rader");
        System.out.println("Det längsta ordet du skrivit är: " + myObj.findLongestWord());



    }


}
