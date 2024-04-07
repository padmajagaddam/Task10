package Task10;

public class Person {
    public String name;
    public int age;
    public  Person()
    {
        name = "yashoda";
        age=55;
        //System.out.println("the name of the person is "+name);
       // System.out.println("the age of the person is "+age);

    }
    public  Person(String Name,int Age)
    {
        name=Name;
        age=Age;
    }
    public String getPerson()
    {
        return name;
    }
    public int getAge(){

    
        return age;
    }
    public static void main(String []args)
    {
        Person person= new Person();
        person.getPerson();
        person.getAge();
        System.out.println(person.name +"||"+ person.age);
        Person padmaja=new Person("paddu",38);
        Person tirupathi=new Person("tiru",41);
        Person sai=new Person("jaideep",13);
        Person neha=new Person("neha",9);
        System.out.println(padmaja.name +"||"+ padmaja.age);
        System.out.println(tirupathi.name+"||"+ tirupathi.age);
        System.out.println(sai.name+"||"+sai.age);
        System.out.println(neha.name+"||"+ neha.age);
        System.out.println("the name from getter method " +person.getPerson());
        System.out.println("the age from getter method " +person.getAge());



    }

    
}
