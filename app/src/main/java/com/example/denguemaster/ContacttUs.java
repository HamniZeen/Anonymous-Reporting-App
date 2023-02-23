package com.example.denguemaster;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class ContacttUs extends AppCompatActivity {
    private Button button1;
    Button btn;
    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactt_us);
        btn = (Button) findViewById(R.id.button15);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openNewActivity1();
            }
        });


        bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.contactUs);
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
                        startActivity(new Intent(getApplicationContext()
                                , MainActivity3.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.contactUs:
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

    private void openNewActivity1() {
        Intent intent = new Intent(this, PushNotification.class);
        startActivity(intent);
    }
}
