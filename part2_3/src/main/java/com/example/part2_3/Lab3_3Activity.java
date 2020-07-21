package com.example.part2_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Lab3_3Activity extends AppCompatActivity implements View.OnClickListener{

    Button trueBtn;
    TextView targetTextView;
    Button falseBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_3);

        //view 객체획득
        trueBtn = findViewById(R.id.btn_visible_true);
        targetTextView = findViewById(R.id.text_visible_target);
        falseBtn = findViewById(R.id.btn_visible_false);

        //Button 이벤트 등록
        trueBtn.setOnClickListener(this);
        falseBtn.setOnClickListener(this);
    }
    // 버튼 이벤트 콜백
    @Override
    public void onClick(View v){
        if(v == trueBtn){
            //trueBtn이 눌리면 targetTextView를 visible로 변경
            targetTextView.setVisibility(View.VISIBLE);
        } else if (v == falseBtn){
            targetTextView.setVisibility(View.INVISIBLE);
        }
    }
}