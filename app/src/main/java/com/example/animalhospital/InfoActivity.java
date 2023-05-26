package com.example.animalhospital;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InfoActivity extends AppCompatActivity  {

    int imgs[] = {R.drawable.info1,R.drawable.info2,R.drawable.info3,R.drawable.info4,R.drawable.info5};

    int imgno = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);


        Intent intent = getIntent();
        String msg = intent.getStringExtra("MSG");
        ((TextView)findViewById(R.id.txt_info)).setText(msg);

        findViewById(R.id.btn_info_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        ImageView imageView = findViewById(R.id.img_info);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(imgs[++imgno%imgs.length]);
                Log.d("SHIN", "이미지번호"+imgno);
            }
        });

    }


}