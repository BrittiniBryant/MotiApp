package com.example.motivation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class BeyonceActivity extends AppCompatActivity {

    private TextView beyScreenText;
    private Button beyInspireButton;
    public Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beyonce);

        beyScreenText = (TextView) findViewById(R.id.beyScreenText);
        beyInspireButton = (Button) findViewById(R.id.beyInspireButton);
        backButton = (Button) findViewById(R.id.backButton);

        //OnClickListener for beyInspireButton
        View.OnClickListener listener = new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String[] quote ={
                        "I felt like it was time to set up my future, so I set a goal. My goal was independence.",
                        "Your self-worth is determined by you. You don't have to depend on someone telling you who you are.",
                        "Take the time to define yourself and define your value.", "Power is not given to you, you have to take it.",
                        "The reality is that sometimes you lose. You're never too good, smart or big to lose. It happens.",
                        "If everything was perfect, you would never learn and you would never grow.", "Power means happiness; power means hard work and sacrifice.",
                        "Everyone's not good at everything, it's okay to depend on someone.", "I don't like to gamble, but if there's one thing I'm willing to bet on, it's myself.",
                        "We all have our purpose. We all have our strengths.", "I embrace mistakes. They make you who you are.",
                        "I use the negativity to fuel the transformation into a better me.",
                        "It's so liberating to know what I want, what makes me happy and what I will not tolerate. I have learned that it's no one else's job to take care of me but me.",
                        "If you don't take the time to think about and analyze your life, you'll never realize all the dots that are connected."


                };
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(quote.length);
                String quotes = quote[randomNumber];

                beyScreenText.setText(quotes);
            }
        };//end of OnClickListener
        beyInspireButton.setOnClickListener(listener);

        View.OnClickListener listener1 = new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                openBackButton();

            }
        };
        backButton.setOnClickListener(listener1);


    }//end of OnCreateMethod

    public void openBackButton()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }



}
