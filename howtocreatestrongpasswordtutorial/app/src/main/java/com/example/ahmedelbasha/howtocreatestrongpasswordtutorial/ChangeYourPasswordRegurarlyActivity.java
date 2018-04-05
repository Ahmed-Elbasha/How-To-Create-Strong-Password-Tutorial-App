package com.example.ahmedelbasha.howtocreatestrongpasswordtutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChangeYourPasswordRegurarlyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.point_activity);

        String pointHeading = "Change your password regularly:";
        String pointDescription = "The longer you use a password, the less secure it becomes. That’s why security experts suggest that you change your passwords at least once a year to protect your accounts. Depending on your risk level, you may need to change them every 90 days. For example, if you use public computers a lot, you should update your passwords more frequently than if you only use a home computer.";

        TextView pointHeadingTextView = findViewById(R.id.point_heading_text_view);
        pointHeadingTextView.setText(pointHeading);

        TextView pointDescriptionTextView = findViewById(R.id.point_description_text_view);
        pointDescriptionTextView.setText(pointDescription);

        Button nextButton = findViewById(R.id.next_button);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent navigateToNextActivityIntent = new Intent(ChangeYourPasswordRegurarlyActivity.this, GoForLemgthActivity.class);
                startActivity(navigateToNextActivityIntent);
            }
        });

        Button returnButton = findViewById(R.id.return_button);

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent navigateToPreviousActivityIntent = new Intent(ChangeYourPasswordRegurarlyActivity.this, MainActivity.class);
                startActivity(navigateToPreviousActivityIntent);
            }
        });
    }
}
