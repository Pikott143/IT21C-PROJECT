/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

/**
 *
 * @author Aj Cervantes
 */

 public class pet {
    
  private String Pet;
  
  public pet(String Pet) {   
   this.Pet = Pet;   
}
  
public String getPet(){
return Pet;
}

public void setPet(String Pet) {
this.Pet = Pet;
}

public String toString(){
  return "[Name: " +  Pet + "]";     
}
}