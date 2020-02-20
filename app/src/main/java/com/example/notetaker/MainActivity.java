package com.example.notetaker;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.*;
import android.os.Bundle;
import android.view.*;

public class MainActivity extends AppCompatActivity {


    EditText notes;
    EditText note;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        note = findViewById(R.id.note);
        notes = findViewById(R.id.notes);
        Button enterNote = findViewById(R.id.enterNote);

        enterNote.setOnClickListener(new View.OnClickListener() {
            int number = 1;
            public void onClick(View v) {
                if (note.getText().length() > 0) {
                    notes.append(number + ".   " + note.getText().toString());
                    notes.append("\n");
                    number++;
                    note.setText("");
                }
            }
        });

        Switch sw = findViewById(R.id.editSwitch);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true) {
                    notes.setClickable(true);
                }
                if (isChecked == false) {
                    notes.setClickable(false);
                }
            }
        });

    }
}
