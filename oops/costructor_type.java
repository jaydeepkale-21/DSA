// class student{
//     String name;
//     int age;
//     int mark[]=new int[3];
//     // constructor
//     student(String name, int age){
//         this.name=name;
//         this.age=age;
//         mark=new int[3];
//     }

//     // Copy constructor
//     student(student s1){
//         this.name=s1.name;
//         this.age=s1.age;
//         for(int i=0;i<3;i++){
//             this.mark=s1.mark;
//         }
//     }
//     void display(){
//         System.out.println("Student name: "+name);
//         System.out.println("Age is: "+age);

//     }
// }
// public class costructor_type{
//     public static void main(String args[]){
//         student s1=new student("Jaydeep",19);
//         // s1.name="Jaydeep";
//         // s1.age=19;
//         s1.mark[0]=80;
//         s1.mark[1]=100;
//         s1.mark[2]=150;
//         // s1.display();

//         student s2=new student(s1);
//         for(int i=0;i<3;i++){
//         System.out.println("mark: "+s2.mark[i]);
//         }
//         s2.display();
//     }
// }