
//pattern to be printed out
// 1 1 1 1 1
// 1 1 0 1 1
// 1 0 1 0 1
// 1 1 0 1 1
// 1 1 1 1 1

class numericpattern237 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col == 1 || col == n ||row == 1 || row==n || row==col || col == n-row+1){
                    System.out.print(1 +" ");
                }else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}