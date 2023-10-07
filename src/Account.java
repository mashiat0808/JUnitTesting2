
public class Account {
    String name;
    String phone_no;
    double balance;

    public Account(String n, String num,double b)
    {
        this.name = n;
        this.phone_no = num;
        this.balance=b;
    }


    void information()
    {
        System.out.println("Name: "+name);
        System.out.println("Mobile Number: "+phone_no);
        System.out.println("Balance: "+ balance);
    }

    public void addmoney(double amount){
        this.balance =this.balance+amount;
        System.out.println("add money " + amount);
        System.out.println("new balance "+ balance);
    }

    public void cashout(double amount, String pin)
    {

        if (balance < amount)
        {
            System.out.println("insufficient balance");
        }

        else {
            balance = balance-amount;
            System.out.println("cash out: " + amount);
            System.out.println("new balance: "+ balance);
        }

    }

}
