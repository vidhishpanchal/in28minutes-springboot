class Pen{
    String color;
    String type; //ball/gel
    public void write(){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}
class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
//non parameterized
    Student(){
        System.out.println("constructor called");
    }
//parameterised
    Student(String name, int age){
        this.name=name;
        this.age=age;
    }
    // copy constructor
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }
}
public class OOPS {
    public static void main(String args[]){
        Student s1 = new Student();
//        Student s1 = new Student("vidhish", 22);
        s1.name="vidhish";
        s1.age=22;

        Student s2 = new Student(s1);
        s1.printInfo();

//        Pen pen1 = new Pen();
//        pen1.color="blue";
//        pen1.type="gel";
//
//        Pen pen2 = new Pen();
//        pen2.color="black";
//        pen2.type="ball";
//
//        pen1.printColor();
//        pen2.printColor();
    }
}
