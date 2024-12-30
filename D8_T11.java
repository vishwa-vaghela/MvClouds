public class D8_T11 {
    public static void main(String[] args) {
        X obj=new Z();
        Y obj1=new Z();
        System.out.println("For X:-");
        obj.show();
        System.out.println("For Y:-");
        obj1.show1();
    }
}
interface X {
    void show();
}
interface Y {
    void show1();
}
class Z implements X,Y{
    public void show(){
        System.out.println("THis is the method of interface X");
    }
    public void show1(){
        System.out.println("THis is the method of interface Y");
    }
}

//Note to slef:- make the implimented method public or it wont work