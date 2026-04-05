package c.f.a.d.x;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f15271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f15272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f15273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f15274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f15275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f15276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f15277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f15278h;

    public c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(c.f.a.d.g0.b.c(context, c.f.a.d.b.u, h.class.getCanonicalName()), c.f.a.d.l.P2);
        this.f15271a = b.a(context, typedArrayObtainStyledAttributes.getResourceId(c.f.a.d.l.S2, 0));
        this.f15277g = b.a(context, typedArrayObtainStyledAttributes.getResourceId(c.f.a.d.l.Q2, 0));
        this.f15272b = b.a(context, typedArrayObtainStyledAttributes.getResourceId(c.f.a.d.l.R2, 0));
        this.f15273c = b.a(context, typedArrayObtainStyledAttributes.getResourceId(c.f.a.d.l.T2, 0));
        ColorStateList colorStateListA = c.f.a.d.g0.c.a(context, typedArrayObtainStyledAttributes, c.f.a.d.l.U2);
        this.f15274d = b.a(context, typedArrayObtainStyledAttributes.getResourceId(c.f.a.d.l.W2, 0));
        this.f15275e = b.a(context, typedArrayObtainStyledAttributes.getResourceId(c.f.a.d.l.V2, 0));
        this.f15276f = b.a(context, typedArrayObtainStyledAttributes.getResourceId(c.f.a.d.l.X2, 0));
        Paint paint = new Paint();
        this.f15278h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
