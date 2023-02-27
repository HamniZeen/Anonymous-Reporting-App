package com.example.denguemaster;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class describe extends AppCompatActivity {
    private Button closeApplicationBtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_describe);
       closeApplicationBtn = findViewById(R.id.closee);

        // on below line we are adding click listener for our button
        closeApplicationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String no="+94728378365";
                String msg="Alert location:https://console.firebase.google.com/project/thedenguemaster/database/thedenguemaster-default-rtdb/data";

                String mapLink = "Alert location: https://www.google.com/maps/search/?api=1&query=" + 7.35944+ "," + 81.7845;
                String senderName = "Dengue Location Alert";


                //Getting intent and PendingIntent instance
                Intent intent=new Intent(getApplicationContext(),MainActivity4.class);
                PendingIntent pi=PendingIntent.getActivity(getApplicationContext(), 0, intent,0);

                //Get the SmsManager instance and call the sendTextMessage method to send message
                SmsManager sms=SmsManager.getDefault();

                intent.putExtra("EXTRA_SENDER",senderName);
                sms.sendTextMessage(no, null, mapLink, pi,null);


                Toast.makeText(getApplicationContext(), "Message Sent successfully!",
                        Toast.LENGTH_LONG).show();
            }
        });





        }
}
