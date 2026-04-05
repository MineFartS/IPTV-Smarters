package c.f.a.d.x;

import a.i.r.x;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f15265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f15266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f15267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ColorStateList f15268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c.f.a.d.j0.k f15270f;

    public b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i2, c.f.a.d.j0.k kVar, Rect rect) {
        a.i.q.i.c(rect.left);
        a.i.q.i.c(rect.top);
        a.i.q.i.c(rect.right);
        a.i.q.i.c(rect.bottom);
        this.f15265a = rect;
        this.f15266b = colorStateList2;
        this.f15267c = colorStateList;
        this.f15268d = colorStateList3;
        this.f15269e = i2;
        this.f15270f = kVar;
    }

    public static b a(Context context, int i2) {
        a.i.q.i.a(i2 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, c.f.a.d.l.Y2);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(c.f.a.d.l.Z2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(c.f.a.d.l.b3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(c.f.a.d.l.a3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(c.f.a.d.l.c3, 0));
        ColorStateList colorStateListA = c.f.a.d.g0.c.a(context, typedArrayObtainStyledAttributes, c.f.a.d.l.d3);
        ColorStateList colorStateListA2 = c.f.a.d.g0.c.a(context, typedArrayObtainStyledAttributes, c.f.a.d.l.i3);
        ColorStateList colorStateListA3 = c.f.a.d.g0.c.a(context, typedArrayObtainStyledAttributes, c.f.a.d.l.g3);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(c.f.a.d.l.h3, 0);
        c.f.a.d.j0.k kVarM = c.f.a.d.j0.k.b(context, typedArrayObtainStyledAttributes.getResourceId(c.f.a.d.l.e3, 0), typedArrayObtainStyledAttributes.getResourceId(c.f.a.d.l.f3, 0)).m();
        typedArrayObtainStyledAttributes.recycle();
        return new b(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, kVarM, rect);
    }

    public int b() {
        return this.f15265a.bottom;
    }

    public int c() {
        return this.f15265a.top;
    }

    public void d(TextView textView) {
        c.f.a.d.j0.g gVar = new c.f.a.d.j0.g();
        c.f.a.d.j0.g gVar2 = new c.f.a.d.j0.g();
        gVar.setShapeAppearanceModel(this.f15270f);
        gVar2.setShapeAppearanceModel(this.f15270f);
        gVar.X(this.f15267c);
        gVar.e0(this.f15269e, this.f15268d);
        textView.setTextColor(this.f15266b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f15266b.withAlpha(30), gVar, gVar2) : gVar;
        Rect rect = this.f15265a;
        x.s0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
