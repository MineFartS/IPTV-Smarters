package c.f.a.b.h3;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.achartengine.renderer.DefaultRenderer;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class c1 {
    public int A;
    public int B;
    public int C;
    public int D;
    public StaticLayout E;
    public StaticLayout F;
    public int G;
    public int H;
    public int I;
    public Rect J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f8640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f8641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f8642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextPaint f8643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f8644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f8645h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f8646i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Layout.Alignment f8647j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Bitmap f8648k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f8649l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8650m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8651n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f8652o;
    public int p;
    public float q;
    public float r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public float x;
    public float y;
    public float z;

    public c1(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f8642e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f8641d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f8638a = fRound;
        this.f8639b = fRound;
        this.f8640c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f8643f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f8644g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f8645h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    public void b(c.f.a.b.f3.c cVar, h0 h0Var, float f2, float f3, float f4, Canvas canvas, int i2, int i3, int i4, int i5) {
        boolean z = cVar.f8068f == null;
        int i6 = DefaultRenderer.BACKGROUND_COLOR;
        if (z) {
            if (TextUtils.isEmpty(cVar.f8065c)) {
                return;
            } else {
                i6 = cVar.f8076n ? cVar.f8077o : h0Var.f8681d;
            }
        }
        if (a(this.f8646i, cVar.f8065c) && c.f.a.b.j3.x0.b(this.f8647j, cVar.f8066d) && this.f8648k == cVar.f8068f && this.f8649l == cVar.f8069g && this.f8650m == cVar.f8070h && c.f.a.b.j3.x0.b(Integer.valueOf(this.f8651n), Integer.valueOf(cVar.f8071i)) && this.f8652o == cVar.f8072j && c.f.a.b.j3.x0.b(Integer.valueOf(this.p), Integer.valueOf(cVar.f8073k)) && this.q == cVar.f8074l && this.r == cVar.f8075m && this.s == h0Var.f8679b && this.t == h0Var.f8680c && this.u == i6 && this.w == h0Var.f8682e && this.v == h0Var.f8683f && c.f.a.b.j3.x0.b(this.f8643f.getTypeface(), h0Var.f8684g) && this.x == f2 && this.y == f3 && this.z == f4 && this.A == i2 && this.B == i3 && this.C == i4 && this.D == i5) {
            d(canvas, z);
            return;
        }
        this.f8646i = cVar.f8065c;
        this.f8647j = cVar.f8066d;
        this.f8648k = cVar.f8068f;
        this.f8649l = cVar.f8069g;
        this.f8650m = cVar.f8070h;
        this.f8651n = cVar.f8071i;
        this.f8652o = cVar.f8072j;
        this.p = cVar.f8073k;
        this.q = cVar.f8074l;
        this.r = cVar.f8075m;
        this.s = h0Var.f8679b;
        this.t = h0Var.f8680c;
        this.u = i6;
        this.w = h0Var.f8682e;
        this.v = h0Var.f8683f;
        this.f8643f.setTypeface(h0Var.f8684g);
        this.x = f2;
        this.y = f3;
        this.z = f4;
        this.A = i2;
        this.B = i3;
        this.C = i4;
        this.D = i5;
        if (z) {
            c.f.a.b.j3.g.e(this.f8646i);
            g();
        } else {
            c.f.a.b.j3.g.e(this.f8648k);
            f();
        }
        d(canvas, z);
    }

    @RequiresNonNull({"cueBitmap", "bitmapRect"})
    public final void c(Canvas canvas) {
        canvas.drawBitmap(this.f8648k, (Rect) null, this.J, this.f8645h);
    }

    public final void d(Canvas canvas, boolean z) {
        if (z) {
            e(canvas);
            return;
        }
        c.f.a.b.j3.g.e(this.J);
        c.f.a.b.j3.g.e(this.f8648k);
        c(canvas);
    }

    public final void e(Canvas canvas) {
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.G, this.H);
        if (Color.alpha(this.u) > 0) {
            this.f8644g.setColor(this.u);
            canvas.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), this.f8644g);
        }
        int i2 = this.w;
        if (i2 == 1) {
            this.f8643f.setStrokeJoin(Paint.Join.ROUND);
            this.f8643f.setStrokeWidth(this.f8638a);
            this.f8643f.setColor(this.v);
            this.f8643f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i2 == 2) {
            TextPaint textPaint = this.f8643f;
            float f2 = this.f8639b;
            float f3 = this.f8640c;
            textPaint.setShadowLayer(f2, f3, f3, this.v);
        } else if (i2 == 3 || i2 == 4) {
            boolean z = i2 == 3;
            int i3 = z ? -1 : this.v;
            int i4 = z ? this.v : -1;
            float f4 = this.f8639b / 2.0f;
            this.f8643f.setColor(this.s);
            this.f8643f.setStyle(Paint.Style.FILL);
            float f5 = -f4;
            this.f8643f.setShadowLayer(this.f8639b, f5, f5, i3);
            staticLayout2.draw(canvas);
            this.f8643f.setShadowLayer(this.f8639b, f4, f4, i4);
        }
        this.f8643f.setColor(this.s);
        this.f8643f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.f8643f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(iSave);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"cueBitmap"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.f8648k
            int r1 = r7.C
            int r2 = r7.A
            int r1 = r1 - r2
            int r3 = r7.D
            int r4 = r7.B
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.f8652o
            float r5 = r5 * r1
            float r2 = r2 + r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r5 = r7.f8649l
            float r5 = r5 * r3
            float r4 = r4 + r5
            float r5 = r7.q
            float r1 = r1 * r5
            int r1 = java.lang.Math.round(r1)
            float r5 = r7.r
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L2c
            goto L38
        L2c:
            float r3 = (float) r1
            int r5 = r0.getHeight()
            float r5 = (float) r5
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
        L38:
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
            int r3 = r7.p
            r5 = 1
            r6 = 2
            if (r3 != r6) goto L47
            float r3 = (float) r1
        L45:
            float r2 = r2 - r3
            goto L4d
        L47:
            if (r3 != r5) goto L4d
            int r3 = r1 / 2
            float r3 = (float) r3
            goto L45
        L4d:
            int r2 = java.lang.Math.round(r2)
            int r3 = r7.f8651n
            if (r3 != r6) goto L58
            float r3 = (float) r0
        L56:
            float r4 = r4 - r3
            goto L5e
        L58:
            if (r3 != r5) goto L5e
            int r3 = r0 / 2
            float r3 = (float) r3
            goto L56
        L5e:
            int r3 = java.lang.Math.round(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r3
            r4.<init>(r2, r3, r1, r0)
            r7.J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.h3.c1.f():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a7  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"cueText"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.h3.c1.g():void");
    }
}
