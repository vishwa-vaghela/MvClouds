import java.util.Scanner;
public class D10_T15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=sc.nextInt();
        int new_num=0;
        int temp=num;
        while (temp!=0) {
            int remainder=temp%10;
            new_num+=Math.pow(remainder,3);
            temp/=10;
        }
        if (num == new_num) {
            System.out.println("It is an ArmStrong number.");
        } else {
            System.out.println("It is not an ArmStrong number.");
        }

        sc.close();
    }
}
