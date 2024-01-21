package Inheritance;

import org.testng.annotations.Test;

public class PS1 extends PS {

    @Test
    public void testRun() {

        //Object of the class
        //Every time you create an object of the class, constructor will be called
        PS2 ps2 = new PS2(3);

        doThis();
        System.out.println(ps2.increment());
        System.out.println(ps2.decrement());

        System.out.println(ps2.multiplyThree());
    }

}
