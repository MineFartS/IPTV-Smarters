package c.f.a.b.e3.g1;

import c.f.a.b.j3.x0;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f7610a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f7611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte f7614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f7615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte f7616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7617h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f7618i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f7619j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte[] f7620k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final byte[] f7621l;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f7622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f7623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte f7624c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f7625d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f7626e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f7627f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte[] f7628g = o.f7610a;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public byte[] f7629h = o.f7610a;

        public o i() {
            return new o(this);
        }

        public b j(byte[] bArr) {
            c.f.a.b.j3.g.e(bArr);
            this.f7628g = bArr;
            return this;
        }

        public b k(boolean z) {
            this.f7623b = z;
            return this;
        }

        public b l(boolean z) {
            this.f7622a = z;
            return this;
        }

        public b m(byte[] bArr) {
            c.f.a.b.j3.g.e(bArr);
            this.f7629h = bArr;
            return this;
        }

        public b n(byte b2) {
            this.f7624c = b2;
            return this;
        }

        public b o(int i2) {
            c.f.a.b.j3.g.a(i2 >= 0 && i2 <= 65535);
            this.f7625d = i2 & 65535;
            return this;
        }

        public b p(int i2) {
            this.f7627f = i2;
            return this;
        }

        public b q(long j2) {
            this.f7626e = j2;
            return this;
        }
    }

    public o(b bVar) {
        this.f7611b = (byte) 2;
        this.f7612c = bVar.f7622a;
        this.f7613d = false;
        this.f7615f = bVar.f7623b;
        this.f7616g = bVar.f7624c;
        this.f7617h = bVar.f7625d;
        this.f7618i = bVar.f7626e;
        this.f7619j = bVar.f7627f;
        byte[] bArr = bVar.f7628g;
        this.f7620k = bArr;
        this.f7614e = (byte) (bArr.length / 4);
        this.f7621l = bVar.f7629h;
    }

    public static o b(c.f.a.b.j3.i0 i0Var) {
        byte[] bArr;
        if (i0Var.a() < 12) {
            return null;
        }
        int iD = i0Var.D();
        byte b2 = (byte) (iD >> 6);
        boolean z = ((iD >> 5) & 1) == 1;
        byte b3 = (byte) (iD & 15);
        if (b2 != 2) {
            return null;
        }
        int iD2 = i0Var.D();
        boolean z2 = ((iD2 >> 7) & 1) == 1;
        byte b4 = (byte) (iD2 & 127);
        int iJ = i0Var.J();
        long jF = i0Var.F();
        int iN = i0Var.n();
        if (b3 > 0) {
            bArr = new byte[b3 * 4];
            for (int i2 = 0; i2 < b3; i2++) {
                i0Var.j(bArr, i2 * 4, 4);
            }
        } else {
            bArr = f7610a;
        }
        byte[] bArr2 = new byte[i0Var.a()];
        i0Var.j(bArr2, 0, i0Var.a());
        return new b().l(z).k(z2).n(b4).o(iJ).q(jF).p(iN).j(bArr).m(bArr2).i();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return this.f7616g == oVar.f7616g && this.f7617h == oVar.f7617h && this.f7615f == oVar.f7615f && this.f7618i == oVar.f7618i && this.f7619j == oVar.f7619j;
    }

    public int hashCode() {
        int i2 = (((((527 + this.f7616g) * 31) + this.f7617h) * 31) + (this.f7615f ? 1 : 0)) * 31;
        long j2 = this.f7618i;
        return ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f7619j;
    }

    public String toString() {
        return x0.D("RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", Byte.valueOf(this.f7616g), Integer.valueOf(this.f7617h), Long.valueOf(this.f7618i), Integer.valueOf(this.f7619j), Boolean.valueOf(this.f7615f));
    }
}
