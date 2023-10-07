
public class nagad extends Account {
    private String pin;
    public double c=9.99;
    public double maxcashout=25000;
    public double maxaddMoney=30000;
    public double min=50;

    public nagad(String n, String no,double balance,String pin) {
        super(n,no, balance);
        this.pin=pin;
    }

    public void addmoney(double amount) {
        if(amount>maxaddMoney) {
            System.out.println("Error");
        }
        else {
            super.addmoney(amount);
        }
    }

    public void cashout(double amount,String pin) {
        if (pin != this.pin){
            System.out.println("Pin is incorrect");
            return;
        }
        else{

            if(amount>maxcashout || amount<min) {
                System.out.println("error");

            }
            else{
                if(amount>1000) {
                    amount=amount+amount*c/1000;
                    super.cashout(amount, pin);
                }
                else
                    super.cashout(amount, pin);
            }
        }
    }

    void information() {
        System.out.println("your ngad account is created");
        super.information();
    }

}
