import java.util.Scanner;

public class CounterMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Counter myobj = new Counter();
        System.out.println("Skriv in ord och tryck enter");
        System.out.println("Skriver du stop tar det roliga slut och ditt resultat visas");

        String input;

        do {
            System.out.println("Skriv in ord här: ");
            myobj.addText(input = scan.nextLine());
        } while (myobj.compareInputToStop(input));


        System.out.println("Du skrev stop. Här är resultatet: ");
        System.out.println("Du har skrivit " + myobj.getNumberOfCharacters() + " tecken");
        System.out.println("Du har skrivit " + myobj.countWords() + " ord");
        System.out.println("Det blev totalt " + myobj.getNumberOfLines() + " rader");
        System.out.println("Det längsta ordet du skrivit är: " + myobj.findLongestWord());



    }


}
