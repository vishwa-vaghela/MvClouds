import java.util.*;
public class D10_T2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 characters here:-");
        List a=new ArrayList();
        for(int i=1;i<=5;i++){
            System.out.println("Enter character "+i+":");
            a.add(sc.nextLine());
        }
        System.out.println(a);
        for(int i=0;i<a.size();i++){
            for (int j = a.size() - 1; j > i; j--) {
                // System.out.println(a.get(i).getClass());
                String ch=a.get(i).toString();
                String ch1=a.get(j).toString();
                if (ch.charAt(0) > ch1.charAt(0)) {        
                    String temp = a.get(i).toString();
                    a.set(i, a.get(j));
                    a.set(j, temp);        
                }
            }
        }
        System.out.println(a);
    }
}
//Note to self:- You have to use get and set method to work with list and even if a object gives a value of string you need to use the toString() method to convert it to string.