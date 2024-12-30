public class D10_T6 {
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n-1;j++){
                if((i==1 && j>=n) || (i==n && j<=n) || i+j==n+1 || i+j==2*n ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
