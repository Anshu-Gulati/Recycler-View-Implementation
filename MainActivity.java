package com.example.mythirdapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<ContactModel> arrcontacts = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView RecyclerList= findViewById(R.id.RecyclerList);
        RecyclerList.setLayoutManager( new LinearLayoutManager(this));

        arrcontacts.add( new ContactModel(R.drawable.download,"Anshu1","123456789"));
        arrcontacts.add( new ContactModel(R.drawable.download,"Anshu2","123456789"));
        arrcontacts.add( new ContactModel(R.drawable.download,"Anshu3","123456789"));
        arrcontacts.add( new ContactModel(R.drawable.download,"Anshu4","123456789"));
        arrcontacts.add( new ContactModel(R.drawable.download,"Anshu5","123456789"));
        arrcontacts.add( new ContactModel(R.drawable.download,"Anshu6","123456789"));
        arrcontacts.add( new ContactModel(R.drawable.download,"Anshu7","123456789"));
        arrcontacts.add( new ContactModel(R.drawable.download,"Anshu8","123456789"));
        arrcontacts.add( new ContactModel(R.drawable.download,"Anshu9","123456789"));
        arrcontacts.add( new ContactModel(R.drawable.download,"Anshu10","123456789"));
        arrcontacts.add( new ContactModel(R.drawable.download,"Anshu11","123456789"));
        arrcontacts.add( new ContactModel(R.drawable.download,"Anshu12","123456789"));
        arrcontacts.add( new ContactModel(R.drawable.download,"Anshu13","123456789"));
        arrcontacts.add( new ContactModel(R.drawable.download,"Anshu14","123456789"));

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this,arrcontacts);
        RecyclerList.setAdapter(adapter);
    }
}