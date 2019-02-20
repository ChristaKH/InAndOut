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


}
