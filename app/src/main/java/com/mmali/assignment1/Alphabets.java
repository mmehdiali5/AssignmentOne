package com.mmali.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alphabets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets);
    }

    public void clickedOnButton(View view){
        Button button=(Button)view;
        String buttonText=button.getText().toString();
        Intent intent=new Intent(this,AnimationAndSound.class);
        intent.putExtra("alphabet",buttonText);
        startActivity(intent);
    }
}