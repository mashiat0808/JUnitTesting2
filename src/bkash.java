
public class bkash extends Account {
     String pin;
    public double c=17.5;
    public double max=25000;
    public double min=10;

    public bkash(String n, String no,double balance,String pin) {
        super(n,no, balance);
        this.pin=pin;
    }

    public bkash(String n, String no,double balance) {
        super(n,no, balance);
    }


    public void addmoney(double amount) {
        if(amount>max || amount<min)
            System.out.println("Error");

        else
            super.addmoney(amount);

    }
    public void cashout(double amount,String pin) {

        if (pin != this.pin){
            System.out.println("pin is incorrect");
            return;
        }
        else{
            if(amount>max || amount<min)
                System.out.println("Error");

            else{
                if(amount>500) {
                    amount=amount+amount*c/1000;
                    super.cashout(amount,pin);
                }
                else
                    super.cashout(amount,pin);
            }
        }
    }

    public void cashout(double amount){
        if(pin == null) {
            System.out.println("set your pin please");
        }
    }
    public void pinset(String pincode) {
        this.pin=pincode;
        System.out.println("Pin added");
    }

    void information() {
        System.out.println("your bkash account is created");
        super.information();
    }

}
