package c.f.a.b.k3;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9510d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9512f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f9507a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f9508b = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f9511e = -9223372036854775807L;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f9513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f9514b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f9515c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f9516d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f9517e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f9518f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean[] f9519g = new boolean[15];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f9520h;

        public static int c(long j2) {
            return (int) (j2 % 15);
        }

        public long a() {
            long j2 = this.f9517e;
            if (j2 == 0) {
                return 0L;
            }
            return this.f9518f / j2;
        }

        public long b() {
            return this.f9518f;
        }

        public boolean d() {
            long j2 = this.f9516d;
            if (j2 == 0) {
                return false;
            }
            return this.f9519g[c(j2 - 1)];
        }

        public boolean e() {
            return this.f9516d > 15 && this.f9520h == 0;
        }

        public void f(long j2) {
            int i2;
            long j3 = this.f9516d;
            if (j3 == 0) {
                this.f9513a = j2;
            } else if (j3 == 1) {
                long j4 = j2 - this.f9513a;
                this.f9514b = j4;
                this.f9518f = j4;
                this.f9517e = 1L;
            } else {
                long j5 = j2 - this.f9515c;
                int iC = c(j3);
                if (Math.abs(j5 - this.f9514b) <= 1000000) {
                    this.f9517e++;
                    this.f9518f += j5;
                    boolean[] zArr = this.f9519g;
                    if (zArr[iC]) {
                        zArr[iC] = false;
                        i2 = this.f9520h - 1;
                        this.f9520h = i2;
                    }
                } else {
                    boolean[] zArr2 = this.f9519g;
                    if (!zArr2[iC]) {
                        zArr2[iC] = true;
                        i2 = this.f9520h + 1;
                        this.f9520h = i2;
                    }
                }
            }
            this.f9516d++;
            this.f9515c = j2;
        }

        public void g() {
            this.f9516d = 0L;
            this.f9517e = 0L;
            this.f9518f = 0L;
            this.f9520h = 0;
            Arrays.fill(this.f9519g, false);
        }
    }

    public long a() {
        if (e()) {
            return this.f9507a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (!e()) {
            return -1.0f;
        }
        double dA = this.f9507a.a();
        Double.isNaN(dA);
        return (float) (1.0E9d / dA);
    }

    public int c() {
        return this.f9512f;
    }

    public long d() {
        if (e()) {
            return this.f9507a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f9507a.e();
    }

    public void f(long j2) {
        this.f9507a.f(j2);
        if (this.f9507a.e() && !this.f9510d) {
            this.f9509c = false;
        } else if (this.f9511e != -9223372036854775807L) {
            if (!this.f9509c || this.f9508b.d()) {
                this.f9508b.g();
                this.f9508b.f(this.f9511e);
            }
            this.f9509c = true;
            this.f9508b.f(j2);
        }
        if (this.f9509c && this.f9508b.e()) {
            a aVar = this.f9507a;
            this.f9507a = this.f9508b;
            this.f9508b = aVar;
            this.f9509c = false;
            this.f9510d = false;
        }
        this.f9511e = j2;
        this.f9512f = this.f9507a.e() ? 0 : this.f9512f + 1;
    }

    public void g() {
        this.f9507a.g();
        this.f9508b.g();
        this.f9509c = false;
        this.f9511e = -9223372036854775807L;
        this.f9512f = 0;
    }
}
