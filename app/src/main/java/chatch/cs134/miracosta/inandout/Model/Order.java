package chatch.cs134.miracosta.inandout.Model;

public class Order {
    private int mDoubleDouble;
    private int mCheeseburger;
    private int mFrenchFries;
    private int mShakes;
    private int mSmall;
    private int mMedium;
    private int mLarge;

    public int getDoubleDouble() {
        return mDoubleDouble;
    }

    public void setDoubleDouble(int doubleDouble) {
        mDoubleDouble = doubleDouble;
    }

    public int getCheeseburger() {
        return mCheeseburger;
    }

    public void setCheeseburger(int cheeseburger) {
        mCheeseburger = cheeseburger;
    }

    public int getFrenchFries() {
        return mFrenchFries;
    }

    public void setFrenchFries(int frenchFries) {
        mFrenchFries = frenchFries;
    }

    public int getShakes() {
        return mShakes;
    }

    public void setShakes(int shakes) {
        mShakes = shakes;
    }

    public int getSmall() {
        return mSmall;
    }

    public void setSmall(int small) {
        mSmall = small;
    }

    public int getMedium() {
        return mMedium;
    }

    public void setMedium(int medium) {
        mMedium = medium;
    }

    public int getLarge() {
        return mLarge;
    }

    public void setLarge(int large) {
        mLarge = large;
    }

    @Override
    public String toString() {
        return "Order{" +
                "mDoubleDouble=" + mDoubleDouble +
                ", mCheeseburger=" + mCheeseburger +
                ", mFrenchFries=" + mFrenchFries +
                ", mShakes=" + mShakes +
                ", mSmall=" + mSmall +
                ", mMedium=" + mMedium +
                ", mLarge=" + mLarge +
                '}';
    }
}
