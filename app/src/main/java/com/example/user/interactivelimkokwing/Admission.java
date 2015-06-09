package com.example.user.interactivelimkokwing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 6/9/15.
 */
public class Admission extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button btnregister, btndetails;

        btnregister=(Button)findViewById(R.id.btnprocedure);
        btndetails=(Button)findViewById(R.id.btndetails);

        btnregister.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent intent=new Intent(Admission.this, WebView.class);
                intent.putExtra("new_variable_name", "register");
                startActivity(intent);

            }

        });

        btndetails.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent intent=new Intent(Admission.this, WebView.class);
                intent.putExtra("new_variable_name", "details");
                startActivity(intent);

            }

        });





    }
}
