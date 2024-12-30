public class D10_T14 {
    public static void main(String[] args) {
        String s = null;
        if(s==null){
            throw new NullPointerException("Null string found!!!");
        }
        else{
            System.out.println("String is not null!!!");
        }
    }
}
