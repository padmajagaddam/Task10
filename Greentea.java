package Task10;

public class Greentea extends Tea{
    public Greentea(String name) {
        super();
        //TODO Auto-generated constructor stub
    }


    public void prepareTea()
    {
        System.out.println("This is a method that prepares a greentea with hot water and green leaves");
        System.out.println("Prepare the blacktea espesially in the Afternoon time with greenleaves only");
    }
    

public static void main(String args[])
{
    Greentea  greentea= new Greentea(teaname);
    greentea.prepareTea();
}
}