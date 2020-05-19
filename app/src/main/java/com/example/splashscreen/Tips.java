package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tips extends AppCompatActivity implements View.OnClickListener {

    private CardView babyCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);


        babyCard = (CardView) findViewById(R.id.baby);
        babyCard.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent intent;

        switch (v.getId()){
            case R.id.baby:
                intent = new Intent(this, Keepbaby.class);startActivity(intent);break;

            default: break;
        }
    }
}
