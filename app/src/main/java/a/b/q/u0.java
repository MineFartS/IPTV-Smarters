package a.b.q;

import a.i.i.e.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypedArray f786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f787c;

    public u0(Context context, TypedArray typedArray) {
        this.f785a = context;
        this.f786b = typedArray;
    }

    public static u0 t(Context context, int i2, int[] iArr) {
        return new u0(context, context.obtainStyledAttributes(i2, iArr));
    }

    public static u0 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new u0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static u0 v(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3) {
        return new u0(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }

    public boolean a(int i2, boolean z) {
        return this.f786b.getBoolean(i2, z);
    }

    public int b(int i2, int i3) {
        return this.f786b.getColor(i2, i3);
    }

    public ColorStateList c(int i2) {
        int resourceId;
        ColorStateList colorStateListC;
        return (!this.f786b.hasValue(i2) || (resourceId = this.f786b.getResourceId(i2, 0)) == 0 || (colorStateListC = a.b.l.a.a.c(this.f785a, resourceId)) == null) ? this.f786b.getColorStateList(i2) : colorStateListC;
    }

    public float d(int i2, float f2) {
        return this.f786b.getDimension(i2, f2);
    }

    public int e(int i2, int i3) {
        return this.f786b.getDimensionPixelOffset(i2, i3);
    }

    public int f(int i2, int i3) {
        return this.f786b.getDimensionPixelSize(i2, i3);
    }

    public Drawable g(int i2) {
        int resourceId;
        return (!this.f786b.hasValue(i2) || (resourceId = this.f786b.getResourceId(i2, 0)) == 0) ? this.f786b.getDrawable(i2) : a.b.l.a.a.d(this.f785a, resourceId);
    }

    public Drawable h(int i2) {
        int resourceId;
        if (!this.f786b.hasValue(i2) || (resourceId = this.f786b.getResourceId(i2, 0)) == 0) {
            return null;
        }
        return i.b().d(this.f785a, resourceId, true);
    }

    public float i(int i2, float f2) {
        return this.f786b.getFloat(i2, f2);
    }

    public Typeface j(int i2, int i3, f.a aVar) {
        int resourceId = this.f786b.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f787c == null) {
            this.f787c = new TypedValue();
        }
        return a.i.i.e.f.c(this.f785a, resourceId, this.f787c, i3, aVar);
    }

    public int k(int i2, int i3) {
        return this.f786b.getInt(i2, i3);
    }

    public int l(int i2, int i3) {
        return this.f786b.getInteger(i2, i3);
    }

    public int m(int i2, int i3) {
        return this.f786b.getLayoutDimension(i2, i3);
    }

    public int n(int i2, int i3) {
        return this.f786b.getResourceId(i2, i3);
    }

    public String o(int i2) {
        return this.f786b.getString(i2);
    }

    public CharSequence p(int i2) {
        return this.f786b.getText(i2);
    }

    public CharSequence[] q(int i2) {
        return this.f786b.getTextArray(i2);
    }

    public TypedArray r() {
        return this.f786b;
    }

    public boolean s(int i2) {
        return this.f786b.hasValue(i2);
    }

    public void w() {
        this.f786b.recycle();
    }
}
