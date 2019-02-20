package chatch.cs134.miracosta.inandout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    TextView orderTotalTextView;
    TextView itemsOrderedTextView;
    TextView subtotalTextView;
    TextView taxTextView;
    Button startNewOrderButton;

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
    }
}
