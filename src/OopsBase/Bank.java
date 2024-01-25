package src.OopsBase;

public class Bank {

    private String ccy;

    private int amount;

    public String getCcy() {

        return ccy;
    }

    public Integer getamount() {

        return amount;
    }

    public void setCcy(String ccy) {

        this.ccy = ccy;
    }

    public void setAmount(String ccy) {

        this.amount = amount;
    }

    public Bank(String ccy, int amount) {

        this.amount = amount;
        this.ccy = ccy;
    }

    public int add(Bank bankName) {

        Integer sum = this.amount + bankName.amount;

        return sum;
    }
}
