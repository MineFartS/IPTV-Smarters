package c.f.a.d.t;

import a.i.s.c;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import c.f.a.d.b;
import c.f.a.d.d0.j;
import c.f.a.d.k;
import c.f.a.d.l;

/* JADX INFO: loaded from: classes2.dex */
public class a extends AppCompatCheckBox {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f15239e = k.q;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[][] f15240f = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f15241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15242h;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.f14628e);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, AttributeSet attributeSet, int i2) {
        int i3 = f15239e;
        super(c.f.a.d.o0.a.a.c(context, attributeSet, i2, i3), attributeSet, i2);
        Context context2 = getContext();
        TypedArray typedArrayH = j.h(context2, attributeSet, l.k3, i2, i3, new int[0]);
        int i4 = l.l3;
        if (typedArrayH.hasValue(i4)) {
            c.c(this, c.f.a.d.g0.c.a(context2, typedArrayH, i4));
        }
        this.f15242h = typedArrayH.getBoolean(l.m3, false);
        typedArrayH.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f15241g == null) {
            int[][] iArr = f15240f;
            int[] iArr2 = new int[iArr.length];
            int iC = c.f.a.d.w.a.c(this, b.f14631h);
            int iC2 = c.f.a.d.w.a.c(this, b.f14636m);
            int iC3 = c.f.a.d.w.a.c(this, b.f14633j);
            iArr2[0] = c.f.a.d.w.a.f(iC2, iC, 1.0f);
            iArr2[1] = c.f.a.d.w.a.f(iC2, iC3, 0.54f);
            iArr2[2] = c.f.a.d.w.a.f(iC2, iC3, 0.38f);
            iArr2[3] = c.f.a.d.w.a.f(iC2, iC3, 0.38f);
            this.f15241g = new ColorStateList(iArr, iArr2);
        }
        return this.f15241g;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f15242h && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f15242h = z;
        c.c(this, z ? getMaterialThemeColorsTintList() : null);
    }
}
