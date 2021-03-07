package com.example.chpter5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);

        String[] attractions= {"Art Institute","Willis Tower","Water Tower","New item added"};
        setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_main, R.id.travel,attractions));
    }
    protected void onListItemClick(ListView l, View v, int position, long id){
        switch (position){
            case 0: // first item on the list
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://alfaisal.edu"))); // go ahead and start a new activity which is this website in the default browser of the phone
                break;
            case 1:
                //do smth else
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://google.com")));
                break;
            case 2:
                startActivity(new Intent(
                        MainActivity.this,PickActivity.class));

                break;

            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://facebook.com")));

        }

    }
}