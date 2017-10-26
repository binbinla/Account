package com.example.administrator.account.customview

import android.content.Context
import android.content.res.TypedArray
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.ViewGroup
import android.widget.RelativeLayout
import com.example.administrator.account.R

/**
 * Created by Ding on 2017/9/25.
 * 首页底部的导航栏
 */
class BottomNavigationView(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : RelativeLayout(context, attrs, defStyleAttr) {

    var mPaint : Paint

    init {
        mPaint = Paint()
        val typedArray = context!!.obtainStyledAttributes(attrs, R.styleable.BottomNavigationView,defStyleAttr,0)
        var centerWidth = typedArray.getDimensionPixelOffset(R.styleable.BottomNavigationView_centerWidth, 0)
        var centerHeight = typedArray.getDimensionPixelOffset(R.styleable.BottomNavigationView_centerHeight, 0)
        var centerMarginBottom = typedArray.getDimensionPixelOffset(R.styleable.BottomNavigationView_centerMarginBottom, 0)
        var centerColor = typedArray.getColor(R.styleable.BottomNavigationView_centerBackground, Color.WHITE)
        var centerBackground = typedArray.getDrawable(R.styleable.BottomNavigationView_centerBackground)
        typedArray.recycle()
    }

    constructor(context: Context?):this(context,null,0){

    }

    constructor(context: Context?,attrs: AttributeSet?):this(context,attrs,0){

    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        var widthMode = MeasureSpec.getMode(widthMeasureSpec)
        var widthSize = MeasureSpec.getSize(widthMeasureSpec)
        if (widthMode==MeasureSpec.EXACTLY){
            

        }else{

        }
    }


}