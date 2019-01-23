package io.tnine.rateusexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.tnine.ratemyapp.RatingDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RatingDialog.getInstance()
                .setPeriodicCount(3)
                .setBackgroundColor(R.color.white)
                .setIcon(R.drawable.star)
                .setCancelTextColor(R.color.grey500)
                .setMessageTextColor(R.color.colorAccent)
                .setCancelTextBackground(R.color.white)
                .setMessageText("Loved Rating App? Please rate us")
                .initDialog(MainActivity.this, MainActivity.this)
                .showDialog();


    }
}
