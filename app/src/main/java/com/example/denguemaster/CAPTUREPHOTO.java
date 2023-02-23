package com.example.denguemaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CAPTUREPHOTO extends AppCompatActivity {
    private  static  final  int CAMERA_REQUEST=1888;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capturephoto);
        imageView = (ImageView) this.findViewById(R.id.imageView);
        Button photobutton = (Button) this.findViewById(R.id.button2);
        Button uploadbutton=(Button) this.findViewById(R.id.button1);

        photobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cameraintent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

                startActivityForResult(cameraintent, CAMERA_REQUEST);
            }
        });

        uploadbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uploadimage();
            }
        });

    }

    private void uploadimage() {


    }

    protected void onActivityResult(int requestcode, int resultcode, Intent data){
        super.onActivityResult(requestcode,resultcode,data);
        if(requestcode==CAMERA_REQUEST){
            Bitmap photo=(Bitmap) data.getExtras().get("data");
            imageView.setImageBitmap(photo);
        }
    }
}
