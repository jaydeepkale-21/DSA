package oops;

public class oops_consept{
    public static void main(String args[]) {
        person p1 = new person();
        person p3 = new person(2);
        person p4 = new person("jaydeep",2);
       p1.a=60;
       p1.name="Jaydeep";
       p1.age=18;
       person p2=new person(p1); //copy costractor
       System.out.println(p2.a);
       System.out.println(p2.name);
       System.out.println(p2.age);
    }
}
// Getter and Setter for Private access modifer
class Pen {
    String name;
    private int  tip;
    private String color;

    void set_value(String newcolor,int tip) {
        color = newcolor;
        this.tip=tip;
    }
    int get_value(){
        return this.tip;
        // return  this.color;
    }
}

class person{
    int a;
    String name;
    int age;
    person(person p1){
        this.a=a;
        this.name=name;
        this.age=age;
    }
    person(){
        System.out.println("non paramerized constructor");
    }
    person(int a){
        this.a=a;
    }
    person(String name,int age){
        this.name=name;
        this.age=age;
    }
}