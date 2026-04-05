package c.f.a.d.g0;

import a.i.i.e.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import c.f.a.d.l;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f14806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f14807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f14808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ColorStateList f14809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f14812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f14813h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f14814i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f14815j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f14816k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f14817l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f14818m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f14819n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f14820o;
    public boolean p = false;
    public Typeface q;

    public class a extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f14821a;

        public a(f fVar) {
            this.f14821a = fVar;
        }

        @Override // a.i.i.e.f.a
        public void d(int i2) {
            d.this.p = true;
            this.f14821a.a(i2);
        }

        @Override // a.i.i.e.f.a
        public void e(Typeface typeface) {
            d dVar = d.this;
            dVar.q = Typeface.create(typeface, dVar.f14811f);
            d.this.p = true;
            this.f14821a.b(d.this.q, false);
        }
    }

    public class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextPaint f14823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f14824b;

        public b(TextPaint textPaint, f fVar) {
            this.f14823a = textPaint;
            this.f14824b = fVar;
        }

        @Override // c.f.a.d.g0.f
        public void a(int i2) {
            this.f14824b.a(i2);
        }

        @Override // c.f.a.d.g0.f
        public void b(Typeface typeface, boolean z) {
            d.this.l(this.f14823a, typeface);
            this.f14824b.b(typeface, z);
        }
    }

    public d(Context context, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, l.i5);
        this.f14819n = typedArrayObtainStyledAttributes.getDimension(l.j5, 0.0f);
        this.f14806a = c.a(context, typedArrayObtainStyledAttributes, l.m5);
        this.f14807b = c.a(context, typedArrayObtainStyledAttributes, l.n5);
        this.f14808c = c.a(context, typedArrayObtainStyledAttributes, l.o5);
        this.f14811f = typedArrayObtainStyledAttributes.getInt(l.l5, 0);
        this.f14812g = typedArrayObtainStyledAttributes.getInt(l.k5, 1);
        int iE = c.e(typedArrayObtainStyledAttributes, l.u5, l.t5);
        this.f14820o = typedArrayObtainStyledAttributes.getResourceId(iE, 0);
        this.f14810e = typedArrayObtainStyledAttributes.getString(iE);
        this.f14813h = typedArrayObtainStyledAttributes.getBoolean(l.v5, false);
        this.f14809d = c.a(context, typedArrayObtainStyledAttributes, l.p5);
        this.f14814i = typedArrayObtainStyledAttributes.getFloat(l.q5, 0.0f);
        this.f14815j = typedArrayObtainStyledAttributes.getFloat(l.r5, 0.0f);
        this.f14816k = typedArrayObtainStyledAttributes.getFloat(l.s5, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT < 21) {
            this.f14817l = false;
            this.f14818m = 0.0f;
            return;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i2, l.t3);
        int i3 = l.u3;
        this.f14817l = typedArrayObtainStyledAttributes2.hasValue(i3);
        this.f14818m = typedArrayObtainStyledAttributes2.getFloat(i3, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void d() {
        String str;
        if (this.q == null && (str = this.f14810e) != null) {
            this.q = Typeface.create(str, this.f14811f);
        }
        if (this.q == null) {
            int i2 = this.f14812g;
            this.q = i2 != 1 ? i2 != 2 ? i2 != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.q = Typeface.create(this.q, this.f14811f);
        }
    }

    public Typeface e() {
        d();
        return this.q;
    }

    public Typeface f(Context context) {
        if (this.p) {
            return this.q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceB = a.i.i.e.f.b(context, this.f14820o);
                this.q = typefaceB;
                if (typefaceB != null) {
                    this.q = Typeface.create(typefaceB, this.f14811f);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.f14810e, e2);
            }
        }
        d();
        this.p = true;
        return this.q;
    }

    public void g(Context context, TextPaint textPaint, f fVar) {
        l(textPaint, e());
        h(context, new b(textPaint, fVar));
    }

    public void h(Context context, f fVar) {
        if (i(context)) {
            f(context);
        } else {
            d();
        }
        int i2 = this.f14820o;
        if (i2 == 0) {
            this.p = true;
        }
        if (this.p) {
            fVar.b(this.q, true);
            return;
        }
        try {
            a.i.i.e.f.d(context, i2, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.p = true;
            fVar.a(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f14810e, e2);
            this.p = true;
            fVar.a(-3);
        }
    }

    public final boolean i(Context context) {
        return e.a();
    }

    public void j(Context context, TextPaint textPaint, f fVar) {
        k(context, textPaint, fVar);
        ColorStateList colorStateList = this.f14806a;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : DefaultRenderer.BACKGROUND_COLOR);
        float f2 = this.f14816k;
        float f3 = this.f14814i;
        float f4 = this.f14815j;
        ColorStateList colorStateList2 = this.f14809d;
        textPaint.setShadowLayer(f2, f3, f4, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void k(Context context, TextPaint textPaint, f fVar) {
        if (i(context)) {
            l(textPaint, f(context));
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void l(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int style = (typeface.getStyle() ^ (-1)) & this.f14811f;
        textPaint.setFakeBoldText((style & 1) != 0);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f14819n);
        if (Build.VERSION.SDK_INT < 21 || !this.f14817l) {
            return;
        }
        textPaint.setLetterSpacing(this.f14818m);
    }
}
