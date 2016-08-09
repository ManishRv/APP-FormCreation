package com.example.manish.formcreation;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;


public class Main2Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Spinner deptSpinner= (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> spinnerAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, new String[]{"CSE", "ECE", "EEE","Civil"});
        deptSpinner.setAdapter(spinnerAdapter);
        final Button Submit = (Button) findViewById(R.id.button);
        final Intent i = new Intent(Main2Activity.this, MainActivity2Activity.class);

        final EditText Email = (EditText)findViewById(R.id.editText4);
        final EditText Name = (EditText)findViewById(R.id.editText3);
        final EditText DOB = (EditText)findViewById(R.id.editText5);
        final RadioGroup Gender= (RadioGroup)findViewById(R.id.radioGroup);
       final EditText Pass=(EditText) findViewById(R.id.editText6);
       final EditText ConfPass=(EditText) findViewById(R.id.editText7);

        final String pass1=Pass.getText().toString();
       final  String pass2=ConfPass.getText().toString();

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( Name.getText().toString().equals("") || Email.getText().toString().equals("") || DOB.getText().toString().equals(""))
                    Toast.makeText(getApplicationContext(), "Please enter all the fields!!", Toast.LENGTH_SHORT).show();
                else {
                    if (android.util.Patterns.EMAIL_ADDRESS.matcher(Email.getText().toString()).matches()) {
                        i.putExtra("User", Name.getText().toString());
                        startActivity(i);
                    } else {
                        Toast.makeText(getApplicationContext(), "Enter a valid mail id!!", Toast.LENGTH_SHORT).show();
                    }
                }
            //    Intent i = new Intent(Main2Activity.this, MainActivity2Activity.class);



              //  startActivity(i);

            }
        });
    }
}
