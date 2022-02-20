


class InSufficientFundException extends RuntimeException {


    /**

     *

     */

    private static final long serialVersionUID = 1L;

    private String message;


    public InSufficientFundException(String message) {

        this.message = message;

    }


    public InSufficientFundException(Throwable cause, String message) {

        super(cause);

        this.message = message;

    }


    public String getMessage() {

        return message;

    }


}

class Bank{

    int rateofintrest;

    public int getdetails()

    {

        return rateofintrest;

    }

    public void setdetails(int roi)

    {

        rateofintrest=roi;

    }
    public void printdetails()

    {

        System.out.println("the rate of intrest of BANK is -" + rateofintrest);

    }

    enum acc_type{

        SAVINGS , CURRENT

    }

}

class SBI extends Bank{

    int rateofintrest;

    private int balance = 3000;

    public int balance() {

        return balance;

    }

    public int getdetails()

    {

        return rateofintrest;

    }

    public void setdetails(int roi)

    {

        rateofintrest=roi;

    }

    public void printdetails()

    {

        System.out.println("the rate of intrest of SBI is -" + rateofintrest);

    }

    enum acc_type{

        SAVINGS , CURRENT

    }

    public void withdraw(int amount) throws InSufficientFundException {

        if(amount > balance) {

            throw new InSufficientFundException(String.format("Current balance %d is less than requested amount %d",balance,amount));



        }

        balance = balance-amount;

    }

    public void deposit(int amount) {

        if(amount <=0) {

            throw new IllegalArgumentException(String.format("Invalid Deposit Amount %s",amount));

        }

    }



}

class BOI extends Bank{

    int rateofintrest;

    private int balance = 6000;

    public int balance() {

        return balance;

    }

    public int getdetails()

    {

        return rateofintrest;

    }

    public void setdetails(int roi)

    {

        rateofintrest=roi;

    }

    public void printdetails()

    {

        System.out.println("the rate of intrest of BOI is -" + rateofintrest);

    }

    enum acc_type{

        SAVINGS , CURRENT

    }

    public void withdraw(int amount) throws InSufficientFundException {

        if(amount > balance) {



            throw new InSufficientFundException(String.format("Current balance %d is less than requested amount %d",balance,amount));



        }

        balance = balance-amount;

    }

    public void deposit(int amount) {

        if(amount <=0) {

            throw new IllegalArgumentException(String.format("Invalid Deposit Amount %s",amount));

        }

    }

}
class ICICI extends Bank{

    int rateofintrest;

    private int balance = 5000;

    public int balance() {

        return balance;

    }

    public int getdetails()

    {

        return rateofintrest;

    }

    public void setdetails(int roi)

    {

        rateofintrest=roi;

    }

    public void printdetails()

    {

        System.out.println("the rate of intrest of ICICI is -" + rateofintrest);

    }

    enum acc_type{

        SAVINGS , CURRENT

    }

    public void withdraw(int amount) throws InSufficientFundException {

        if(amount > balance) {

            throw new InSufficientFundException(String.format("Current balance %d is less than requested amount %d",balance,amount));



        }

        balance = balance-amount;

    }

    public void deposit(int amount) {

        if(amount <=0) {

            throw new IllegalArgumentException(String.format("Invalid Deposit Amount %s",amount));

        }

    }

}



