package Task10;

public class Herbaltea extends Tea {
    public Herbaltea(String name) {
        super();
        //TODO Auto-generated constructor stub
    }
    public void prepareTea()
    {
        System.out.println("This is a method that prepares a Herbaltea with hot water and herbs powder");
        System.out.println("Prepare the blacktea espesially in the eveningtime with herbs and leaves only");
    }
    public static void main(String args[])
    {
        Herbaltea herbaltea = new Herbaltea(teaname);
        herbaltea.prepareTea(); 
    }
    
}
