package com.example.testpractise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] Questions = {"Sharks are mammals ?", "The blue whale is the biggest animal to have ever lived ?", "Bats are blind ?", "It takes a sloth two weeks to digest a meal ?","The two longest rivers in the world are the Mississippi and the Nile ?","Greenland is the largest island in the world ?","Vatican City is the smallest country in the world ?","Infants have more bones than adults ?","Taste buds can only be found on the tongue ?","The world's Oceans produce over 40% of the oxygen we breath ?"};
    private boolean[] answers = {false, true, false, true,false,true,true,true,false,true};
    private int score = 0;
    Button yes;
    Button no;
    TextView question;
    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.Yes);
        no = findViewById(R.id.No);
        question = findViewById(R.id.textView);
        question.setText(Questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index <= Questions.length - 1) {

                    if (answers[index] == true) {
                        score++;
                    }
                    index++;
                    if (index <= Questions.length - 1) {
                        question.setText(Questions[index]);
                    } else {
                        Toast.makeText(MainActivity.this, "your Score  is :" + score +"/" +Questions.length, Toast.LENGTH_SHORT).show();
                    }

                } else {
                    Toast.makeText(MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();

                }
            }


        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index <= Questions.length - 1) {

                    if (answers[index] == false) {
                        score++;
                    }
                    index++;
                    if (index <= Questions.length - 1) {
                        question.setText(Questions[index]);
                    } else {
                        Toast.makeText(MainActivity.this, "your Score  is :" + score+"/"+Questions.length, Toast.LENGTH_SHORT).show();
                    }

                } else {
                    Toast.makeText(MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}


