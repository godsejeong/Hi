package com.wark.hi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ArrayList arrayList = new ArrayList();
    int count = 0;//연산판별
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.button1);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);
        Button btn4 = (Button) findViewById(R.id.button4);
        Button btn5 = (Button) findViewById(R.id.button5);
        Button btn6 = (Button) findViewById(R.id.button6);
        Button btn7 = (Button) findViewById(R.id.button7);
        Button btn8 = (Button) findViewById(R.id.button8);
        Button btn9 = (Button) findViewById(R.id.button9);
        Button btn0 = (Button) findViewById(R.id.button0);
        Button btnsum = (Button) findViewById(R.id.buttonsum);//+
        Button btneq = (Button) findViewById(R.id.buttoneq);//=
        Button btnx = (Button) findViewById(R.id.buttonx);//X
        Button btndi = (Button) findViewById(R.id.buttondi);///
        Button btnma = (Button) findViewById(R.id.buttonma);//-
        Button btnj = (Button) findViewById(R.id.buttonj);//.
        Button btnclr = (Button) findViewById(R.id.buttonCLR);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnsum.setOnClickListener(this);
        btneq.setOnClickListener(this);
        btnx.setOnClickListener(this);
        btndi.setOnClickListener(this);
        btnma.setOnClickListener(this);
        btnj.setOnClickListener(this);
        btnclr.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        TextView text_1 = (TextView) findViewById(R.id.text);
        switch (v.getId()) {
            case R.id.button0:
            text_1.setText((text_1.getText().toString()+"0"));
                break;
            case R.id.button1:
                text_1.setText(text_1.getText().toString()+"1");
                break;

            case R.id.button2:
                text_1.setText(text_1.getText().toString()+"2");
            break;

            case R.id.button3:
                text_1.setText(text_1.getText().toString()+"3");
                break;

            case R.id.button4:
                text_1.setText(text_1.getText().toString()+"4");
                break;

            case R.id.button5:
                text_1.setText(text_1.getText().toString()+"5");
                break;

            case R.id.button6:
                text_1.setText(text_1.getText().toString()+"6");
                break;

            case R.id.button7:
                text_1.setText(text_1.getText().toString()+"7");
                break;

            case R.id.button8:

                text_1.setText(text_1.getText().toString()+"8");
                break;

            case R.id.button9:
                text_1.setText(text_1.getText().toString()+"9");
                break;


            case R.id.buttonCLR:
                arrayList.clear();
                text_1.setText("");
                break;

            case R.id.buttonsum://더하기
                arrayList.add(text_1.getText().toString());
                text_1.setText("");
                count = 1;
                break;

            case R.id.buttonma://빼기
                arrayList.add(text_1.getText().toString());
                text_1.setText("");
                count = 2;
                break;

            case R.id.buttonx://곱하기
                arrayList.add(text_1.getText().toString());
                text_1.setText("");
                count = 3;
                break;

            case R.id.buttondi://나누기
                arrayList.add(text_1.getText().toString());
                text_1.setText("");
                count = 4;
                break;










            case R.id.buttoneq:
                int sum1=0, sum2=0 ,sum3 ,count2=0;
                double fsum1 =0, fsum2=0, fsum3;
                if(arrayList.isEmpty()) {
                    text_1.setText("");
                } else {

                    Object obj = arrayList.get(0);
                    String num1 = (String) obj;
                    String num2 = text_1.getText().toString();

                    if (num1.contains(".") || num2.contains(".")) {

                        count2 = 1;
                        fsum1 = Float.parseFloat(num1);
                        fsum2 = Float.parseFloat(num2);
                    }else {
                        sum1 = Integer.parseInt(num1);
                        sum2 = Integer.parseInt(num2);
                    }
                    String val="";

                    switch (count) {
                        case 0:

                            text_1.setText("");

                            break;

                        case 1:

                            if(count2 == 1){
                                fsum3 = fsum1+fsum2;

                                val = String.valueOf(fsum3);
                            }else{
                                sum3 = sum1 + sum2;
                                val = String.valueOf(sum3);
                            }

                            text_1.setText(val);
                            arrayList.clear();
                            break;

                        case 2:

                            if(count2 == 1){
                                fsum3 = fsum1-fsum2;

                                val = String.valueOf(fsum3);
                            }else{
                                sum3 = sum1 - sum2;
                                val = String.valueOf(sum3);
                            }

                            text_1.setText(val);
                            arrayList.clear();
                            break;

                        case 3:

                            if(count2 == 1){
                                fsum3 = fsum1*fsum2;

                                val = String.valueOf(fsum3);
                            }else{
                                sum3 = sum1 * sum2;
                                val = String.valueOf(sum3);
                            }

                            text_1.setText(val);
                            arrayList.clear();
                            break;

                        case 4:

                            if(count2 == 1){
                                fsum3 = fsum1/fsum2;

                                val = String.valueOf(fsum3);
                            }else{
                                sum3 = sum1 / sum2;
                                val = String.valueOf(sum3);
                            }

                            text_1.setText(val);
                            arrayList.clear();
                            break;
                    }
                    }

            break;

        }

    }
}
