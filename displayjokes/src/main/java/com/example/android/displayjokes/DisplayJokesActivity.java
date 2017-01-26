package com.example.android.displayjokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokesActivity extends AppCompatActivity {

    TextView mJokeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_jokes);
        mJokeTextView = (TextView) findViewById(R.id.display_joke);
        Intent intent = getIntent();
        String joke = intent.getStringExtra(getString(R.string.key_joke));
        mJokeTextView.setText(joke);
    }
}
