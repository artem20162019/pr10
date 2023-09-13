package com.example.pr10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class table extends AppCompatActivity implements View.OnClickListener {
    ImageView back;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        btn = findViewById(R.id.button2);
        btn.setOnClickListener(this);
        back = findViewById(R.id.imageView7);
        back.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        if (view.getId() == R.id.button2) {
            startActivity(new Intent(this,showitem.class));
        }
        if (view.getId() == R.id.imageView7) {
            startActivity(new Intent(this,MainActivity.class));
        }

    }
}