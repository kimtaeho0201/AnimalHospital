package com.example.animalhospital;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class GuideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        findViewById(R.id.img_map).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:37.4807426,127.084375"));
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=서울랜드"));
                startActivity(intent);
            }
        });
    }


}
