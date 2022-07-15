/* Header title here */

package edu.lwtech.converter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // On app startup
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Handle Convert button click
    public void onClickConvert( View view ) {
        // get a reference to the EditText widget.
        // It's where we get the input for the conversion.
        // Store it in a variable named fromStr.
        EditText edtText = findViewById( R.id.etextFrom );
        String fromStr = edtText.getText().toString();

        // get a reference to the TextView widget.
        // It's where we store the output for the converted value
        TextView txtView = findViewById( R.id.tviewTo );

        // get a string from the spinner that describes the
        // conversion
        Spinner spinner = (Spinner) findViewById( R.id.spnConvert );
        String convStr = spinner.getSelectedItem().toString();

	    // Temporary variables for input and result
	    Double input = 0.0;
        Double result = 0.0;

	    // Convert input string to double
        input = Double.parseDouble(fromStr);

        // Check for non-zero input
        if (input != 0.0) {
            // TODO - perform the conversion here, storing in result
            result = input;
        }

        // Store the converted value as a string in the TextView
        txtView.setText(Double.toString(result));
    }
}
