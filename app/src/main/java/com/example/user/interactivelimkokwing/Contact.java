package com.example.user.interactivelimkokwing;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by user on 6/9/15.
 */
public class Contact extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        TextView addressbox=(TextView)findViewById(R.id.addressbox);
        TextView callbox=(TextView)findViewById(R.id.callbox);
        TextView faxbox=(TextView)findViewById(R.id.faxbox);

        addressbox.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String address = "Inovasi 1-1, Jalan Teknokrat, 1/1 63000 Cyberjaya Selangor";

                address = address.replace(' ', '+');
                Intent geoIntent = new Intent(
                        android.content.Intent.ACTION_VIEW,
                        Uri.parse("google.navigation:q=" + address));

                startActivity(geoIntent);

            }

        });

        callbox.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String phone = "+60383178888";

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + phone));

                startActivity(callIntent);

            }

        });

        faxbox.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String phone = "+60383178988";

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + phone));

                startActivity(callIntent);

            }

        });





    }
}
