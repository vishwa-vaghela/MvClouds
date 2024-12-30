import java.util.*;
public class D8_T10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System .out.println("Enter the number:-");
        float num=sc.nextFloat();
        String str=String.valueOf(num);
        String rev="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            rev=c+rev;
        }
        System.out.println(rev);
        int dot=str.indexOf('.');
        System.out.println(dot);
        rev=rev.replace(".","");
        System.out.println(rev);
        String final_str="";
        for(int i=0;i<rev.length();i++){
            if(i==dot){
                final_str+="."+rev.charAt(i);
            }
            else{
                final_str+=rev.charAt(i);
            }
        }
        System.out.println("---------------------------------------");
        System.out.println("Final String:-"+final_str);
    }
}
