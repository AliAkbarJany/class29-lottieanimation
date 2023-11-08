package com.rafsan.class29lottieanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    LottieAnimationView lottieAnimation;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lottieAnimation = findViewById(R.id.lottieAnimation);
        button = findViewById(R.id.button);

//        lottieViewAnimation = findViewById(R.id.lottieViewAnimation);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lottieAnimation.setAnimation(R.raw.lottiedesign);
                lottieAnimation.playAnimation();
            }
        });

    }
}