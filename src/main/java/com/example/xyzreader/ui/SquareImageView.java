package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class SquareImageView extends ImageView {

    public SquareImageView(Context context) {
        super(context);

    }

    public SquareImageView(Context context, AttributeSet attrs) {
        super(context,attrs);
    }

    public SquareImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
    @Override
    protected void onMeasure (int widthSpec, int heightSpec) {
        int threeTwoHeight = MeasureSpec.getSize(widthSpec)*2/2;
        int threeTwoHeightSpec = MeasureSpec.makeMeasureSpec(threeTwoHeight, MeasureSpec.EXACTLY);

        super.onMeasure(widthSpec, threeTwoHeightSpec);

    }
}
