// Write a program to check if a List of integers contains only odd numbers.
public class D8_T8 {
    public static void main(String[] args) {
        int a[]={3,5,7,9,11};
        int b[]={1,3,5,2,7};
        
        D8_T8 obj=new D8_T8();
        System.out.println("Array a:-"); 
        obj.checkodd(a);  
        System.out.println("Array b:-");  
        obj.checkodd(b);

    }
    void checkodd(int arr[]){
        boolean flag=true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                flag=false;
                break;
            }
            else{
                flag=true;
            }
        }
        if(flag==true){
            System.out.println("All elements in array are odd");
        }
        else{
            System.out.println("All elements in array are not odd");
        };
    }
}

