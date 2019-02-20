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
    final double sPRICE_CHEESEBURGER = 2.15; // Price of a cheeseburger
    final double sPRICE_DOUBLE_DOUBLE = 3.60; // Price of a double double
    final double sPRICE_FRENCH_FRIES = 1.65; // Price of french fries
    final double sPRICE_LARGE_DRINK = 1.75;  // Price of a large drink
    final double sPRICE_MEDIUM_DRINK = 1.55; // Price of medium drink
    final double sPRICE_SMALL_DRINK = 1.45;  // Price of small drink
    final double sPRICE_SHAKE = 2.20;    // Price of a shake
    final double sTAX_RATE = 0.08;   // Tax rate (8%)

    /**
     * Initializes all instance variables to zero
     */
    public Order()
    {
        mDoubleDouble = 0;
        mCheeseburger = 0;
        mFrenchFries = 0;
        mShakes = 0;
        mSmallDrinks = 0;
        mMediumDrinks = 0;
        mLargeDrinks = 0;
    }

    /**
     * Initializes the instance variables to the values in the parameters
     * @param doubleDouble  Number of double doubles in the order
     * @param cheeseburger  Number of cheeseburgers in the order
     * @param frenchFries   Number of french fries in the order
     * @param shakes    Number of shakes in the order
     * @param smallDrinks   Number of small drinks in the order
     * @param mediumDrinks  Number of medium drinks in the order
     * @param largeDrinks   Numbeer of large drinks in the order
     */
    public Order(int doubleDouble, int cheeseburger, int frenchFries, int shakes, int smallDrinks, int mediumDrinks, int largeDrinks) {
        mDoubleDouble = doubleDouble;
        mCheeseburger = cheeseburger;
        mFrenchFries = frenchFries;
        mShakes = shakes;
        mSmallDrinks = smallDrinks;
        mMediumDrinks = mediumDrinks;
        mLargeDrinks = largeDrinks;
    }

    /**
     * Returns the number of double doubles in the order
     * @return mDoubleDouble
     */
    public int getDoubleDouble() {
        return mDoubleDouble;
    }

    /**
     * Sets the number of double doubles in the order
     * @param doubleDouble  New number of double doubles in the order
     */
    public void setDoubleDouble(int doubleDouble) {
        mDoubleDouble = doubleDouble;
    }

    /**
     * Returns the number of cheeseburgers in the order
     * @return mCheeseburger
     */
    public int getCheeseburger() {
        return mCheeseburger;
    }

    /**
     * Sets the number of cheeseburgers in the order
     * @param cheeseburger  New number of cheeseburgers in the order
     */
    public void setCheeseburger(int cheeseburger) {
        mCheeseburger = cheeseburger;
    }

    /**
     * Returns the number of french fries in the order
     * @return  mFrenchFries
     */
    public int getFrenchFries() {
        return mFrenchFries;
    }

    /**
     * Sets the number of french fries in the order
     * @param frenchFries   The new number of french fries in the order
     */
    public void setFrenchFries(int frenchFries) {
        mFrenchFries = frenchFries;
    }

    /**
     * Returns the number of shakes in the order
     * @return  mShakes
     */
    public int getShakes() {
        return mShakes;
    }

    /**
     * Sets the number of shakes in the order
     * @param shakes    New number of shakes in the order
     */
    public void setShakes(int shakes) {
        mShakes = shakes;
    }

    /**
     * Returns the number of small drinks in the order
     * @return mSmallDrinks
     */
    public int getSmallDrinks() {
        return mSmallDrinks;
    }

    /**
     * Sets the number of small drinks in the order
     * @param smallDrinks   New number of small drinks in the order
     */
    public void setSmallDrinks(int smallDrinks) {
        mSmallDrinks = smallDrinks;
    }

    /**
     * Returns the number of medium drinks in the order
     * @return  mMediumDrinks
     */
    public int getMediumDrinks() {
        return mMediumDrinks;
    }

    /**
     * Sets the number of medium drinks in the order
     * @param mediumDrinks  New number of medium drinks in the order
     */
    public void setMediumDrinks(int mediumDrinks) {
        mMediumDrinks = mediumDrinks;
    }

    /**
     * Returns the number of large drinks in the order
     * @return  mLargeDrinks
     */
    public int getLargeDrinks() {
        return mLargeDrinks;
    }

    /**
     * Sets the number of large drinks in the order
     * @param largeDrinks   New number of large drinks in the order
     */
    public void setLargeDrinks(int largeDrinks) {
        mLargeDrinks = largeDrinks;
    }

    /**
     * Returns the subtotal in the order (does not include tax)
     * @return  subtotal
     */
    public double calculateSubtotal() {
        double subtotal = 0;
        subtotal += (mDoubleDouble * sPRICE_DOUBLE_DOUBLE);
        subtotal += (mCheeseburger * sPRICE_CHEESEBURGER);
        subtotal += (mFrenchFries * sPRICE_FRENCH_FRIES);
        subtotal += (mShakes * sPRICE_SHAKE);
        subtotal += (mSmallDrinks * sPRICE_SMALL_DRINK);
        subtotal += (mMediumDrinks * sPRICE_MEDIUM_DRINK);
        subtotal += (mLargeDrinks * sPRICE_LARGE_DRINK);

        return subtotal;
    }

    /**
     * Returns the amount of tax that results from the order
     * @return  tax
     */
    public double calculateTax() {
        double tax = 0.0;
        tax = this.calculateSubtotal();
        tax *= sTAX_RATE;

        return tax;
    }

    /**
     * Returns the total of the whole order including tax
     * @return  total
     */
    public double calculateTotal()
    {
        double total = 0.0;
        total += this.calculateSubtotal();
        total += this.calculateTax();

        return total;
    }
}
