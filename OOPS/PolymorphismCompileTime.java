class Student1{
    String name;
    int age;
    public void printInfo1(String name){
        System.out.println(name);
    }
    public void printInfo1(int age){
        System.out.println(age);
    }
    public void printInfo1(String name, int age){
        System.out.println(name + " : " + age);
    }
}

public class PolymorphismCompileTime {
    public static void main(String args[]){
        Student1 s1 = new Student1();
        s1.printInfo1("vidhish");
        s1.printInfo1(22);
        s1.printInfo1("vidhish", 22);
    }
}
