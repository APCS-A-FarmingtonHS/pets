
/**
 * This class represent a collection of Pet objects
 * including objects of any class which IS-A Pet
 * @author (Tim Barron) 
 */
public class Zoo
{
    //fields
    private Pet[] theZoo;
    
    //constructors
    public Zoo()
    {
        theZoo = new Pet[40];
        theZoo[0] = new Pet("boring pet");
        theZoo[3] = new DireWolf();
    }

    public void soundOff()
    {
        for(int i = 0; i < theZoo.length; i++)
        {
            if(theZoo[i] != null)
                System.out.println("The " + theZoo[i].getName() + " says " + theZoo[i].getName());
            else
                System.out.println("There is no animal in that spot in the Zoo.");
        }
    }
}
