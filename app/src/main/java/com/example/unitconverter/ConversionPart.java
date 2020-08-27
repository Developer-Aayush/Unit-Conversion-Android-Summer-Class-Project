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


public class ConversionPart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_part);

        //spinner one
        Spinner spinnerOne = (Spinner) findViewById(R.id.spinnerTo);
        ArrayAdapter<CharSequence> adapterOne = ArrayAdapter.createFromResource(this,
                R.array.spinnerOne, android.R.layout.simple_spinner_item);
        adapterOne.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerOne.setAdapter(adapterOne);


        //spinnerTwo
        Spinner spinnerTwo = (Spinner) findViewById(R.id.spinnerFrom);
        ArrayAdapter<CharSequence> adapterTwo = ArrayAdapter.createFromResource(this,
                R.array.spinnerOne, android.R.layout.simple_spinner_item);
        adapterTwo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTwo.setAdapter(adapterTwo);




        Button buttonConvert = findViewById(R.id.buttonConvert);
        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                // getting the selected item from the first spinner
                Spinner mySpinner = (Spinner) findViewById(R.id.spinnerFrom);
                String first = mySpinner.getSelectedItem().toString();
                //System.out.println("This is your " + first);

                // getting the selected item from the second spinner
                Spinner mySpinnerTwo = (Spinner) findViewById(R.id.spinnerTo);
                String second = mySpinnerTwo.getSelectedItem().toString();
                //System.out.println("This is your" +second);


                //taking the user input from the text edit
                EditText text = (EditText)findViewById(R.id.editTextNumber);
                String userNumber= text.getText().toString();



                //converting the user input string to integer
                double userNumberConverted = Double.parseDouble(userNumber);
                double number;
                //System.out.println( "user ko number" +userNumberConverted);

                //user output ko lagi leko text view
                TextView finalAnswer = findViewById(R.id.textViewOutput);

                //invalid selection ko lagi leko text view
                TextView invalidSelection = findViewById(R.id.textViewInvalidSelection);

                //Kilo gram part----------------------------------------------------------------

                if(first.equals("Kilo Gram (Kg)") && second.equals("Gram (g)")){
                        number = userNumberConverted * 1000;
                        finalAnswer.setText( number + " " + second);

                }
                else if(first.equals("Gram (g)") && second.equals("Kilo Gram (Kg)")){
                    number = userNumberConverted / 1000;
                    finalAnswer.setText( number + " " + second);

                }
                else if (first.equals("Kilo Gram (Kg)") && second.equals(("Pound (lb)"))){
                    number = userNumberConverted * 2.20462;
                    finalAnswer.setText( number + " " + second);

                }

                else if (first.equals("Pound (lb)") && second.equals(("Kilo Gram (Kg)"))){
                    number = userNumberConverted / 2.20462;
                    finalAnswer.setText( number + " " + second);

                }

                else if (first.equals("Kilo Gram (Kg)") && second.equals(("Ounces (o)"))){
                    number = userNumberConverted * 35.274;
                    finalAnswer.setText( number + " " + second);

                }

                else if (first.equals("Ounces (o)") && second.equals(("Kilo Gram (Kg)"))){
                    number = userNumberConverted / 35.274;
                    finalAnswer.setText( number + " " + second);

                }

                else if (first.equals("Kilo Gram (Kg)") && second.equals(("Milli Gram (mg)"))){
                    number = userNumberConverted * 100000;
                    finalAnswer.setText( number + " " + second);

                }

                else if (first.equals("Milli Gram (mg)") && second.equals(("Kilo Gram (Kg)"))){
                    number = userNumberConverted / 100000;
                    finalAnswer.setText( number + " " + second);

                }
                //End of Kilo gram-------------------------------------------------------------

                //Start of Gram---------------------------------------------------------------

                else if (first.equals("Gram (g)") && second.equals(("Pound (lb)"))){
                    number = userNumberConverted / 454;
                    finalAnswer.setText( number + " " + second);

                }

                else if (first.equals("Pound (lb)") && second.equals(("Gram (g)"))){
                    number = userNumberConverted * 454;
                    finalAnswer.setText( number + " " + second);

                }

                else if (first.equals("Gram (g)") && second.equals(("Ounces (o)"))){
                    number = userNumberConverted / 28.35;
                    finalAnswer.setText( number + " " + second);

                }

                else if (first.equals("Ounces (o)") && second.equals(("Gram (g)"))){
                    number = userNumberConverted * 28.35;
                    finalAnswer.setText( number + " " + second);

                }

                else if (first.equals("Gram (g)") && second.equals(("Milli Gram (mg)"))){
                    number = userNumberConverted * 100000;
                    finalAnswer.setText( number + " " + second);

                }

                else if (first.equals("Milli Gram (mg)") && second.equals(("Gram (g)"))){
                    number = userNumberConverted / 100000;
                    finalAnswer.setText( number + " " + second);

                }
                // End of Gram------------------------------------------------------------

                // Start of Pounds--------------------------------------------------------
                else if (first.equals("Pound (lb)") && second.equals(("Ounces (o)"))){
                    number = userNumberConverted * 16;
                    finalAnswer.setText( number + " " + second);

                }

                else if (first.equals("Ounces (o)") && second.equals(("Pound (lb)"))){
                    number = userNumberConverted / 16;
                    finalAnswer.setText( number + " " + second);

                }

                else if (first.equals("Pound (lb)") && second.equals(("Milli Gram (mg)"))){
                    number = userNumberConverted * 453592;
                    finalAnswer.setText( number + " " + second);

                }

                else if (first.equals("Milli Gram (mg)") && second.equals(("Pound (lb)"))){
                    number = userNumberConverted / 453592;
                    finalAnswer.setText( number + " " + second);

                }
                // End of Pounds------------------------------------------------------------

                // Start of Ounces--------------------------------------------------------

                else if (first.equals("Ounces (o)") && second.equals(("Milli Gram (mg)"))){
                    number = userNumberConverted * 28350;
                    finalAnswer.setText( number + " " + second);

                }

                else if (first.equals("Milli Gram (mg)") && second.equals(("Ounces (o)"))){
                    number = userNumberConverted / 28350;
                    finalAnswer.setText( number + " " + second);

                }

                if(first.equals("Kilo Gram (Kg)") && second.equals("Kilo Gram (Kg)")) {
                    invalidSelection.setText("Sorry you cannot convert from " + first + " to " + second);
                }

                if(first.equals("Gram (g)") && second.equals("Gram (g)")) {
                    invalidSelection.setText("Sorry you cannot convert from " + first + " to " + second);
                }

                if(first.equals("Pound (lb)") && second.equals("Pound (lb)")) {
                    invalidSelection.setText("Sorry you cannot convert from " + first + " to " + second);
                }

                if(first.equals("Ounces (o)") && second.equals("Ounces (o)")) {
                    invalidSelection.setText("Sorry you cannot convert from " + first + " to " + second);
                }

                if(first.equals("Milli Gram (mg)") && second.equals("Milli Gram (mg)")){
                    invalidSelection.setText( "Sorry you cannot convert from " + first + " to " + second);
                }

                if(first.equals("Select the unit") && second.equals("Select the unit")){
                    invalidSelection.setText( " Please select the units for conversion");
                }
            }
        });
    }
}