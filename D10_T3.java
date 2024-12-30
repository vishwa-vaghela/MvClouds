import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D10_T3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 numbers here:-");
        List a=new ArrayList();
        for(int i=1;i<=5;i++){
            System.out.println("Enter number "+i+":");
            a.add(sc.nextInt());
        }
        int max=(int)a.get(0);
        int max2=(int)a.get(0);
        for(int i=0;i<a.size();i++){
            if((int)a.get(i)>max){
                max2=max;
                max=(int)a.get(i);
            }
        }
        System.out.println("The second largest number is:- "+max2);
    }
}
//Note to self:- similar to code you did in js.

