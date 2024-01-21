package Inheritance;

public class PS2 extends PS3 {

    //Class variable
    int a;

    //Constructor
    //int a is instance variable
    public PS2(int a) {

        super(a); //Parent class (PS3) constructor is invoked

        //this.a refers to the class variables
        this.a = a;

    }

    public int increment() {

        a = a + 1;
        return a;
    }

    public int decrement() {

        a = a - 1;
        return a;
    }
}
