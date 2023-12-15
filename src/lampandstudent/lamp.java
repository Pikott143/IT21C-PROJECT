
package Lampandstudent;


public class lamp {
    
 boolean is_on;

    void turnOn() {
        System.out.println("Suga on!");
    }

    void turnOff() {
        System.out.println("suga off!");

    }
}
class main{
    
public static void main (String [] args){
    lamp led = new lamp();
    lamp Halogen = new lamp();
    led.turnOff();
    Halogen.turnOn();
    
}
}
