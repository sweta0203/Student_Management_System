package Models;

public class Bill {
    double amount;
    String description;

    // Constructor
    public Bill(double amount, String description) {
        this.amount = amount;
        this.description = description;
    }

    // getter and setter
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

}
