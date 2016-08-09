package com.example.manish.formcreation;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView WarningMsg = (TextView) findViewById(R.id.Error);
        final EditText UserName = (EditText)findViewById(R.id.editText);
        final EditText Pwd = (EditText)findViewById(R.id.editText2);
        Button login = (Button)findViewById(R.id.login);



        login.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MainActivity2Activity.class);

                if(UserName.getText().toString().equals("Manish") && Pwd.getText().toString().equals("Manish")) {
                    i.putExtra("User", UserName.getText().toString());
                    startActivity(i);
                }
                else {
                    WarningMsg.setTextColor(Color.RED);
                    WarningMsg.setText("Please enter a valid username and password");
                }
            }
        });

        Button SignUp = (Button)findViewById(R.id.Sign);
        SignUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            Intent i = new Intent(MainActivity.this, Main2Activity.class);


                startActivity(i);
            }


        });
    }



}



