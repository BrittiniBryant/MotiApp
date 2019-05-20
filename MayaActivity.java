package com.example.motivation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MayaActivity extends AppCompatActivity {

    private TextView mayaScreenText;
    private Button mayaInspireButton;
    public Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maya);

        mayaScreenText = (TextView) findViewById(R.id.mayaScreenText);
        mayaInspireButton = (Button) findViewById(R.id.mayaInspireButton);
        backButton = (Button) findViewById(R.id.backButton);

        View.OnClickListener listener = new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String[] quote = {"I do my best because I'm counting on you counting on me.", "If you are always trying to be normal, you will never know how amazing you can be.",
                "Nothing will work unless you do.", "Do the best you can until you know better. Then when you know better, do better.",
                "Develop enough courage so that you can stand up for yourself and then stand up for somebody else.", "Only equals can become friends.",
                "If you find it in your heart to care for somebody else, you will have succeeded.", "You alone are enough. You have nothing to prove to anybody.",
                "We may encounter many defeats but we must not be defeated.", "The desire to reach for the stars is ambitious. The desire to reach hearts is wise.",
                "You can't really know where you are going until you know where you have been.", "I've learned that people will forget what you said, people will forget what you did, but people will never forget how you made them feel.",
                "Life is not measured by the number of breaths we take, but by the moments that take our breath away.", "If you don't like something, change it. If you can't change it, change your attitude.",
                "When you know you are of worth, you walk into a room with a particular power.", "You can only become truly accomplished at something you loved.",
                "You can't use up creativity. The more you see, the more you have.", "Ask for what you want and be prepared to get it.",
                "I can't ask somebody else to stand up for me if I won't stand up for myself.", "If a person does not invent themselves, they will be invented.",
                "Success is liking yourself, liking what you do, and liking how you do it.", "Hate has caused a lot of problems in the world, but has not solved one yet.",
                "If one has courage, nothing can dim the light which shines from within.", "Be a rainbow in someone else's cloud.",
                "When you get, give. When you learn, teach.", "There is no greater agony than bearing an untold story inside you.",
                "Never make someone a priority when all you are to them is an option.", "I can be changed by what happens to me, but I refuse to be reduced by it.",
                "Your belief and work will speak for you.", "We need much less than we think we need.", "I believe that every person is born with talent.",
                "If someone shows you who you are, believe them.", "You can do anything you choose to do.", "We need not be in denial about what we've done and what we've come through.",
                "I don't trust anyone who doesn't laugh.", "We are only as blind as we want to be.", "I've learned that making a living is not the same thing as making a life.",
                "Forgiveness is a gift you give to yourself.", "If I am not good to myself, how can I expect anyone else to be good to me?",
                "Whatever you want to do, if you want to be great at it, you have to love it and be able to make sacrifices for it.",
                "Whenever I decide something with an open heart, I usually make the right decision.", "I have respect for the past, but I'm a person of the moment.",
                "Be present in all things and thankful for all things.", "A wise person refuses to be anyone's victim", "I have great respect for the past.",
                "Hoping for the best, prepared for the worst and unsurprised by anything in between."};

                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(quote.length);
                String quotes = quote[randomNumber];

                mayaScreenText.setText(quotes);
            }
        };

        mayaInspireButton.setOnClickListener(listener);

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
