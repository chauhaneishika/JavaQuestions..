public class ConstructorChallenge {
    private String Name;
    private double CreditLimit;
    private String EmailAddress;

    public ConstructorChallenge(String Name,String EmailAddress) {
        this(Name,100,EmailAddress);
    }

    public ConstructorChallenge() {
        this("Eishika","chauhaneishika@gmail.com");
    }
    public ConstructorChallenge(String Name,double CreditLimit,String EmailAddress) {
        System.out.println("Account constructor with parameters called");
        this.Name = Name;
        this.CreditLimit = CreditLimit;
        this.EmailAddress = EmailAddress;
    }

    public String getName() {
        return Name;
    }

    public double getCreditLimit() {
        return CreditLimit;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }
}
