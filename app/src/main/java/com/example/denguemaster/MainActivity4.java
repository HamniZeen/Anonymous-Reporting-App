package com.example.denguemaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    private Button button;
    private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        button=(Button) findViewById(R.id.button33);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivity3();

            }
        });
        button=(Button) findViewById(R.id.button22);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivity2();

            }
        });
    }

    private void openActivity2() {
        Intent intent =new Intent(this,Dataaa.class);
        startActivity(intent);
    }

    public void openActivity3(){
        Intent intent =new Intent(this,Dataaa.class);
        startActivity(intent);

    }

}