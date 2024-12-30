public class D10_T8 {
    public static void main(String[] args) {
        int n = 7;
        for (int i=1;i<=n;i++) {
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            // for (int j = 1; j <=i-1; j++) { 
            //     System.out.print("--"); 
            // }
            for (int j=1; j<=2*i-1;j++) {
                if (j==1 || j==2*i-1 || i==n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
