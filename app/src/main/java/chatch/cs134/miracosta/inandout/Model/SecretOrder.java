/**
 * This model performs the mathematical calculations related to the secret
 * menu for In-N-Out
 *
 * @author: Christa Hatch
 * @version: 1.0
 */

package chatch.cs134.miracosta.inandout.Model;

public class SecretOrder {
    private int mDoubleMeat;
    private int mThreeByThree;
    private int mFourByFour;
    private int mGrilledCheese;
    private int mProteinStyle;
    private int mAnimalStyle;

    public static final double sPRICE_DOUBLE_MEAT = 2.85;
    public static final double sPRICE_THREE_BY_THREE = 4.45;
    public static final double sPRICE_FOUR_BY_FOUR = 5.50;
    public static final double sPRICE_GRILLED_CHEESE = 2.35;
    public static final double sPRICE_PROTEIN_STYLE = 3.90;
    public static final double sPRICE_ANIMAL_STYLE = 3.40;

    /**
     * Initializes all instance variables
     * @param doubleMeat    Number of double meats in the order
     * @param threeByThree  Number of 3x3's in the order
     * @param fourByFour    Number of 4x4's in the order
     * @param grilledCheese Number of grilled cheeses in the order
     * @param proteinStyle  Number of protein styles in the order
     * @param animalStyle   Number of animal styles in the order
     */
    public SecretOrder(int doubleMeat, int threeByThree, int fourByFour, int grilledCheese, int proteinStyle, int animalStyle) {
        mDoubleMeat = doubleMeat;
        mThreeByThree = threeByThree;
        mFourByFour = fourByFour;
        mGrilledCheese = grilledCheese;
        mProteinStyle = proteinStyle;
        mAnimalStyle = animalStyle;
    }

    /**
     * Initializes all instance variables to 0 so the order has 0 items in it
     */
    public SecretOrder()
    {
        mDoubleMeat = 0;
        mThreeByThree = 0;
        mFourByFour = 0;
        mGrilledCheese = 0;
        mProteinStyle = 0;
        mAnimalStyle = 0;
    }

    /**
     * Returns the number of double meats in the order
     * @return  mDoubleMeat
     */
    public int getDoubleMeat() {
        return mDoubleMeat;
    }

    /**
     * Sets the number of double meats in the order
     * @param doubleMeat    New number of double meats in the order
     */
    public void setDoubleMeat(int doubleMeat) {
        mDoubleMeat = doubleMeat;
    }

    /**
     * Returns the number of 3x3's in the order
     * @return  mThreeByThree
     */
    public int getThreeByThree() {
        return mThreeByThree;
    }

    /**
     * Sets the number of 3x3's in the order
     * @param threeByThree  New number of 3x3's in the order
     */
    public void setThreeByThree(int threeByThree) {
        mThreeByThree = threeByThree;
    }

    /**
     * Returns the number of 4x4's in the order
     * @return  mFourByFour
     */
    public int getFourByFour() {
        return mFourByFour;
    }

    /**
     * Sets the number of 4x4's in the order
     * @param fourByFour    New number of 4x4's in the order
     */
    public void setFourByFour(int fourByFour) {
        mFourByFour = fourByFour;
    }

    /**
     * Returns the number of grilled cheeses in the order
     * @return  mGrilledCheese
     */
    public int getGrilledCheese() {
        return mGrilledCheese;
    }

    /**
     * Sets the number of grilled cheeses in the order
     * @param grilledCheese New number of grilled cheese in the order
     */
    public void setGrilledCheese(int grilledCheese) {
        mGrilledCheese = grilledCheese;
    }

    /**
     * Returns the number of protein style in the order
     * @return  mProteinStyle
     */
    public int getProteinStyle() {
        return mProteinStyle;
    }

    /**
     * Sets the number of protein style in the order
     * @param proteinStyle  New number of protein style fries in the order
     */
    public void setProteinStyle(int proteinStyle) {
        mProteinStyle = proteinStyle;
    }

    /**
     * Return the number of animal style fries in the order
     * @return  mAnimalStyle
     */
    public int getAnimalStyle() {
        return mAnimalStyle;
    }

    /**
     * Sets the number of animal style fries in the order
     * @param animalStyle   New number of animal style fries in the order
     */
    public void setAnimalStyle(int animalStyle) {
        mAnimalStyle = animalStyle;
    }
}
