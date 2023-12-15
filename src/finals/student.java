package finals;

/**
 *
 * @author Aj Cervantes
 */
public class student extends person {
    private String major;

  public student(String n, int byear, String m) 
 {
     super(n, byear);
     major = m;
 }
  public String toString()
  {
    return "student[super =" + super.toString() + ",major =" + major + "]";
  }
    
}
