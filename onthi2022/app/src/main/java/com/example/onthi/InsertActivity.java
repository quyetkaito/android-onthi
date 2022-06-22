package com.example.onthi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class InsertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);
    }
    public void insertRow(View view){
        EditText name = findViewById(R.id.editTextTextPersonName);
        EditText  email = findViewById(R.id.editTextTextEmailAddress);
        EditText  phone = findViewById(R.id.editTextPhone);
        //validate
        UsersDatabaseAdapter userDB = new UsersDatabaseAdapter(getApplicationContext());
        userDB.insertEntry(name.getText().toString(),phone.getText().toString(),email.getText().toString());
        //quay lai man hinh chinh
        Intent myIntent = new Intent(InsertActivity.this, MainActivity.class);
        InsertActivity.this.startActivity(myIntent);
    }
}

