import java.util.*;;
class D10_T1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string:-");
        String str=sc.nextLine();
        String new_str="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '){
                continue;
            }
            else{
                new_str+=ch;
            }
        }
        System.out.println("String after removing spaces:- "+new_str);
    }
}