package com.example.motivation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class DrakeActivity extends AppCompatActivity {

    private TextView drakeScreenText;
    private Button drakeInspireButton;
    public Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drake);

        drakeScreenText = (TextView) findViewById(R.id.drakeScreenText);
        drakeInspireButton = (Button) findViewById(R.id.drakeInspireButton);
        backButton = (Button) findViewById(R.id.backButton);

        View.OnClickListener listener = new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String[] quote = {"Everybody has an addiction, mine happens to be success.", "I was born to make mistakes, not to fake perfection.",
                "When writing the story of your life, don't let anyone else hold the pen.", "Haters will broadcast your failures, but whisper your success.",
                "Never let success get to your head and never let failure get to your heart.", "Strength isn't always shown in what you can hold on to, sometimes it's shown in what you can let go of.",
                "Life can always change. You have to adjust.",  "Before you give up, think of the reason you held on so long.",
                "It's never too late to realize what you want in your life and it's never wrong to fight for it.", "Jealousy is just love and hate at the same time.",
                "Sometimes it's the journey that teaches you a lot about your destination.", "The moment I stop having fun with it, I'll be done with it.",
                "Pain makes you stronger. Fear makes you braver. Heartbreak makes you wiser.", "Everybody dies but not everybody lives.",
                "I'm trying to better than good enough.", "Count your blessings, not problems.", "You never see it coming you just get to see it go.",
                "No matter how dirty your past is, your future is spotless.", "Always smile more than you cry, give more than you take and love more than you hate.",
                "I live for the nights that I can't remember, with the people that I won't forget.", "Kill them with success and bury them with a smile.",
                "People will wish you all the success in the world and then hate you when you get it.", "Smile and let everybody know that today, you're a lot stronger than you were yesterday.",
                "My life is mine to remember.", "I've never been reckless, it's always calculated. I'm mischievous but I'm calculated.",
                "Patience is key.", "A goal is just a dream with a deadline.", "Careful what you wish for, you just might get it all.",
                "I learned working with the negatives could make for better pictures.", "Spend life with someone who makes you happy, not someone you have to impress."
                };
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(quote.length);
                String quotes = quote[randomNumber];

                drakeScreenText.setText(quotes);

            }
        };
        drakeInspireButton.setOnClickListener(listener);

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
