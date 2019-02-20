package chatch.cs134.miracosta.inandout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import chatch.cs134.miracosta.inandout.Model.Order;

public class MainActivity extends AppCompatActivity {

    EditText doubleDoubleEditText;
    EditText cheeseburgerEditText;
    EditText frenchFriesEditText;
    EditText shakesEditText;
    EditText smallEditText;
    EditText mediumEditText;
    EditText largeEditText;
    Button  placeOrderButton;

    Order order;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connect Views
        doubleDoubleEditText = findViewById(R.id.doubleDoubleEditText);
        cheeseburgerEditText = findViewById(R.id.cheeseburgerEditText);
        frenchFriesEditText = findViewById(R.id.frenchFriesEditText);
        shakesEditText = findViewById(R.id.shakesEditText);
        smallEditText = findViewById(R.id.smallEditText);
        mediumEditText = findViewById(R.id.mediumEditText);
        largeEditText = findViewById(R.id.largeEditText);
        placeOrderButton = findViewById(R.id.placeOrderButton);
        order = new Order();
    }

    /**
     * Take in the user input to calculate the order and send the values
     * to another activity
     * @param v Takes in a view or in this case a button
     */
    public void placeOrder(View v){
        Intent orderIntent = new Intent(this, OrderActivity.class);
        int itemTotals = 0;

        if( doubleDoubleEditText.getText().toString() != ""){
                order.setDoubleDouble(Integer.parseInt(doubleDoubleEditText.getText().toString()));
                itemTotals += Integer.parseInt(doubleDoubleEditText.getText().toString());
        }

        if(cheeseburgerEditText.getText().toString() != ""){
            order.setCheeseburger(Integer.parseInt(cheeseburgerEditText.getText().toString()));
            itemTotals += Integer.parseInt(cheeseburgerEditText.getText().toString());
        }

        if(frenchFriesEditText.getText().toString() != ""){
            order.setFrenchFries(Integer.parseInt(frenchFriesEditText.getText().toString()));
            itemTotals += Integer.parseInt(frenchFriesEditText.getText().toString());
        }

        if(shakesEditText.getText().toString() != ""){
            order.setShakes(Integer.parseInt(shakesEditText.getText().toString()));
            itemTotals += Integer.parseInt(shakesEditText.getText().toString());
        }

        if(smallEditText.getText().toString() != ""){
            order.setSmallDrinks(Integer.parseInt(smallEditText.getText().toString()));
            itemTotals += Integer.parseInt(smallEditText.getText().toString());
        }

        if(mediumEditText.getText().toString() != ""){
            order.setMediumDrinks(Integer.parseInt(mediumEditText.getText().toString()));
            itemTotals += Integer.parseInt(mediumEditText.getText().toString());
        }

        if(largeEditText.getText().toString() != ""){
            order.setLargeDrinks(Integer.parseInt(largeEditText.getText().toString()));
            itemTotals += Integer.parseInt(largeEditText.getText().toString());
        }

        orderIntent.putExtra("ItemTotal", itemTotals);
        orderIntent.putExtra("Total", order.calculateTotal());
        orderIntent.putExtra("Subtotal", order.calculateSubtotal());
        orderIntent.putExtra("Tax", order.calculateTax());

        startActivity(orderIntent);
    }

    /**
     * When the secret menu button is clicked this method pulls up the SecretMenuActivity
     * No transfer of information is needed
     * @param v current view
     */
    public void secretMenu(View v){
        // Create an intent to go to the secret menu
        Intent secretMenuIntent = new Intent(this, SecretMenuActivity.class);
        startActivity( secretMenuIntent);
    }
}
