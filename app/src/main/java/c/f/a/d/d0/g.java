package c.f.a.d.d0;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f14746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Constructor<StaticLayout> f14747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Object f14748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f14749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextPaint f14750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14751f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14753h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f14757l;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14752g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Layout.Alignment f14754i = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14755j = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f14756k = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextUtils.TruncateAt f14758m = null;

    public static class a extends Exception {
        public a(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    public g(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.f14749d = charSequence;
        this.f14750e = textPaint;
        this.f14751f = i2;
        this.f14753h = charSequence.length();
    }

    public static g c(CharSequence charSequence, TextPaint textPaint, int i2) {
        return new g(charSequence, textPaint, i2);
    }

    public StaticLayout a() throws a {
        if (this.f14749d == null) {
            this.f14749d = BuildConfig.FLAVOR;
        }
        int iMax = Math.max(0, this.f14751f);
        CharSequence charSequenceEllipsize = this.f14749d;
        if (this.f14755j == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f14750e, iMax, this.f14758m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f14753h);
        this.f14753h = iMin;
        if (Build.VERSION.SDK_INT < 23) {
            b();
            try {
                return (StaticLayout) ((Constructor) a.i.q.i.e(f14747b)).newInstance(charSequenceEllipsize, Integer.valueOf(this.f14752g), Integer.valueOf(this.f14753h), this.f14750e, Integer.valueOf(iMax), this.f14754i, a.i.q.i.e(f14748c), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f14756k), null, Integer.valueOf(iMax), Integer.valueOf(this.f14755j));
            } catch (Exception e2) {
                throw new a(e2);
            }
        }
        if (this.f14757l) {
            this.f14754i = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f14752g, iMin, this.f14750e, iMax);
        builderObtain.setAlignment(this.f14754i);
        builderObtain.setIncludePad(this.f14756k);
        builderObtain.setTextDirection(this.f14757l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f14758m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f14755j);
        return builderObtain.build();
    }

    public final void b() throws a {
        Class<?> cls;
        if (f14746a) {
            return;
        }
        try {
            boolean z = this.f14757l && Build.VERSION.SDK_INT >= 23;
            if (Build.VERSION.SDK_INT >= 18) {
                cls = TextDirectionHeuristic.class;
                f14748c = z ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            } else {
                ClassLoader classLoader = g.class.getClassLoader();
                String str = this.f14757l ? "RTL" : "LTR";
                Class<?> clsLoadClass = classLoader.loadClass("android.text.TextDirectionHeuristic");
                Class<?> clsLoadClass2 = classLoader.loadClass("android.text.TextDirectionHeuristics");
                f14748c = clsLoadClass2.getField(str).get(clsLoadClass2);
                cls = clsLoadClass;
            }
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls2, cls2, TextPaint.class, cls2, Layout.Alignment.class, cls, cls3, cls3, Boolean.TYPE, TextUtils.TruncateAt.class, cls2, cls2);
            f14747b = declaredConstructor;
            declaredConstructor.setAccessible(true);
            f14746a = true;
        } catch (Exception e2) {
            throw new a(e2);
        }
    }

    public g d(Layout.Alignment alignment) {
        this.f14754i = alignment;
        return this;
    }

    public g e(TextUtils.TruncateAt truncateAt) {
        this.f14758m = truncateAt;
        return this;
    }

    public g f(boolean z) {
        this.f14756k = z;
        return this;
    }

    public g g(boolean z) {
        this.f14757l = z;
        return this;
    }

    public g h(int i2) {
        this.f14755j = i2;
        return this;
    }
}
