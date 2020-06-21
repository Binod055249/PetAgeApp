package com.binodroxx.petage;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    public void buttonISClicked(View buttonView){

        EditText petBornTextField=findViewById(R.id.edtPetBorn);
        TextView petageTextView = findViewById(R.id.textView);
        int petAge= Calendar.getInstance().get(Calendar.YEAR)-Integer.parseInt(petBornTextField.getText().toString());
        petageTextView.setText(petAge+"");


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
