package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView tv;
    Button btn1,btn2;
    int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        tv = (TextView)findViewById(R.id.storyTextView);
        btn1 = (Button)findViewById(R.id.buttonTop);
        btn2 = (Button)findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex ==1)
                {
                    tv.setText(R.string.T3_Story);
                    btn1.setText(R.string.T3_Ans1);
                    btn2.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                }
                else if(mStoryIndex ==3)
                {
                    tv.setText(R.string.T6_End);
                    btn1.setVisibility(View.GONE);
                    btn2.setVisibility(View.GONE);
                    mStoryIndex = 5;
                }
                if(mStoryIndex ==2)
                {
                    tv.setText(R.string.T3_Story);
                    btn1.setText(R.string.T3_Ans1);
                    btn2.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                }

            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex ==1)
                {
                    tv.setText(R.string.T2_Story);
                    btn1.setText(R.string.T2_Ans1);
                    btn2.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                }
                else if(mStoryIndex ==3)
                {
                    tv.setText(R.string.T5_End);
                    btn1.setVisibility(View.GONE);
                    btn2.setVisibility(View.GONE);
                    mStoryIndex = 5;
                }
                else if(mStoryIndex ==2)
                {
                    tv.setText(R.string.T4_End);
                    btn1.setVisibility(View.GONE);
                    btn2.setVisibility(View.GONE);
                    mStoryIndex = 2;
                }
            }
        });

    }


}
