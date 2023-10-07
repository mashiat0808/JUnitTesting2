
public class rocket extends Account{

    private String pin;
    public double c=9;
    public double max=30000;
    public double min=50;

    public rocket(String n, String no,double balance,String pin) {
        super(n,no, balance);
        this.pin=pin;
    }

    public void addmoney(double amount) {
        if(amount>max || amount<min) {
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

            if(amount>max || amount<min) {
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
        System.out.println("your rocket account is created");
        super.information();
    }

}
