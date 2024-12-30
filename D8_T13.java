import java.util.Scanner;
import java.util.Random;
public class D8_T13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:-");
        String str=sc.nextLine();

        D8_T13 obj=new D8_T13();
        String encrypt=obj.encryption(str);
        String decrypt=obj.decryption(encrypt);
    }
    String encryption(String str){
        String enc="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int asc=ch;
            System.out.println(asc);
            int new_asc=asc+10;
            char new_ch=(char)new_asc;
            System.out.println(new_ch);
            Random r=new Random();
            char random=(char)(r.nextInt(26)+65);
            System.out.println(random);
            enc += String.valueOf(new_ch) + random;
        }
        System.out.println("---------------------------------");
        System.out.println("Encrypted String:-"+enc);
        return enc;
    }
    String decryption(String str){
        String dec="";
        for(int i=0;i<str.length();i+=2){
                char ch=str.charAt(i);
                int asc=ch;
                System.out.println(asc);
                int new_asc=asc-10;
                System.out.println(new_asc);
                char new_ch=(char)new_asc;
                dec += String.valueOf(new_ch);
        }
        System.out.println("---------------------------------");
        System.out.println("Decrypted String:-"+dec);
        return dec;    
    }
}
