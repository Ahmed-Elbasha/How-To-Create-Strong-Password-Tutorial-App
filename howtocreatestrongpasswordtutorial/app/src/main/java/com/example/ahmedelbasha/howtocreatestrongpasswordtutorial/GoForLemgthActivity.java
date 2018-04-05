package com.example.ahmedelbasha.howtocreatestrongpasswordtutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GoForLemgthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.point_activity);

        String pointHeading = "Go for length:";
        String pointDescription = "When creating a strong password, length matters. Try to make sure it’s at least eight to 10 characters. Complexity also helps. A six-character, lowercase password takes five minutes to break; one with nine characters takes two months. A six-character password with numbers and symbols takes less than nine days to break; one with nine characters takes nearly 20,000 years.";

        TextView pointHeadingTextView = findViewById(R.id.point_heading_text_view);
        pointHeadingTextView.setText(pointHeading);

        TextView pointDescriptionTextView = findViewById(R.id.point_description_text_view);
        pointDescriptionTextView.setText(pointDescription);

        Button nextButton = findViewById(R.id.next_button);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent navigateToNextActivityIntent = new Intent(GoForLemgthActivity.this, BeUniqueActivity.class);
                startActivity(navigateToNextActivityIntent);
            }
        });

        Button returnButton = findViewById(R.id.return_button);

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent navigateToPreviousActivityIntent = new Intent(GoForLemgthActivity.this, ChangeYourPasswordRegurarlyActivity.class);
                startActivity(navigateToPreviousActivityIntent);
            }
        });
    }
}
