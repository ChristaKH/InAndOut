/**
 * This is the java file that corresponds to the secret menu activity
 *
 * @author: Christa Hatch
 * @version: 1.0
 */
package chatch.cs134.miracosta.inandout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SecretMenuActivity extends AppCompatActivity {

    // Create variables that correspond to the view in the xml
    EditText doubleMeatEditText;
    EditText threeByThreeEditText;
    EditText fourByFourEditText;
    EditText grilledCheeseEditText;
    EditText proteinStyleEditText;
    EditText animalStyleEditText;
    Button placeOrderButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secret_menu);

        //Connect variables to corresponding views
        doubleMeatEditText = findViewById(R.id.doubleDoubleEditText);
        threeByThreeEditText = findViewById(R.id.threeByThreeEditText);
        fourByFourEditText = findViewById(R.id.fourByFourEditText);
        grilledCheeseEditText = findViewById(R.id.grilledCheeseEditText);
        proteinStyleEditText = findViewById(R.id.proteinStyleEditText);
        animalStyleEditText = findViewById(R.id.animalStyleEditText);
        placeOrderButton = findViewById(R.id.placeOrderButton);
    }
}
