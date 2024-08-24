import java.util.Scanner;

public class RewardValue {
    private double cash;
    private double miles;

    public RewardValue(double cashVal) {
        this.cash = cashVal;
        this.miles = cashVal / 0.0035;
    }

    public RewardValue(int mileVal) {
        this.miles = mileVal;
        this.cash = mileVal * 0.0035;
    }

    public double getCashValue() {
        return cash;
    }

    public double getMilesValue() {
        return miles;
    }

}