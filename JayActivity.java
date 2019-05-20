package com.example.motivation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class JayActivity extends AppCompatActivity {

    private TextView jayScreenText;
    private Button jayInspireButton;
    public Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jay);

        jayScreenText = (TextView) findViewById(R.id.jayScreenText);
        jayInspireButton = (Button) findViewById(R.id.jayInspireButton);
        backButton = (Button) findViewById(R.id.backButton);

        View.OnClickListener listener = new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String[] quote = {"I came, I saw, I conquered.", "What you see is what you reflect. If I'm standoffish, that's because you are.",
                "I'm hungry for knowledge. The whole thing is to learn everyday, to get brighter and brighter.",
                "I'm far from being god, but I work god damn hard.", "Successful people have a bigger fear of failure than people who've never done anything because if you haven't been successful, then you don't know how it feels to lose it all.",
                "People respect success. They respect big. If you're big enough, people are drawn to you.",
                "Once you've let yourself fall in love with someone, once you put them on such a high pedestal and they let you down, you never want to experience that pain again.",
                "Do me a favor. Don't do me no favors. I handle mine.", "You can want success all you want, but to get it, you can't falter.",
                "All I got is dreams. Nobody else believes. Nobody else can see. Nobody else but me.", "Don't tell me what was said about me. Tell me why they were so comfortable to say it to you.",
                "Everything evens up, you just wait. You're not even a garbage can, you have faith!", "You can pay for school but you can't buy class.",
                "You learn more in failure than you ever do in success.", "I'm not afraid of dying. I'm afraid of not trying.",
                "I will not lose, for even in defeat, there's a valuable lesson learned, so it evens up for me.", "A wise man told me don't argue with fools. People from a distance can't tell who is who.",
                "Difficulty takes a day, impossible takes a week.", "Be more concerned with your character than your reputation. Your character is what you really are, while your reputation is merely what others think of you.",
                "They talk. We live. Who cares what they say?", "Identity is a prison you can never escape, but the way to redeem your past is not to run from it, but to try to understand it, and use it as a foundation to grow.",
                "Those who are successful overcome their fears and take action. Those who aren't submit to their fears and live with regrets.",
                "I'd rather die enormous than live dormant.", "We change people through conversation, not through censorship.", "I'm like a dog, I never speak, but I understand.",
                "If people don't hate you, you're probably not doing very big things.", "I believe everybody in the world is born with genius-level talent. Apply yourself to whatever you're genius at and you can do anything in the world.",
                "I went through hell, I'm expecting heaven.", "Leave a mark they can't erase, neither space nor time.",
                "Belief in oneself and knowing who you are. That's the foundation for everything great.", "Jealousy is a weak emotion."};

                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(quote.length);
                String quotes = quote[randomNumber];

                jayScreenText.setText(quotes);
            }

        };

        jayInspireButton.setOnClickListener(listener);

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
