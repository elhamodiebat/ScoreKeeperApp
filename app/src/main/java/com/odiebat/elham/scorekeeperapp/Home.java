package com.odiebat.elham.scorekeeperapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;

public class Home extends AppCompatActivity {
    String teamOne, teamTwo;
    public byte[] flagA, flagB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void select(View view) {
        int id = view.getId();
        Bitmap bitmapA, bitmapB;
        ByteArrayOutputStream boasA, boasB;

        if (id == R.id.ernvsswe) {
            teamOne = "NORTHERN IRELAND";
            teamTwo = "SWITZERLAND";
            bitmapA = BitmapFactory.decodeResource(getResources(), R.drawable.northern_ireland);
            boasA = new ByteArrayOutputStream();
            bitmapA.compress(Bitmap.CompressFormat.PNG, 100, boasA);
            flagA = boasA.toByteArray();


            bitmapB = BitmapFactory.decodeResource(getResources(), R.drawable.switzerland);
            boasB = new ByteArrayOutputStream();
            bitmapB.compress(Bitmap.CompressFormat.PNG, 100, boasB);
            flagB = boasB.toByteArray();

        } else if (id == R.id.crovsgre) {

            teamOne = "CROATIA";
            teamTwo = "GREECE";
            bitmapA = BitmapFactory.decodeResource(getResources(), R.drawable.croatia);
            boasA = new ByteArrayOutputStream();
            bitmapA.compress(Bitmap.CompressFormat.PNG, 100, boasA);
            flagA = boasA.toByteArray();


            bitmapB = BitmapFactory.decodeResource(getResources(), R.drawable.greece);
            boasB = new ByteArrayOutputStream();
            bitmapB.compress(Bitmap.CompressFormat.PNG, 100, boasB);
            flagB = boasB.toByteArray();


        } else if (id == R.id.algvsnga) {

            teamOne = "ALGERIA";
            teamTwo = "NIGERIA";
            bitmapA = BitmapFactory.decodeResource(getResources(), R.drawable.alg);
            boasA = new ByteArrayOutputStream();
            bitmapA.compress(Bitmap.CompressFormat.PNG, 100, boasA);
            flagA = boasA.toByteArray();


            bitmapB = BitmapFactory.decodeResource(getResources(), R.drawable.nga);
            boasB = new ByteArrayOutputStream();
            bitmapB.compress(Bitmap.CompressFormat.PNG, 100, boasB);
            flagB = boasB.toByteArray();


        } else if (id == R.id.swevsita) {
            teamOne = "SWEDEN";
            teamTwo = "ITALY";
            bitmapA = BitmapFactory.decodeResource(getResources(), R.drawable.alg);
            boasA = new ByteArrayOutputStream();
            bitmapA.compress(Bitmap.CompressFormat.PNG, 100, boasA);
            flagA = boasA.toByteArray();


            bitmapB = BitmapFactory.decodeResource(getResources(), R.drawable.nga);
            boasB = new ByteArrayOutputStream();
            bitmapB.compress(Bitmap.CompressFormat.PNG, 100, boasB);
            flagB = boasB.toByteArray();


        }

        Intent intent = new Intent(Home.this, Scoring.class);

        intent.putExtra("teamOne", teamOne);
        intent.putExtra("teamTwo", teamTwo);
        intent.putExtra("flagA", flagA);
        intent.putExtra("flagB", flagB);
        startActivity(intent);
    }
}
