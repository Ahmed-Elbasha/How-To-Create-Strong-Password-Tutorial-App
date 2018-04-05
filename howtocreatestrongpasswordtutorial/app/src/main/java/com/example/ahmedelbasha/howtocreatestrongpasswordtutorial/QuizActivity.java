package com.example.ahmedelbasha.howtocreatestrongpasswordtutorial;

import android.content.Context;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    Context context = QuizActivity.this;
    Toast toast;
    CharSequence message;
    int toastDuration = Toast.LENGTH_SHORT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        RadioGroup selectionGroupOfFirstQuestion = findViewById(R.id.selection_group_of_first_question);

        RadioButton yesIknowRadioButton = selectionGroupOfFirstQuestion.findViewById(R.id.yes_i_know_radio_button);
        Boolean checkedStateOfYesIKnowRadio = yesIknowRadioButton.isChecked();

        RadioButton noIDidntRadioButton = selectionGroupOfFirstQuestion.findViewById(R.id.no_i_didnt_radio_button);
        Boolean checkedStateOfNoIDidntRadio = noIDidntRadioButton.isChecked();

        RadioButton somehowIKnowRadioButton = selectionGroupOfFirstQuestion.findViewById(R.id.somehow_radio_button);
        Boolean checkedStateOfSomehowIKnowRadio = somehowIKnowRadioButton.isChecked();

        RadioGroup selectionGroupOfSecondQuestion = findViewById(R.id.selection_group_of_second_question);

        RadioButton yesItsUsefulRadioButton = selectionGroupOfSecondQuestion.findViewById(R.id.yes_its_useful_radio_button);
        Boolean checkedStateOfYesItsUsefulRadio = yesItsUsefulRadioButton.isChecked();

        RadioButton noItsNotRadioButton = selectionGroupOfSecondQuestion.findViewById(R.id.no_its_not_radio_button);
        Boolean checkedStateOfNoItsNotRadio = noItsNotRadioButton.isChecked();

        RadioGroup selectionGroupOfThirdQuestion = findViewById(R.id.selection_group_of_third_question);

        RadioButton verySatisfiedRadioButton = selectionGroupOfThirdQuestion.findViewById(R.id.very_satisfied_radio_button);
        Boolean checkedStateOfVerySatisfiedRadio = verySatisfiedRadioButton.isChecked();

        RadioButton satisfiedRadioButton = selectionGroupOfThirdQuestion.findViewById(R.id.satisfied_radio_button);
        Boolean checkedStateOfSatisfiedRadio = satisfiedRadioButton.isChecked();

        RadioButton fairRadioButton = selectionGroupOfThirdQuestion.findViewById(R.id.fair_radio_button);
        Boolean checkedStateOfFairRadio = fairRadioButton.isChecked();

        RadioButton badRadioButton = selectionGroupOfThirdQuestion.findViewById(R.id.bad_radio_button);
        Boolean checkedStateOfBadRadio = badRadioButton.isChecked();

        RadioButton veryBadRadioButton = selectionGroupOfThirdQuestion.findViewById(R.id.very_bad_radio_button);
        Boolean checkedStateOfVeryBadRadio = veryBadRadioButton.isChecked();

        RadioGroup selectionGroupOfFourthQuestion = findViewById(R.id.selection_group_of_fourth_question);

        RadioButton yesIRecommendRadioButton = selectionGroupOfFourthQuestion.findViewById(R.id.yes_i_recommend_radio_button);
        Boolean checkedStateOfYesIRecommendRadio = yesIRecommendRadioButton.isChecked();

        RadioButton noIDontRecommendRadioButton = selectionGroupOfFourthQuestion.findViewById(R.id.no_iam_not_radio_button);
        Boolean checkedStateOfNoIDontRecommendRadio = noIDontRecommendRadioButton.isChecked();

        EditText moreCommentsEditText = findViewById(R.id.other_comments_user_input);
        String comments = moreCommentsEditText.getText().toString();

        Button submitButton = findViewById(R.id.submit_button);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message = "thanks for your feedback.";
                toast = Toast.makeText(context, message, toastDuration);
                toast.show();
            }
        });
    }
}
