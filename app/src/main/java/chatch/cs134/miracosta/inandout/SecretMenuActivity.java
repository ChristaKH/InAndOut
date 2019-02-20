/**
 * This is the java file that corresponds to the secret menu activity
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
import android.widget.EditText;

import chatch.cs134.miracosta.inandout.Model.SecretOrder;

public class SecretMenuActivity extends AppCompatActivity {

    // Create variables that correspond to the view in the xml
    EditText doubleMeatEditText;
    EditText threeByThreeEditText;
    EditText fourByFourEditText;
    EditText grilledCheeseEditText;
    EditText proteinStyleEditText;
    EditText animalStyleEditText;
    Button placeOrderButton;
    SecretOrder order;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secret_menu);

        //Connect variables to corresponding views
        doubleMeatEditText = findViewById(R.id.doubleMeatEditText);
        threeByThreeEditText = findViewById(R.id.threeByThreeEditText);
        fourByFourEditText = findViewById(R.id.fourByFourEditText);
        grilledCheeseEditText = findViewById(R.id.grilledCheeseEditText);
        proteinStyleEditText = findViewById(R.id.proteinStyleEditText);
        animalStyleEditText = findViewById(R.id.animalStyleEditText);
        placeOrderButton = findViewById(R.id.placeOrderButton);

        // Start new intent
        Intent mainIntent = getIntent();

        // Start secret order model
        order = new SecretOrder();
    }

    /**
     * Changes activity to the order summary activity and sends the intent information
     * @param v Current view
     */
    public void placeOrder(View v){
        int itemTotal = 0;

        // Update order
        if(! doubleMeatEditText.getText().toString().equals("")){
            order.setDoubleMeat(Integer.parseInt(doubleMeatEditText.getText().toString()));
            itemTotal += Integer.parseInt(doubleMeatEditText.getText().toString());
        }
        if(! threeByThreeEditText.getText().toString().equals("")){
            order.setThreeByThree(Integer.parseInt(threeByThreeEditText.getText().toString()));
            itemTotal += Integer.parseInt(threeByThreeEditText.getText().toString());
        }
        if(! fourByFourEditText.getText().toString().equals("")){
            order.setFourByFour(Integer.parseInt(fourByFourEditText.getText().toString()));
            itemTotal += Integer.parseInt(fourByFourEditText.getText().toString());
        }
        if(! grilledCheeseEditText.getText().toString().equals("")){
            order.setGrilledCheese(Integer.parseInt(grilledCheeseEditText.getText().toString()));
            itemTotal += Integer.parseInt(grilledCheeseEditText.getText().toString());
        }
        if(! proteinStyleEditText.getText().toString().equals("")){
            order.setProteinStyle(Integer.parseInt(proteinStyleEditText.getText().toString()));
            itemTotal += Integer.parseInt(proteinStyleEditText.getText().toString());
        }
        if(! animalStyleEditText.getText().toString().equals("")){
            order.setAnimalStyle(Integer.parseInt(animalStyleEditText.getText().toString()));
            itemTotal += Integer.parseInt(animalStyleEditText.getText().toString());
        }

        // Send intent
        Intent orderIntent = new Intent(this, OrderActivity.class);
        orderIntent.putExtra("Total", order.calculateTotal() );
        orderIntent.putExtra("ItemTotal", itemTotal);
        orderIntent.putExtra("Subtotal", order.calculateSubtotal());
        orderIntent.putExtra("Tax", order.calculateTax());

        startActivity(orderIntent);
    }

    /**
     * Button that returns to the main activity from the secret menu activity
     * @param v Current view
     */
    public void backButton(View v){
        Intent mainIntent = new Intent(this, MainActivity.class);
        startActivity(mainIntent);
    }
}
