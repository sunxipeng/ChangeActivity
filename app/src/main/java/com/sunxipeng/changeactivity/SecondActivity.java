package com.sunxipeng.changeactivity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Window;

/**
 * Created by Administrator on 2016/1/7.
 */
public class SecondActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        super.onCreate(savedInstanceState);

        setContentView(R.layout.second);

        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);



        SildingFinishLayout sildingFinishLayout = (SildingFinishLayout) findViewById(R.id.view);

        sildingFinishLayout.setOnSildingFinishListener(new SildingFinishLayout.OnSildingFinishListener() {
            @Override
            public void onSildingFinish() {

                finish();
            }
        });

        sildingFinishLayout.setTouchView(sildingFinishLayout);


  }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0, R.anim.base_slide_right_out);
    }
}
