package c.k.b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.NetworkInfo;
import c.k.b.j;
import c.k.b.r;
import c.k.b.t;
import c.k.b.y;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f18671b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ThreadLocal<StringBuilder> f18672c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicInteger f18673d = new AtomicInteger();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y f18674e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18675f = f18673d.incrementAndGet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f18676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f18677h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c.k.b.d f18678i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a0 f18679j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f18680k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w f18681l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f18682m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f18683n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y f18684o;
    public c.k.b.a p;
    public List<c.k.b.a> q;
    public Bitmap r;
    public Future<?> s;
    public t.e t;
    public Exception u;
    public int v;
    public int w;
    public t.f x;

    public static class a extends ThreadLocal<StringBuilder> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    public static class b extends y {
        @Override // c.k.b.y
        public boolean c(w wVar) {
            return true;
        }

        @Override // c.k.b.y
        public y.a f(w wVar, int i2) {
            throw new IllegalStateException("Unrecognized type of request: " + wVar);
        }
    }

    /* JADX INFO: renamed from: c.k.b.c$c, reason: collision with other inner class name */
    public static class RunnableC0250c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e0 f18685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ RuntimeException f18686c;

        public RunnableC0250c(e0 e0Var, RuntimeException runtimeException) {
            this.f18685b = e0Var;
            this.f18686c = runtimeException;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new RuntimeException("Transformation " + this.f18685b.key() + " crashed with exception.", this.f18686c);
        }
    }

    public static class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f18687b;

        public d(StringBuilder sb) {
            this.f18687b = sb;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new NullPointerException(this.f18687b.toString());
        }
    }

    public static class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e0 f18688b;

        public e(e0 e0Var) {
            this.f18688b = e0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException("Transformation " + this.f18688b.key() + " returned input Bitmap but recycled it.");
        }
    }

    public static class f implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e0 f18689b;

        public f(e0 e0Var) {
            this.f18689b = e0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException("Transformation " + this.f18689b.key() + " mutated input Bitmap but failed to recycle the original.");
        }
    }

    public c(t tVar, i iVar, c.k.b.d dVar, a0 a0Var, c.k.b.a aVar, y yVar) {
        this.f18676g = tVar;
        this.f18677h = iVar;
        this.f18678i = dVar;
        this.f18679j = a0Var;
        this.p = aVar;
        this.f18680k = aVar.d();
        this.f18681l = aVar.i();
        this.x = aVar.h();
        this.f18682m = aVar.e();
        this.f18683n = aVar.f();
        this.f18684o = yVar;
        this.w = yVar.e();
    }

    public static Bitmap a(List<e0> list, Bitmap bitmap) {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            e0 e0Var = list.get(i2);
            try {
                Bitmap bitmapA = e0Var.a(bitmap);
                if (bitmapA == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Transformation ");
                    sb.append(e0Var.key());
                    sb.append(" returned null after ");
                    sb.append(i2);
                    sb.append(" previous transformation(s).\n\nTransformation list:\n");
                    Iterator<e0> it = list.iterator();
                    while (it.hasNext()) {
                        sb.append(it.next().key());
                        sb.append('\n');
                    }
                    t.f18744a.post(new d(sb));
                    return null;
                }
                if (bitmapA == bitmap && bitmap.isRecycled()) {
                    t.f18744a.post(new e(e0Var));
                    return null;
                }
                if (bitmapA != bitmap && !bitmap.isRecycled()) {
                    t.f18744a.post(new f(e0Var));
                    return null;
                }
                i2++;
                bitmap = bitmapA;
            } catch (RuntimeException e2) {
                t.f18744a.post(new RunnableC0250c(e0Var, e2));
                return null;
            }
        }
        return bitmap;
    }

    public static Bitmap e(InputStream inputStream, w wVar) throws IOException {
        n nVar = new n(inputStream);
        long jI = nVar.i(65536);
        BitmapFactory.Options optionsD = y.d(wVar);
        boolean zG = y.g(optionsD);
        boolean zT = g0.t(nVar);
        nVar.d(jI);
        if (zT) {
            byte[] bArrX = g0.x(nVar);
            if (zG) {
                BitmapFactory.decodeByteArray(bArrX, 0, bArrX.length, optionsD);
                y.b(wVar.f18791i, wVar.f18792j, optionsD, wVar);
            }
            return BitmapFactory.decodeByteArray(bArrX, 0, bArrX.length, optionsD);
        }
        if (zG) {
            BitmapFactory.decodeStream(nVar, null, optionsD);
            y.b(wVar.f18791i, wVar.f18792j, optionsD, wVar);
            nVar.d(jI);
        }
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(nVar, null, optionsD);
        if (bitmapDecodeStream != null) {
            return bitmapDecodeStream;
        }
        throw new IOException("Failed to decode stream.");
    }

    public static c g(t tVar, i iVar, c.k.b.d dVar, a0 a0Var, c.k.b.a aVar) {
        w wVarI = aVar.i();
        List<y> listI = tVar.i();
        int size = listI.size();
        for (int i2 = 0; i2 < size; i2++) {
            y yVar = listI.get(i2);
            if (yVar.c(wVarI)) {
                return new c(tVar, iVar, dVar, a0Var, aVar, yVar);
            }
        }
        return new c(tVar, iVar, dVar, a0Var, aVar, f18674e);
    }

    public static boolean t(boolean z, int i2, int i3, int i4, int i5) {
        return !z || i2 > i4 || i3 > i5;
    }

    public static Bitmap w(w wVar, Bitmap bitmap, int i2) {
        int i3;
        int i4;
        int i5;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int iCeil;
        int i6;
        int i7;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        boolean z = wVar.f18795m;
        Matrix matrix = new Matrix();
        int i8 = 0;
        if (wVar.e()) {
            int i9 = wVar.f18791i;
            int i10 = wVar.f18792j;
            float f7 = wVar.f18796n;
            if (f7 != 0.0f) {
                if (wVar.q) {
                    matrix.setRotate(f7, wVar.f18797o, wVar.p);
                } else {
                    matrix.setRotate(f7);
                }
            }
            if (wVar.f18793k) {
                float f8 = i9;
                float f9 = f8 / width;
                float f10 = i10;
                float f11 = f10 / height;
                if (f9 > f11) {
                    iCeil = (int) Math.ceil(r10 * (f11 / f9));
                    i7 = (height - iCeil) / 2;
                    f11 = f10 / iCeil;
                    f6 = f9;
                    i6 = width;
                } else {
                    int iCeil2 = (int) Math.ceil(r6 * (f9 / f11));
                    f6 = f8 / iCeil2;
                    iCeil = height;
                    i8 = (width - iCeil2) / 2;
                    i6 = iCeil2;
                    i7 = 0;
                }
                if (t(z, width, height, i9, i10)) {
                    matrix.preScale(f6, f11);
                }
                i5 = i7;
                i3 = i6;
                i4 = iCeil;
            } else {
                if (wVar.f18794l) {
                    float f12 = i9 / width;
                    float f13 = i10 / height;
                    if (f12 >= f13) {
                        f12 = f13;
                    }
                    if (t(z, width, height, i9, i10)) {
                        matrix.preScale(f12, f12);
                    }
                } else if ((i9 != 0 || i10 != 0) && (i9 != width || i10 != height)) {
                    if (i9 != 0) {
                        f2 = i9;
                        f3 = width;
                    } else {
                        f2 = i10;
                        f3 = height;
                    }
                    float f14 = f2 / f3;
                    if (i10 != 0) {
                        f4 = i10;
                        f5 = height;
                    } else {
                        f4 = i9;
                        f5 = width;
                    }
                    float f15 = f4 / f5;
                    if (t(z, width, height, i9, i10)) {
                        matrix.preScale(f14, f15);
                    }
                }
                i3 = width;
                i4 = height;
                i5 = 0;
            }
        } else {
            i3 = width;
            i4 = height;
            i5 = 0;
        }
        if (i2 != 0) {
            matrix.preRotate(i2);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i8, i5, i3, i4, matrix, true);
        if (bitmapCreateBitmap == bitmap) {
            return bitmap;
        }
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    public static void x(w wVar) {
        String strA = wVar.a();
        StringBuilder sb = f18672c.get();
        sb.ensureCapacity(strA.length() + 8);
        sb.replace(8, sb.length(), strA);
        Thread.currentThread().setName(sb.toString());
    }

    public void b(c.k.b.a aVar) {
        String strD;
        String strM;
        boolean z = this.f18676g.p;
        w wVar = aVar.f18626b;
        if (this.p != null) {
            if (this.q == null) {
                this.q = new ArrayList(3);
            }
            this.q.add(aVar);
            if (z) {
                g0.v("Hunter", "joined", wVar.d(), g0.m(this, "to "));
            }
            t.f fVarH = aVar.h();
            if (fVarH.ordinal() > this.x.ordinal()) {
                this.x = fVarH;
                return;
            }
            return;
        }
        this.p = aVar;
        if (z) {
            List<c.k.b.a> list = this.q;
            if (list == null || list.isEmpty()) {
                strD = wVar.d();
                strM = "to empty hunter";
            } else {
                strD = wVar.d();
                strM = g0.m(this, "to ");
            }
            g0.v("Hunter", "joined", strD, strM);
        }
    }

    public boolean c() {
        Future<?> future;
        if (this.p != null) {
            return false;
        }
        List<c.k.b.a> list = this.q;
        return (list == null || list.isEmpty()) && (future = this.s) != null && future.cancel(false);
    }

    public final t.f d() {
        t.f fVarH = t.f.LOW;
        List<c.k.b.a> list = this.q;
        boolean z = true;
        boolean z2 = (list == null || list.isEmpty()) ? false : true;
        c.k.b.a aVar = this.p;
        if (aVar == null && !z2) {
            z = false;
        }
        if (!z) {
            return fVarH;
        }
        if (aVar != null) {
            fVarH = aVar.h();
        }
        if (z2) {
            int size = this.q.size();
            for (int i2 = 0; i2 < size; i2++) {
                t.f fVarH2 = this.q.get(i2).h();
                if (fVarH2.ordinal() > fVarH.ordinal()) {
                    fVarH = fVarH2;
                }
            }
        }
        return fVarH;
    }

    public void f(c.k.b.a aVar) {
        boolean zRemove;
        if (this.p == aVar) {
            this.p = null;
            zRemove = true;
        } else {
            List<c.k.b.a> list = this.q;
            zRemove = list != null ? list.remove(aVar) : false;
        }
        if (zRemove && aVar.h() == this.x) {
            this.x = d();
        }
        if (this.f18676g.p) {
            g0.v("Hunter", "removed", aVar.f18626b.d(), g0.m(this, "from "));
        }
    }

    public c.k.b.a h() {
        return this.p;
    }

    public List<c.k.b.a> i() {
        return this.q;
    }

    public w j() {
        return this.f18681l;
    }

    public Exception k() {
        return this.u;
    }

    public String l() {
        return this.f18680k;
    }

    public t.e m() {
        return this.t;
    }

    public int n() {
        return this.f18682m;
    }

    public t o() {
        return this.f18676g;
    }

    public t.f p() {
        return this.x;
    }

    public Bitmap q() {
        return this.r;
    }

    public Bitmap r() {
        Bitmap bitmapW;
        if (p.shouldReadFromMemoryCache(this.f18682m)) {
            bitmapW = this.f18678i.get(this.f18680k);
            if (bitmapW != null) {
                this.f18679j.d();
                this.t = t.e.MEMORY;
                if (this.f18676g.p) {
                    g0.v("Hunter", "decoded", this.f18681l.d(), "from cache");
                }
                return bitmapW;
            }
        } else {
            bitmapW = null;
        }
        w wVar = this.f18681l;
        wVar.f18786d = this.w == 0 ? q.OFFLINE.index : this.f18683n;
        y.a aVarF = this.f18684o.f(wVar, this.f18683n);
        if (aVarF != null) {
            this.t = aVarF.c();
            this.v = aVarF.b();
            bitmapW = aVarF.a();
            if (bitmapW == null) {
                InputStream inputStreamD = aVarF.d();
                try {
                    Bitmap bitmapE = e(inputStreamD, this.f18681l);
                    g0.e(inputStreamD);
                    bitmapW = bitmapE;
                } catch (Throwable th) {
                    g0.e(inputStreamD);
                    throw th;
                }
            }
        }
        if (bitmapW != null) {
            if (this.f18676g.p) {
                g0.u("Hunter", "decoded", this.f18681l.d());
            }
            this.f18679j.b(bitmapW);
            if (this.f18681l.f() || this.v != 0) {
                synchronized (f18671b) {
                    if (this.f18681l.e() || this.v != 0) {
                        bitmapW = w(this.f18681l, bitmapW, this.v);
                        if (this.f18676g.p) {
                            g0.u("Hunter", "transformed", this.f18681l.d());
                        }
                    }
                    if (this.f18681l.b()) {
                        bitmapW = a(this.f18681l.f18790h, bitmapW);
                        if (this.f18676g.p) {
                            g0.v("Hunter", "transformed", this.f18681l.d(), "from custom transformations");
                        }
                    }
                }
                if (bitmapW != null) {
                    this.f18679j.c(bitmapW);
                }
            }
        }
        return bitmapW;
    }

    @Override // java.lang.Runnable
    public void run() {
        i iVar;
        i iVar2;
        try {
            try {
                try {
                    x(this.f18681l);
                    if (this.f18676g.p) {
                        g0.u("Hunter", "executing", g0.l(this));
                    }
                    Bitmap bitmapR = r();
                    this.r = bitmapR;
                    if (bitmapR == null) {
                        this.f18677h.e(this);
                    } else {
                        this.f18677h.d(this);
                    }
                } catch (r.a e2) {
                    this.u = e2;
                    iVar2 = this.f18677h;
                    iVar2.g(this);
                } catch (IOException e3) {
                    this.u = e3;
                    iVar2 = this.f18677h;
                    iVar2.g(this);
                } catch (Exception e4) {
                    this.u = e4;
                    iVar = this.f18677h;
                    iVar.e(this);
                }
            } catch (j.b e5) {
                if (!e5.f18725b || e5.f18726c != 504) {
                    this.u = e5;
                }
                iVar = this.f18677h;
                iVar.e(this);
            } catch (OutOfMemoryError e6) {
                StringWriter stringWriter = new StringWriter();
                this.f18679j.a().a(new PrintWriter(stringWriter));
                this.u = new RuntimeException(stringWriter.toString(), e6);
                iVar = this.f18677h;
                iVar.e(this);
            }
        } finally {
            Thread.currentThread().setName("Picasso-Idle");
        }
    }

    public boolean s() {
        Future<?> future = this.s;
        return future != null && future.isCancelled();
    }

    public boolean u(boolean z, NetworkInfo networkInfo) {
        int i2 = this.w;
        if (!(i2 > 0)) {
            return false;
        }
        this.w = i2 - 1;
        return this.f18684o.h(z, networkInfo);
    }

    public boolean v() {
        return this.f18684o.i();
    }
}
