package com.example.denguemaster;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity3 extends AppCompatActivity {
    private Button button1;
    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.notifications);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext()
                        ,Homee.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.notifications:
                        return true;

                    case R.id.contactUs:
                        startActivity(new Intent(getApplicationContext()
                                ,ContacttUs.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.Data:
                        startActivity(new Intent(getApplicationContext()
                                ,Dataaa.class));
                        overridePendingTransition(0,0);
                        return true;

                    default:

                }
                return true;
            }
        });
    }



}