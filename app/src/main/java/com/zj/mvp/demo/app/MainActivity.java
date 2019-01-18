package com.zj.mvp.demo.app;

import android.os.Bundle;
import android.widget.TextView;

import com.lib.base.BaseActivity;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.lib.base.R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = findViewById(com.lib.base.R.id.sample_text);
        tv.setText("aaaa");
    }


}
