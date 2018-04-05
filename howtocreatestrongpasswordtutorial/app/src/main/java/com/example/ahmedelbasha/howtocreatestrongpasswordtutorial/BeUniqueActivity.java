package com.example.ahmedelbasha.howtocreatestrongpasswordtutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BeUniqueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.point_activity);

        String pointHeading = "Be unique:";
        String pointDescription = "Every year security services provider SplashData releases the most common (and therefore the worst) passwords in use. And every year “123456” and “password” are at the top of the list. Don’t use those passwords—and don’t use common dictionary words or consecutive numbers when creating your password. Passwords with simple patterns, such as “1234” or “qwerty,” or with obvious substitutions, such as “H0u$e,” are easy to guess.";

        TextView pointHeadingTextView = findViewById(R.id.point_heading_text_view);
        pointHeadingTextView.setText(pointHeading);

        TextView pointDescriptionTextView = findViewById(R.id.point_description_text_view);
        pointDescriptionTextView.setText(pointDescription);

        Button nextButton = findViewById(R.id.next_button);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent navigateToNextActivityIntent = new Intent(BeUniqueActivity.this, FollowTheseGuideLinesActivity.class);
                startActivity(navigateToNextActivityIntent);
            }
        });

        Button returnButton = findViewById(R.id.return_button);

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent navigateToPreviousActivityIntent = new Intent(BeUniqueActivity.this, GoForLemgthActivity.class);
                startActivity(navigateToPreviousActivityIntent);
            }
        });
    }
}
