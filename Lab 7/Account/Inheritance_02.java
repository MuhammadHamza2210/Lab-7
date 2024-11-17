package lab07;
class Member {
    private String memberName;
    private String memberEmail;
    private String memberContact;

    
    public Member(String memberName, String memberEmail, String memberContact) {
        this.memberName = memberName;
        this.memberEmail = memberEmail;
        this.memberContact = memberContact;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public String getMemberContact() {
        return memberContact;
    }
}

class Account {
    protected String accountType;
    protected int accountNo;
    protected String accountBranch;
    protected double accountBalance;
    protected Member accountOwner;

    
    public Account(String accountType, int accountNo, Member accountOwner, double accountBalance) {
        this.accountType = accountType;
        this.accountNo = accountNo;
        this.accountOwner = accountOwner;
        this.accountBalance = accountBalance;
    }

    public String getAccountType() {
        return accountType;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public String getAccountBranch() {
        return accountBranch;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getOwnerName() {
        return accountOwner.getMemberName();
    }

    public String getOwnerEmail() {
        return accountOwner.getMemberEmail();
    }

    public String getOwnerContact() {
        return accountOwner.getMemberContact();
    }

   
    public void displayInfo() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + accountBalance);
        System.out.println("Account Owner: " + getOwnerName());
        System.out.println("Owner Email: " + getOwnerEmail());
        System.out.println("Owner Contact: " + getOwnerContact());
        System.out.println("-----------");
    }
}


class CurrentAccount extends Account {

    public CurrentAccount(String accountType, int accountNo, Member accountOwner, double accountBalance) {
        super(accountType, accountNo, accountOwner, accountBalance);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("This is a Current Account.");
    }
}


class SavingAccount extends Account {

    public SavingAccount(String accountType, int accountNo, Member accountOwner, double accountBalance) {
        super(accountType, accountNo, accountOwner, accountBalance);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("This is a Saving Account.");
    }
}

public class Inheritance_02 {
    public static void main(String[] args) {
       
        Member member1 = new Member("MUHAMMAD HAMZA", "hamza@gmail.com", "1234567890");
        Member member2 = new Member("Muhammad Umer", "umer@gmail.com", "0987654321");
        Member member3 = new Member("Muhammad Usman", "usman@gmail.com", "1122334455");

        CurrentAccount currentAccount1 = new CurrentAccount("Current", 101, member1, 1500.00);
        CurrentAccount currentAccount2 = new CurrentAccount("Current", 102, member2, 2500.00);
        SavingAccount savingAccount = new SavingAccount("Saving", 201, member3, 3000.00);

        System.out.println("Account Information:");
        currentAccount1.displayInfo();
        currentAccount2.displayInfo();
        savingAccount.displayInfo();
    }
}
