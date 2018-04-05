package com.example.ahmedelbasha.howtocreatestrongpasswordtutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MakeItMemorableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.point_activity);

        String pointHeading = "Make it memorable:";
        String pointDescription = "A strong password should be based on something you can remember but that would be difficult for a hacker to guess. Stay away from well-known phrases, quotes or song lyrics. Start with a sentence such as “I live for boating!” and transform it to “ILv4Btng!” Or string a series of random words together to create a strong password like this: “wizardboWLingchicKeN.”\n" +
                "\n" +
                "Following these tips can help you create stronger passwords that are tough for hackers to break—and help protect your identity.";

        TextView pointHeadingTextView = findViewById(R.id.point_heading_text_view);
        pointHeadingTextView.setText(pointHeading);

        TextView pointDescriptionTextView = findViewById(R.id.point_description_text_view);
        pointDescriptionTextView.setText(pointDescription);

        Button nextButton = findViewById(R.id.next_button);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent navigateToNextActivityIntent = new Intent(MakeItMemorableActivity.this, QuizActivity.class);
                startActivity(navigateToNextActivityIntent);
            }
        });

        Button returnButton = findViewById(R.id.return_button);

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent navigateToPreviousActivityIntent = new Intent(MakeItMemorableActivity.this, FollowTheseGuideLinesActivity.class);
                startActivity(navigateToPreviousActivityIntent);
            }
        });
    }
}
