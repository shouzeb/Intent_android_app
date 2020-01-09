package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button b1,b2,b3,b4;
private static final String TAG=MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);
        b4=findViewById(R.id.btn4);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn1:{
                Intent i=new Intent(this,ChatActivity.class);
                startActivity(i);
                break;
            }
            case R.id.btn2:{
                Uri u=Uri.parse("geo:336844,730409");
                Intent map=new Intent(Intent.ACTION_VIEW,u);
                map.setPackage("com.google.android.apps.maps");
                startActivity(map);
                break;
            }
            case R.id.btn3:{
                Intent i=new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+923369195539"));
                startActivity(i);
                Log.d(TAG,"hi");
                break;
            }
            case R.id.btn4:{
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http:/www.google.com"));
                startActivity(i);
                break;
            }
        }

    }
}
