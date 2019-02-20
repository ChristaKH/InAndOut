/***
 * This app takes your order at In-N-Out and gives you the total
 * including tax
 *
 * @author: Christa Hatch
 * @version: 1.0
 */
package chatch.cs134.miracosta.inandout.Model;

public class Order {
    // Instance variables
    private int mDoubleDouble;  // Number of double doubles
    private int mCheeseburger; // Number of cheeseburgers
    private int mFrenchFries; // Number of french fries
    private int mShakes;    // Number of shakes
    private int mSmallDrinks;   // Number of small drinks
    private int mMediumDrinks;  // Number of medium drinks
    private int mLargeDrinks;   // Number of large drinks

    // Constants
    final double PRICE_CHEESEBURGER = 2.15; // Price of a cheeseburger
    final double PRICE_DOUBLE_DOUBLE = 3.60; // Price of a double double
    final double PRICE_FRENCH_FRIES = 1.65; // Price of french fries
    final double PRICE_LARGE_DRINK = 1.75;  // Price of a large drink
    final double PRICE_MEDIUM_DRINK = 1.55; // Price of medium drink
    final double PRICE_SMALL_DRINK = 1.45;  // Price of small drink
    final double PRICE_SHAKE = 2.20;    // Price of a shake
    final double TAX_RATE = 0.08;   // Tax rate (8%)

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

    public int getSmallDrinks() {
        return mSmallDrinks;
    }

    public void setSmallDrinks(int smallDrinks) {
        mSmallDrinks = smallDrinks;
    }

    public int getMediumDrinks() {
        return mMediumDrinks;
    }

    public void setMediumDrinks(int mediumDrinks) {
        mMediumDrinks = mediumDrinks;
    }

    public int getLargeDrinks() {
        return mLargeDrinks;
    }

    public void setLargeDrinks(int largeDrinks) {
        mLargeDrinks = largeDrinks;
    }
}
