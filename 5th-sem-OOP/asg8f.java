interface A{//default public static
    void f1();
}
interface  B{
    public void f2();
}
class C implements A,B{ // multiple inheritance
    @Override
    public void f1(){
        System.out.println("hi");
    }
    @Override
    public void f2(){
        System.out.println("hello");
    }
    void f3(){
        System.out.println("BYY");
    }
}
public class asg8f {
    public static void main(String[] args) {
        C obj = new C();
        obj.f1();
        obj.f2();
        obj.f3();
    }
}
/*
hi
hello
BYY
 */