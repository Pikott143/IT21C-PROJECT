
package polimorphism;

public class main {
    
    public static void main(String[]args){
        
       pet pet = new pet(" cat, rabbit and dog");
       dog dog = new dog(" iro"); 
       cat cat = new cat(" Inky");
        
        //local methods
        pet.chill();
        dog.chill();
        cat.chill();
        
    }
}