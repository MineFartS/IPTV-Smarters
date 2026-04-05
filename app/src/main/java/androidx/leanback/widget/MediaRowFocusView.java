package androidx.leanback.widget;

import a.n.b;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class MediaRowFocusView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f4486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f4487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4488d;

    public MediaRowFocusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4487c = new RectF();
        this.f4486b = a(context);
    }

    public final Paint a(Context context) {
        Paint paint = new Paint();
        paint.setColor(context.getResources().getColor(b.f2570e));
        return paint;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        this.f4488d = height;
        int height2 = ((height * 2) - getHeight()) / 2;
        this.f4487c.set(0.0f, -height2, getWidth(), getHeight() + height2);
        RectF rectF = this.f4487c;
        int i2 = this.f4488d;
        canvas.drawRoundRect(rectF, i2, i2, this.f4486b);
    }
}
