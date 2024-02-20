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
    int random1,random2,random3,random4;
    int counter = 0;

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

        random1 = rnd.nextInt(90) + 10;
        random2 = rnd.nextInt(90) + 10;
        random3 = rnd.nextInt(90) + 10;
        random4 = rnd.nextInt(90) + 10;

        tV1.setText("" + random1);
        tV2.setText("" + random2);


        tV3.setVisibility(View.INVISIBLE);
        tV4.setVisibility(View.INVISIBLE);
        tV5.setVisibility(View.INVISIBLE);
        tV6.setVisibility(View.INVISIBLE);
        eT2.setVisibility(View.INVISIBLE);
        eT3.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

    }

    public void clicked_btn1(View view) {
        String st1 = eT1.getText().toString();
        if (!st1.isEmpty()) {
            int uAnswer1 = Integer.parseInt(st1);
            if (random1 + random2 == uAnswer1) {
                iV1.setImageResource(R.drawable.correct);
                counter++;
            }
            else
                iV1.setImageResource(R.drawable.incorrect);

            tV3.setText("" + (random1+random2));
            tV4.setText("" + random3);

            tV3.setVisibility(View.VISIBLE);
            tV4.setVisibility(View.VISIBLE);
            eT2.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);

        }
    }

    public void clicked_eT2(View view) {
        String st2 = eT2.getText().toString();
        if (!st2.isEmpty()) {
            int uAnswer2 = Integer.parseInt(st2);
            if (random1 + random2 + random3 == uAnswer2) {
                iV2.setImageResource(R.drawable.correct);
                counter++;
            }
            else
                iV2.setImageResource(R.drawable.incorrect);

            tV5.setText("" + (random1+random2+random3));
            tV6.setText("" + random4);

            tV5.setVisibility(View.VISIBLE);
            tV6.setVisibility(View.VISIBLE);
            eT3.setVisibility(View.VISIBLE);
            btn3.setVisibility(View.VISIBLE);
        }
    }

    public void clicked_eT3(View view) {
        String st3 = eT3.getText().toString();
        if (!st3.isEmpty()) {
            int uAnswer3 = Integer.parseInt(st3);
            if (random1 + random2 + random3+ random4 == uAnswer3) {
                iV3.setImageResource(R.drawable.correct);
                counter++;
            }
            else
                iV3.setImageResource(R.drawable.incorrect);

            if (counter == 3)
                btn4.setText("(3/3, 100%)");
            else if (counter == 2)
                btn4.setText("(2/3 66%)");
            else if (counter == 1)
                btn4.setText("(1/3 33%)");
            else
                btn4.setText("(0/3 0%)");
            btn4.setVisibility(View.VISIBLE);
        }
    }
    public void Restart(View view) {

        tV3.setVisibility(View.INVISIBLE);
        tV4.setVisibility(View.INVISIBLE);
        tV5.setVisibility(View.INVISIBLE);
        tV6.setVisibility(View.INVISIBLE);
        eT2.setVisibility(View.INVISIBLE);
        eT3.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);
        iV1.setImageBitmap(null);
        iV2.setImageBitmap(null);
        iV3.setImageBitmap(null);

        random1 = rnd.nextInt(90) + 10;
        random2 = rnd.nextInt(90) + 10;
        random3 = rnd.nextInt(90) + 10;
        random4 = rnd.nextInt(90) + 10;
        tV1.setText("" + random1);
        tV2.setText("" + random2);
        tV4.setText("" + random3);
        tV6.setText("" + random4);
        eT1.setText("");
        eT2.setText("");
        eT3.setText("");
        counter = 0;
    }
}

