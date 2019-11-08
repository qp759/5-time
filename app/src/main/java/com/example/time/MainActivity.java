package com.example.time;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText year;                //宣告全域變數
    EditText month;                //宣告全域變數
    EditText day;
    EditText hour;                //宣告全域變數
    EditText minute;                //宣告全域變數
    EditText second;
    TextView out;
    TextView output2;
    TextView output3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        year = (EditText) findViewById(R.id.edyear);
        month = (EditText) findViewById(R.id.edmonth);
        day = (EditText) findViewById(R.id.edday);
        hour = (EditText) findViewById(R.id.edhour);
        minute = (EditText) findViewById(R.id.edminute);
        second = (EditText) findViewById(R.id.edsecond);
        out = (TextView) findViewById(R.id.out);
     //   output2 = (TextView) findViewById(R.id.displayoutput2);
     //   output3 = (TextView) findViewById(R.id.displayoutput3);

        Button submit = (Button) findViewById(R.id.button);             // 取得按鈕物件
        submit.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View arg0) {

                float h3 = Float.parseFloat(year.getEditableText().toString());      // 取得 輸入值
                //tv.setText((h1) +" / "+(w1)+" / "+(a1));
                out.setText(year.getText() + "年 "+month.getText() + "月 "+day.getText() + "日 "
                        +hour.getText() + "點 "+minute.getText() + "分 "+second.getText() + "秒");
                // tv1.setText((h3) +" : "+(w3)+" : "+(a3));


            }




        });
    }

}