import java.util.*;
public class D8_T9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your string:-");
        String str=sc.nextLine();
        System.out.println("Enter your number of the word you want to see:-");
        int num=sc.nextInt();
        String arr[]=str.split(" ");
        if(num>arr.length){
            System.out.println("No word on the index entered");
            return;
        }
        else{
            System.out.println("Word on the index entered:-"+arr[num-1]);
        }
        
    }
}
