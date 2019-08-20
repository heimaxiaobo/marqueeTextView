package com.example.marqueeview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.marqueeview.widget.MarqueeTextView;
import com.example.marqueeview.widget.MarqueeView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.tv_marquee)
    MarqueeView tv_marquee;
    @Bind(R.id.mMarqueeTextView)
    MarqueeTextView mMarqueeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        marqueeText("一般我们");
    }

    /**
     * 文字跑马灯
     * @param marqueeStr
     */
    private void marqueeText(String marqueeStr) {
        //如果是横屏
            tv_marquee.setVisibility(View.VISIBLE);
            tv_marquee.setFocusable(true);
            tv_marquee.requestFocus();
            //设置文本
            tv_marquee.setText(marqueeStr);
            //开始
            tv_marquee.startScroll();


            //设置控件显示
            mMarqueeTextView.setVisibility(View.VISIBLE);
            mMarqueeTextView.setFocusable(true);
            mMarqueeTextView.requestFocus();
            //设置滚动文字
            mMarqueeTextView.setText(marqueeStr);
            //开始滚动
            mMarqueeTextView.startScroll();
    }

}
