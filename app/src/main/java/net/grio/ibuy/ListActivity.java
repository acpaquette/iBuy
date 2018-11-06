package net.grio.ibuy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }

    public void perform_action(View view){
        //TextView myTextView = (TextView) findViewById(R.id.list0);
        Intent intent = new Intent(ListActivity.this, MyItemsActivity.class);
        startActivity(intent);
    }
}
