class Shape{
    public void area(){
        System.out.println("print area");
    }
}
class Traingle extends Shape{
    public void area(int b, int h){
        System.out.println(1/2*b*h);
    }
}
class EquilateralTriangle extends Traingle{
    public void area(int a){
        System.out.println(1.73*a*a/4);
    }
}

public class Inheritance {
    public static void main(String args[]){
       EquilateralTriangle et = new EquilateralTriangle();
       et.area(11);
    }
}
