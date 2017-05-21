package com.example.android.musicplayer;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/**
 * Created by Giannis on 15/5/2017.
 */

public class SquareFrameLayout extends FrameLayout {


    /* Default constructors */
    public SquareFrameLayout(Context context){
        super(context);
    }

    public SquareFrameLayout(Context context, AttributeSet attrs){
        super(context, attrs);
    }

    public SquareFrameLayout(Context context, AttributeSet attrs, int defStyleAttr){
        super(context, attrs, defStyleAttr);
    }

    public SquareFrameLayout(Context context,AttributeSet attrs, int defStyleAttr, int defStyleRes){
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if(heightMeasureSpec < widthMeasureSpec) {
            super.onMeasure(heightMeasureSpec, heightMeasureSpec);
        } else if(widthMeasureSpec < heightMeasureSpec) {
            super.onMeasure(widthMeasureSpec, widthMeasureSpec);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}
