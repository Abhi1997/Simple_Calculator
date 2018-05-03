package com.example.cse15u001.simple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Mul(View view) {
        EditText E1= (EditText)findViewById(R.id.et1);
        EditText E2 =(EditText)findViewById(R.id.et2);
        TextView t = (TextView)findViewById(R.id.tv);
        int a,b;
        a=Integer.parseInt(E1.getText().toString());
        b=Integer.parseInt(E2.getText().toString());
        int result = a*b;
        t.setText(Integer.toString(result));
    }
}
