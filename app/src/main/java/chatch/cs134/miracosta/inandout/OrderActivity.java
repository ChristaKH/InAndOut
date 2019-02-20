/**
 * This is the corresponding java file ro the activity_order.xml
 * This program controls the summary or total information of the order
 *
 * @author: Christa Hatch
 * @version: 1.0
 */
package chatch.cs134.miracosta.inandout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

public class OrderActivity extends AppCompatActivity {

    TextView orderTotalTextView;
    TextView itemsOrderedTextView;
    TextView subtotalTextView;
    TextView taxTextView;
    Button startNewOrderButton;
    NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.getDefault());

    /**
     * Acts as the main method of the class. Starts the current activity based
     * on the info from the previous intent/activity
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        // Connect variables in this class to views in XML
        orderTotalTextView = findViewById(R.id.orderTotalTextView);
        itemsOrderedTextView = findViewById(R.id.itemsOrderedTextView);
        subtotalTextView = findViewById(R.id.subtotalTextView);
        taxTextView = findViewById(R.id.taxTextView);
        startNewOrderButton = findViewById(R.id.startNewOrderButton);

        // Take in other intent
        Intent orderIntent = getIntent();

        // Take info from intent: order total, number of items in order, subtotal,
        // and tax
        double orderTotal = orderIntent.getDoubleExtra("Total", 0.00);
        int itemsOrdered = orderIntent.getIntExtra("ItemTotal", 0);
        double subtotal = orderIntent.getDoubleExtra("Subtotal", 0.00);
        double tax = orderIntent.getDoubleExtra("Tax", 0.00);

        // Use intent values to change views
        orderTotalTextView.setText("Order Total " + currency.format(orderTotal));
        itemsOrderedTextView.setText("Items Ordered: " + itemsOrdered);
        subtotalTextView.setText("Subtotal: " + currency.format(subtotal));
        taxTextView.setText("Tax (8%): " + currency.format(tax));
    }

    /**
     * Method that corresponds to the button in activity_order.xml that allows you
     * to go back to the main order activity to place a new order
     * @param v current view
     */
    public void placeNewOrder(View v)
    {
        // No information gets passed to the main order page
        // Returns to the main order page even if the original order came from
        // the secret menu page
        // Create intent and start the new activity
        Intent mainIntent = new Intent(this, MainActivity.class);
        startActivity(mainIntent);
    }
}
