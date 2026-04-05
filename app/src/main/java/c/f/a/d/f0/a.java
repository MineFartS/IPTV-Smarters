package c.f.a.d.f0;

import a.i.s.c;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import c.f.a.d.b;
import c.f.a.d.d0.j;
import c.f.a.d.k;
import c.f.a.d.l;

/* JADX INFO: loaded from: classes2.dex */
public class a extends AppCompatRadioButton {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f14797e = k.r;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[][] f14798f = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f14799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14800h;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.y);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, AttributeSet attributeSet, int i2) {
        int i3 = f14797e;
        super(c.f.a.d.o0.a.a.c(context, attributeSet, i2, i3), attributeSet, i2);
        Context context2 = getContext();
        TypedArray typedArrayH = j.h(context2, attributeSet, l.n3, i2, i3, new int[0]);
        int i4 = l.o3;
        if (typedArrayH.hasValue(i4)) {
            c.c(this, c.f.a.d.g0.c.a(context2, typedArrayH, i4));
        }
        this.f14800h = typedArrayH.getBoolean(l.p3, false);
        typedArrayH.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f14799g == null) {
            int iC = c.f.a.d.w.a.c(this, b.f14631h);
            int iC2 = c.f.a.d.w.a.c(this, b.f14633j);
            int iC3 = c.f.a.d.w.a.c(this, b.f14636m);
            int[][] iArr = f14798f;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = c.f.a.d.w.a.f(iC3, iC, 1.0f);
            iArr2[1] = c.f.a.d.w.a.f(iC3, iC2, 0.54f);
            iArr2[2] = c.f.a.d.w.a.f(iC3, iC2, 0.38f);
            iArr2[3] = c.f.a.d.w.a.f(iC3, iC2, 0.38f);
            this.f14799g = new ColorStateList(iArr, iArr2);
        }
        return this.f14799g;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f14800h && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f14800h = z;
        c.c(this, z ? getMaterialThemeColorsTintList() : null);
    }
}
