package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4;
    ImageView iV1, iV2, iV3;
    EditText eT1, eT2, eT3;
    TextView tV1, tV2, tV3, tV4,tV5,tV6;
    Random rnd = new Random();
    boolean go_eT1 = false, go_eT2 = false, go_eT3 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);

        iV1 = (ImageView) findViewById(R.id.iV1);
        iV2 = (ImageView) findViewById(R.id.iV2);
        iV3 = (ImageView) findViewById(R.id.iV3);

        eT1 = (EditText) findViewById(R.id.eT1);
        eT2 = (EditText) findViewById(R.id.eT2);
        eT3 = (EditText) findViewById(R.id.eT3);

        tV1 = ((TextView) findViewById(R.id.tV1));
        tV2 = ((TextView) findViewById(R.id.tV2));
        tV3 = ((TextView) findViewById(R.id.tV3));
        tV4 = ((TextView) findViewById(R.id.tV4));
        tV5 = ((TextView) findViewById(R.id.tV5));
        tV6 = ((TextView) findViewById(R.id.tV6));

        int r1 = rnd.nextInt(89) + 10;
        int r2 = rnd.nextInt(89) + 10;
        int r3 = rnd.nextInt(89) + 10;
        int r4 = rnd.nextInt(89) + 10;

        tV1.setText("" + r1);
        tV2.setText("" + r2);
    }

    public void ace1(View view) {go_eT1 = true;}
    public void ace2(View view) {go_eT2 = true;}
    public void ace3(View view) {go_eT3 = true;}

    public void clicked_btn1(View view) {
        if (go_eT1 == true) {
            String st1 = eT1.getText().toString();
            int uAnswer1 = Integer.parseInt(st1);

        }
    }

    public void clicked_eT2(View view) {
        if (go_eT2 == true) {
            String st2 = eT1.getText().toString();
            int uAnswer2 = Integer.parseInt(st2);
        }
    }

    public void clicked_eT3(View view) {
        if (go_eT3 == true) {
            String st3 = eT1.getText().toString();
            int uAnswer3 = Integer.parseInt(st3);
        }
    }
}

