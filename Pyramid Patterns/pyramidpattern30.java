import java.util.Scanner;

class pyramidpattern30 {

    static void printPattern (int totalLines) {

        int whiteSpaces, printCharacter;
        char Character = 'A';

        for (int i = 1; i <= totalLines; i++) {

            whiteSpaces = (totalLines - i);
            printCharacter = ((2 * i) - 1);

            for (int j = 1; j <= whiteSpaces; j++) {

                System.out.print("  ");
            }

            for (int k = 1; k <= printCharacter; k++) {

                System.out.print(Character + " ");
            }

            Character += 2;
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int totalLines;

        System.out.print("How many lines to be printed? --> ");
        totalLines = input.nextInt();

        System.out.println("\nYour pattern looks like this:\n");
        printPattern (totalLines);
    }
}