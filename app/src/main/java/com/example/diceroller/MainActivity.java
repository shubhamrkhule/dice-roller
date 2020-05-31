package com.example.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButtonListnerMethod();
    }

    public void myButtonListnerMethod()
    {
        Button button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int rollResult=rand.nextInt(6) +1;

                TextView diceResult=(TextView)findViewById(R.id.diceResult);

                diceResult.setText(Integer.toString(rollResult));

                ImageView img =(ImageView)findViewById(R.id.dice);

                switch (rollResult)
                {
                    case 1:
                        img.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        img.setImageResource(R.drawable.dice2);
                        break;

                    case 3:
                        img.setImageResource(R.drawable.dice3);
                        break;

                    case 4:
                        img.setImageResource(R.drawable.dice4);
                        break;

                    case 5:
                        img.setImageResource(R.drawable.dice5);
                        break;

                    case 6:
                        img.setImageResource(R.drawable.dice6);
                        break;
                }

            }
        });
    }
}
