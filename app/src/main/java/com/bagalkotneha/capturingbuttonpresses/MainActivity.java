package com.bagalkotneha.capturingbuttonpresses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button submitButton;
    TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitButton = findViewById(R.id.clickButton);
        displayText = findViewById(R.id.textBox);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("testMessage", "This is a test");
                int count = Integer.parseInt(displayText.getText().toString());
                count++;
                displayText.setText("" + count);
            }
        });
    }

    public void clickMethod(View view) {
        view.setBackgroundColor(getResources().getColor(R.color.newColor));
    }
}
