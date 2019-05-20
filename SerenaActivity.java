package com.example.motivation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import java.util.Random;

public class SerenaActivity extends AppCompatActivity {

    private TextView serenaScreenText;
    private Button serenaInspireButton;
    public Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serena);

        serenaScreenText = (TextView) findViewById(R.id.serenaScreenText);
        serenaInspireButton = (Button) findViewById(R.id.serenaInspireButton);
        backButton = (Button) findViewById(R.id.backButton);

        View.OnClickListener listener = new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String[] quote = {"I think a champion is defined not only by their wins, but by how they can recover when they fall.",
                "I think you should work on yourself until the day you die.", "Everyone's dream can come true if you just stick to it and work hard.",
                "Luck has nothing to do with it. I have spent many, many countless hours on the court working for my one moment in time, not knowing when it would come.",
                "When you lose you get up, you make it better and you try again.", "I just never give up. I fight to the end.",
                "You can be whatever size you are and you can be beautiful both inside and out. We're always told what's beautiful and what's not and that's not right.",
                "You have to believe in yourself when no one else does.", "You can become strong, powerful and beautiful.",
                "Overpower. Overtake. Overcome.", "Whatever fear I have inside me, my desire to win is always stronger.",
                "It doesn't matter what your background is or where you come from, if you have dreams and goals, that's all that matters.",
                "I am who I am. I love who I am.", "Strong is beautiful.", "I'm really excited. I smile a lot and I win a lot.",
                "You have to be fearless to have success.", "Everything comes at a cost. Just what are you willing to pay for it?",
                "You have to work hard. Nothing comes for free.", "I'm just about winning.", "Different is good.",
                "I decided I can't pay a person to rewind time, so I may as well get over it.",
                "I've always been a fighter and I've always fought through things my whole life.",
                "If I don't get it right, I don't stop until I do.", "Don't let anybody work harder than you do.",
                "I love who I am and I encourage other people to love and embrace who they are.",
                "Your legacy is what you did with your life.", "I am not a robot. I have a heart and I bleed.",
                "Just believe in yourself. Even if you don't, pretend that you do and at some point you will.",
                "Nothing comes to a sleeper but a dream.", "I was tired of losing. Life was passing me by.",
                "I don't know if I've had my share of drama, but I've definitely had my share of hard times.",
                "Am I the greatest? I don't know. I'm the greatest that I can be.", "You have to prove to yourself that you can go out there and be the best that you can be and not prove anything to anyone.",
                "Victory is very, very sweet. It tastes better than any dessert you've ever had.", "If plan A isn't working, I have a Plan B, C and D."
                };
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(quote.length);
                String quotes = quote[randomNumber];

                serenaScreenText.setText(quotes);
            }
        };

        serenaInspireButton.setOnClickListener(listener);

        View.OnClickListener listener1 = new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                openBackButton();
            }
        };
        backButton.setOnClickListener(listener1);

    }

    public void openBackButton()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
