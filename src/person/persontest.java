
package person;

public class persontest {
    public static void main(String[] args) {
        student annalyn = new student("Annalyn Jean", 2004, " Bachelor of Science in Information Technology");
        System.out.println("Student details: " + annalyn);
        
   
        instructor instructor = new instructor("Phoebe Ruth Alithea", 1995, 50000000);
        System.out.println("Instructor details: " + instructor);
        
        pet cat = new pet("freya and more");
        System.out.println("Students Pet:" + cat);

        
        
    }
}