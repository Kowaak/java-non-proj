package com.example.factorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BigInteger number = new BigInteger(editText.getText().toString());
                BigInteger factorial = factorial(number);
                String result = String.format("Silnia z %d jest równa %d",number,factorial);
                textView.setText(result);
            }
        });
    }
    private BigInteger factorial(BigInteger n){
        if (n.compareTo(BigInteger.ONE) == -1){
            return BigInteger.ONE;
        }
        else {
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }

    }
}