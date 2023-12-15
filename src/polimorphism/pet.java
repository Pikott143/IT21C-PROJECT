package polimorphism;

public class pet {

    
     String name;
    
 pet(String name){
      
   this.name = name;   
       
  } 
  
 void purring(){
     System.out.println(name + "is purring");
     
 } 
  
void chill(){
     System.out.println("ga pa chill sila" + name);
     
}
}