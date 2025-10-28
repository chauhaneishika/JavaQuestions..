public class Main2 {
    public static void main(String[] args) {

//
        BankAccount bobsAccount = new BankAccount();
        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getAccountBalance());


//        bobsAccount.setAccountNumber("12345");
//        bobsAccount.setAccountBalance(1000.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setEmail("chauhaneishika@gmail.com");
//        bobsAccount.setPhoneNumber("(087) 123-4567");

        bobsAccount.withdrawFunds(100);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);

        bobsAccount.withdrawFunds(200);

        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);

        bobsAccount.withdrawFunds(54.45);

        BankAccount timsAccount = new BankAccount("Tim","tim@email.com","12345");
        System.out.println("AccountNo: " + timsAccount.getAccountNumber() +
                "; name " + timsAccount.getCustomerName());

    }
}
