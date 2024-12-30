import java.util.*;
public class D10_T12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr)); //Not to slef:- Arrays.toString():-Can use this for ques 2 and 3 its eaiser
        String arr1[]=new String[arr.length];
        for(int i=arr.length-1; i>=0; i--){
          arr1[arr.length-1-i] = arr[i];  
        }
        System.out.println(Arrays.toString(arr1));
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
