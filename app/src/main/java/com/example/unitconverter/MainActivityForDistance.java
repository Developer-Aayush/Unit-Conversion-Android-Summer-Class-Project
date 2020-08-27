package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivityForDistance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_for_distance);

        //spinner from distance
        Spinner spinnerFromDistance = (Spinner) findViewById(R.id.spinnerFromdistance);
        ArrayAdapter<CharSequence> adapterOneDistance = ArrayAdapter.createFromResource(this,
                R.array.spinnerfromDistance, android.R.layout.simple_spinner_item);
        adapterOneDistance.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFromDistance.setAdapter(adapterOneDistance);


        //spinner to distance
        Spinner spinnerTodistance = (Spinner) findViewById(R.id.spinnerTodistance);
        ArrayAdapter<CharSequence> adapterTwoDistance = ArrayAdapter.createFromResource(this,
                R.array.spinnerToDistance, android.R.layout.simple_spinner_item);
        adapterTwoDistance.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTodistance.setAdapter(adapterTwoDistance);




        Button buttonConvertDistance = findViewById(R.id.buttonConvertdistance);
        buttonConvertDistance.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {



                // getting the selected item from the first spinner
                Spinner mySpinnerDistance = (Spinner) findViewById(R.id.spinnerFromdistance);
                String firstDistance = mySpinnerDistance.getSelectedItem().toString();
                System.out.println("This is your " + firstDistance);

                // getting the selected item from the second spinner
                Spinner mySpinnerTwoDistance = (Spinner) findViewById(R.id.spinnerTodistance);
                String secondDistance = mySpinnerTwoDistance.getSelectedItem().toString();
                System.out.println("This is your" + secondDistance);


                //taking the user input from the text edit
                EditText textDistance = (EditText)findViewById(R.id.editTextNumberdistance);
                String userNumberDistance= textDistance.getText().toString();

                //converting the user input string to integer
                double userNumberConvertedDistance = Double.parseDouble(userNumberDistance);
                double numberDistance;
                //System.out.println( "user ko number" +userNumberConvertedDistance);

                //user output ko lagi leko text view
                TextView finalAnswerDistance = findViewById(R.id.textViewOutputdistance);

                //invalid selection ko lagi leko text view
                TextView invalidSelectionD = findViewById(R.id.textViewInvalidSelectionDistance);

                // Start of the Kilometer ----------------------------------------------------------------
                if(firstDistance.equals("Kilometer (Km)") && secondDistance.equals("Meter (m)")){
                    numberDistance = userNumberConvertedDistance * 1000;
                    finalAnswerDistance.setText( numberDistance + " " + firstDistance);
                }

                if(firstDistance.equals("Meter (m)") && secondDistance.equals("Kilometer (Km)")){
                    numberDistance = userNumberConvertedDistance / 1000;
                    finalAnswerDistance.setText( numberDistance + " " + firstDistance);
                }

                if(firstDistance.equals("Kilometer (Km)") && secondDistance.equals("Mile (m)")){
                    numberDistance = userNumberConvertedDistance / 1.609;
                    finalAnswerDistance.setText( numberDistance + " " + firstDistance);
                }

                if(firstDistance.equals("Mile (m)") && secondDistance.equals("Kilometer (Km)")){
                    numberDistance = userNumberConvertedDistance * 1.609;
                    finalAnswerDistance.setText( numberDistance + " " + firstDistance);
                }

                if(firstDistance.equals("Kilometer (Km)") && secondDistance.equals("Inch (in)")){
                    numberDistance = userNumberConvertedDistance * 39370.1;
                    finalAnswerDistance.setText( numberDistance + " " + firstDistance);
                }

                if(firstDistance.equals("Inch (in)") && secondDistance.equals("Kilometer (Km)")){
                    numberDistance = userNumberConvertedDistance / 39370.1;
                    finalAnswerDistance.setText( numberDistance + " " + firstDistance);
                }

                if(firstDistance.equals("Kilometer (Km)") && secondDistance.equals("Foot (ft)")){
                    numberDistance = userNumberConvertedDistance * 3281;
                    finalAnswerDistance.setText( numberDistance + " " + firstDistance);
                }

                if(firstDistance.equals("Foot (ft)") && secondDistance.equals("Kilometer (Km)")){
                    numberDistance = userNumberConvertedDistance / 3281;
                    finalAnswerDistance.setText( numberDistance + " " + firstDistance);
                }
                // end of kilometer----------------------------------------------------------------

                // Start of Meter ------------------------------------------------------------------

                if(firstDistance.equals("Meter (m)") && secondDistance.equals("Mile (m)")){
                    numberDistance = userNumberConvertedDistance / 1609;
                    finalAnswerDistance.setText( numberDistance + " " + firstDistance);
                }

                if(firstDistance.equals("Mile (m)") && secondDistance.equals("Meter (m)")){
                    numberDistance = userNumberConvertedDistance * 1609;
                    finalAnswerDistance.setText( numberDistance + " " + firstDistance);
                }

                if(firstDistance.equals("Meter (m)") && secondDistance.equals("Inch (in)")){
                    numberDistance = userNumberConvertedDistance * 39.37;
                    finalAnswerDistance.setText( numberDistance + " " + firstDistance);
                }

                if(firstDistance.equals("Inch (in)") && secondDistance.equals("Meter (m)")){
                    numberDistance = userNumberConvertedDistance * 39.37;
                    finalAnswerDistance.setText( numberDistance + " " + firstDistance);
                }

                if(firstDistance.equals("Meter (m)") && secondDistance.equals("Foot (ft)")){
                    numberDistance = userNumberConvertedDistance * 3.281;
                    finalAnswerDistance.setText( numberDistance + " " + firstDistance);
                }

                if(firstDistance.equals("Foot (ft)") && secondDistance.equals("Meter (m)")){
                    numberDistance = userNumberConvertedDistance / 3.281;
                    finalAnswerDistance.setText( numberDistance + " " + firstDistance);
                }
                // End of meter.....................................................................

                //Start of Mile---------------------------------------------------------------------
                if(firstDistance.equals("Mile (m)") && secondDistance.equals("Inch (in)")){
                    numberDistance = userNumberConvertedDistance * 63360;
                    finalAnswerDistance.setText( numberDistance + " " + firstDistance);
                }

                if(firstDistance.equals("Inch (in)") && secondDistance.equals("Mile (m)")){
                    numberDistance = userNumberConvertedDistance / 63360;
                    finalAnswerDistance.setText( numberDistance + " " + firstDistance);
                }

                if(firstDistance.equals("Mile (m)") && secondDistance.equals("Foot (ft)")){
                    numberDistance = userNumberConvertedDistance * 5280;
                    finalAnswerDistance.setText( numberDistance + " " + firstDistance);
                }

                if(firstDistance.equals("Foot (ft)") && secondDistance.equals("Mile (m)")){
                    numberDistance = userNumberConvertedDistance / 5280;
                    finalAnswerDistance.setText( numberDistance + " " + firstDistance);
                }
                //End of Miles----------------------------------------------------------------------

                //Start of Inch---------------------------------------------------------------------
                if(firstDistance.equals("Inch (in)") && secondDistance.equals("Foot (ft)")){
                    numberDistance = userNumberConvertedDistance / 12;
                    finalAnswerDistance.setText( numberDistance + " " + firstDistance);
                }

                if(firstDistance.equals("Foot (ft)") && secondDistance.equals("Inch (in)")){
                    numberDistance = userNumberConvertedDistance * 12;
                    finalAnswerDistance.setText( numberDistance + " " + firstDistance);
                }
                //End of Foot

                //start of same selection thing

                if(firstDistance.equals("Kilometer (Km)") && secondDistance.equals("Kilometer (Km)")) {
                    invalidSelectionD.setText("Sorry you cannot convert from " + firstDistance + " to " + secondDistance);
                }
                if(firstDistance.equals("Meter (m)") && secondDistance.equals("Meter (m)")) {
                    invalidSelectionD.setText("Sorry you cannot convert from " + firstDistance + " to " + secondDistance);
                }
                if(firstDistance.equals("Mile (m)") && secondDistance.equals("Mile (m)")) {
                    invalidSelectionD.setText("Sorry you cannot convert from " + firstDistance + " to " + secondDistance);
                }
                if(firstDistance.equals("Inch (in)") && secondDistance.equals("Inch (in)")) {
                    invalidSelectionD.setText("Sorry you cannot convert from " + firstDistance + " to " + secondDistance);
                }
                if(firstDistance.equals("Foot (ft)") && secondDistance.equals("Foot (ft)")){
                    invalidSelectionD.setText( "Sorry you cannot convert from " + firstDistance + " to " + secondDistance);
                }

                if(firstDistance.equals("Select the unit") && secondDistance.equals("Select the unit")){
                    invalidSelectionD.setText( " Please select the units for conversion");
                }
            }
        });
    }
}