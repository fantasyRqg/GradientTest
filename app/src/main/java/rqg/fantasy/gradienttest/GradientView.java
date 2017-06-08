package rqg.fantasy.gradienttest;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/**
 * *Created by rqg on 6/7/17 11:21 AM.
 */

public class GradientView extends View {


    public GradientView(Context context) {
        super(context);
    }

    public GradientView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public GradientView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public GradientView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    private Paint p = new Paint(Paint.ANTI_ALIAS_FLAG);

    @Override
    protected void onDraw(Canvas canvas) {
        for (int i = 0; i < 5; i++) {
            p.setARGB(255, (255 / 4 * (4 - i)), (255 / 4 * (4 - i)), (255 / 4 * (4 - i)));
            canvas.drawRect(canvas.getWidth() / 5 * i, 0, canvas.getWidth() / 5 * (i + 1), canvas.getHeight(), p);
        }
        float gHeight = canvas.getHeight() / 256f;
        for (int i = 0; i < 256; i++) {
            p.setARGB(i, 255, 255, 255);

            canvas.drawRect(0, i * gHeight, canvas.getWidth(), (i + 1) * gHeight, p);
        }
    }
}
