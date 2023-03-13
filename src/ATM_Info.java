
public class ATM_Info extends Bank{

    private int atmId;
    private ATM_Transactions transaction;
    private String location;

    public ATM_Info(int bankId, String location, String bankName) {
        super(bankId, location, bankName);
    }

    public void changePassword() {
    }

    public void checkBalance() {
    }
}