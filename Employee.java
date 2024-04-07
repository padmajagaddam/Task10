package Task10;
class Employee {  
  //Creating properties of Employee class  
int emp_id, salary;  
String firstname,lastname,name;
private Object paddu;  

//Getter and setters for getting and setting properties  
public int getEmp_id() {  
  return emp_id;  
}  
public void setEmp_id(int emp_id) {  
  this.emp_id = emp_id;  
}  
public int getAnnualSalary(int salary){
  return 12*salary;
}
public int getSalary() {  
  return salary;  
}  
public void setSalary(int salary) {  
  this.salary = salary;  
}  
public String getFirstname(){
  return firstname;
}
public void setFirstname(String firstname){
  this.firstname = firstname;
}
public String getLastname(){
  return lastname;
}
public void setLastname(String lastname){
  this.lastname = lastname;
}
public String getName() {  
  return firstname ;
}  
public void setName(String firstname,String lastname) {  
  this.firstname = firstname; 
  this.lastname = lastname; 
}  
  public Employee(int emp_id,String firstname,String lastname,int salary)
  {
    this.emp_id =emp_id;
    this.firstname = firstname;
    this.lastname =lastname;
    this.salary = salary;
    System.out.println("The id of the employee is " + emp_id);
    System.out.println("The firstname of the employee is " + firstname);
    System.out.println("The lastnameof the employee is " + lastname);
    System.out.println("The salaryof the employee is " + salary);
  }
  
  

  public int raiseSalary(int salary)
  {
    Employee emp= new Employee(765,"nishal","Chennu",40000);
    int sal = emp.getSalary(); 
 
      int increment = 0;  
        //Incrementing salary based on condition  
        if ((sal >=10000) && (sal <=20000))  
        {  
            //incrementing salary 2%  
            increment += (sal * 2)/100;  
            sal = sal+increment;  
              
            emp.setSalary(sal);  
            System.out.println("\n Salary is incremented \n");  
            System.out.println(emp);  
              
        }else if ((sal >=15000) && (sal <=200000)){  
            //incrementing salary 5%  
            increment += (sal * 5)/100;  
            sal = sal+increment;  
                   
          emp.setSalary(sal);  
          System.out.println("\n Salary is incremented \n");  
          System.out.println(emp);  
      }else {  
          System.out.println("\n Salary is not incremented \n");  
          System.out.println(emp); 
      }
        return increment; 
  }

//Overriding toString() method  
@Override  
public String toString() {  
  return "Employee [emp_id = " + emp_id + ", salary = " + salary + ", name = " + firstname + " "+ lastname+ "]";  
  }  
    

//Creating main class  
//public class Employee{  
  //main() method start  
  public static void main(String args[]) {  
        
      //Creating object of EmployeeDetails class  
      Employee paddu= new Employee(689, "Padmaja","Gaddam", 30000);
      Employee Tiru=new Employee(789, "Tirupathi", "Gaddam", 100000);
      //Setting values to the properties  
      
       //Showing Employee details  
     // System.out.println(raiseSalary());  
        paddu.raiseSalary(25000);
      
  }  
}  