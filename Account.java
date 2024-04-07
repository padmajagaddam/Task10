package Task10;

public class Account {
       public double Balance;
        public double AcctNo;
    
        //Behaviors
    
        public void setBalance(double bal) 
        {
            Balance = bal;
        }
        public double getBalance() 
        {
            return Balance;
        }
        public void setAcctNo(double an) 
        {
            AcctNo = an;
        }
        public double getAcctNo()
         {
            return AcctNo;
        }
    
        //Constructor with out argument
        public Account()  {
            super();
            Balance=0;
            AcctNo=0;
        }
    // constructor with two arguments
        public Account(double bal, double an) {
            super();
            Balance=bal;
            AcctNo=an;
        }
    
        public void deposit(double d) {
         Balance = d+Balance;
            System.out.println("the balance after deposite is "+Balance);
        }
    
        public void withdraw(double f) {
            Balance=Balance-f;
            System.out.println("the balance after withdraw " +Balance);
        }
    
    
        public void display() {
            System.out.println("Balance   = " + getBalance());
            System.out.println("Account Number   = " + getAcctNo());
        }
    
    
        public static void main (String args []) {
            Account a1 = new Account();
            a1.setBalance(1000);
            a1.setAcctNo(2222);
            a1.deposit(100.00);
            a1.withdraw(250);
            a1.display();
        }



    }
    

