package com.example.ex006;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

Button btn;
int rand = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.layout.activity_main);

    }

    public void clicked(View view) {
        rand = (int) ((Math.random() * 3) + 1);

        if (rand == 1)
        {
            myImageView.setImageResource(R.drawable.pic1);
        }
        if (rand == 2)
        {
            myImageView.setImageResource(R.drawable.pic2);
        }
        if (rand == 3)
        {
            myImageView.setImageResource(R.drawable.pic3);
        }
    }
}