package com.example.androidcarogame;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    String start = "X";
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn_reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn1.setText(start);
                changeState();
                check();

            }
        });
        btn2 = findViewById(R.id.btn2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setText(start);
                changeState();
                check();

            }
        });
        btn3 = findViewById(R.id.btn3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn3.setText(start);
                changeState();
                check();

            }
        });
        btn4 = findViewById(R.id.btn4);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn4.setText(start);
                changeState();
                check();

            }
        });
        btn5 = findViewById(R.id.btn5);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn5.setText(start);
                changeState();
                check();

            }
        });
        btn6 = findViewById(R.id.btn6);

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn6.setText(start);
                changeState();
                check();
            }
        });
        btn7 = findViewById(R.id.btn7);

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn7.setText(start);
                changeState();
                check();

            }
        });
        btn8 = findViewById(R.id.btn8);

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn8.setText(start);
                changeState();
                check();

            }
        });
        btn9 = findViewById(R.id.btn9);

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn9.setText(start);
                changeState();
                check();

            }
        });

        btn_reset = findViewById(R.id.btn_reset);

        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();

            }
        });


    }

    public void changeState() {
        if (start.equals("X")) {
            start = "O";
        } else start = "X";
    }

    public void check() {
        String btn1Text = btn1.getText().toString();
        String btn2Text = btn1.getText().toString();
        String btn3Text = btn1.getText().toString();
        String btn4Text = btn1.getText().toString();
        String btn5Text = btn1.getText().toString();
        String btn6Text = btn1.getText().toString();
        String btn7Text = btn1.getText().toString();
        String btn8Text = btn1.getText().toString();
        String btn9Text = btn1.getText().toString();

//        if (btn1Text.equals(btn2Text) && btn2Text.equals(btn3Text) && (!btn1Text.equals("") || !btn2Text.equals("") || !btn3Text.equals(""))) {
//            showNotification(start + " Win");
//        }


            if(btn1Text.equals(btn2Text) && btn2Text.equals(btn3Text)){
                Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();

            }
    }

//    public void showNotification(String message) {
//        new AlertDialog.Builder(this)
//                .setTitle("Notification")
//                .setMessage(message)
//                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                    }
//                }).show();
//    }

    public void reset() {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        start = "X";
    }
}
