package finals;

/**
 *
 * @author Aj Cervantes
 */

public class instructor extends person  {
    
    private double salary;

	public instructor(String n, int byear, double s)
        {
            super(n, byear);
      salary = s;
        }
public String toString()
    {
        return "Employee[super=" + super.toString() + ",salary=" + salary + "]";
    }
    }
 
