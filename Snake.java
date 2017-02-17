public class Snake extends Pet
{
	public Snake()
	{
		super("Slither");
     //name = “Slither”; How set this field to something different than in the Pet class
	}
	public Snake (String theName)
	{
		super(theName);
	}
	public String speak()
	{
		return "Hissss";
	}
	public String showColor()
	{
	    return "Green";
	}
}
