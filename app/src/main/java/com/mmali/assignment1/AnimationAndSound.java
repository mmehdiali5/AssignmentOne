package com.mmali.assignment1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class AnimationAndSound extends AppCompatActivity {
    Boolean start=true;
    MediaPlayer mp;

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean("start",false);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_and_sound);

        TextView showAlphabet=findViewById(R.id.alphabet);
        TextView showThing=findViewById(R.id.thing);
        Intent intent=getIntent();
        String alphabet=intent.getStringExtra("alphabet");
        showAlphabet.setText(alphabet+" "+alphabet.toLowerCase());
        int audioId=getResources().getIdentifier(alphabet.toLowerCase(),"raw",getPackageName());
        mp=MediaPlayer.create(this,audioId);

        if(alphabet.equals("A")){
            showThing.setText("APPLE");
        }else if(alphabet.equals("B")){
            showThing.setText("BASE BALL");
        }else if(alphabet.equals("C")){
            showThing.setText("CLOCK");
        }else if(alphabet.equals("D")){
            showThing.setText("DONKEY");
        }else if(alphabet.equals("E")){
            showThing.setText("ELEPHANT");
        }else if(alphabet.equals("F")){
            showThing.setText("FATHER");
        }else if(alphabet.equals("G")){
            showThing.setText("GRAND MOTHER");
        }else if(alphabet.equals("H")){
            showThing.setText("HUNGRY");
        }else if(alphabet.equals("I")){
            showThing.setText("INTERNET");
        }else if(alphabet.equals("J")){
            showThing.setText("JUSTICE");
        }else if(alphabet.equals("K")){
            showThing.setText("KANGAROO");
        }else if(alphabet.equals("L")){
            showThing.setText("LONDON");
        }else if(alphabet.equals("M")){
            showThing.setText("MONKEY");
        }else if(alphabet.equals("N")){
            showThing.setText("NORWAY");
        }else if(alphabet.equals("O")){
            showThing.setText("OVERTIME");
        }else if(alphabet.equals("P")){
            showThing.setText("PILLOW");
        }else if(alphabet.equals("Q")){
            showThing.setText("QUESTION");
        }else if(alphabet.equals("R")){
            showThing.setText("RABBIT");
        }else if(alphabet.equals("S")){
            showThing.setText("SUPERMAN");
        }else if(alphabet.equals("T")){
            showThing.setText("TELEPHONE");
        }else if(alphabet.equals("U")){
            showThing.setText("UNDERWEAR");
        }else if(alphabet.equals("V")){
            showThing.setText("VACCINATE");
        }else if(alphabet.equals("W")){
            showThing.setText("WORLD WIDE WEB");
        }else if(alphabet.equals("X")){
            showThing.setText("XYLOPHONE");
        }else if(alphabet.equals("Y")){
            showThing.setText("YOGURT");
        }else if(alphabet.equals("Z")){
            showThing.setText("ZEBRA");
        }

        ImageView img=findViewById(R.id.thingPic);
        int imgId=getResources().getIdentifier(alphabet.toLowerCase(),"drawable",getPackageName());
        img.setImageResource(imgId);

        if(savedInstanceState==null){
            mp.start();
            img.animate().rotation(360).setDuration(1000);
        }
    }

    public void clickedOnImage(View view) {
        mp.start();
    }
}