package com.example.batterylevel;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView batterylevel;
    Button minusBtn;
    Button plusBtn;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        batterylevel = findViewById(R.id.batterylevel);
        minusBtn = findViewById(R.id.MinusButton);
        plusBtn = findViewById(R.id.PlusButton);
    }

    public void plus_onClick(View view)
    {
        count++;

        if (count <= 7 && count >= 0)
        {
            batterylevel.setImageLevel(count);
        }

        if (count > 7)
        {
            count = 7;
        }
    }

    public void minus_onClick(View view)
    {
        count--;

        if (count < 6 && count > 0)
        {
            batterylevel.setImageLevel(count);
        }
        if (count < 1)
        {
            count = 1;
        }
    }
}