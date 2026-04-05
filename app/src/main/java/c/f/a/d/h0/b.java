package c.f.a.d.h0;

import android.R;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f14845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f14846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f14847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f14848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f14849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f14850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f14851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f14852h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f14853i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f14854j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f14855k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f14856l;

    static {
        f14845a = Build.VERSION.SDK_INT >= 21;
        f14846b = new int[]{R.attr.state_pressed};
        f14847c = new int[]{R.attr.state_hovered, R.attr.state_focused};
        f14848d = new int[]{R.attr.state_focused};
        f14849e = new int[]{R.attr.state_hovered};
        f14850f = new int[]{R.attr.state_selected, R.attr.state_pressed};
        f14851g = new int[]{R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};
        f14852h = new int[]{R.attr.state_selected, R.attr.state_focused};
        f14853i = new int[]{R.attr.state_selected, R.attr.state_hovered};
        f14854j = new int[]{R.attr.state_selected};
        f14855k = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        f14856l = b.class.getSimpleName();
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        if (f14845a) {
            return new ColorStateList(new int[][]{f14854j, StateSet.NOTHING}, new int[]{c(colorStateList, f14850f), c(colorStateList, f14846b)});
        }
        int[] iArr = f14850f;
        int[] iArr2 = f14851g;
        int[] iArr3 = f14852h;
        int[] iArr4 = f14853i;
        int[] iArr5 = f14846b;
        int[] iArr6 = f14847c;
        int[] iArr7 = f14848d;
        int[] iArr8 = f14849e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f14854j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{c(colorStateList, iArr), c(colorStateList, iArr2), c(colorStateList, iArr3), c(colorStateList, iArr4), 0, c(colorStateList, iArr5), c(colorStateList, iArr6), c(colorStateList, iArr7), c(colorStateList, iArr8), 0});
    }

    @TargetApi(21)
    public static int b(int i2) {
        return a.i.j.a.m(i2, Math.min(Color.alpha(i2) * 2, 255));
    }

    public static int c(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f14845a ? b(colorForState) : colorForState;
    }

    public static ColorStateList d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 22 && i2 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f14855k, 0)) != 0) {
            Log.w(f14856l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean e(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i2 : iArr) {
            if (i2 == 16842910) {
                z = true;
            } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
