package c.f.a.b;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import c.f.a.b.j3.t;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface a2 {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f6396a = new a().e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final v0<b> f6397b = new v0() { // from class: c.f.a.b.j0
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c.f.a.b.j3.t f6398c;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f6399a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27};

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final t.b f6400b = new t.b();

            public a a(int i2) {
                this.f6400b.a(i2);
                return this;
            }

            public a b(b bVar) {
                this.f6400b.b(bVar.f6398c);
                return this;
            }

            public a c(int... iArr) {
                this.f6400b.c(iArr);
                return this;
            }

            public a d(int i2, boolean z) {
                this.f6400b.d(i2, z);
                return this;
            }

            public b e() {
                return new b(this.f6400b.e());
            }
        }

        public b(c.f.a.b.j3.t tVar) {
            this.f6398c = tVar;
        }

        public boolean b(int i2) {
            return this.f6398c.a(i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f6398c.equals(((b) obj).f6398c);
            }
            return false;
        }

        public int hashCode() {
            return this.f6398c.hashCode();
        }
    }

    @Deprecated
    public interface c {
        void C(boolean z);

        void E(a2 a2Var, d dVar);

        @Deprecated
        void H(boolean z, int i2);

        void O(p1 p1Var, int i2);

        void Z(boolean z, int i2);

        void b0(c.f.a.b.e3.a1 a1Var, c.f.a.b.g3.l lVar);

        void d(z1 z1Var);

        void f(f fVar, f fVar2, int i2);

        void g(int i2);

        @Deprecated
        void h(boolean z);

        void h0(x1 x1Var);

        @Deprecated
        void i(int i2);

        @Deprecated
        void l(List<c.f.a.b.b3.a> list);

        void m0(boolean z);

        void onRepeatModeChanged(int i2);

        void p(boolean z);

        @Deprecated
        void r();

        void s(x1 x1Var);

        void t(b bVar);

        void v(p2 p2Var, int i2);

        void x(int i2);

        void z(q1 q1Var);
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c.f.a.b.j3.t f6401a;

        public d(c.f.a.b.j3.t tVar) {
            this.f6401a = tVar;
        }

        public boolean a(int i2) {
            return this.f6401a.a(i2);
        }

        public boolean b(int... iArr) {
            return this.f6401a.b(iArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                return this.f6401a.equals(((d) obj).f6401a);
            }
            return false;
        }

        public int hashCode() {
            return this.f6401a.hashCode();
        }
    }

    public interface e extends c.f.a.b.k3.b0, c.f.a.b.t2.r, c.f.a.b.f3.l, c.f.a.b.b3.f, c.f.a.b.w2.c, c {
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final v0<f> f6402a = new v0() { // from class: c.f.a.b.k0
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f6403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6404c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f6405d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f6406e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f6407f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f6408g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f6409h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f6410i;

        public f(Object obj, int i2, Object obj2, int i3, long j2, long j3, int i4, int i5) {
            this.f6403b = obj;
            this.f6404c = i2;
            this.f6405d = obj2;
            this.f6406e = i3;
            this.f6407f = j2;
            this.f6408g = j3;
            this.f6409h = i4;
            this.f6410i = i5;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || f.class != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            return this.f6404c == fVar.f6404c && this.f6406e == fVar.f6406e && this.f6407f == fVar.f6407f && this.f6408g == fVar.f6408g && this.f6409h == fVar.f6409h && this.f6410i == fVar.f6410i && c.f.b.a.h.a(this.f6403b, fVar.f6403b) && c.f.b.a.h.a(this.f6405d, fVar.f6405d);
        }

        public int hashCode() {
            return c.f.b.a.h.b(this.f6403b, Integer.valueOf(this.f6404c), this.f6405d, Integer.valueOf(this.f6406e), Integer.valueOf(this.f6404c), Long.valueOf(this.f6407f), Long.valueOf(this.f6408g), Integer.valueOf(this.f6409h), Integer.valueOf(this.f6410i));
        }
    }

    List<c.f.a.b.f3.c> A();

    int B();

    boolean C(int i2);

    void D(SurfaceView surfaceView);

    int E();

    c.f.a.b.e3.a1 F();

    p2 G();

    Looper H();

    boolean I();

    long J();

    void K();

    void L();

    void M(TextureView textureView);

    c.f.a.b.g3.l N();

    void O();

    q1 P();

    long Q();

    z1 c();

    void d(z1 z1Var);

    boolean e();

    long f();

    void g(int i2, long j2);

    long getCurrentPosition();

    long getDuration();

    int getPlaybackState();

    int getRepeatMode();

    float getVolume();

    b h();

    boolean i();

    boolean isPlaying();

    void j(boolean z);

    int k();

    int l();

    boolean m();

    void n(TextureView textureView);

    c.f.a.b.k3.e0 o();

    void p(e eVar);

    void prepare();

    int q();

    void r(SurfaceView surfaceView);

    int s();

    void seekTo(long j2);

    void setRepeatMode(int i2);

    void t();

    x1 u();

    void v(boolean z);

    long w();

    long x();

    void y(e eVar);

    void z(int i2, List<p1> list);
}
