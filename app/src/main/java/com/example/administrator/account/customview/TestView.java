package com.example.administrator.account.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

/**
 * Created by Ding on 2017/9/25.
 */

public class TestView extends RelativeLayout {

    private Paint mPaint;

    public TestView(Context context) {
        this(context,null);
    }

    public TestView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public TestView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);


        ((View) getParent()).getMeasuredWidth();
        mPaint = new Paint();
        mPaint.setColor(Color.RED);
        ((View) getParent()).setAlpha(1.0f);
    }
}
