
/**
 * The Pet class - a start of the Pet Inheritance Hierarchy
 */
public class Pet
{
    //fields
    private String name;

    //constructors
    public Pet()
    {
        name = "default pet";
    }

    
    public Pet(String n)
    {
        name = n;
    }
    //methods
    
    public String getName()
    {
        return name;
    }
    
    public String speak()
    {
        return "default pet sound";
    }
}
