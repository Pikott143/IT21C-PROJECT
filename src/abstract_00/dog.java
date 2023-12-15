package abstract_00;

/**
 *
 * @author Aj Cervantes
 */
public class dog extends pet{
        String name;

    dog(String name) {
        this.name = name;
    }

   
    public void Color() {
        System.out.println(name + " color brown");
    }
}