package com.example.android.androidbasictestquestions;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int counter = 0;

    public void submit(View view) {

        //Checck whether the right answers are choosen

        RadioButton question_1 = (RadioButton) super.findViewById(R.id.answer_1_2);
        boolean question_1_checked = question_1.isChecked();
        int answer_1 = (question_1_checked) ? 1 : 0;

        RadioButton question_2 = (RadioButton) super.findViewById(R.id.answer_2_2);
        boolean question_2_checked = question_2.isChecked();
        int answer_2 = (question_2_checked) ? 1 : 0;

        RadioButton question_3 = (RadioButton) super.findViewById(R.id.answer_3_4);
        boolean question_3_checked = question_3.isChecked();
        int answer_3 = (question_3_checked) ? 1 : 0;


        CheckBox question_4_a = (CheckBox) findViewById(R.id.answer_4_1);
        boolean answer_4_1_checked = question_4_a.isChecked();
        int answer_4_a = (answer_4_1_checked) ? 1 : 0;

        CheckBox question_4_b = (CheckBox) findViewById(R.id.answer_4_2);
        boolean question_4_2_checked = question_4_b.isChecked();
        int answer_4_b = (question_4_2_checked) ? 1 : 0;

        RadioButton question_5 = (RadioButton) super.findViewById(R.id.answer_5_1);
        boolean question_5_checked = question_5.isChecked();
        int answer_5 = (question_5_checked) ? 1 : 0;

        RadioButton question_6 = (RadioButton) super.findViewById(R.id.answer_6_2);
        boolean question_6_checked = question_6.isChecked();
        int answer_6 = (question_6_checked) ? 1 : 0;

        //Calculate total score

        counter += answer_1 + answer_2 + answer_3 + answer_4_a * answer_4_b + answer_5 + answer_6;

        //Get user's name and show score message on screen

        EditText nameTextView = (EditText) findViewById(R.id.name_of_user);
        String nameOfUser = nameTextView.getText().toString();

        if (counter == 6) {
            Toast.makeText(this, "Well done! " + nameOfUser + " answered all the questions correctly !", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, nameOfUser + "'s score is " + counter, Toast.LENGTH_LONG).show();
        }
        counter = 0;
    }


}



