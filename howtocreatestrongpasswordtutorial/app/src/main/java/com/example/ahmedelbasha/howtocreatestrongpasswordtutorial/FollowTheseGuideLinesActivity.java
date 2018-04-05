package com.example.ahmedelbasha.howtocreatestrongpasswordtutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FollowTheseGuideLinesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.point_activity);

        String pointHeading = "Follow these guidelines:";
        String pointDescription = "1- Do not use your Social Security number, phone number, birth date, first and last name or user ID when creating your password.\n\n" +
                "2- Use a different password for every site. A strong password has to be unique, not just a variation of passwords you use on other sites.\n\n" +
                "3- Avoid storing your passwords in unencrypted files, like the notes app on your phone. Instead, write them down and store them in a safe place.";

        TextView pointHeadingTextView = findViewById(R.id.point_heading_text_view);
        pointHeadingTextView.setText(pointHeading);

        TextView pointDescriptionTextView = findViewById(R.id.point_description_text_view);
        pointDescriptionTextView.setText(pointDescription);

        Button nextButton = findViewById(R.id.next_button);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent navigateToNextActivityIntent = new Intent(FollowTheseGuideLinesActivity.this, MakeItMemorableActivity.class);
                startActivity(navigateToNextActivityIntent);
            }
        });

        Button returnButton = findViewById(R.id.return_button);

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent navigateToPreviousActivityIntent = new Intent(FollowTheseGuideLinesActivity.this, BeUniqueActivity.class);
                startActivity(navigateToPreviousActivityIntent);
            }
        });
    }
}
