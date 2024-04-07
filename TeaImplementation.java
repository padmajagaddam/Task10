package Task10;
class Tea{
    public static String teaname;
    public Tea(String name){

    
    
        Tea.teaname = name;
    }
    public String getName()
        {
            return teaname;
        }
    
    public void prepareTea(){
   System.out.println("preparing the tea " +teaname);
    }

}
class Blacktea extends Tea
{
    
 public Blacktea(String name)
 {
    super(name);
 }
 public void prepareTea(){
    System.out.println("preparing the blacktea " +teaname);
     }
}
class Greentea extends Tea{
    public Greentea(String name)
    {
        super(name);
    }
    public void prepareTea(){
        System.out.println("preparing the greentea " +teaname);
         }
    }
    class Herbaltea extends Tea{
        public Herbaltea(String name)
        {
            super(name);
        }
        public void prepareTea(){
            System.out.println("preparing the greentea " +teaname);
             }
        }
public class TeaImplementation {
    public static void main(String args[])
    {
        Tea []  teas= new Tea[4];
        teas[1] = new Blacktea("Blacktea");
        teas[0] = new Blacktea("Tea");
         teas[2] = new Greentea("Greentea");
         teas[3] = new Herbaltea("Herbaltea");
        /*  System.out.println(teas[0].getName());
         System.out.println(teas[1].getName());
         System.out.println(teas[2].getName());
         System.out.println(teas[3].getName());*/
         teas[0].prepareTea();
         teas[1].prepareTea();
         teas[2].prepareTea();
         teas[3].prepareTea();
    }
    
}
