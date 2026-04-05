package c.f.a.d.j0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public float f14966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public float f14967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public float f14968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public float f14969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public float f14970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public float f14971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<f> f14972g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<g> f14973h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f14974i;

    public class a extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f14975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Matrix f14976c;

        public a(List list, Matrix matrix) {
            this.f14975b = list;
            this.f14976c = matrix;
        }

        @Override // c.f.a.d.j0.m.g
        public void a(Matrix matrix, c.f.a.d.i0.a aVar, int i2, Canvas canvas) {
            Iterator it = this.f14975b.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(this.f14976c, aVar, i2, canvas);
            }
        }
    }

    public static class b extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f14978b;

        public b(d dVar) {
            this.f14978b = dVar;
        }

        @Override // c.f.a.d.j0.m.g
        public void a(Matrix matrix, c.f.a.d.i0.a aVar, int i2, Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f14978b.k(), this.f14978b.o(), this.f14978b.l(), this.f14978b.j()), i2, this.f14978b.m(), this.f14978b.n());
        }
    }

    public static class c extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f14979b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f14980c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f14981d;

        public c(e eVar, float f2, float f3) {
            this.f14979b = eVar;
            this.f14980c = f2;
            this.f14981d = f3;
        }

        @Override // c.f.a.d.j0.m.g
        public void a(Matrix matrix, c.f.a.d.i0.a aVar, int i2, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f14979b.f14990c - this.f14981d, this.f14979b.f14989b - this.f14980c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f14980c, this.f14981d);
            matrix2.preRotate(c());
            aVar.b(canvas, matrix2, rectF, i2);
        }

        public float c() {
            return (float) Math.toDegrees(Math.atan((this.f14979b.f14990c - this.f14981d) / (this.f14979b.f14989b - this.f14980c)));
        }
    }

    public static class d extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final RectF f14982b = new RectF();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Deprecated
        public float f14983c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Deprecated
        public float f14984d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Deprecated
        public float f14985e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Deprecated
        public float f14986f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Deprecated
        public float f14987g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Deprecated
        public float f14988h;

        public d(float f2, float f3, float f4, float f5) {
            q(f2);
            u(f3);
            r(f4);
            p(f5);
        }

        @Override // c.f.a.d.j0.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f14991a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f14982b;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }

        public final float j() {
            return this.f14986f;
        }

        public final float k() {
            return this.f14983c;
        }

        public final float l() {
            return this.f14985e;
        }

        public final float m() {
            return this.f14987g;
        }

        public final float n() {
            return this.f14988h;
        }

        public final float o() {
            return this.f14984d;
        }

        public final void p(float f2) {
            this.f14986f = f2;
        }

        public final void q(float f2) {
            this.f14983c = f2;
        }

        public final void r(float f2) {
            this.f14985e = f2;
        }

        public final void s(float f2) {
            this.f14987g = f2;
        }

        public final void t(float f2) {
            this.f14988h = f2;
        }

        public final void u(float f2) {
            this.f14984d = f2;
        }
    }

    public static class e extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f14989b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f14990c;

        @Override // c.f.a.d.j0.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f14991a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f14989b, this.f14990c);
            path.transform(matrix);
        }
    }

    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f14991a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    public static abstract class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Matrix f14992a = new Matrix();

        public abstract void a(Matrix matrix, c.f.a.d.i0.a aVar, int i2, Canvas canvas);

        public final void b(c.f.a.d.i0.a aVar, int i2, Canvas canvas) {
            a(f14992a, aVar, i2, canvas);
        }
    }

    public m() {
        n(0.0f, 0.0f);
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        d dVar = new d(f2, f3, f4, f5);
        dVar.s(f6);
        dVar.t(f7);
        this.f14972g.add(dVar);
        b bVar = new b(dVar);
        float f8 = f6 + f7;
        boolean z = f7 < 0.0f;
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        c(bVar, f6, z ? (180.0f + f8) % 360.0f : f8);
        double d2 = f8;
        r(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))));
        s(((f3 + f5) * 0.5f) + (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))));
    }

    public final void b(float f2) {
        if (g() == f2) {
            return;
        }
        float fG = ((f2 - g()) + 360.0f) % 360.0f;
        if (fG > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(fG);
        this.f14973h.add(new b(dVar));
        p(f2);
    }

    public final void c(g gVar, float f2, float f3) {
        b(f2);
        this.f14973h.add(gVar);
        p(f3);
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f14972g.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f14972g.get(i2).a(matrix, path);
        }
    }

    public boolean e() {
        return this.f14974i;
    }

    public g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f14973h), new Matrix(matrix));
    }

    public final float g() {
        return this.f14970e;
    }

    public final float h() {
        return this.f14971f;
    }

    public float i() {
        return this.f14968c;
    }

    public float j() {
        return this.f14969d;
    }

    public float k() {
        return this.f14966a;
    }

    public float l() {
        return this.f14967b;
    }

    public void m(float f2, float f3) {
        e eVar = new e();
        eVar.f14989b = f2;
        eVar.f14990c = f3;
        this.f14972g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f2);
        s(f3);
    }

    public void n(float f2, float f3) {
        o(f2, f3, 270.0f, 0.0f);
    }

    public void o(float f2, float f3, float f4, float f5) {
        t(f2);
        u(f3);
        r(f2);
        s(f3);
        p(f4);
        q((f4 + f5) % 360.0f);
        this.f14972g.clear();
        this.f14973h.clear();
        this.f14974i = false;
    }

    public final void p(float f2) {
        this.f14970e = f2;
    }

    public final void q(float f2) {
        this.f14971f = f2;
    }

    public final void r(float f2) {
        this.f14968c = f2;
    }

    public final void s(float f2) {
        this.f14969d = f2;
    }

    public final void t(float f2) {
        this.f14966a = f2;
    }

    public final void u(float f2) {
        this.f14967b = f2;
    }
}
