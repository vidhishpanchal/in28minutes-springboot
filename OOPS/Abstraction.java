import javax.sound.midi.SysexMessage;

abstract class Animal{
    abstract void walk();
    public void eat(){
        System.out.println("Animal eats");
    }
    Animal(){
        System.out.println("Animal made");
    }
}
class Horse extends Animal{
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
    Horse(){
        System.out.println("Horse made");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walk on 2 legs");
    }
}
public class Abstraction {
    public static void main(String args[]){
        Horse horse = new Horse();
        horse.walk();
    }
}
