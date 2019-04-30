package com.dn.ricky.performance.lsn1_performanceoptimization;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CommUtil commUtil = CommUtil.getInstance(this);

    }
}
