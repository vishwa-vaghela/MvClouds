public class D8_T12 {
    public static void main(String[] args) {
        System.out.println("Method 1:-");
        StringBuffer sb=new StringBuffer("Hello");
        System.out.println("Original sb:-"+sb);
        sb.setLength(0);
        System.out.println("New sb:-"+ sb);
        System.out.println("---------------------------------");
        System.out.println("Method 2:-");
        StringBuffer sb2=new StringBuffer("Hello");
        System.out.println("Original sb:-"+sb2);
        sb2.delete(0, sb2.length());
        System.out.println("New sb:-"+ sb2);
        System.out.println("---------------------------------");
        System.out.println("Method 3:-");
        StringBuffer sb3=new StringBuffer("Hello");
        for(int i=0;i<sb3.length();i++){
            sb3.setCharAt(i, ' ');
        }
        System.out.println("New sb:-"+ sb3);
        System.out.println("---------------------------------");
        System.out.println("Method 4:-");
        StringBuffer sb4=new StringBuffer("Hello");
        System.out.println("Original sb:-"+sb4);
        sb4.replace(0,sb4.length(),"");
        System.out.println("New sb:-"+ sb4);
        System.out.println("---------------------------------");
    }
}
