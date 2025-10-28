public class BankAccount {
    private String AccountNumber ;
    private double AccountBalance ;
    private String CustomerName ;
    private String email ;
    private String PhoneNumber ;

    public BankAccount () {
        this("56789",2.50,"Default name","Default address","Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount (String AccountNumber,double AccountBalance, String CustomerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.AccountNumber = AccountNumber;
        this.AccountBalance = AccountBalance;
        this.CustomerName = CustomerName;
        this.email = email;
        this.PhoneNumber = PhoneNumber;

    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999",100.55,customerName,email,phoneNumber);
//        CustomerName = customerName;
//        this.email = email;
//        PhoneNumber = phoneNumber;
    }

    public void depositFunds(double depositAmount) {
        AccountBalance += depositAmount;
        System.out.println("Deposit of $ " + depositAmount + " made. New balance is $ " + AccountBalance);
    }
    public void withdrawFunds(double withdrawlAmount) {
        if(AccountBalance - withdrawlAmount < 0) {
            System.out.println("Insufficient Funds! You only have $" + AccountBalance + " in your account. ");
        } else{
            AccountBalance -= withdrawlAmount;
            System.out.println("Withdrawal of $" + withdrawlAmount + " processed, Remaining balance = $" + AccountBalance);
        }
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return AccountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        AccountBalance = accountBalance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
