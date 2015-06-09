package com.example.user.interactivelimkokwing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 6/9/15.
 */
public class Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btncourses, btncontact, btnadmission, btnfaculty;

        btnadmission=(Button)findViewById(R.id.btnadmission);
        btncontact=(Button)findViewById(R.id.btncontact);
        btncourses=(Button)findViewById(R.id.btncourses);
        btnfaculty=(Button)findViewById(R.id.btnfaculty);


        btnadmission.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent intent=new Intent(Main.this, Admission.class);
                startActivity(intent);

            }

        });

        btncontact.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent=new Intent(Main.this, Contact.class);
                startActivity(intent);

            }

        });

        btncourses.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent=new Intent(Main.this, Courses.class);
                startActivity(intent);

            }

        });

        btnfaculty.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent=new Intent(Main.this, Faculty.class);
                startActivity(intent);

            }

        });

    }
}
