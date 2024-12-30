import java.util.*;
public class D10_T13{
    public static void main(String[] args) {
        D10_T13 obj=new D10_T13();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1:-");
        int num1=sc.nextInt();
        System.out.println("Enter number 2:-");
        int num2=sc.nextInt();
        System.out.println("Permutation of num1 and num2:-");
        int n=obj.factorial(num1);
        int d=obj.factorial(num1-num2);
        System.out.println(n/d);
        System.out.println("Combination of num1 and num2:-");
        int d1=obj.factorial(num2)*obj.factorial(num1-num2);
        if (n/d1==0){
            System.out.println("Enter numbers are not valid for combination");
        }
        else{
            System.out.println(n/d1);
        }

    }
    int factorial(int num){
        int fact=1;
        for (int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
}