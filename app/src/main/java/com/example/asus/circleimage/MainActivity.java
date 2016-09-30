package com.example.asus.circleimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button  FilletButton=(Button)findViewById(R.id.filletButton);
        //使用匿名类注册Button事件
        FilletButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this, "你点击了圆角按钮", Toast.LENGTH_LONG).show();
            }
        });
    }
}
