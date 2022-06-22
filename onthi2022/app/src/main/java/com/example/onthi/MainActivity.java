package com.example.onthi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    UsersDatabaseAdapter usersDatabaseAdapter;
    ArrayList<UserModel> listUsers;
    ListView listView;
    ListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // create the instance of Databse
        usersDatabaseAdapter=new UsersDatabaseAdapter(getApplicationContext());
        listUsers = new ArrayList<>();
        listUsers.add(new UserModel(1,"name 1","phone 1","email 1"));
        listUsers.add(new UserModel(2,"name 2","phone 1","email 1"));
        listUsers.add(new UserModel(3,"name 33","phone 1","email 1"));
        listAdapter = new ListAdapter(listUsers);
        listView = findViewById(R.id.listUsers);

    }

    //open activity to Insert new rows in table
    public void insertRowActivity(View view) {
        Intent myIntent = new Intent(MainActivity.this, InsertActivity.class);
        MainActivity.this.startActivity(myIntent);
    }
//
//    //Open activity to update rows
//    public void updateRowView(View view) {
//        Intent myIntent = new Intent(MainActivity.this, UpdateRowsActivity.class);
//        MainActivity.this.startActivity(myIntent);
//    }

    //call method to show rows count in Toast
    public void rowCount(View view) {
        usersDatabaseAdapter.getRowCount();
    }

    //Open activity to delete rows
//    public void deleteRowActivity(View view) {
//       Intent myIntent = new Intent(MainActivity.this, DeleteRowsActivity.class);
//        MainActivity.this.startActivity(myIntent);
//    }

    //Button method to truncate table rows
    public void truncateTable(View view) {
        usersDatabaseAdapter.truncateTable();
    }

    //Open URL in browser
    public void goToUrl (View view) {
        String url = "https://timoday.edu.vn";
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
    public void gotoList(View view){
        Intent intent = new Intent(MainActivity.this, ListActivity.class);
        MainActivity.this.startActivity(intent);
    }
}
