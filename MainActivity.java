package com.example.motivation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button beyButton;
    private Button oprahButton;
    private Button tylerButton;
    private Button michelleButton;
    private Button serenaButton;
    private Button drakeButton;
    private Button jayButton;
    private Button aliButton;
    private Button mayaButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        beyButton = (Button) findViewById(R.id.beyButton);
        oprahButton = (Button) findViewById(R.id.oprahButton);
        tylerButton = (Button) findViewById(R.id.tylerButton);
        michelleButton = (Button) findViewById(R.id.michelleButton);
        serenaButton = (Button) findViewById(R.id.serenaButton);
        drakeButton = (Button) findViewById(R.id.drakeButton);
        jayButton = (Button) findViewById(R.id.jayButton);
        aliButton = (Button) findViewById(R.id.aliButton);
        mayaButton = (Button) findViewById(R.id.mayaButton);

        beyButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
                    public void onClick(View view)
            {
                openBeyonceQuotes();

            }
        });//End of beyButton onClickListener

        oprahButton.setOnClickListener(new View.OnClickListener()
                                       {
                                           @Override
                                           public void onClick(View view)
                                           {
                                               openOprahQuotes();
                                           }
                                       });//End of oprahButton OnClickListener

        tylerButton.setOnClickListener(new View.OnClickListener()
                                       {
                                           @Override
                                           public void onClick(View view)
                                           {
                                               openTylerQuotes();
                                           }
                                       });//End of tylerButton OnClicKListener

        michelleButton.setOnClickListener(new View.OnClickListener()
                                    {
                                        @Override
                                        public void onClick(View view)
                                        {
                                            openMichelleQuotes();
                                        }
                                    });

        serenaButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                openSerenaQuotes();
            }
        });

        drakeButton.setOnClickListener(new View.OnClickListener()
                                       {
                                           @Override
                                           public void onClick(View view)
                                           {
                                               openDrakeQuotes();
                                           }
                                       });

        jayButton.setOnClickListener(new View.OnClickListener()
                                     {
                                         @Override
                                         public void onClick(View view)
                                         {
                                             openJayQuotes();
                                         }
                                     });

        aliButton.setOnClickListener(new View.OnClickListener()
                                     {
                                         @Override
                                         public void onClick(View view)
                                         {
                                             openAliQuotes();
                                         }
                                     });

        mayaButton.setOnClickListener(new View.OnClickListener()
                                      {
                                          @Override
                                          public void onClick(View view)
                                          {
                                              openMayaQuotes();
                                          }
                                      });


    } //end of onCreate bundle



//This is a method that handles what happens once the Beyonce button is clicked. It will take the user to the Beyonce quotes screen
        public void openBeyonceQuotes()
        {
            Intent intent = new Intent(this, BeyonceActivity.class); //This will tell the app to open THIS intent/context & tells the class that you want opened
            startActivity(intent);
        }

        public void openOprahQuotes()
        {
            Intent intent = new Intent(this, OprahActivity.class);
            startActivity(intent);
        }

        public void openTylerQuotes()
        {
            Intent intent = new Intent(this, TylerActivity.class);
            startActivity(intent);
        }

        public void openMichelleQuotes()
        {
            Intent intent = new Intent(this, MichelleActivity.class);
            startActivity(intent);
        }

        public void openSerenaQuotes()
        {
            Intent intent = new Intent(this, SerenaActivity.class);
            startActivity(intent);
        }

        public void openDrakeQuotes()
        {
            Intent intent = new Intent(this, DrakeActivity.class);
            startActivity(intent);
        }

        public void openJayQuotes()
        {
            Intent intent = new Intent(this, JayActivity.class);
            startActivity(intent);
        }

        public void openAliQuotes()
        {
            Intent intent = new Intent(this, AliActivity.class);
            startActivity(intent);
        }

        public void openMayaQuotes()
        {
            Intent intent = new Intent(this, MayaActivity.class);
            startActivity(intent);
        }

}
