package com.example.recycler34;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class Students extends AppCompatActivity {

EditText editText;
EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);
        editText = findViewById(R.id.line01);
        editText2 = findViewById(R.id.line02);
    }


    public void send (View view) {
        String a1 = editText.getText().toString();
        String a2 = editText2.getText().toString();

        Intent intent= new Intent();
        intent.putExtra("name",a1);
        intent.putExtra("group",a2);
        setResult(RESULT_OK, intent);
        finish();

    }
}
