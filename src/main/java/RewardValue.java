import java.util.Scanner;

public class RewardValue {
    private double flightCash;
    private double miles;

    public RewardValue(double cashVal) {
        this.flightCash = cashVal;
        this.miles = cashVal / 0.0035;
    }

    public RewardValue(int mileVal) {
        this.miles = mileVal;
        this.flightCash = mileVal * 0.0035;
    }

    public double getCashValue() {
        return flightCash;
    }

    public double getMilesValue() {
        return miles;
    }

}