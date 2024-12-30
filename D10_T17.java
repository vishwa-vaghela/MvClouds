import java.util.Scanner;

public class D10_T17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:-");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                // System.out.print(i+j);
                // System.out.print(i+j-1);
                // System.out.print(i-1/2 +j);
                System.out.print((i*(i-1))/2+j);
            }
            System.out.println();
        }
    }
}
