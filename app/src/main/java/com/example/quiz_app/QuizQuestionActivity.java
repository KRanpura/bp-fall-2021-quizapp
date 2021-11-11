package com.example.quiz_app;

import android.content.Intent;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class QuizQuestionActivity extends AppCompatActivity {

    // UI components here

    // other variables here

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_questions);

        // create arraylist of questions
       ArrayList<String> questions = new ArrayList<String>(5);
       questions.add("When was Rutgers founded?");
       questions.add("When did Rutgers admit its first full class of women students?");
       questions.add("Which one of the following is not a Rutgers building?");
       questions.add("What was Rutgers University’s original name?");
       questions.add("How many campuses make up Rutgers university?");


        // get username intent from main activity screen

        // initialize views using findViewByID

        // use helper method to add question content to arraylist

        // get total number of questions

        // set progress bar

        // use helper method to proceed to next question
    }

    /**
     * Method that adds questions to our questions arraylist, using the Question Model constructor
     */
    private void addQuestions(){
        // question 1

        // question 2

        // question 3

        // question 4

        // question 5

    }

    /**
     * Check the answer when user clicks submit and move on to next question
     */
    public void submitQuestion(View view){
        // if no options have been selected, prompt user to select an answer

        // use helper methods to check the answer and show the next question

    }

    /**
     * Display next question. If finished, move onto results screen
     */
    private void showNextQuestion(){

        // clear previous button selections

        // if you haven't gone through all the questions yet
        // set the question & text to the next question
        // increase question number
        // set progress bar

        // if finished with quiz, start Results activity

    }

    /**
     * Checks the answer and increases score if correct
     */
    private void checkAnswer(){
        // see which answer they picked

        // increase score if correct

    }
}
