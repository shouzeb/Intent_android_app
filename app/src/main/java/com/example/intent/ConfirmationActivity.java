package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmationActivity extends AppCompatActivity implements View.OnClickListener{
Button b;
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);
        b=findViewById(R.id.bt6);
        b.setOnClickListener(this);
        tv=findViewById(R.id.tv1);
        Bundle b= getIntent().getExtras();
        String mess=b.getString("message");
        tv.setText(mess);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.bt6:{
                Intent i=new Intent();
                setResult(RESULT_OK,i);
                finish();
                break;
            }
        }
    }
}
