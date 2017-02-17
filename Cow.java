public class Cow extends Pet{
    public Cow(){
        super("Pasture");
    }
    public Cow(String name){
        super(name);
    }
    public String speak(){
        return("Moo.");
    }
    public void changecolor(){
        System.out.println("My color is blue");
    }
}