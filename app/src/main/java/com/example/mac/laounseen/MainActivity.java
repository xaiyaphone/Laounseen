package com.example.mac.laounseen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText1 = findViewById(R.id.number1);
        final EditText editText2 = findViewById(R.id.number2);
        final TextView textView = findViewById(R.id.result);
        Button button = findViewById(R.id.calculate);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int i = Integer.parseInt(editText1.getText().toString() );
                int j = Integer.parseInt(editText2.getText().toString() );

                textView.setText(i + j + "");
            }
        });
    }
}
