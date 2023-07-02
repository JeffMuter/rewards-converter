public class RewardValue {

    // create member variables for cash input or miles input varying on which constructor used.
    private int miles = 0;
    private double cash = 0;

    //make 2 constructors
    //constructor 1 accepts cash
    //constructor 2 accepts miles


    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(int miles) {
        this.miles = miles;
    }

    public int getMilesValue() {
        return this.miles;
    }


    public double getCashValue() {
        return this.cash;
    }

    //rate of 0.0035
    public double getConversionToCash () {
        this.cash += (this.miles * 0.0035);
        return this.cash;
    }

    //rate of 285.71/1
    public int getConversionToMiles() {
        this.miles += (this.cash / 285.71);
        return this.miles;
    }
}
