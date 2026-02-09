package oops;
// // single inheritance-> single parent and single child
// class base{
//     void display(){
//         System.out.println("base");
//     }
// }
// class derived extends base{
//     void show(){
//         System.out.print("derived");
//     }
// }

// // multilevel inheritance -> multi parent multi child or chain of inhertance
// //                     e.x-> animal-> mammal
// //                                 |-> birds 
// class base1{
//     void display(){
//         System.out.println("base");
//     }
// }
// class derived1 extends base1{
//     void show(){
//         System.out.print("derived");
//     }
// }
// class derived2 extends derived1{
//     void got(){
//         System.out.println("got");
//     }
// }

// // Hybrid inheritance -> combination of two or more inherrance in single program
// class Animal{
//     void living_org(){
//         System.out.print("they living org");
//     }
// }
// class bird extends Animal{
//     void fly(){
//         System.out.println("bird are fly");
//     }
// }
// class fish extends Animal{ //->Hierarchical inhertance
//     void swim(){
//         System.out.print("They can be swim");
//     }
// }
// class shark extends fish{ //->Multilevel Inheritance
//     void danger(){
//         System.out.print("fish shark is danger");
//     }
// }

class base{
    base(){
        System.out.print("base class constructor");
    }
}
class derived extends base{

    derived() {
         super();z
        System.out.println("derived class constructor");
    }
}
public class inhertance_types {
    public static void main(String[] args) {
        derived d=new derived();
        
    }
}
