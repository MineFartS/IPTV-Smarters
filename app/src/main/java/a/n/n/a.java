package a.n.n;

import a.n.b;
import a.n.e;
import a.n.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f2720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f2722e;

    public a(int i2, float f2, float f3) {
        f2 = f2 > 1.0f ? 1.0f : f2;
        f2 = f2 < 0.0f ? 0.0f : f2;
        f3 = f3 > 1.0f ? 1.0f : f3;
        float f4 = f3 >= 0.0f ? f3 : 0.0f;
        Paint paint = new Paint();
        this.f2720c = paint;
        paint.setColor(Color.rgb(Color.red(i2), Color.green(i2), Color.blue(i2)));
        this.f2718a = f2;
        this.f2719b = f4;
        c(1.0f);
    }

    public static a a(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(l.f2664k);
        int color = typedArrayObtainStyledAttributes.getColor(l.f2668o, context.getResources().getColor(b.f2579n));
        float fraction = typedArrayObtainStyledAttributes.getFraction(l.f2666m, 1, 1, context.getResources().getFraction(e.f2608h, 1, 0));
        float fraction2 = typedArrayObtainStyledAttributes.getFraction(l.f2667n, 1, 1, context.getResources().getFraction(e.f2609i, 1, 1));
        typedArrayObtainStyledAttributes.recycle();
        return new a(color, fraction, fraction2);
    }

    public Paint b() {
        return this.f2720c;
    }

    public void c(float f2) {
        float f3 = this.f2719b;
        float f4 = f3 + (f2 * (this.f2718a - f3));
        this.f2722e = f4;
        int i2 = (int) (f4 * 255.0f);
        this.f2721d = i2;
        this.f2720c.setAlpha(i2);
    }
}
