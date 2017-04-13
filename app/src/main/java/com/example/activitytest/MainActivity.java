package com.example.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but_main = (Button)findViewById(R.id.but_main);
        but_main.setOnClickListener(butMainHandler);
    }

    //버튼을 눌렀을 때 실행
    View.OnClickListener butMainHandler=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }
    };
}
