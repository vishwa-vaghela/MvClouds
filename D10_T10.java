public class D10_T10 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for (int j=n;j>i;j--) {
                System.out.print("  ");
            }
          //   int count=1;   // Note to slef:- Check why the count code was notworking 
            for(int j=1;j<=2*i-1;j++){    
                if (j %2!=0) {
                    System.out.print(". ");
                } else {
                    System.out.print(i-1+" ");
                }
            }
            
            System.out.println("");
        }
    }
}
