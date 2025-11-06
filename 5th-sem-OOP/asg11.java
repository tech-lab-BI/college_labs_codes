import mypackage.*;

public class asg11 {
    // your own method outside the package
    public static void main(String args[]) {
        addmul intAdder = new addInt(10, 20);
        intAdder.add();
        intAdder.show();

        addmul doubleAdder = new addDouble(5.5, 7.2);
        doubleAdder.add();
        doubleAdder.show();

        addmul stringAdder = new addString("Hello ", "World");
        stringAdder.add();
        stringAdder.show();
    }
}
/*
10+20=30
5.5+7.2=12.7
Hello World
 */