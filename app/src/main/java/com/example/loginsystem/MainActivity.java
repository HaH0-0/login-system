package com.example.loginsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final String login = "hah";
    private final String password = "123456";
    Button btn;
    EditText ed1, ed2;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        ed1 = findViewById(R.id.ed_log);
        ed2 = findViewById(R.id.ed_pas);
        text = findViewById(R.id.info_text);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String s1 = ed1.getText().toString();
        String s2 = ed2.getText().toString();
        if (s1.equals(login) && s2.equals(password)){
            text.setTextColor(Color.GREEN);
            text.setTextSize(25);
            text.setGravity(Gravity.CENTER);
            text.setText("Sign in successful!");
        }
        else{
            text.setTextColor(Color.RED);
            text.setTextSize(25);
            text.setGravity(Gravity.CENTER);
            text.setText("Wrong login or password!");
            ed1.setText("");
            ed2.setText("");
        }
    }
}