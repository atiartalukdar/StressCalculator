/*
package com.example.dotnet.stresscalculator;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

*/
/**
 * Created by DotNet on 11/13/2016.
 *//*


public class PieGraph extends View {
    private Paint piePaint; // to draw pie graph<br
    private RectF rectF;    // view within which pie graph will be drawn<br
    private float[] data;      // data set to be used to draw slices of pie graph<br

    public PieGraph(Context context, AttributeSet attrs) {
        super(context, attrs);
        piePaint = new Paint();
        piePaint.setAntiAlias(true);
        piePaint.setDither(true);
        piePaint.setStyle(Paint.Style.FILL);
    }
    public void setData(float[] data){
            this.data = data;
            invalidate();
    }
    private float[] pieSegment(){
        float[] segValues = new float[this.data.length];
        float Total = getTotal();
        for (int i = 0; i <= this.data.length; i++){
                segValues[i] = (this.data[i]/Total) * 360;
        }
        return segValues;
    }
    private float getTotal()
        float total = 0;
        for (float val : this.data){
                total +=val;
        }
        return total;
    }
}*/
