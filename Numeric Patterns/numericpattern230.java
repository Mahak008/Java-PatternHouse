
//pattern to be printed
//    1
//    2
//1 2 3 4 5
//    4
//    5

class numericpattern230 {
    public static void main(String[] args) {
        int n= 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                int value = col == n/2+1 ? row : col;
                if (col == n/2+1 || row == n/2+1){
                    System.out.print(value + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
