package com.example.zqy.bitmapcachedemo;


import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by zqy on 17/12/12.
 */

public class SquareImageView extends ImageView {
    public SquareImageView(Context context) {
//        super(context);
        this(context,null);
    }

    public SquareImageView(Context context, @Nullable AttributeSet attrs) {
//        super(context, attrs);
        this(context,attrs,0);
    }

    public SquareImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
    }
}
