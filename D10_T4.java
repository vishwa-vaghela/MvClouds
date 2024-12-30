import java.util.Scanner;

public class D10_T4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of line:-");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            int count=1;
            for(int j=1;j<=i;j++){
                if(i==j ){
                    System.out.println("*");
                }
                else if(i==n){
                    System.out.print("*");
                }
                else if(j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                count++;
            }
            
        }
    }
}
