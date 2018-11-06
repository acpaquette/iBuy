package net.grio.ibuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        final ImageView imgView = (ImageView)findViewById(R.id.imageView);

        Button findLowPrice = findViewById(R.id.lowPriceButton);
        findLowPrice.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        imgView.setVisibility(View.VISIBLE);
                    }
                }
        );

        Button confirm = findViewById(R.id.confirmItem);
        confirm.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        Intent myItemsActivity_2 = new Intent(v.getContext(), MyItemsActivity_2.class);
                        startActivity(myItemsActivity_2);
                    }
                }
        );

    }
}
