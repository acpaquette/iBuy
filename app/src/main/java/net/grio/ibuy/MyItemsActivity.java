package net.grio.ibuy;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyItemsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_items);

        FloatingActionButton addItem = findViewById(R.id.floatingActionButton);
        addItem.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        Intent itemActivity = new Intent(v.getContext(), ItemActivity.class);
                        startActivity(itemActivity);
                    }
                }
        );
    }


}
