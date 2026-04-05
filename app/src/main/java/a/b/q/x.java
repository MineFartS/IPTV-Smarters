package a.b.q;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import com.amazonaws.services.s3.internal.Constants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RectF f831a = new RectF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentHashMap<String, Method> f832b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentHashMap<String, Field> f833c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f834d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f835e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f836f = -1.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f837g = -1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f838h = -1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f839i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f840j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextPaint f841k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f842l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Context f843m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f844n;

    public static class a extends c {
        @Override // a.b.q.x.c
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) x.r(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    public static class b extends a {
        @Override // a.b.q.x.a, a.b.q.x.c
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // a.b.q.x.c
        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    public static class c {
        public void a(StaticLayout.Builder builder, TextView textView) {
        }

        public boolean b(TextView textView) {
            return ((Boolean) x.r(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public x(TextView textView) {
        this.f842l = textView;
        this.f843m = textView.getContext();
        int i2 = Build.VERSION.SDK_INT;
        this.f844n = i2 >= 29 ? new b() : i2 >= 23 ? new a() : new c();
    }

    public static <T> T a(Object obj, String str, T t) {
        try {
            Field fieldO = o(str);
            return fieldO == null ? t : (T) fieldO.get(obj);
        } catch (IllegalAccessException e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e2);
            return t;
        }
    }

    public static Field o(String str) {
        try {
            Field declaredField = f833c.get(str);
            if (declaredField == null && (declaredField = TextView.class.getDeclaredField(str)) != null) {
                declaredField.setAccessible(true);
                f833c.put(str, declaredField);
            }
            return declaredField;
        } catch (NoSuchFieldException e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e2);
            return null;
        }
    }

    public static Method p(String str) {
        try {
            Method declaredMethod = f832b.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                f832b.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    public static <T> T r(Object obj, String str, T t) {
        try {
            return (T) p(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return t;
        }
    }

    public final void A(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = typedArray.getDimensionPixelSize(i2, -1);
            }
            this.f839i = c(iArr);
            B();
        }
    }

    public final boolean B() {
        boolean z = this.f839i.length > 0;
        this.f840j = z;
        if (z) {
            this.f834d = 1;
            this.f837g = r0[0];
            this.f838h = r0[r1 - 1];
            this.f836f = -1.0f;
        }
        return z;
    }

    public final boolean C(int i2, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f842l.getText();
        TransformationMethod transformationMethod = this.f842l.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f842l)) != null) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f842l.getMaxLines() : -1;
        q(i2);
        StaticLayout staticLayoutE = e(text, (Layout.Alignment) r(this.f842l, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutE.getLineCount() <= maxLines && staticLayoutE.getLineEnd(staticLayoutE.getLineCount() - 1) == text.length())) && ((float) staticLayoutE.getHeight()) <= rectF.bottom;
    }

    public final boolean D() {
        return !(this.f842l instanceof j);
    }

    public final void E(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        }
        if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        }
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
        this.f834d = 1;
        this.f837g = f2;
        this.f838h = f3;
        this.f836f = f4;
        this.f840j = false;
    }

    public void b() {
        if (s()) {
            if (this.f835e) {
                if (this.f842l.getMeasuredHeight() <= 0 || this.f842l.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f844n.b(this.f842l) ? Constants.MB : (this.f842l.getMeasuredWidth() - this.f842l.getTotalPaddingLeft()) - this.f842l.getTotalPaddingRight();
                int height = (this.f842l.getHeight() - this.f842l.getCompoundPaddingBottom()) - this.f842l.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f831a;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float fI = i(rectF);
                    if (fI != this.f842l.getTextSize()) {
                        y(0, fI);
                    }
                }
            }
            this.f835e = true;
        }
    }

    public final int[] c(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    public final void d() {
        this.f834d = 0;
        this.f837g = -1.0f;
        this.f838h = -1.0f;
        this.f836f = -1.0f;
        this.f839i = new int[0];
        this.f835e = false;
    }

    public StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3) {
        int i4 = Build.VERSION.SDK_INT;
        return i4 >= 23 ? f(charSequence, alignment, i2, i3) : i4 >= 16 ? h(charSequence, alignment, i2) : g(charSequence, alignment, i2);
    }

    public final StaticLayout f(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f841k, i2);
        StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(this.f842l.getLineSpacingExtra(), this.f842l.getLineSpacingMultiplier()).setIncludePad(this.f842l.getIncludeFontPadding()).setBreakStrategy(this.f842l.getBreakStrategy()).setHyphenationFrequency(this.f842l.getHyphenationFrequency());
        if (i3 == -1) {
            i3 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i3);
        try {
            this.f844n.a(builderObtain, this.f842l);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return builderObtain.build();
    }

    public final StaticLayout g(CharSequence charSequence, Layout.Alignment alignment, int i2) {
        return new StaticLayout(charSequence, this.f841k, i2, alignment, ((Float) a(this.f842l, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) a(this.f842l, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) a(this.f842l, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    public final StaticLayout h(CharSequence charSequence, Layout.Alignment alignment, int i2) {
        return new StaticLayout(charSequence, this.f841k, i2, alignment, this.f842l.getLineSpacingMultiplier(), this.f842l.getLineSpacingExtra(), this.f842l.getIncludeFontPadding());
    }

    public final int i(RectF rectF) {
        int length = this.f839i.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i2 = length - 1;
        int i3 = 1;
        int i4 = 0;
        while (i3 <= i2) {
            int i5 = (i3 + i2) / 2;
            if (C(this.f839i[i5], rectF)) {
                int i6 = i5 + 1;
                i4 = i3;
                i3 = i6;
            } else {
                i4 = i5 - 1;
                i2 = i4;
            }
        }
        return this.f839i[i4];
    }

    public int j() {
        return Math.round(this.f838h);
    }

    public int k() {
        return Math.round(this.f837g);
    }

    public int l() {
        return Math.round(this.f836f);
    }

    public int[] m() {
        return this.f839i;
    }

    public int n() {
        return this.f834d;
    }

    public void q(int i2) {
        TextPaint textPaint = this.f841k;
        if (textPaint == null) {
            this.f841k = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f841k.set(this.f842l.getPaint());
        this.f841k.setTextSize(i2);
    }

    public boolean s() {
        return D() && this.f834d != 0;
    }

    public void t(AttributeSet attributeSet, int i2) {
        int resourceId;
        Context context = this.f843m;
        int[] iArr = a.b.j.i0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        TextView textView = this.f842l;
        a.i.r.x.n0(textView, textView.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
        int i3 = a.b.j.n0;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            this.f834d = typedArrayObtainStyledAttributes.getInt(i3, 0);
        }
        int i4 = a.b.j.m0;
        float dimension = typedArrayObtainStyledAttributes.hasValue(i4) ? typedArrayObtainStyledAttributes.getDimension(i4, -1.0f) : -1.0f;
        int i5 = a.b.j.k0;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(i5) ? typedArrayObtainStyledAttributes.getDimension(i5, -1.0f) : -1.0f;
        int i6 = a.b.j.j0;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(i6) ? typedArrayObtainStyledAttributes.getDimension(i6, -1.0f) : -1.0f;
        int i7 = a.b.j.l0;
        if (typedArrayObtainStyledAttributes.hasValue(i7) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i7, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            A(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!D()) {
            this.f834d = 0;
            return;
        }
        if (this.f834d == 1) {
            if (!this.f840j) {
                DisplayMetrics displayMetrics = this.f843m.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                E(dimension2, dimension3, dimension);
            }
            z();
        }
    }

    public void u(int i2, int i3, int i4, int i5) {
        if (D()) {
            DisplayMetrics displayMetrics = this.f843m.getResources().getDisplayMetrics();
            E(TypedValue.applyDimension(i5, i2, displayMetrics), TypedValue.applyDimension(i5, i3, displayMetrics), TypedValue.applyDimension(i5, i4, displayMetrics));
            if (z()) {
                b();
            }
        }
    }

    public void v(int[] iArr, int i2) {
        if (D()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i2 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f843m.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArrCopyOf[i3] = Math.round(TypedValue.applyDimension(i2, iArr[i3], displayMetrics));
                    }
                }
                this.f839i = c(iArrCopyOf);
                if (!B()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f840j = false;
            }
            if (z()) {
                b();
            }
        }
    }

    public void w(int i2) {
        if (D()) {
            if (i2 == 0) {
                d();
                return;
            }
            if (i2 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i2);
            }
            DisplayMetrics displayMetrics = this.f843m.getResources().getDisplayMetrics();
            E(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (z()) {
                b();
            }
        }
    }

    public final void x(float f2) {
        if (f2 != this.f842l.getPaint().getTextSize()) {
            this.f842l.getPaint().setTextSize(f2);
            boolean zIsInLayout = Build.VERSION.SDK_INT >= 18 ? this.f842l.isInLayout() : false;
            if (this.f842l.getLayout() != null) {
                this.f835e = false;
                try {
                    Method methodP = p("nullLayouts");
                    if (methodP != null) {
                        methodP.invoke(this.f842l, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (zIsInLayout) {
                    this.f842l.forceLayout();
                } else {
                    this.f842l.requestLayout();
                }
                this.f842l.invalidate();
            }
        }
    }

    public void y(int i2, float f2) {
        Context context = this.f843m;
        x(TypedValue.applyDimension(i2, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public final boolean z() {
        if (D() && this.f834d == 1) {
            if (!this.f840j || this.f839i.length == 0) {
                int iFloor = ((int) Math.floor((this.f838h - this.f837g) / this.f836f)) + 1;
                int[] iArr = new int[iFloor];
                for (int i2 = 0; i2 < iFloor; i2++) {
                    iArr[i2] = Math.round(this.f837g + (i2 * this.f836f));
                }
                this.f839i = c(iArr);
            }
            this.f835e = true;
        } else {
            this.f835e = false;
        }
        return this.f835e;
    }
}
