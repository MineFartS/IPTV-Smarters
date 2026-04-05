package c.f.a.b.e3;

import android.content.Context;
import android.util.SparseArray;
import c.f.a.b.e3.p0;
import c.f.a.b.e3.x0;
import c.f.a.b.i3.p;
import c.f.a.b.p1;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p.a f8002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<k0> f8003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f8004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f8005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c.f.a.b.h3.f0 f8006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c.f.a.b.i3.f0 f8007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f8008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f8009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f8010i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f8011j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f8012k;

    public interface a {
        c.f.a.b.e3.c1.j a(p1.b bVar);
    }

    public w(Context context, c.f.a.b.z2.o oVar) {
        this(new c.f.a.b.i3.w(context), oVar);
    }

    public w(p.a aVar) {
        this(aVar, new c.f.a.b.z2.h());
    }

    public w(p.a aVar, c.f.a.b.z2.o oVar) {
        this.f8002a = aVar;
        SparseArray<k0> sparseArrayD = d(aVar, oVar);
        this.f8003b = sparseArrayD;
        this.f8004c = new int[sparseArrayD.size()];
        for (int i2 = 0; i2 < this.f8003b.size(); i2++) {
            this.f8004c[i2] = this.f8003b.keyAt(i2);
        }
        this.f8008g = -9223372036854775807L;
        this.f8009h = -9223372036854775807L;
        this.f8010i = -9223372036854775807L;
        this.f8011j = -3.4028235E38f;
        this.f8012k = -3.4028235E38f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SparseArray<k0> d(p.a aVar, c.f.a.b.z2.o oVar) {
        SparseArray<k0> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, Class.forName("com.google.android.exoplayer2.source.dash.DashMediaSource$Factory").asSubclass(k0.class).getConstructor(p.a.class).newInstance(aVar));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, Class.forName("com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(k0.class).getConstructor(p.a.class).newInstance(aVar));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, Class.forName("com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory").asSubclass(k0.class).getConstructor(p.a.class).newInstance(aVar));
        } catch (Exception unused3) {
        }
        try {
            sparseArray.put(3, Class.forName("com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory").asSubclass(k0.class).getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Exception unused4) {
        }
        sparseArray.put(4, new p0.b(aVar, oVar));
        return sparseArray;
    }

    public static i0 e(p1 p1Var, i0 i0Var) {
        p1.d dVar = p1Var.f9646g;
        long j2 = dVar.f9665b;
        if (j2 == 0 && dVar.f9666c == Long.MIN_VALUE && !dVar.f9668e) {
            return i0Var;
        }
        long jD = c.f.a.b.w0.d(j2);
        long jD2 = c.f.a.b.w0.d(p1Var.f9646g.f9666c);
        p1.d dVar2 = p1Var.f9646g;
        return new r(i0Var, jD, jD2, !dVar2.f9669f, dVar2.f9667d, dVar2.f9668e);
    }

    @Override // c.f.a.b.e3.k0
    public i0 a(p1 p1Var) {
        c.f.a.b.j3.g.e(p1Var.f9643d);
        p1.g gVar = p1Var.f9643d;
        int iO0 = c.f.a.b.j3.x0.o0(gVar.f9685a, gVar.f9686b);
        k0 k0Var = this.f8003b.get(iO0);
        c.f.a.b.j3.g.f(k0Var, "No suitable media source factory found for content type: " + iO0);
        p1.f fVar = p1Var.f9644e;
        if ((fVar.f9680c == -9223372036854775807L && this.f8008g != -9223372036854775807L) || ((fVar.f9683f == -3.4028235E38f && this.f8011j != -3.4028235E38f) || ((fVar.f9684g == -3.4028235E38f && this.f8012k != -3.4028235E38f) || ((fVar.f9681d == -9223372036854775807L && this.f8009h != -9223372036854775807L) || (fVar.f9682e == -9223372036854775807L && this.f8010i != -9223372036854775807L))))) {
            p1.c cVarA = p1Var.a();
            long j2 = p1Var.f9644e.f9680c;
            if (j2 == -9223372036854775807L) {
                j2 = this.f8008g;
            }
            p1.c cVarU = cVarA.u(j2);
            float f2 = p1Var.f9644e.f9683f;
            if (f2 == -3.4028235E38f) {
                f2 = this.f8011j;
            }
            p1.c cVarT = cVarU.t(f2);
            float f3 = p1Var.f9644e.f9684g;
            if (f3 == -3.4028235E38f) {
                f3 = this.f8012k;
            }
            p1.c cVarR = cVarT.r(f3);
            long j3 = p1Var.f9644e.f9681d;
            if (j3 == -9223372036854775807L) {
                j3 = this.f8009h;
            }
            p1.c cVarS = cVarR.s(j3);
            long j4 = p1Var.f9644e.f9682e;
            if (j4 == -9223372036854775807L) {
                j4 = this.f8010i;
            }
            p1Var = cVarS.q(j4).a();
        }
        i0 i0VarA = k0Var.a(p1Var);
        List<p1.h> list = ((p1.g) c.f.a.b.j3.x0.i(p1Var.f9643d)).f9691g;
        if (!list.isEmpty()) {
            i0[] i0VarArr = new i0[list.size() + 1];
            int i2 = 0;
            i0VarArr[0] = i0VarA;
            x0.b bVarB = new x0.b(this.f8002a).b(this.f8007f);
            while (i2 < list.size()) {
                int i3 = i2 + 1;
                i0VarArr[i3] = bVarB.a(list.get(i2), -9223372036854775807L);
                i2 = i3;
            }
            i0VarA = new m0(i0VarArr);
        }
        return f(p1Var, e(p1Var, i0VarA));
    }

    @Override // c.f.a.b.e3.k0
    public int[] b() {
        int[] iArr = this.f8004c;
        return Arrays.copyOf(iArr, iArr.length);
    }

    public final i0 f(p1 p1Var, i0 i0Var) {
        String str;
        c.f.a.b.j3.g.e(p1Var.f9643d);
        p1.b bVar = p1Var.f9643d.f9688d;
        if (bVar == null) {
            return i0Var;
        }
        a aVar = this.f8005d;
        c.f.a.b.h3.f0 f0Var = this.f8006e;
        if (aVar == null || f0Var == null) {
            str = "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.";
        } else {
            c.f.a.b.e3.c1.j jVarA = aVar.a(bVar);
            if (jVarA != null) {
                c.f.a.b.i3.s sVar = new c.f.a.b.i3.s(bVar.f9647a);
                Object obj = bVar.f9648b;
                return new c.f.a.b.e3.c1.k(i0Var, sVar, obj != null ? obj : c.f.b.b.t.M(p1Var.f9642c, p1Var.f9643d.f9685a, bVar.f9647a), this, jVarA, f0Var);
            }
            str = "Playing media without ads, as no AdsLoader was provided.";
        }
        c.f.a.b.j3.z.i("DefaultMediaSourceFactory", str);
        return i0Var;
    }

    public w g(c.f.a.b.h3.f0 f0Var) {
        this.f8006e = f0Var;
        return this;
    }

    public w h(a aVar) {
        this.f8005d = aVar;
        return this;
    }

    @Override // c.f.a.b.e3.k0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public w c(c.f.a.b.x2.c0 c0Var) {
        for (int i2 = 0; i2 < this.f8003b.size(); i2++) {
            this.f8003b.valueAt(i2).c(c0Var);
        }
        return this;
    }
}
