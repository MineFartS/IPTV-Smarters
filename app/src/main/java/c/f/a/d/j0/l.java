package c.f.a.d.j0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m[] f14948a = new m[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix[] f14949b = new Matrix[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix[] f14950c = new Matrix[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PointF f14951d = new PointF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f14952e = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Path f14953f = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f14954g = new m();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f14955h = new float[2];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f14956i = new float[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Path f14957j = new Path();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Path f14958k = new Path();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f14959l = true;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f14960a = new l();
    }

    public interface b {
        void a(m mVar, Matrix matrix, int i2);

        void b(m mVar, Matrix matrix, int i2);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f14961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Path f14962b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RectF f14963c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f14964d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f14965e;

        public c(k kVar, float f2, RectF rectF, b bVar, Path path) {
            this.f14964d = bVar;
            this.f14961a = kVar;
            this.f14965e = f2;
            this.f14963c = rectF;
            this.f14962b = path;
        }
    }

    public l() {
        for (int i2 = 0; i2 < 4; i2++) {
            this.f14948a[i2] = new m();
            this.f14949b[i2] = new Matrix();
            this.f14950c[i2] = new Matrix();
        }
    }

    public static l k() {
        return a.f14960a;
    }

    public final float a(int i2) {
        return (i2 + 1) * 90;
    }

    public final void b(c cVar, int i2) {
        this.f14955h[0] = this.f14948a[i2].k();
        this.f14955h[1] = this.f14948a[i2].l();
        this.f14949b[i2].mapPoints(this.f14955h);
        Path path = cVar.f14962b;
        float[] fArr = this.f14955h;
        if (i2 == 0) {
            path.moveTo(fArr[0], fArr[1]);
        } else {
            path.lineTo(fArr[0], fArr[1]);
        }
        this.f14948a[i2].d(this.f14949b[i2], cVar.f14962b);
        b bVar = cVar.f14964d;
        if (bVar != null) {
            bVar.a(this.f14948a[i2], this.f14949b[i2], i2);
        }
    }

    public final void c(c cVar, int i2) {
        m mVar;
        Matrix matrix;
        Path path;
        int i3 = (i2 + 1) % 4;
        this.f14955h[0] = this.f14948a[i2].i();
        this.f14955h[1] = this.f14948a[i2].j();
        this.f14949b[i2].mapPoints(this.f14955h);
        this.f14956i[0] = this.f14948a[i3].k();
        this.f14956i[1] = this.f14948a[i3].l();
        this.f14949b[i3].mapPoints(this.f14956i);
        float f2 = this.f14955h[0];
        float[] fArr = this.f14956i;
        float fMax = Math.max(((float) Math.hypot(f2 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float fI = i(cVar.f14963c, i2);
        this.f14954g.n(0.0f, 0.0f);
        f fVarJ = j(i2, cVar.f14961a);
        fVarJ.b(fMax, fI, cVar.f14965e, this.f14954g);
        this.f14957j.reset();
        this.f14954g.d(this.f14950c[i2], this.f14957j);
        if (this.f14959l && Build.VERSION.SDK_INT >= 19 && (fVarJ.a() || l(this.f14957j, i2) || l(this.f14957j, i3))) {
            Path path2 = this.f14957j;
            path2.op(path2, this.f14953f, Path.Op.DIFFERENCE);
            this.f14955h[0] = this.f14954g.k();
            this.f14955h[1] = this.f14954g.l();
            this.f14950c[i2].mapPoints(this.f14955h);
            Path path3 = this.f14952e;
            float[] fArr2 = this.f14955h;
            path3.moveTo(fArr2[0], fArr2[1]);
            mVar = this.f14954g;
            matrix = this.f14950c[i2];
            path = this.f14952e;
        } else {
            mVar = this.f14954g;
            matrix = this.f14950c[i2];
            path = cVar.f14962b;
        }
        mVar.d(matrix, path);
        b bVar = cVar.f14964d;
        if (bVar != null) {
            bVar.b(this.f14954g, this.f14950c[i2], i2);
        }
    }

    public void d(k kVar, float f2, RectF rectF, Path path) {
        e(kVar, f2, rectF, null, path);
    }

    public void e(k kVar, float f2, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f14952e.rewind();
        this.f14953f.rewind();
        this.f14953f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(kVar, f2, rectF, bVar, path);
        for (int i2 = 0; i2 < 4; i2++) {
            m(cVar, i2);
            n(i2);
        }
        for (int i3 = 0; i3 < 4; i3++) {
            b(cVar, i3);
            c(cVar, i3);
        }
        path.close();
        this.f14952e.close();
        if (Build.VERSION.SDK_INT < 19 || this.f14952e.isEmpty()) {
            return;
        }
        path.op(this.f14952e, Path.Op.UNION);
    }

    public final void f(int i2, RectF rectF, PointF pointF) {
        float f2;
        float f3;
        if (i2 == 1) {
            f2 = rectF.right;
        } else {
            if (i2 != 2) {
                f2 = i2 != 3 ? rectF.right : rectF.left;
                f3 = rectF.top;
                pointF.set(f2, f3);
            }
            f2 = rectF.left;
        }
        f3 = rectF.bottom;
        pointF.set(f2, f3);
    }

    public final c.f.a.d.j0.c g(int i2, k kVar) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? kVar.t() : kVar.r() : kVar.j() : kVar.l();
    }

    public final d h(int i2, k kVar) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? kVar.s() : kVar.q() : kVar.i() : kVar.k();
    }

    public final float i(RectF rectF, int i2) {
        float fCenterX;
        float f2;
        float[] fArr = this.f14955h;
        m[] mVarArr = this.f14948a;
        fArr[0] = mVarArr[i2].f14968c;
        fArr[1] = mVarArr[i2].f14969d;
        this.f14949b[i2].mapPoints(fArr);
        if (i2 == 1 || i2 == 3) {
            fCenterX = rectF.centerX();
            f2 = this.f14955h[0];
        } else {
            fCenterX = rectF.centerY();
            f2 = this.f14955h[1];
        }
        return Math.abs(fCenterX - f2);
    }

    public final f j(int i2, k kVar) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? kVar.o() : kVar.p() : kVar.n() : kVar.h();
    }

    public final boolean l(Path path, int i2) {
        this.f14958k.reset();
        this.f14948a[i2].d(this.f14949b[i2], this.f14958k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f14958k.computeBounds(rectF, true);
        path.op(this.f14958k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    public final void m(c cVar, int i2) {
        h(i2, cVar.f14961a).b(this.f14948a[i2], 90.0f, cVar.f14965e, cVar.f14963c, g(i2, cVar.f14961a));
        float fA = a(i2);
        this.f14949b[i2].reset();
        f(i2, cVar.f14963c, this.f14951d);
        Matrix matrix = this.f14949b[i2];
        PointF pointF = this.f14951d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f14949b[i2].preRotate(fA);
    }

    public final void n(int i2) {
        this.f14955h[0] = this.f14948a[i2].i();
        this.f14955h[1] = this.f14948a[i2].j();
        this.f14949b[i2].mapPoints(this.f14955h);
        float fA = a(i2);
        this.f14950c[i2].reset();
        Matrix matrix = this.f14950c[i2];
        float[] fArr = this.f14955h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f14950c[i2].preRotate(fA);
    }
}
