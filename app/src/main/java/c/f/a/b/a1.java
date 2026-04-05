package c.f.a.b;

/* JADX INFO: loaded from: classes.dex */
public class a1 implements o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.a.b.i3.t f6385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6390f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6391g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f6392h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f6393i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6394j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6395k;

    public a1() {
        this(new c.f.a.b.i3.t(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    public a1(c.f.a.b.i3.t tVar, int i2, int i3, int i4, int i5, int i6, boolean z, int i7, boolean z2) {
        i(i4, 0, "bufferForPlaybackMs", "0");
        i(i5, 0, "bufferForPlaybackAfterRebufferMs", "0");
        i(i2, i4, "minBufferMs", "bufferForPlaybackMs");
        i(i2, i5, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        i(i3, i2, "maxBufferMs", "minBufferMs");
        i(i7, 0, "backBufferDurationMs", "0");
        this.f6385a = tVar;
        this.f6386b = w0.d(i2);
        this.f6387c = w0.d(i3);
        this.f6388d = w0.d(i4);
        this.f6389e = w0.d(i5);
        this.f6390f = i6;
        this.f6394j = i6 == -1 ? 13107200 : i6;
        this.f6391g = z;
        this.f6392h = w0.d(i7);
        this.f6393i = z2;
    }

    public static void i(int i2, int i3, String str, String str2) {
        c.f.a.b.j3.g.b(i2 >= i3, str + " cannot be less than " + str2);
    }

    public static int k(int i2) {
        if (i2 == 0) {
            return 144310272;
        }
        if (i2 == 1) {
            return 13107200;
        }
        if (i2 == 2) {
            return 131072000;
        }
        if (i2 == 3 || i2 == 5 || i2 == 6) {
            return 131072;
        }
        if (i2 == 7) {
            return 0;
        }
        throw new IllegalArgumentException();
    }

    @Override // c.f.a.b.o1
    public boolean a() {
        return this.f6393i;
    }

    @Override // c.f.a.b.o1
    public long b() {
        return this.f6392h;
    }

    @Override // c.f.a.b.o1
    public void c(h2[] h2VarArr, c.f.a.b.e3.a1 a1Var, c.f.a.b.g3.h[] hVarArr) {
        int iJ = this.f6390f;
        if (iJ == -1) {
            iJ = j(h2VarArr, hVarArr);
        }
        this.f6394j = iJ;
        this.f6385a.h(iJ);
    }

    @Override // c.f.a.b.o1
    public void d() {
        l(true);
    }

    @Override // c.f.a.b.o1
    public boolean e(long j2, float f2, boolean z, long j3) {
        long jD0 = c.f.a.b.j3.x0.d0(j2, f2);
        long jMin = z ? this.f6389e : this.f6388d;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(j3 / 2, jMin);
        }
        return jMin <= 0 || jD0 >= jMin || (!this.f6391g && this.f6385a.f() >= this.f6394j);
    }

    @Override // c.f.a.b.o1
    public boolean f(long j2, long j3, float f2) {
        boolean z = true;
        boolean z2 = this.f6385a.f() >= this.f6394j;
        long jMin = this.f6386b;
        if (f2 > 1.0f) {
            jMin = Math.min(c.f.a.b.j3.x0.Y(jMin, f2), this.f6387c);
        }
        if (j3 < Math.max(jMin, 500000L)) {
            if (!this.f6391g && z2) {
                z = false;
            }
            this.f6395k = z;
            if (!z && j3 < 500000) {
                c.f.a.b.j3.z.i("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j3 >= this.f6387c || z2) {
            this.f6395k = false;
        }
        return this.f6395k;
    }

    @Override // c.f.a.b.o1
    public c.f.a.b.i3.f g() {
        return this.f6385a;
    }

    @Override // c.f.a.b.o1
    public void h() {
        l(true);
    }

    public int j(h2[] h2VarArr, c.f.a.b.g3.h[] hVarArr) {
        int iK = 0;
        for (int i2 = 0; i2 < h2VarArr.length; i2++) {
            if (hVarArr[i2] != null) {
                iK += k(h2VarArr[i2].getTrackType());
            }
        }
        return Math.max(13107200, iK);
    }

    public final void l(boolean z) {
        int i2 = this.f6390f;
        if (i2 == -1) {
            i2 = 13107200;
        }
        this.f6394j = i2;
        this.f6395k = false;
        if (z) {
            this.f6385a.g();
        }
    }

    @Override // c.f.a.b.o1
    public void onPrepared() {
        l(false);
    }
}
