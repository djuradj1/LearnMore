package com.fit.djuka.learnmore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Prvi extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prvi);

        Bundle bundle = getIntent().getExtras();

        if(bundle!= null){
            textView.setText(bundle.getString("title"));
        }
    }
}
