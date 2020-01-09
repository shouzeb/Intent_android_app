package com.example.intent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ChatActivity extends AppCompatActivity implements View.OnClickListener{
Button b;
EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        b=findViewById(R.id.btn5);
        ed=findViewById(R.id.editText);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn5:{

                Intent i=new Intent(this,ConfirmationActivity.class);
                String mess=String.valueOf(this.ed.getText());
                i.putExtra("message",mess);
                startActivityForResult(i,100);
                break;
            }

        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==100){
            if(resultCode==RESULT_OK){
                Toast.makeText(this,"Confirmed",Toast.LENGTH_LONG).show();
            }
        }
    }
}
