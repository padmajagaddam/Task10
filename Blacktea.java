package Task10;

public class Blacktea extends Tea {
    public Blacktea(String teaname) {
        super();
        //TODO Auto-generated constructor stub
    }

    public void prepareTea()
    { 
        System.out.println("This is a method that prepares a blacktea with hot water and tea powder");
        System.out.println("Prepare the blacktea espesially in the morningtime with blackleaves only");
    }

    public static void main(String args[])
{
    Blacktea blacktea = new Blacktea(teaname);
    blacktea.prepareTea();
}
}