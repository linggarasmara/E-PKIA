package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Menu extends AppCompatActivity implements View.OnClickListener {

    private CardView konsulCard;
    private CardView tipsCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        //define card
        konsulCard = (CardView) findViewById(R.id.konsul_card);
        tipsCard = (CardView) findViewById(R.id.tips_card);
        //add click listener
        konsulCard.setOnClickListener(this);
        tipsCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;

        switch (v.getId()){
        case R.id.konsul_card:
        intent = new Intent(this, Konsultasi.class); startActivity(intent);break;

            default:break;

    }

        switch (v.getId()){
            case R.id.tips_card:
                intent = new Intent(this, Tips.class);startActivity(intent);break;

            default:break;
        }
    }
}