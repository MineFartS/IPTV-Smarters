package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import c.f.a.b.e3.g1.f0;
import c.f.a.b.e3.g1.l;
import c.f.a.b.e3.g1.l0;
import c.f.a.b.e3.g1.n0;
import c.f.a.b.e3.g1.w;
import c.f.a.b.e3.i0;
import c.f.a.b.e3.k0;
import c.f.a.b.e3.n;
import c.f.a.b.e3.v0;
import c.f.a.b.e3.y;
import c.f.a.b.i1;
import c.f.a.b.i3.f;
import c.f.a.b.j3.g;
import c.f.a.b.p1;
import c.f.a.b.p2;
import c.f.a.b.w0;
import c.f.a.b.x2.c0;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class RtspMediaSource extends n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p1 f23974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l.a f23975i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f23976j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f23977k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f23979m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f23980n;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f23978l = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f23981o = true;

    public static final class Factory implements k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f23982a = 8000;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f23983b = "ExoPlayerLib/2.15.0";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f23984c;

        @Override // c.f.a.b.e3.k0
        public int[] b() {
            return new int[]{3};
        }

        @Override // c.f.a.b.e3.k0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public RtspMediaSource a(p1 p1Var) {
            g.e(p1Var.f9643d);
            return new RtspMediaSource(p1Var, this.f23984c ? new l0(this.f23982a) : new n0(this.f23982a), this.f23983b);
        }

        @Override // c.f.a.b.e3.k0
        @Deprecated
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Factory c(c0 c0Var) {
            return this;
        }
    }

    public class a extends y {
        public a(p2 p2Var) {
            super(p2Var);
        }

        @Override // c.f.a.b.e3.y, c.f.a.b.p2
        public p2.b g(int i2, p2.b bVar, boolean z) {
            super.g(i2, bVar, z);
            bVar.f9707g = true;
            return bVar;
        }

        @Override // c.f.a.b.e3.y, c.f.a.b.p2
        public p2.c o(int i2, p2.c cVar, long j2) {
            super.o(i2, cVar, j2);
            cVar.p = true;
            return cVar;
        }
    }

    public static final class b extends IOException {
        public b(String str) {
            super(str);
        }

        public b(String str, Throwable th) {
            super(str, th);
        }

        public b(Throwable th) {
            super(th);
        }
    }

    static {
        i1.a("goog.exo.rtsp");
    }

    public RtspMediaSource(p1 p1Var, l.a aVar, String str) {
        this.f23974h = p1Var;
        this.f23975i = aVar;
        this.f23976j = str;
        this.f23977k = ((p1.g) g.e(p1Var.f9643d)).f9685a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void F(f0 f0Var) {
        this.f23978l = w0.d(f0Var.a());
        this.f23979m = !f0Var.c();
        this.f23980n = f0Var.c();
        this.f23981o = false;
        G();
    }

    @Override // c.f.a.b.e3.n
    public void B(c.f.a.b.i3.n0 n0Var) {
        G();
    }

    @Override // c.f.a.b.e3.n
    public void D() {
    }

    public final void G() {
        p2 v0Var = new v0(this.f23978l, this.f23979m, false, this.f23980n, null, this.f23974h);
        if (this.f23981o) {
            v0Var = new a(v0Var);
        }
        C(v0Var);
    }

    @Override // c.f.a.b.e3.i0
    public c.f.a.b.e3.f0 a(i0.a aVar, f fVar, long j2) {
        return new w(fVar, this.f23975i, this.f23977k, new w.c() { // from class: c.f.a.b.e3.g1.h
            @Override // c.f.a.b.e3.g1.w.c
            public final void a(f0 f0Var) {
                this.f7522a.F(f0Var);
            }
        }, this.f23976j);
    }

    @Override // c.f.a.b.e3.i0
    public p1 h() {
        return this.f23974h;
    }

    @Override // c.f.a.b.e3.i0
    public void l() {
    }

    @Override // c.f.a.b.e3.i0
    public void o(c.f.a.b.e3.f0 f0Var) {
        ((w) f0Var).S();
    }
}
