package a.b.q;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* JADX INFO: loaded from: classes.dex */
public class q extends RatingBar {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f743b;

    public q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.b.a.L);
    }

    public q(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        p0.a(this, getContext());
        p pVar = new p(this);
        this.f743b = pVar;
        pVar.c(attributeSet, i2);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        Bitmap bitmapB = this.f743b.b();
        if (bitmapB != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapB.getWidth() * getNumStars(), i2, 0), getMeasuredHeight());
        }
    }
}
