
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
        theZoo[1] = new Pet("boring pet");
        theZoo[2] = new Pet("boring pet");
        theZoo[3] = new Pet("boring pet");
        theZoo[4] = new Pet("boring pet");
        theZoo[5] = new Pet("boring pet");
        theZoo[6] = new Pet("boring pet");
        theZoo[7] = new Pet("boring pet");
        theZoo[8] = new Pet("boring pet");
        theZoo[9] = new Pet("boring pet");
        theZoo[10] = new Pet("boring pet");
        theZoo[11] = new Pet("boring pet");
        theZoo[12] = new Pet("boring pet");
        theZoo[13] = new Pet("boring pet");
        theZoo[14] = new Pet("boring pet");
        theZoo[15] = new Pet("boring pet");
        theZoo[16] = new Pet("boring pet");
        theZoo[17] = new Pet("boring pet");
        theZoo[18] = new Pet("boring pet");
        theZoo[19] = new DireWolf();
        theZoo[20] = new Pet("boring pet");
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
