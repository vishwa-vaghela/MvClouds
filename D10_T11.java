public class D10_T11 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for (int j=n;j>i;j--) {
                System.out.print("_ ");
            }
            for(int j=1;j<=2*i-1;j++){    
                if (j%2!=0) {
                    System.out.print(". ");
                } else {
                    System.out.print(i-1+" ");
                }
            }         
            System.out.println("");
        }
        for (int i=n-1;i>=1;i--) {
            for (int j=1;j<=n-i;j++) {  //Note to self:- remember this part for diagonal printing next time 
                System.out.print("_ "); //Dont forget and use other methods
            }
            for (int j=1;j<=2*i-1;j++) {
                if (j% 2!=0) {
                    System.out.print(". ");
                } else {
                    System.out.print(i-1+" ");
                }
            }
            System.out.println();
        }

    }
}
