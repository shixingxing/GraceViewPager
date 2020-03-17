package com.lancewu.graceviewpager.example;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import com.lancewu.graceviewpager.util.GraceLog;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.analyse_btn).setOnClickListener(this);
        findViewById(R.id.data_set_changed_btn).setOnClickListener(this);
        findViewById(R.id.transformer_btn).setOnClickListener(this);
        findViewById(R.id.grace_vp_btn).setOnClickListener(this);
        findViewById(R.id.grace_vp_support_btn).setOnClickListener(this);
        // 打开log
        GraceLog.setEnable(true);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.analyse_btn:
                AnalyseActivity.start(this);
                break;
            case R.id.data_set_changed_btn:
                DataSetChangedActivity.start(this);
                break;
            case R.id.transformer_btn:
                TransformerActivity.start(this);
                break;
            case R.id.grace_vp_btn:
                GraceViewPagerActivity.start(this);
                break;
            case R.id.grace_vp_support_btn:
                GraceViewPagerSupportActivity.start(this);
                break;
        }
    }
}
