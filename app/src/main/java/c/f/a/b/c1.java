package c.f.a.b;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import c.f.a.b.t2.d0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c1 implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6651a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6654d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6658h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f6659i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6660j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6661k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6652b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f6653c = 5000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c.f.a.b.a3.u f6655e = c.f.a.b.a3.u.f6497a;

    public c1(Context context) {
        this.f6651a = context;
    }

    @Override // c.f.a.b.l2
    public h2[] a(Handler handler, c.f.a.b.k3.d0 d0Var, c.f.a.b.t2.u uVar, c.f.a.b.f3.l lVar, c.f.a.b.b3.f fVar) {
        ArrayList<h2> arrayList = new ArrayList<>();
        h(this.f6651a, this.f6652b, this.f6655e, this.f6654d, handler, d0Var, this.f6653c, arrayList);
        c.f.a.b.t2.v vVarC = c(this.f6651a, this.f6659i, this.f6660j, this.f6661k);
        if (vVarC != null) {
            b(this.f6651a, this.f6652b, this.f6655e, this.f6654d, vVarC, handler, uVar, arrayList);
        }
        g(this.f6651a, lVar, handler.getLooper(), this.f6652b, arrayList);
        e(this.f6651a, fVar, handler.getLooper(), this.f6652b, arrayList);
        d(this.f6651a, this.f6652b, arrayList);
        f(this.f6651a, handler, this.f6652b, arrayList);
        return (h2[]) arrayList.toArray(new h2[0]);
    }

    public void b(Context context, int i2, c.f.a.b.a3.u uVar, boolean z, c.f.a.b.t2.v vVar, Handler handler, c.f.a.b.t2.u uVar2, ArrayList<h2> arrayList) {
        int i3;
        int i4;
        c.f.a.b.t2.g0 g0Var = new c.f.a.b.t2.g0(context, uVar, z, handler, uVar2, vVar);
        g0Var.f0(this.f6656f);
        g0Var.g0(this.f6657g);
        g0Var.h0(this.f6658h);
        arrayList.add(g0Var);
        if (i2 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i2 == 2) {
            size--;
        }
        try {
            try {
                i3 = size + 1;
                try {
                    arrayList.add(size, (h2) Class.forName("c.f.a.b.y2.f.b").getConstructor(Handler.class, c.f.a.b.t2.u.class, c.f.a.b.t2.v.class).newInstance(handler, uVar2, vVar));
                    c.f.a.b.j3.z.g("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i3;
                    i3 = size;
                }
            } catch (ClassNotFoundException unused2) {
            }
            try {
                try {
                    i4 = i3 + 1;
                } catch (Exception e2) {
                    throw new RuntimeException("Error instantiating FLAC extension", e2);
                }
            } catch (ClassNotFoundException unused3) {
            }
            try {
                arrayList.add(i3, (h2) Class.forName("c.f.a.b.y2.d.i").getConstructor(Handler.class, c.f.a.b.t2.u.class, c.f.a.b.t2.v.class).newInstance(handler, uVar2, vVar));
                c.f.a.b.j3.z.g("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
            } catch (ClassNotFoundException unused4) {
                i3 = i4;
                i4 = i3;
            }
            try {
                arrayList.add(i4, (h2) Class.forName("c.f.a.b.y2.c.b").getConstructor(Handler.class, c.f.a.b.t2.u.class, c.f.a.b.t2.v.class).newInstance(handler, uVar2, vVar));
                c.f.a.b.j3.z.g("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
            } catch (ClassNotFoundException unused5) {
            } catch (Exception e3) {
                throw new RuntimeException("Error instantiating FFmpeg extension", e3);
            }
        } catch (Exception e4) {
            throw new RuntimeException("Error instantiating Opus extension", e4);
        }
    }

    public c.f.a.b.t2.v c(Context context, boolean z, boolean z2, boolean z3) {
        return new c.f.a.b.t2.d0(c.f.a.b.t2.q.c(context), new d0.d(new c.f.a.b.t2.s[0]), z, z2, z3 ? 1 : 0);
    }

    public void d(Context context, int i2, ArrayList<h2> arrayList) {
        arrayList.add(new c.f.a.b.k3.f0.e());
    }

    public void e(Context context, c.f.a.b.b3.f fVar, Looper looper, int i2, ArrayList<h2> arrayList) {
        arrayList.add(new c.f.a.b.b3.g(fVar, looper));
    }

    public void f(Context context, Handler handler, int i2, ArrayList<h2> arrayList) {
    }

    public void g(Context context, c.f.a.b.f3.l lVar, Looper looper, int i2, ArrayList<h2> arrayList) {
        arrayList.add(new c.f.a.b.f3.m(lVar, looper));
    }

    public void h(Context context, int i2, c.f.a.b.a3.u uVar, boolean z, Handler handler, c.f.a.b.k3.d0 d0Var, long j2, ArrayList<h2> arrayList) {
        int i3;
        c.f.a.b.k3.u uVar2 = new c.f.a.b.k3.u(context, uVar, j2, z, handler, d0Var, 50);
        uVar2.f0(this.f6656f);
        uVar2.g0(this.f6657g);
        uVar2.h0(this.f6658h);
        arrayList.add(uVar2);
        if (i2 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i2 == 2) {
            size--;
        }
        try {
            try {
                i3 = size + 1;
                try {
                    arrayList.add(size, (h2) Class.forName("c.f.a.b.y2.h.b").getConstructor(Long.TYPE, Handler.class, c.f.a.b.k3.d0.class, Integer.TYPE).newInstance(Long.valueOf(j2), handler, d0Var, 50));
                    c.f.a.b.j3.z.g("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i3;
                    i3 = size;
                }
            } catch (ClassNotFoundException unused2) {
            }
            try {
                arrayList.add(i3, (h2) Class.forName("c.f.a.b.y2.a.d").getConstructor(Long.TYPE, Handler.class, c.f.a.b.k3.d0.class, Integer.TYPE).newInstance(Long.valueOf(j2), handler, d0Var, 50));
                c.f.a.b.j3.z.g("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
            } catch (ClassNotFoundException unused3) {
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating AV1 extension", e2);
            }
        } catch (Exception e3) {
            throw new RuntimeException("Error instantiating VP9 extension", e3);
        }
    }

    public c1 i(int i2) {
        this.f6652b = i2;
        return this;
    }
}
