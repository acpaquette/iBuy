package net.grio.ibuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button signUp = findViewById(R.id.button2);
        signUp.setOnClickListener(new Button.OnClickListener()
                                  {
                                      public void onClick(View v)
                                      {
                                          Intent myAbout = new Intent(v.getContext(), ListActivity.class);
                                          startActivity(myAbout);
                                      }
                                  }
        );
        setContentView(R.layout.activity_sign_up);
    }
}
