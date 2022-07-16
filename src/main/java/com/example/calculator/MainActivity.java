package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnAdd,btnSub,btnMul,btnDiv,btnEqual,btnDot;
    Button btnClear;
    EditText ed1;
    float res1,res2;
    boolean add,sub,mul,div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.button19);
        btn2=(Button)findViewById(R.id.button20);
        btn3=(Button)findViewById(R.id.button21);
        btn4=(Button)findViewById(R.id.button23);
        btn5=(Button)findViewById(R.id.button24);
        btn6=(Button)findViewById(R.id.button25);
        btn7=(Button)findViewById(R.id.button27);
        btn8=(Button)findViewById(R.id.button28);
        btn9=(Button)findViewById(R.id.button29);
        btn0=(Button)findViewById(R.id.button32);
        btnAdd=(Button)findViewById(R.id.button22);
        btnSub=(Button)findViewById(R.id.button26);
        btnMul=(Button)findViewById(R.id.button30);
        btnDiv=(Button)findViewById(R.id.button34);
        btnEqual=(Button)findViewById(R.id.button33);
        btnDot=(Button)findViewById(R.id.button31);
        btnClear=(Button)findViewById(R.id.button35);
        ed1=(EditText) findViewById(R.id.editText2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"0");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+".");
            }
        });
        btnAdd.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null){
                    ed1.setText("");
                }
                else{
                    res1=Float.parseFloat(ed1.getText()+"");
                    add=true;
                    ed1.setText(null);
                }
            }
        }));
        btnSub.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null){
                    ed1.setText("");
                }
                else{
                    res1=Float.parseFloat(ed1.getText()+"");
                    sub=true;
                    ed1.setText(null);
                }
            }
        }));
        btnMul.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null){
                    ed1.setText("");
                }
                else{
                    res1=Float.parseFloat(ed1.getText()+"");
                    mul=true;
                    ed1.setText(null);
                }
            }
        }));
        btnDiv.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null){
                    ed1.setText("");
                }
                else{
                    res1=Float.parseFloat(ed1.getText()+"");
                    div=true;
                    ed1.setText(null);
                }
            }
        }));
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res2=Float.parseFloat(ed1.getText()+"");
                if(add==true){
                    ed1.setText(res1+res2+"");
                    add=false;
                }
                if(sub==true){
                    ed1.setText(res1-res2+"");
                    sub=false;
                }
                if(mul==true){
                    ed1.setText(res1*res2+"");
                    mul=false;
                }
                if(div==true){
                    ed1.setText(res1/res2+"");
                    div=false;
                }
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
            }
        });


    }
}
