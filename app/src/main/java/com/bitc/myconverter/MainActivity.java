package com.bitc.myconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText inputFaren;
    TextView output;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputFaren= findViewById(R.id.inputFaren);
        output= findViewById(R.id.output);
        button= findViewById(R.id.button);


        // on clicking button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //things to do after clicking button

                // get temperature from the inputFaren in farenheit
                String faren= inputFaren.getText().toString();

                double fahrenheit = Double.parseDouble(faren);

                //convert the temperature to celsius
                // (32°F − 32) × 5/9 = 0°C

                double celsius= ((5*(fahrenheit - 32.0))/9.0);

                // display the output to the output

                output.setText(" The temperature in celsius is= " + celsius);


            }
        });









    }
}