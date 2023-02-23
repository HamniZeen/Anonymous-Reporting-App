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

public class Homee extends AppCompatActivity {
    private Button button11;
    private Button button22;
    private Button button33;
    private Button button44;
    private Button button1;
    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homee);

        bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.home);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        return true;

                    case R.id.notifications:
                        startActivity(new Intent(getApplicationContext()
                                , MainActivity3.class));
                        overridePendingTransition(0,0);
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


        button11=(Button) findViewById(R.id.button5);
        button11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivity33();

            }
        });
        button22=(Button) findViewById(R.id.button6);
        button22.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivity44();

            }
        });
        button33=(Button) findViewById(R.id.button7);
        button33.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivity55();

            }
        });
        button44=(Button) findViewById(R.id.button8);
        button44.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivity66();

            }
        });
    }

    private void openActivity66() {
        Intent intent =new Intent(this,soacialmobilization.class);
        startActivity(intent);
    }

    private void openActivity55() {
        Intent intent =new Intent(this,REPELLENTS.class);
        startActivity(intent);
    }

    private void openActivity44() {
        Intent intent =new Intent(this,preventt.class);
        startActivity(intent);
    }

    private void openActivity33() {
        Intent intent =new Intent(this,BreedingSites.class);
        startActivity(intent);
    }
}
