package com.example.motivation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class OprahActivity extends AppCompatActivity {

    private TextView oprahText;
    private Button oprahScreenText;
    public Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oprah);

        oprahText = (TextView) findViewById(R.id.oprahScreenText);
        oprahScreenText = (Button) findViewById(R.id.oprahInspireButton);
        backButton = (Button) findViewById(R.id.backButton);

        View.OnClickListener listener = new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
               String[] quote = {
                       "Turn your wounds into wisdom.", "You can have it all. Just not all at once.",
                       "Don't worry about being successful but work toward being significant and the success will naturally follow.",
                       "Real integrity is doing the right thing knowing that nobody's going to know whether you did it or not.",
                       "The more you praise and celebrate your life, the more there is in life to celebrate.",
                       "One of the hardest things in life to learn are which bridges to cross and which bridges to burn.",
                       "You don't become what you want, you become what you believe.", "When you undervalue what you do, the world will undervalue who you are.",
                       "Self-esteem comes from being able to define the world in your own terms and refusing to abide by the judgements of others.",
                       "Only make decisions that support your self-image, self-esteem and self-worth.", "Whatever you fear has no power, it is your fear that has the power.",
                       "It makes no difference how many peaks you reach if there was no pleasure in the climb.", "Forgiveness is giving up the hope that the past could have been any different.",
                       "You are where you are in life because of what you believe is possible for yourself.", "I don't believe in failure. It's not failure if you enjoy the process.",
                       "When people show you who they are, believe them!", "With every experience, you alone are painting your own canvas, thought by thought, choice by choice.",
                       "It doesn't matter who you are, where you come from. The ability to triumph begins with you. Always.",
                       "Breathe. Let go. Remind yourself that this very moment is the only one you know you have for sure.",
                       "Create the highest, grandest vision possible for your life, because you become what you believe.", "You know you are on the road to success if you would do your job and not be paid for it.",

               };
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(quote.length);
                String quotes = quote[randomNumber];

                oprahText.setText(quotes);
            }
        };
        oprahScreenText.setOnClickListener(listener);

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
