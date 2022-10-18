import java.util.Scanner;

class NumericPattern307 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        for(int i = 1;i <= height; i++) {
            for(int j = 1; j <= height-i;j++) {
                System.out.print("   ");
            }
            for(int j =1;j <= i; j++) {
                System.out.print((char)(j+64) + "  ");
            }
            for(int j = 1;j <= i; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
//         A 1
//       A B 1 2
//     A B C 1 2 3
//   A B C D 1 2 3 4
// A B C D E 1 2 3 4 5
