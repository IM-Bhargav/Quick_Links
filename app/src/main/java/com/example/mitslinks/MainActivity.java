package com.example.mitslinks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button moodle = (Button)findViewById(R.id.moodle);
        moodle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://182.76.43.238/login/index.php";
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse(url));
                startActivity(viewIntent);


            }
        });

        Button GEMS = (Button)findViewById(R.id.gems);
        GEMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://159.65.141.127/#";
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse(url));
                startActivity(viewIntent);


            }
        });
        ImageView iv = findViewById(R.id.iv);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast T1 = null;
                T1.makeText(MainActivity.this,"Created By Bhargavesh ",Toast.LENGTH_LONG).show();

            }
        });

        TextView About = (TextView) findViewById(R.id.about);
        About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast T1 = null;
                T1.makeText(MainActivity.this,"Created By Bhargavesh ",Toast.LENGTH_LONG).show();
            }
        });
    }

}