package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //레이아웃 -> Java 코드화(setContentView)
        // R class
        //  - R 클래스
        //      - 리소스 종류 클래스
        //          - 리소스 값
        // R.layout.file명
        setContentView(R.layout.activity_main);

        //버튼
        //findViewById() : id로 view(조상)를 찾음
        Button btn = findViewById(R.id.button);
        String str = (String) btn.getText();

        //Logcat 출력
        // System.out.println() 대신 => Logcat
        Log.i("버튼", str);

        // 버튼 내용 바꾸기
        btn.setText("My button!");

        str = (String) btn.getText();
        Log.i("버튼", str);

        //버튼을 누르면 내용 바꾸도록 만들기
        Button btn2 = findViewById(R.id.button2);

        //TextView
        TextView result = findViewById(R.id.textView2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn2.setText("Button : "+(++count));
                Log.d("버튼", ""+count);

                result.setText("Button : "+count);

                //Toast
                Toast.makeText(MainActivity.this, "Button : "+count, Toast.LENGTH_SHORT).show();

                //위 코드와 동일
                //Toast ts =  Toast.makeText(MainActivity.this, "Button : "+count, Toast.LENGTH_SHORT);
                //ts.show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn.setText("Button2 : "+(++count));
                Log.d("버튼", ""+count);

                result.setText("Button2 : "+count);

                Toast.makeText(MainActivity.this, "Button2 : "+count, Toast.LENGTH_SHORT).show();
            }
        });
        // CheckBox 이벤트 리스너
        CheckBox cb=findViewById(R.id.checkBox);
        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

            }
        });

        //Switch 이벤트
        Switch sw = findViewById(R.id.switch1);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

            }
        });

        //Rating bar 이벤트
        RatingBar rb = findViewById(R.id.ratingBar);
        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {

            }
        });
    }
}