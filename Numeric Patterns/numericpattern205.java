
// pattern to be printed
//        A
//      2 2
//    C C C
//  4 4 4 4
//E E E E E

class numericpattern205 {
    public static void main(String[] args) {
        int n = 5;
        char value = 'A';
        for (int row = 1; row <= n ; row++) {
            for (int spaces = 1; spaces <= n-row; spaces++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                if (row % 2 == 0){
                    System.out.print( row + " ");
                }else{
                    System.out.print(value + " ");
                }
            }
            value++;
            System.out.println();
        }
    }
}
