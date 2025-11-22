import java.awt.*;

class MyShape {
    public int ratio; // <-- Only declared, not initialized (default value is 0)
    public String accelerate() {
        return "Item : Shape";
    }
}

public class Main1 extends MyShape {
    public int ratio = 9; // <-- Hiding the parent's ratio
    public String accelerate() {
        return "Item : Main";
    }
    public static void main (String [] args){
        Main1 c = new Main1();
        MyShape s = new Main1();
        System.out.println( c.ratio + " : " + c.accelerate() );
        System.out.println( s.ratio + " : " + s.accelerate() );
    }
}