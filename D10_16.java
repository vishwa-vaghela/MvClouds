import java.util.Scanner;

class D10_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of dice:");
        int numdice = sc.nextInt();
        System.out.println("Enter the outcome:");
        int out = sc.nextInt();
        
        int result = Combinations(numdice, out);
        System.out.println("Number of possible combinations: " + result);
    }
    
    public static int Combinations(int numdice, int out) {
        if(numdice==0){
            return out == 0?1:0;
        }
        // else{
        //     return (out=1);
        // }
        int count=0;
        for(int i=1;i<=6;i++){
            count+=Combinations(numdice-1,out-i);
        }
        return count;
    }
}