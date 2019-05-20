package com.example.motivation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class AliActivity extends AppCompatActivity {

    private TextView aliScreenText;
    private Button aliInspireButton;
    public Button backButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ali);

        aliScreenText = (TextView) findViewById(R.id.aliScreenText);
        aliInspireButton = (Button) findViewById(R.id.aliInspireButton);
        backButton = (Button) findViewById(R.id.backButton);

        View.OnClickListener listener = new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String[] quote = {"He who is not courageous enough to take risks will accomplish nothing in life.", "I don't count my sit-ups. I only start counting when it starts hurting because they're the only ones that count.",
                "Don't quit. Suffer now and live the rest of your life as a champion.", "It's lack of faith that makes people afraid of meeting challenges and I believed in myself.",
                "If you haven't learned the meaning of friendship, you haven't really learned anything.", "I don't have to be what you want me to be. I'm free to be what I want.",
                "A person who views the world the same at 50 as they did at 20 has wasted 30 years of their life.", "It isn't the mountains ahead to climb that wear you out. It's the pebble in your show.",
                "Float like a butterfly, sting like a bee.", "I am the greatest. I said that even before I knew I was. I figured that if I said it enough, I would convince the world that I really was the greatest.",
                "If they can make penicillin out of moldy bread, they can sure making something out of you.", "Only someone who knows what it's like to be defeated can reach down to the bottom of his soul and come up with the extra ounce of power it takes to win when the match is even.",
                "Champions are made from something they have deep inside them. A desire, a dream, a vision.", "The will must be stronger than the skill.",
                "If my mind can conceive it, and my heart can believe it, then I can achieve it.", "Don't count the days, make the days count.",
                "It's not bragging if you can back it up.", "Humble people don't get very far.", "To be a great champion, you must believe you are. If not, pretend you are.",
                "What you are thinking is what you are becoming.", "What keeps me going is goals.", "Live everyday as if it were your last because someday you're going to be right.",
                "Silence is golden when you can't think of a good answer.", "It's the repetition of affirmations that leads to belief. Once that belief becomes a deep conviction, things begin to happen.",
                "My way of joking is to tell the truth. That's the funniest joke of all.", "Old age is just a record of one's whole life.",
                "We all have defeats to take in life."};

                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(quote.length);
                String quotes = quote[randomNumber];

                aliScreenText.setText(quotes);
            }
        };

        aliInspireButton.setOnClickListener(listener);

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
