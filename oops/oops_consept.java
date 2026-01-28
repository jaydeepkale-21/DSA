package oops;          // package name

// -------- Main class --------
public class oops_consept {   // class name

    public static void main(String args[]) {   // main method

        Pen p1 = new Pen();    // object creation (reference variable p1)

        p1.change_color("blue",5); // method call (change_color)

        System.out.println(p1.color); // accessing instance variable (color)
        // p1.tip=5;
        // System.out.println(p1.tip);
    }
}

// -------- User-defined class --------
class Pen {               // class name

    String name;          // instance variable
     private int tip;              // instance variable
    String color;         // instance variable

    void change_color(String newcolor,int tips) { // method
        color = newcolor; // assigning value to instance variable
        tip=tips;
        System.out.println(tip);
    }
}
