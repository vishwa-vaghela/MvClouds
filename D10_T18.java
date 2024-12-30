public class D10_T18 {
    public static void main(String[] args) {
        // int n=9;
        // for(int i=1;i<=n;i++){
        //     // for(int j=1;j<=4*n;j++){
        //     //     System.out.print("*");
        //     // }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     for (int j=n; j>i; j--)
        //     {    
        //         System.out.print(" ");
        //     }
        //     for(int j=n;j>i;j--){
        //         System.out.print("*");
        //     }
        //     // loop to print the number of stars in each row 
        //     for (int j = 1; j <i; j++) { 
        //         System.out.print("  "); 
        //     }
        //     for (int j=n; j>i; j--)
        //     {    
        //         System.out.print("*");
        //     }
        //     for(int j=n;j>i;j--){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        int n = 7;
        int count=0;
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=4*n-1;j++) {
                if (j<=i || j>=4*n-i || (j>=n+1 && j<=3*n-1)&& (j<n+(n-i+2) || j>3*n-(n-i+2))) {
                    // Note to self :- check why it was not working for the condition 7*i when free
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            count+=2;
            System.out.println();
        }
    }
}
