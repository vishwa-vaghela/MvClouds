class Maintask6{
    public static void main(String[] args) {
        A obj=new A();
        System.out.println("For A:-");
        obj.classcalled();
        B obj1=new B();
        System.out.println("For B:-");
        obj1.classcalled();
        C obj2=new C();
        System.out.println("For C:-");
        obj2.classcalled();
    }
}
class A{
    A(){
        System.out.println("A");
    }
    void classcalled(){
        System.out.println("Class A called");
    }
}
class B extends A{
    B(){    
        System.out.println("B");
    }
    void classcalled(){
        super.classcalled();
        System.out.println("Class B called");
    }
}
class C extends B{
    C(){
        System.out.println("C");
    }
    void classcalled(){
        super.classcalled();
        System.out.println("Class C called");
    }
}