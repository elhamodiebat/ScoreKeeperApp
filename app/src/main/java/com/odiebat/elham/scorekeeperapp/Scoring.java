package com.odiebat.elham.scorekeeperapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Scoring extends AppCompatActivity {
    TextView teamOne, teamTwo;
    ImageView flagA, flagB;
    String teamA, teamB;
    TextView txFoulsA, txFoulsB, txPointsA, txPointsB;
    public int pointsA, pointsB;
    public int foulsA, foulsB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoring);
        Bundle extras = getIntent().getExtras();
        teamA = extras.getString("teamOne");
        teamB = extras.getString("teamTwo");

        teamOne = findViewById(R.id.team_one);
        teamTwo = findViewById(R.id.team_two);
        flagA = findViewById(R.id.flag_team_a);
        flagB = findViewById(R.id.flag_team_b);
        txFoulsA = findViewById(R.id.team_one_fouls);
        txFoulsB = findViewById(R.id.team_two_fouls);
        txPointsA = findViewById(R.id.team_one_score);
        txPointsB = findViewById(R.id.team_two_score);
        txFoulsB = findViewById(R.id.team_two_fouls);
        byte[] b = extras.getByteArray("flagB");
        byte[] a = extras.getByteArray("flagA");
        Bitmap bmpA = BitmapFactory.decodeByteArray(a, 0, a.length);
        Bitmap bmpB = BitmapFactory.decodeByteArray(b, 0, b.length);
        teamOne.setText(teamA);
        teamTwo.setText(teamB);
        flagA.setImageBitmap(bmpA);
        flagB.setImageBitmap(bmpB);
    }

    public void reset(View view) {
        pointsA = 0;
        pointsB = 0;
        foulsA = 0;
        foulsB = 0;
        txFoulsB.setText(String.valueOf(foulsB));
        txFoulsA.setText(String.valueOf(foulsA));
        txPointsA.setText(String.valueOf(pointsA));
        txPointsB.setText(String.valueOf(pointsB));

    }

    public void foulB(View view) {
        foulsB = foulsB + 1;
        txFoulsB.setText(String.valueOf(foulsB));
    }

    public void foulA(View view) {
        foulsA = foulsA + 1;
        txFoulsA.setText(String.valueOf(foulsA));
    }

    public void plus_three_for_A(View view) {
        pointsA = pointsA + 3;
        txPointsA.setText(String.valueOf(pointsA));
    }

    public void plus_two_for_A(View view) {
        pointsA = pointsA + 2;
        txPointsA.setText(String.valueOf(pointsA));
    }

    public void plus_one_for_A(View view) {
        pointsA = pointsA + 1;
        txPointsA.setText(String.valueOf(pointsA));
    }

    public void plus_one_for_B(View view) {
        pointsB = pointsB + 1;
        txPointsB.setText(String.valueOf(pointsB));
    }

    public void plus_two_for_B(View view) {
        pointsB = pointsB + 2;
        txPointsB.setText(String.valueOf(pointsB));
    }

    public void plus_three_for_B(View view) {
        pointsB = pointsB + 3;
        txPointsB.setText(String.valueOf(pointsB));
    }
}
