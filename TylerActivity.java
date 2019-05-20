package com.example.motivation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class TylerActivity extends AppCompatActivity {

    private TextView tylerScreenText;
    private Button tylerInspireButton;
    public Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tyler);

        tylerScreenText = (TextView) findViewById(R.id.tylerScreenText);
        tylerInspireButton = (Button) findViewById(R.id.tylerInspireButton);
        backButton = (Button) findViewById(R.id.backButton);

        View.OnClickListener listener = new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {

                String[] quote = {"Be aware of the darkness but your focus should always be the light.",
                        "Don't let people change who you are, just be who you are with someone else.", "Fear is a spirit that really can stop you from living.",
                        "It takes awhile to build a dream.", "Share wisdom with those who will receive it.", "What I have learned in this life is you can never be ashamed of where you come from.",
                        "A footstool is only needed when you need to get higher. Let your enemy lift you.", "I'm just enjoying my life. I suggest you try it.",
                        "Take time to smell the roses, but be careful of the bees.", "What rings true is that everything we grow through in life will work out for our good.",
                        "You can learn something from everything and everybody, especially the elderly.", "You really will reap what you sow",
                        "A mother's love is stronger than distance, more powerful than time and can transcend the grave.", "Don't share your dreams with everyone and don't be angry with non-dreamers.",
                        "People always try to do the right thing...after they've tried everything else.", "Teach but never try to change people because sometimes they change back.",
                        "There will be rough nights but joy really does come in the morning.", "The most dangerous person in the world is a person with nothing to lose, the most powerful person in the world is a person with nothing to prove.",
                        "You can never be upset with the people who forced you into your dream or up higher.", "You'll always find jealous people. They're the ones promoting you.",
                        "Bitterness is as toxic as stage 4 cancer.", "Never argue with what is.", "The dream will outlive the dreamer so dream big.",
                        "You can't make yourself happy by causing other peoples misery.", "Your beginning never dictates your destination",
                        "Are you living or just existing?", "Don't wait for someone to green light your project, build your own intersection.",
                        "Never wish to be somebody else.", "The grass may be greener on the other side but the water bill is higher.",
                        "You can't build your life around hurts from the past.", "Your gift can make room for you."};

                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(quote.length);
                String quotes = quote[randomNumber];

                tylerScreenText.setText(quotes);
            }
        };
        tylerInspireButton.setOnClickListener(listener);

        View.OnClickListener listener1 = new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                openBackButton();
            }
        };
        backButton.setOnClickListener(listener1);

    }//end of onCreate

public void openBackButton()
{
    Intent intent = new Intent(this, MainActivity.class);
    startActivity(intent);
}
}
