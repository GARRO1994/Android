package com.example.tester;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListner();
    }

    public void addListner(){
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent("com.example.tester.Activity2");
                        startActivity(intent);
                    }
                }
        );
    }

    public void onButtonClicPluse(View v){
        EditText el1=(EditText)findViewById(R.id.Num1);
        EditText el2=(EditText)findViewById(R.id.Num2);
        TextView resText=(TextView)findViewById(R.id.Result);
        double num1=Integer.parseInt(el1.getText().toString());
        double num2=Integer.parseInt(el2.getText().toString());
        double resSum=num1+num2;
        resText.setText(Double.toString(resSum));

    }
    public void onButtonClicMinus(View v){
        EditText el1=(EditText)findViewById(R.id.Num1);
        EditText el2=(EditText)findViewById(R.id.Num2);
        TextView resText=(TextView)findViewById(R.id.Result);
        double num1=Integer.parseInt(el1.getText().toString());
        double num2=Integer.parseInt(el2.getText().toString());
        double resMinus=num1-num2;
        resText.setText(Double.toString(resMinus));
    }
    public void onButtonClicMult(View v){
        EditText el1=(EditText)findViewById(R.id.Num1);
        EditText el2=(EditText)findViewById(R.id.Num2);
        TextView resText=(TextView)findViewById(R.id.Result);
        double num1=Integer.parseInt(el1.getText().toString());
        double num2=Integer.parseInt(el2.getText().toString());
        double mult=num1*num2;
        resText.setText(Double.toString(mult));
    }
    public void onButtonClicDivided(View v){
        EditText el1=(EditText)findViewById(R.id.Num1);
        EditText el2=(EditText)findViewById(R.id.Num2);
        TextView resText=(TextView)findViewById(R.id.Result);
        double num1=Integer.parseInt(el1.getText().toString());
        double num2=Integer.parseInt(el2.getText().toString());
        double divided=num1/num2;
        resText.setText(Double.toString(divided));
    }

}
