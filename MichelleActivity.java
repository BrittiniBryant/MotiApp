package com.example.motivation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MichelleActivity extends AppCompatActivity {

    private TextView michelleScreenText;
    private Button michelleInspireButton;
    public Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_michelle);

        michelleScreenText = (TextView) findViewById(R.id.michelleScreenText);
        michelleInspireButton = (Button) findViewById(R.id.michelleInspireButton);
        backButton = (Button) findViewById(R.id.backButton);

        View.OnClickListener listener = new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String[] quote = {
                        "How hard you work matters more than how much you make.", "Success doesn't count unless you earn it fair and square.",
                        "When they go low, we go high.", "Always stay true to yourself and never let what somebody says distract you from your goals.",
                        "You can't make decisions based on fear and the possibility of what might happen.", "I am so tired of fear. I don't want my girls to live in a country/world based on fear.",
                        "Don't bring people in your life who weigh you down and trust your instincts.", "Good relationships feel good. They feel right.",
                        "We should always have three friends in our lives. One who walks ahead who we look up to and follow, one who walks beside us and one who we reach back for and bring along after we've cleared the way.",
                        "No matter who you are or how you started out, if you work hard you can build a decent life for yourself.",
                        "Something better is always possible if you're willing to work for it and fight for it.",
                        "Changing the big picture takes time and the best thing to do is focus on the things that we can make in our lives.",
                        "My job was to be myself, to speak as myself. And so I did.", "Your story is what you have, what you will always have. It's something to own.",
                        "If you don't get out there and define yourself, you'll be quickly and inaccurately defined by others.",
                        "Time was a gift you gave to other people.", "Failure is a feeling long before it becomes an actual result.",
                        "No one was going to look out for me unless I pushed for it."
                };
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(quote.length);
                String quotes = quote[randomNumber];

                michelleScreenText.setText(quotes);
            }

        };
        michelleInspireButton.setOnClickListener(listener);

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
