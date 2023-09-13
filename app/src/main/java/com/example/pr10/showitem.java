package com.example.pr10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class showitem extends AppCompatActivity implements View.OnClickListener {
    ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showitem);
        back = findViewById(R.id.imageView8);
        back.setOnClickListener(this);
    }
    public void onClick(View view){
        startActivity(new Intent(this,table.class));
    }
}