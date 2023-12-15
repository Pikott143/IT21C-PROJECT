package finals;

/**
 *
 * @author Aj Cervantes
 */
public class person{
    
       

private String name;
	private int birthofYear;

	public person(String n, int byear)
{
  name = n;
	  birthofYear = byear;
	}
public String toString()
	{
  return "Person[name=" + name + ",birthofYear=" + birthofYear + "]";
}
}